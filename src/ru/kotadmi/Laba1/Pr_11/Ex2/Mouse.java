package ru.kotadmi.Laba1.Pr_11.Ex2;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse implements MouseListener {
    Window m;
    Mouse(Window m){
        this.m = m;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        m.paint(m.getGraphics());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
