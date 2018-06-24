package com.example.bubbledraw;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.Random;

public class Bubble {
    private int x;
    private int y;
    private int size;
    private int color;
    private int xspeed, yspeed;
    private final int MAX_SPEED = 5;

    private Random rand = new Random();
    private Paint myPaint = new Paint();

    public Bubble(int newX, int newY, int newSize) {
        x = newX;
        y = newY;
        size = newSize;
        color = Color.argb(rand.nextInt(256),
                rand.nextInt(256),
                rand.nextInt(256),
                rand.nextInt(256) );
        xspeed = rand.nextInt(MAX_SPEED * 2) - MAX_SPEED;
        yspeed = rand.nextInt(MAX_SPEED * 2) - MAX_SPEED;
    }

    public void draw(Canvas canvas) {
        myPaint.setColor(color);
        canvas.drawOval(x - size/2, y - size/2, x + size/2, y + size/2, myPaint);
    }

    public void update() {
        x += xspeed;
        y += yspeed;
    }
}
