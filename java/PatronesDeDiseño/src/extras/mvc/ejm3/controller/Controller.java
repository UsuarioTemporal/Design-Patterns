/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras.mvc.ejm3.controller;

import extras.mvc.ejm3.model.Multiplicacion;
import extras.mvc.ejm3.view.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class Controller implements ActionListener{
    private Vista view;
    private Multiplicacion model;

    public Controller(Vista view, Multiplicacion model) {
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    public void iniciar(){
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNumber1(Integer.parseInt(view.txtNumber1.getText()));
        model.setNumber2(Integer.parseInt(view.txtNumber2.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
}
