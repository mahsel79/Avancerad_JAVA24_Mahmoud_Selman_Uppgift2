package util;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    private static final String FILE_PATH = "src/main/resources/students.txt";

    public static List<Student> readStudentsFromFile() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String grade = parts[2];
                students.add(new Student(id, name, grade));
            }
        } catch (IOException e) {
            LoggerUtil.logError("Error reading students file: " + e.getMessage());
        }
        return students;
    }

    public static void writeStudentsToFile(List<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Student student : students) {
                writer.write(student.getId() + "," + student.getName() + "," + student.getGrade());
                writer.newLine();
            }
        } catch (IOException e) {
            LoggerUtil.logError("Error writing to students file: " + e.getMessage());
        }
    }
}
