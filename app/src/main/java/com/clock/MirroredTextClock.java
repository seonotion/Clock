package com.clock;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextClock;
import android.widget.TextView;

/**
 * Created by auham on 17/03/15.
 */
public class MirroredTextClock extends TextClock {

    public MirroredTextClock(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.translate(getWidth(), 0);
        canvas.scale(-1, 1);
        float py = this.getHeight()/2.0f;
        float px = this.getWidth()/2.0f;
        canvas.rotate(180, px, py);

        super.onDraw(canvas);
    }

}
