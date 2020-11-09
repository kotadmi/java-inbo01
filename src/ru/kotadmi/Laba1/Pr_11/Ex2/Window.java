package ru.kotadmi.Laba1.Pr_11.Ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        JFrame jbr = new JFrame("Example");
        JButton centre = new JButton("Center");
        centre.setBackground(Color.black);
        centre.setBounds(230,180,100,100);
        JButton north = new JButton("North");
        north.setBackground(Color.gray);
        north.setBounds(160,110,240,70);
        JButton south = new JButton("South");
        south.setBackground(Color.red);
        south.setBounds(160,280,240,70);
        JButton east = new JButton("East");
        east.setBackground(Color.orange);
        east.setBounds(330,180,70,100);
        JButton west = new JButton("West");
        west.setBackground(Color.yellow);
        west.setBounds(160,180,70,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(centre);
        add(north);
        add(south);
        add(west);
        add(east);
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(jbr,"Добро пожаловать в ЦАО", "", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(jbr,"Добро пожаловать в САО", "", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(jbr, "Добро пожаловать в ЮЗАО", "", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(jbr,"Добро пожаловать в СВАО", "", JOptionPane.DEFAULT_OPTION);
            }
        };
        ActionListener actionListener5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(jbr,"Добро пожаловать в ЗАО", "", JOptionPane.DEFAULT_OPTION);
            }
        };
        centre.addActionListener(actionListener);
        north.addActionListener(actionListener2);
        south.addActionListener(actionListener3);
        east.addActionListener(actionListener4);
        west.addActionListener(actionListener5);
    }
}
