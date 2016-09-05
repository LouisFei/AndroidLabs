package com.verysoft.louis.myandroidlabs;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

/**
 * 按钮事件监听的三种方法：
 * 1、内部类
 * 2、匿名类
 * 3、XML申明
 * Created by Administrator on 2016/9/5.
 */
public class ButtonEventDemoActivity extends Activity {
    //1.声明控件
    private Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.button_event_demo_layout);

        //2.关联控件
        btnTest = (Button) findViewById(R.id.btnTest);
        //所有的控件都是从View派生

        //3.注册事件监听
        /*Listener listener = new Listener();
        btnTest.setOnClickListener(
                //实现接口的类对象 View.OnClickListener
                listener
        );*/

        //匿名类
        /*btnTest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //事件处理程序
                Log.i("TEST","以匿名类的方法，实现单击！");
            }
        });*/

    }

    /**
     * 当以XML方式设置事件时，回调
     * 要求方法的原型与OnClickListenter中定义的方法原型一致
     * @param view
     */
    public void click(View view){
        //事件处理程序
        Log.i("TEST","以XML方式设置事件");
    }

    //内部类
    class Listener implements View.OnClickListener
    {
        @Override
        public void onClick(View view) {
            //回调的方法，事件处理程序
            Log.i("TEST","按钮被单击了!");
        }
    }
}
