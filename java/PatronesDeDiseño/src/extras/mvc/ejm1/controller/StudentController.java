/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.mvc.ejm1.controller;

import extras.mvc.ejm1.model.Student;
import extras.mvc.ejm1.view.StudentView;

/**
 *
 * @author User
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void updateView(){
        view.printStudentDetail(model.getName());
    }
}
