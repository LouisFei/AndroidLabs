package com.verysoft.louis.myandroidlabs;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
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
import com.verysoft.louis.myandroidlabs.LoginUI.LoginBasicLayout;

public class MainActivity extends Activity implements View.OnClickListener {

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
        findViewById( R.id.btnEventDemo).setOnClickListener(this);
        findViewById( R.id.btnShowLoginDemo).setOnClickListener(this);
        findViewById(R.id.btnImageDemo).setOnClickListener(this);
        findViewById(R.id.btnOptionControl).setOnClickListener(this);

        //在代码中获取字符串资源
        Resources res = getResources();
        String strTest = res.getString(R.string.test);
        Log.i("TEST", "字符串为：" + strTest);
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
            case R.id.btnEventDemo:{
                //Toast.makeText(MainActivity.this, "hello button", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ButtonEventDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnShowLoginDemo:{
                Intent intent = new Intent(MainActivity.this, LoginBasicLayout.class);
                startActivity(intent);
                break;
            }
            case R.id.btnImageDemo:{
                Intent intent = new Intent(MainActivity.this, ImageDemoActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btnOptionControl:{
                Intent intent = new Intent(MainActivity.this, OptionControlActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
