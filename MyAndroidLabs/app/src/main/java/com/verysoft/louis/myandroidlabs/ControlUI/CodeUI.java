package com.verysoft.louis.myandroidlabs.ControlUI;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.verysoft.louis.myandroidlabs.R;

public class CodeUI extends Activity {

    public TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_code_ui);

        FrameLayout frameLayout = new FrameLayout(this); //创建帧布局管理器
        frameLayout.setBackgroundColor(Color.RED); //设置背景
        setContentView(frameLayout); //设置在Activity中显示frameLayout

        //创建一个TextView组件
        TextView textView1 = new TextView(this);
        textView1.setText("在代码中控制UI界面"); //设置显示的文字
        textView1.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24); //设置文字大小，单位为像素
        textView1.setTextColor(Color.rgb(1, 1, 1));  //设置文字的颜色
        frameLayout.addView(textView1); //将textView1添加到布局管理器中

        textView2 = new TextView(this);
        textView2.setText("单击进入游戏……");
        textView2.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24);
        textView2.setTextColor(Color.rgb(1, 1, 1));
        textView2.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);


        textView2.setOnClickListener(new View.OnClickListener() { //添加单击事件监听器
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(CodeUI.this).setTitle("系统提示") //设置对话框的标题
                        .setMessage("游戏有风险，进入需谨慎，真的要进入吗？") //设置对话框的显示内容
                        .setPositiveButton("确定", //为“确定”按钮添加单击事件
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Log.i("", "进入游戏"); //输出消息日志
                                    }
                                })
                        .setNegativeButton("退出", //为“退出”按钮添加单击事件
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Log.i("", "退出游戏"); //输出消息日志
                                        finish(); //结束游戏
                                    }
                                }
                        ).show(); //显示对话框
            }
        });

        frameLayout.addView(textView2);
    }

}
