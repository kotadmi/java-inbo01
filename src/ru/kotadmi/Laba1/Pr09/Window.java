package ru.kotadmi.Laba1.Pr09;

import ru.kotadmi.Laba1.Pr08.Ex1.Circle;
import ru.kotadmi.Laba1.Pr08.Ex1.Rectangle;
import ru.kotadmi.Laba1.Pr08.Ex1.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {
    JButton btn;

    Window(){
        super("Example");
        btn = new JButton("Press the button");
        setBounds(0,0,1000,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(btn);
        btn.addMouseListener(new Mouse(this));
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
            Random random = new Random();
            graphics2D.setColor(new Color (Math.abs(random.nextInt())));
            int k = (int) (Math.random() * 2);
            if (k == 1) drawShape(new Circle( Math.random()*500, Math.random()*500, Math.random()*500), graphics2D);
            if (k == 0) drawShape(new Rectangle(Math.random()*300, Math.random()*300, Math.random()*700, Math.random()*700), graphics2D);
    }
    private void drawShape(Shape a, Graphics2D graphics2D){
        a.draw(graphics2D);
    }
}
