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
public class DrawView3 extends View {

    /**
     * 构造方法
     * @param context
     * @param attrs
     */
    public DrawView3(Context context, AttributeSet attrs) {
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

        Paint paint2 = new Paint();
        paint2.setAntiAlias(true); //抗锯齿
        paint2.setStrokeWidth(3); //笔触宽度
        paint2.setStyle(Paint.Style.STROKE); //填充样式为描边

        paint2.setColor(Color.BLUE);
        canvas.drawCircle(100,100,90, paint2); //绘制蓝色圆形

        paint2.setColor(Color.YELLOW);
        canvas.drawCircle(250,100,90, paint2); //绘制黄色圆形

        paint2.setColor(Color.BLACK);
        canvas.drawCircle(400,100,90, paint2); //绘制黑色圆形

        paint2.setColor(Color.GREEN);
        canvas.drawCircle(200,200,90, paint2); //绘制绿色圆形

        paint2.setColor(Color.RED);
        canvas.drawCircle(350,200,90, paint2); //绘制红色圆形
    }
}
