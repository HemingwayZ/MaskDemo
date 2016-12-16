package com.zhuanghm.maskdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Hemingway1014@gmail.com on 2016/12/16.
 */

public class MaskView extends ImageView {
    private Paint mPaint = new Paint();

    public MaskView(Context context) {
        super(context);
    }

    public MaskView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MaskView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        mPaint.setColor(0xff000000);
        canvas.drawRect(0, 0, 100, 100, mPaint);
        super.onDraw(canvas);
    }
}
