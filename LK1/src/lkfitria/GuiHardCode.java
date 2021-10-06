/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkfitria;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author fitriadyaa
 */
public class GuiHardCode extends JFrame{
    private Container ctn = new Container();
    
    public GuiHardCode(String title){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //membuat form ukuran 300 x 150
        setSize(300,150);
        //menentukan lokasi form
        setLocation(200,150);
        setTitle(title);
        ctn = getContentPane();
        //menyisipkan letak tombol
        ctn.add(new JButton("Tombol 1"), BorderLayout.PAGE_START);
        ctn.add(new JButton("Tombol 2"), BorderLayout.CENTER);
        ctn.add(new JButton("Tombol 3"), BorderLayout.LINE_START);
        ctn.add(new JButton("Tombol 4"), BorderLayout.PAGE_END);
        ctn.add(new JButton("Tombol 5"), BorderLayout.LINE_END);
        setVisible(true);
    }
    public static void main (String args[]){
        JFrame.setDefaultLookAndFeelDecorated(true);
        new GuiHardCode("Jendela Utama");
    }

}


