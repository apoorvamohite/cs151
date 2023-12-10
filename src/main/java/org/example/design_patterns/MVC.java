package org.example.design_patterns;

// referred from https://www.geeksforgeeks.org/mvc-design-pattern/

class MVCPattern {
    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("FirstName LastName");
        student.setSid("00000001");
        return student;
    }

    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("newFirstName newLastName");
        controller.updateView();
    }
}