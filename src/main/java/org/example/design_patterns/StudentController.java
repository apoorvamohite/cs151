package org.example.design_patterns;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentSid(String sid) {
        model.setSid(sid);
    }

    public String getStudentSid() {
        return model.getSid();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getSid());
    }
}
