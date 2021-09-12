/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myguidemo;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Hunter
 */
public class MyFrame extends JFrame{
    
    private static MyFrame inst;
    
    public static MyFrame getInstance()
    {
        if (inst == null)
            inst = new MyFrame();
        return inst;
    }
    
    private MyFrame()
    {
        super("My Live Demo Frame");
        setSize(600, 600);
        setLocation(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PaintPanel pp = PaintPanel.getInstance();
        ButtonPanel bp = ButtonPanel.getInstance();
        
        getContentPane().add(pp, BorderLayout.CENTER);
        getContentPane().add(bp, BorderLayout.WEST);
        
        
        setVisible(true);
    }
    
}
