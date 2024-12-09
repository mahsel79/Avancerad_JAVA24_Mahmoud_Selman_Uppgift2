package main.java.service;

import main.java.model.Student;
import main.java.util.FileHandler;
import main.java.util.LoggerUtil;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private final List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>(FileHandler.readStudentsFromFile());
        LoggerUtil.logInfo("Student data loaded from file.");
    }

    public void addStudent(Student student) {
        students.add(student);
        FileHandler.writeStudentsToFile(students);
        LoggerUtil.logInfo("Added new student: " + student);
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public void saveStudentsToFile() {
        FileHandler.writeStudentsToFile(students);
        LoggerUtil.logInfo("All students saved to file.");
    }

    public void loadStudentsFromFile() {
        List<Student> loadedStudents = FileHandler.readStudentsFromFile();
        if (loadedStudents != null) {
            students.clear();
            students.addAll(loadedStudents);
            LoggerUtil.logInfo("Students loaded from file.");
        } else {
            LoggerUtil.logError("Failed to load students from file.");
        }
    }
}
