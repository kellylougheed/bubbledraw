package com.example.bubbledraw;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.Random;

public class Bubble {

    private final int MAX_SPEED = 5;
    private Random rand = new Random();
    private Paint myPaint = new Paint();

    public void draw(Canvas canvas) {
        myPaint.setColor(color);
        canvas.drawOval(x - size/2, y - size/2, x + size/2, y + size/2, myPaint);
    }

}
