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
public class DrawView2 extends View {

    /**
     * 构造方法
     * @param context
     * @param attrs
     */
    public DrawView2(Context context, AttributeSet attrs) {
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

        //绘制几何图形
        Paint paint1 = new Paint();
        paint1.setAntiAlias(true); //使用抗锯齿功能
        paint1.setColor(Color.RED); //设置颜色为红色
        paint1.setStrokeWidth(2); //笔触的宽度为2像素
        paint1.setStyle(Paint.Style.STROKE); //填充样式为描边
        canvas.drawRect(40, 20, 200, 200, paint1);
    }
}
