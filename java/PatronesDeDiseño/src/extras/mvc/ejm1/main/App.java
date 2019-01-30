/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.mvc.ejm1.main;

import extras.mvc.ejm1.controller.StudentController;
import extras.mvc.ejm1.model.Student;
import extras.mvc.ejm1.view.StudentView;

/**
 *
 * @author User
 */
public class App {
    public static void main(String[] args) {
        Student model=new Student();
        model.setName("Thom");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Carlos");
        controller.updateView();
    }
}
