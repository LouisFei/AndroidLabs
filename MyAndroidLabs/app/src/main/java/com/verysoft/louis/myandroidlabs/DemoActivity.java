package com.verysoft.louis.myandroidlabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.verysoft.louis.myandroidlabs.DemoTest.MaskDemo;
import com.verysoft.louis.myandroidlabs.R;

/**
 * 演示主界面
 * Created by Administrator on 2016/9/14.
 */
public class DemoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_main);
    }

    public  void button_onclick(View view){
        switch (view.getId()){
            case R.id.btnMask:{
                Intent intent = new Intent(this, MaskDemo.class);
                startActivity(intent);
                break;
            }
        }
    }
}
