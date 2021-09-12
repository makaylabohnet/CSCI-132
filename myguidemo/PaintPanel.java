/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myguidemo;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
/**
 *
 * @author Hunter
 */
public class PaintPanel extends JPanel {
    
    
    Graphics2D gc;
    BufferedImage grid;
    
    private static PaintPanel inst;
    
    public static PaintPanel getInstance()
    {
        if (inst == null)
            inst = new PaintPanel();
        return inst;
    }
    
    private PaintPanel()
    {
        setBackground(Color.YELLOW);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        if (grid == null){
            int w = this.getWidth();
            int h = this.getHeight();
            grid =  (BufferedImage) (this.createImage(w, h));
            gc = grid.createGraphics();
            gc.setColor(Color.yellow);
            gc.fillRect(0,0, w, h);
        }
        g2.drawImage(grid, null, 0, 0);   
      
    }   
    
    public void drawRectangle()
    {
        
        gc.setColor(Color.black);
        gc.drawRect(5, 100, 200,200);
        repaint();
    }
    public void drawFillOval()
    {
       
        gc.setColor(Color.blue);
        gc.fillOval(305, 100, 200, 200);
        repaint();
    }
    public void clearPanel()
    {
        grid = null;
        repaint();
    }
    
}
