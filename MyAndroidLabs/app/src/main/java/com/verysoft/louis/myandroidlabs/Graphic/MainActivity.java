package com.verysoft.louis.myandroidlabs.Graphic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.verysoft.louis.myandroidlabs.R;

/**
 * 图形图像演示 主活动
 * Created by Louis on 2016/9/21.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graphic_main_activity);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCommonDraw: {
                Intent intent = new Intent(MainActivity.this, DrawViewDemoActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
