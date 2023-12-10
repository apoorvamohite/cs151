package org.example.reflection;

class Student {
    private int studentId;
    private String grade;
    private String name;

    public Student(int studentId, String grade, String name) {
        this.studentId = studentId;
        this.grade = grade;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private void setGrade(String grade) {
        this.grade = grade;
    }

    private void setName(String name) {
        this.name = name;
    }

    public static String publicStaticMethod() {
        return new String("Public Static Method");
    }


    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", grade=" + grade + ", name=" + name + "]";
    }


}
