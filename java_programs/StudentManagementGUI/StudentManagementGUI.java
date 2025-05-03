package java_programs.StudentManagementGUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StudentManagementGUI {
    private JFrame frame;
    private JTextField nameField, ageField, gradeField;
    private DefaultListModel<String> listModel;
    private JList<String> studentList;

    private ArrayList<Student> students = new ArrayList<>();

    public StudentManagementGUI() {
        frame = new JFrame("Student Management App");
        frame.setSize(1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Top Panel for Input
        JPanel inputPanel = new JPanel();
        nameField = new JTextField(10);
        ageField = new JTextField(5);
        gradeField = new JTextField(5);
        JButton addButton = new JButton("Add Student");

        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Age:"));
        inputPanel.add(ageField);
        inputPanel.add(new JLabel("Grade:"));
        inputPanel.add(gradeField);
        inputPanel.add(addButton);

        frame.add(inputPanel, BorderLayout.NORTH);

        // Center Panel for List
        listModel = new DefaultListModel<>();
        studentList = new JList<>(listModel);
        frame.add(new JScrollPane(studentList), BorderLayout.CENTER);

        // Bottom Panel for Actions
        JPanel buttonPanel = new JPanel();
        JButton deleteButton = new JButton("Delete Student");
        buttonPanel.add(deleteButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Add Button Action
        addButton.addActionListener(e -> addStudent());

        // Delete Button Action
        deleteButton.addActionListener(e -> deleteStudent());

        frame.setVisible(true);
    }

    private void addStudent() {
        try {
            String name = nameField.getText().trim();
            int age = Integer.parseInt(ageField.getText().trim());
            String grade = gradeField.getText().trim();

            if (name.isEmpty() || grade.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill all fields.");
                return;
            }

            Student student = new Student(name, age, grade);
            students.add(student);
            listModel.addElement(student.toString());

            // Clear fields
            nameField.setText("");
            ageField.setText("");
            gradeField.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Age must be a number.");
        }
    }

    private void deleteStudent() {
        int index = studentList.getSelectedIndex();
        if (index != -1) {
            students.remove(index);
            listModel.remove(index);
            JOptionPane.showMessageDialog(frame, "Student deleted.");
        } else {
            JOptionPane.showMessageDialog(frame, "Please select a student to delete.");
        }
    }

    public static void main(String[] args) {
        new StudentManagementGUI();
    }
}
