package com.verysoft.louis.myandroidlabs.LayoutMgr;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.verysoft.louis.myandroidlabs.R;

/**
 * FrameLayout 帧布局
 * Created by Administrator on 2016/9/13.
 */
public class FrameLayoutDemo extends Activity {
    //申明控件
    private FrameLayout layout;
    private TextView tvFinish, tvTouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout_demo);

        //初始化控件
        initControl();
    }

    private void initControl() {
        layout = (FrameLayout) findViewById(R.id.layout);
        tvFinish = (TextView) findViewById(R.id.tvFinish);
        tvTouch = (TextView) findViewById(R.id.tvTouch);

        //触屏事件
        layout.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_MOVE){
                    tvTouch.setVisibility(View.INVISIBLE); //设置上面的视图不可见
                    tvFinish.setVisibility(View.VISIBLE); //设置下面的控件可见

                    /*float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    Log.i("TEST","x:" + x + ",y:" + y);*/
                }
                return true;
            }
        });
    }

    /**
     * 触屏事件
     * @param event
     * @return
     *//*
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //return super.onTouchEvent(event);

        int action = event.getAction(); //得到当前用户动作
        float x = event.getX(); //得到当前用户坐标
        float y = event.getY();

        switch (action){
            case MotionEvent.ACTION_DOWN: //按下
                Log.i("TEST", "onTouchEvent 按下 " + "X="+ x + ",Y=" + y);
                break;
            case MotionEvent.ACTION_MOVE: //移动
                Log.i("TEST", "onTouchEvent 移动 " + "X="+ x + ",Y=" + y);
                break;
            case MotionEvent.ACTION_UP: //弹起
                Log.i("TEST", "onTouchEvent 弹起 " + "X="+ x + ",Y=" + y);
                break;
        }

        return true;
    }*/
}
