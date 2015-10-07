/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author 068681097
 */
public class CardGame  extends JPanel {

    /**
     * @param args the command line arguments
     */
   
         public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {

                    JFrame f = new JFrame("Java Game");

                    f.setSize(1300, 800);
                    f.setResizable(false);
                    f.setVisible(true);
                    f.setBackground(Color.GRAY);
                    f.setContentPane(new CardGame());
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

    

