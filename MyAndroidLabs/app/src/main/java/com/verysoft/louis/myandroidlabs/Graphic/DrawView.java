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
public class DrawView extends View {

    /**
     * 构造方法
     * @param context
     * @param attrs
     */
    public DrawView(Context context, AttributeSet attrs) {
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
        paint.setColor(Color.RED); //设置颜色为红色
        paint.setShadowLayer(2,3,3,Color.rgb(180,180,180)); //设置阴影
        canvas.drawRect(40,40,200,100, paint); //绘制矩形
    }
}
