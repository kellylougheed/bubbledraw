package com.example.bubbledraw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.view.View;
import java.util.ArrayList;
import java.util.Random;

public class BubbleView extends ImageView implements View.OnTouchListener {

    private Handler h = new Handler();

    public BubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

    }

    private Runnable r = new Runnable() {
        @Override
        public void run() {
            for (Bubble b : bubbleList) {
                b.update();
            }
            invalidate();
        }
    };

    protected void onDraw(Canvas canvas) {
        for (Bubble b : bubbleList) {
            b.draw(canvas);
        }
        h.postDelayed(r, delay);
    }

    public void testBubbles() {

        invalidate();
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int s = rand.nextInt(size) + size;
            bubbleList.add(new Bubble(x, y, s));
            return true;
        }
    }
}
