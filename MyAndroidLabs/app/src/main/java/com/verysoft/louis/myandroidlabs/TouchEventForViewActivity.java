package com.verysoft.louis.myandroidlabs;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * 触屏Demo
 * Created by Administrator on 2016/9/7.
 */
public class TouchEventForViewActivity extends Activity {
    //声明控件
    private View view;
    private TextView tvPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.touch_for_view);

        //初始化控件，关联控件
        initControl();

        //在控件上注册事件监听
        view.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_MOVE){
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    tvPosition.setText("X="+x + ",Y="+y);
                }
                return true;
                //return false;
            }
        });
    }

    private  void initControl()
    {
        view = findViewById(R.id.view);
        tvPosition = (TextView) findViewById(R.id.tvPosition);
    }
}
