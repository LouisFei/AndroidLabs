package com.verysoft.louis.myandroidlabs.Graphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * 自定义视图
 * Created by Louis on 2016/9/21.
 */
public class DrawView4 extends View {

    /**
     * 构造方法
     * @param context
     * @param attrs
     */
    public DrawView4(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 重写onDraw方法
     * @param canvas 画布
     */
    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);

        //Paint类代表画笔
        //Canvas类代表画布

        //canvas.drawColor(Color.WHITE); //指定画布的背景色为白色

        Paint paint = new Paint(); //定义一个采用默认设置的画笔
        paint.setColor(0xFFFF6600); //设置画笔颜色
        paint.setTextAlign(Paint.Align.LEFT); //设置文字左对齐
        paint.setTextSize(24); //设置文字大小
        paint.setAntiAlias(true); //抗锯齿
        canvas.drawText("绘制文字，你好！",50,50,paint); //绘制文字
    }
}
