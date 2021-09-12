/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myguidemo;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Hunter
 */
public class ButtonPanel extends JPanel implements ActionListener {
    PaintPanel pp;
    private static ButtonPanel inst;
    
    public static ButtonPanel getInstance()
    {
        if (inst == null)
            inst = new ButtonPanel();
        return inst;
    }
     ButtonPanel()
    {
        pp = PaintPanel.getInstance();
        setBackground(Color.GREEN);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JButton button1 = new JButton("Press Me");
        JButton button2 = new JButton("Press Me Too");
        JButton clearButton = new JButton("Clear");
        add(button1);
        add(button2);
        add(clearButton);
        button1.addActionListener(this);
        button2.addActionListener(this);
        clearButton.addActionListener(this);
        
    }
     
     
     public void actionPerformed(ActionEvent ae)
     {
         //System.out.println(ae.getActionCommand());
         
         if(ae.getActionCommand().equals("Press Me"))
         {  //System.out.println("Calling oval");
             pp.drawFillOval(); }
         else if(ae.getActionCommand().equals("Press Me Too"))
         { 
             //System.out.println("Calling rect");
             pp.drawRectangle(); }
         else if (ae.getActionCommand().equals("Clear")) 
         { 
          PaintPanel.getInstance().clearPanel(); 
           //System.out.println("Calling Clear");
         }
     }
}
