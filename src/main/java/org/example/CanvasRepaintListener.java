package org.example;

import org.example.MainCanvas;

import java.awt.*;
public interface CanvasRepaintListener {
    void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime);
}

