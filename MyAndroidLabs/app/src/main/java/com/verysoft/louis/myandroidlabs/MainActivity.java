package com.verysoft.louis.myandroidlabs;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.verysoft.louis.myandroidlabs.BasicComponent.BasicComponent;
import com.verysoft.louis.myandroidlabs.ControlUI.ControlUI;
import com.verysoft.louis.myandroidlabs.LayoutMgr.LayoutMgr;
import com.verysoft.louis.myandroidlabs.LoginUI.LoginBasicLayout;
import com.verysoft.louis.myandroidlabs.MessageShow.ToastDemoActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //给视图上的按钮绑定单击事件监听器
        findViewById(R.id.btnControlUI).setOnClickListener(this);
        findViewById(R.id.btnLayoutMgr).setOnClickListener(this);
        findViewById(R.id.btnBasicComponent).setOnClickListener(this);
        findViewById(R.id.btnToastDemo).setOnClickListener(this);
        findViewById(R.id.btnNotification).setOnClickListener(this);
        findViewById(R.id.btnAlertDialog).setOnClickListener(this);
        findViewById(R.id.btnEventDemo).setOnClickListener(this);
        findViewById(R.id.btnShowLoginDemo).setOnClickListener(this);
        findViewById(R.id.btnImageDemo).setOnClickListener(this);
        findViewById(R.id.btnOptionControl).setOnClickListener(this);
        findViewById(R.id.btnTouchDemo).setOnClickListener(this);
        findViewById(R.id.btnDemo).setOnClickListener(this);

        //在代码中获取字符串资源
        Resources res = getResources();
        String strTest = res.getString(R.string.test);
        Log.i("TEST", "字符串为：" + strTest);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnSplashScreen: {
                Intent intent = new Intent(MainActivity.this, SplashScreenActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnStyleAndTheme: {
                Intent intent = new Intent(MainActivity.this, StylesAndThemesActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnControlUI: {
                Intent intent = new Intent(MainActivity.this, ControlUI.class);
                startActivity(intent);
                break;
            }

            case R.id.btnLayoutMgr: {
                Intent intent = new Intent(MainActivity.this, LayoutMgr.class);
                startActivity(intent);
                break;
            }
            case R.id.btnBasicComponent: {
                Intent intent = new Intent(MainActivity.this, BasicComponent.class);
                startActivity(intent);
                break;
            }
            case R.id.btnToastDemo: {
                Intent intent = new Intent(MainActivity.this, ToastDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnNotification: {
                Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnAlertDialog: {
                Intent intent = new Intent(MainActivity.this, AlertDialogActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnEventDemo: {
                //Toast.makeText(MainActivity.this, "hello button", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ButtonEventDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnShowLoginDemo: {
                Intent intent = new Intent(MainActivity.this, LoginBasicLayout.class);
                startActivity(intent);
                break;
            }
            case R.id.btnImageDemo: {
                Intent intent = new Intent(MainActivity.this, ImageDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnOptionControl: {
                Intent intent = new Intent(MainActivity.this, OptionControlActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnTouchDemo: {
                Intent intent = new Intent(MainActivity.this, TouchEventForViewActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnDemo: {
                Intent intent = new Intent(MainActivity.this, DemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnGraphic: {
                Intent intent = new Intent(MainActivity.this, com.verysoft.louis.myandroidlabs.Graphic.MainActivity.class);
                startActivity(intent);
                break;
            }
        }
    }

    //触屏事件
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // 按下，移动，弹起
        int action = event.getAction(); //得到当前用户动作
        float x = event.getX(); //得到当前用户坐标
        float y = event.getY();
        switch (action) {
            case MotionEvent.ACTION_DOWN: //按下
                Log.i("TEST", "onTouchEvent 按下 " + "X=" + x + ",Y=" + y);
                break;
            case MotionEvent.ACTION_MOVE: //移动
                Log.i("TEST", "onTouchEvent 移动 " + "X=" + x + ",Y=" + y);
                break;
            case MotionEvent.ACTION_UP: //弹起
                Log.i("TEST", "onTouchEvent 弹起 " + "X=" + x + ",Y=" + y);
                break;
        }

        //Log.i("TEST", "onTouchEvent");

        //默认返回false，表示在自身方法中没有做完，需要向上传递。
        //return super.onTouchEvent(event);
        //如果认为在方法中事情做完了，可以返回true
        return true;
    }

}
