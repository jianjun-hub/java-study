package com.jianjun.study;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class chatApplet  extends Applet implements MouseListener,Runnable {
    private  int x,y;
    @Override
    public void init() {
        x = 0;
        y = 0;
        //设置背景色为黑色
        setBackground(Color.black);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e) {

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

    @Override
    public void run() {

    }
}
