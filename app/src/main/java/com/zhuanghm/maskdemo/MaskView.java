package com.zhuanghm.maskdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

/**
 * Created by Hemingway1014@gmail.com on 2016/12/16.
 */

public class MaskView extends ImageView {
    private Paint mPaint = new Paint();
    private Bitmap bitmap;
    private PorterDuffXfermode porterDuffXfermode;
    private Bitmap foregroundBitmap;
    public MaskView(Context context) {
        super(context, null);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        foregroundBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.book_shadow);
        porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
    }

    public MaskView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        foregroundBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.book_shadow);
        porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
    }

    public MaskView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        foregroundBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.book_shadow);
        porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);


    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MaskView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes, Paint mPaint, Bitmap bitmap, PorterDuffXfermode porterDuffXfermode) {
        super(context, attrs, defStyleAttr, defStyleRes);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
    }

    private float getDensity() {
        DisplayMetrics outMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics.density;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int density = canvas.getDensity();
        mPaint.setColor(0x50000000);
//
//        canvas.drawRect(0, 0, getDensity() * 360, getDensity() * 400, mPaint);
//
//
        mPaint.setXfermode(porterDuffXfermode);
        canvas.drawBitmap(bitmap, 100, 100, mPaint);

        super.onDraw(canvas);
    }
}
