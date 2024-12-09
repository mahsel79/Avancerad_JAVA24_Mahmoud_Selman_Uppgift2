package main;

import model.Student;
import service.StudentService;
import util.LoggerUtil;

import java.util.Scanner;

public class StudentManagementSystem {

    private final StudentService studentService;
    private final Scanner scanner;

    public StudentManagementSystem() {
        this.studentService = new StudentService();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add a new student");
            System.out.println("2. Search for a student by ID");
            System.out.println("3. Display all students");
            System.out.println("4. Save students to file");
            System.out.println("5. Load students from file");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> findStudentById();
                case 3 -> displayAllStudents();
                case 4 -> saveStudentsToFile();
                case 5 -> loadStudentsFromFile();
                case 6 -> {
                    LoggerUtil.logInfo("Exiting the system.");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    private void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Grade: ");
        String grade = scanner.nextLine();

        Student student = new Student(id, name, grade);
        studentService.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private void findStudentById() {
        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student student = studentService.findStudentById(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private void displayAllStudents() {
        for (Student student : studentService.getAllStudents()) {
            System.out.println(student);
        }
    }

    private void saveStudentsToFile() {
        studentService.saveStudentsToFile();
        System.out.println("Students saved to file successfully.");
    }

    private void loadStudentsFromFile() {
        studentService.loadStudentsFromFile();
        System.out.println("Students loaded from file successfully.");
    }

    public static void main(String[] args) {
        new StudentManagementSystem().start();
    }
}
