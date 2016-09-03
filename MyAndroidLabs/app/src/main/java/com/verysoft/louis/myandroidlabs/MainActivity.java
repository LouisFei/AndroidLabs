package com.verysoft.louis.myandroidlabs;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.verysoft.louis.myandroidlabs.BasicComponent.BasicComponent;
import com.verysoft.louis.myandroidlabs.ControlUI.ControlUI;
import com.verysoft.louis.myandroidlabs.LayoutMgr.LayoutMgr;

public class MainActivity extends Activity implements View.OnClickListener {

    //1.声明控件
    private Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //给视图上的按钮绑定单击事件监听器
        findViewById( R.id.btnControlUI).setOnClickListener(this);
        findViewById( R.id.btnLayoutMgr).setOnClickListener(this);
        findViewById( R.id.btnBasicComponent).setOnClickListener(this);
        findViewById( R.id.btnToast).setOnClickListener(this);
        findViewById( R.id.btnNotification).setOnClickListener(this);
        findViewById( R.id.btnAlertDialog).setOnClickListener(this);
        findViewById( R.id.btnTest).setOnClickListener(this);

        //2.关联控件
        btnTest = (Button) findViewById(R.id.btnTest);
        //所有的控件都是从View派生

        Listener listener = new Listener();
        //3.注册事件监听
        btnTest.setOnClickListener(
                //实现接口的类对象 View.OnClickListener
                listener
        );
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

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
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
            case R.id.btnToast: {
                Intent intent = new Intent(MainActivity.this, ToastActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnNotification:{
                Intent intent = new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnAlertDialog:{
                Intent intent = new Intent(MainActivity.this, AlertDialogActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnTest:{
                Toast.makeText(MainActivity.this, "hello button", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
