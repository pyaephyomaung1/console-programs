package java_programs.StudentManagement;

public class Student {
    private static int count = 0;
    private int studentId;
    String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
        studentId = ++count;
    }

    public void displayStudentInfo(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
