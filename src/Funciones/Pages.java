/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author laszlo
 */
public class Pages {
    public void ViewPages(JPanel page, JPanel content){
        int width = (int) Math.floor(content.getSize().getWidth());
        int height = (int) Math.floor(content.getSize().getHeight());
        page.setSize(width, height);
        page.setLocation(0, 0);
        content.removeAll();
        content.add(page, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    public void ViewComponent(JPanel component, JPanel content, int y){
        int width = (int) Math.floor(component.getSize().getWidth());
        int height = (int) Math.floor(component.getSize().getHeight());
        component.setSize(width, height);
        component.setLocation(0, 0);
        content.add(component,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
}
