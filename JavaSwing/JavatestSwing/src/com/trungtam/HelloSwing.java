/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trungtam;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
//import javax.swing.JFrame;

/**
 *
 * @author ACER
 */
public class HelloSwing {
    public HelloSwing(){
        JButton button = new JButton("Ok");
        JFrame frame = new JFrame("Title");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setSize(720,480);
        frame.add(button);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        button.addActionListener (new ActionListener());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //frame.pack();
        
    }
    public static void main(String[] args) {
        new HelloSwing();
    }
}
