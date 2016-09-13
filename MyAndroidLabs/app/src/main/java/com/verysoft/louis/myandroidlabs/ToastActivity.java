package com.verysoft.louis.myandroidlabs;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class ToastActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast);

        findViewById(R.id.btnSimpleToast).setOnClickListener(this);
        findViewById(R.id.btnSimpleToastWithCustomPosition).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast toast = null;
        Log.i("", String.valueOf(view.getId()));
        switch(view.getId())
        {
            case R.id.btnSimpleToast:
                Toast.makeText(getApplicationContext(), "默认Toast样式", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSimpleToastWithCustomPosition:
                toast = Toast.makeText(getApplicationContext(),"自定义位置Toast", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0); //设置位置
                toast.setMargin(1, 0); //设置边距
                //toast.setText("hello 我是提示"); //设置显示文字
                toast.setView(view); //设置视图
                toast.show();
                break;
        }
    }
}
