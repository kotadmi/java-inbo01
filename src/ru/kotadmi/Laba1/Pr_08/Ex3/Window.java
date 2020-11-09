package ru.kotadmi.Laba1.Pr_08.Ex3;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Window extends JFrame {
    Image image;
    String a;

    Window(String a) {
        this.a = a;
        try {
            image = ImageIO.read(new File(a));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setSize (new Dimension (700, 360));
        Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize (), fSize = getSize ();
        if (fSize.height > sSize.height) {
            fSize.height = sSize.height;
        }
        if (fSize.width > sSize.width) {
            fSize.width = sSize.width;
        }
        setTitle ("Rabbit");
        Container container = getContentPane();
        container.setLayout(new GridLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void selectPicture(String abcArg) {
        try {
            image = ImageIO.read(new File(abcArg));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        if (image != null) {
            g.drawImage(image, 0, 35, null);
        }
    }
}
