package com.zhuanghm.maskdemo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnMask).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getRectMaskBitmap();
            }
        });
//       ;
    }

    /**
     * 获取屏幕像素密度
     */
    private float getDensityPixl(int dp) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        return displayMetrics.density * dp;
    }

    private Bitmap getRectMaskBitmap() {

        Paint paint = new Paint();
        paint.setColor(0x50000000);
        Canvas canvas = new Canvas();
        canvas.drawColor(0xff000000);
        canvas.drawRect(10, 10, 100, 100, paint);
//        ShapeDrawable sd = new ShapeDrawable(new RectShape());
//        sd.setBounds(0,0,200,200);
//        sd.draw(canvas);
        return null;
    }

//    public Bitmap getRoundedCornerBitmap() {
//        Resources res = getResources();
//        Bitmap bmp = BitmapFactory.decodeResource(res, R.mipmap.fang);
//        Bitmap dst = BitmapFactory.decodeResource(res, R.drawable.yuan);
//
//        Canvas canvas = new Canvas(bmp);
//        final int color = 0xff424242;
//        final Paint paint = new Paint();
//
//
//        paint.setAntiAlias(true);
////        canvas.drawARGB(0, 0, 0, 0);
////        paint.setColor(color);
////
//        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
//
//        canvas.drawBitmap(dst, 0, 0, paint);
//        return bmp;
//    }
}
