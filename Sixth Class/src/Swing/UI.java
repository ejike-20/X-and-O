package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UI {
    JFrame window = new JFrame(Physics);
    JTextField tfMass = new JTextField("Enter Mass");
    JTextField acceleration = new JTextField("Enter acceleration");
    JButton btnCalculate = new JButton("Calculate");


    public void drawUI() {
        window.add(tfMass);
        window.add(tfAcceleration);
        window.add(btnCalculate);
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });

        window.pack();
        btnCalculate.addActionListener(new ActionListener);
          public void actionPerformed(ActionEvent e) {
            Physics physics = new Physics();
            float mass = Float.valueOf(tfMass.getText());
            float acceleration = Float.valueOf(tfMass.getFocusAccelerator())
    //        System.out.println("BUTTON CLICKED");
        }

    }


    window.setDefaultCloseOperation

}
