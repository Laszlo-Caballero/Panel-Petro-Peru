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
        page.setSize(1000, 840);
        page.setLocation(0, 0);

        content.removeAll();
        content.add(page, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
}
