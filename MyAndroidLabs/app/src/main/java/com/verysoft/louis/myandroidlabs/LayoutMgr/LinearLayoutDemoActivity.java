package com.verysoft.louis.myandroidlabs.LayoutMgr;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.verysoft.louis.myandroidlabs.R;

/**
 * 线性布局
 * Created by Louis on 2016/9/7.
 */
public class LinearLayoutDemoActivity extends Activity {
    //声明控件
    private LinearLayout layout;
    private Button btnHor, btnVer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_demo);

        //初始化控件
        initControl();
    }

    /**
     * 初始化控件，关联控件
     */
    private void initControl() {
        layout = (LinearLayout) findViewById(R.id.layout);
        btnHor = (Button) findViewById(R.id.btnHor);
        btnVer = (Button) findViewById(R.id.btnVer);

        //注册事件监听
        ChangeOrientation listener = new ChangeOrientation();
        btnHor.setOnClickListener(listener);
        btnVer.setOnClickListener(listener);
    }

    /**
     * 内部类实现单击事件监听
     */
    class ChangeOrientation implements View.OnClickListener{

        /**
         * 事件处理程序
         * @param view 事件源
         */
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnHor:
                    //将布局改为水平排列
                    layout.setOrientation(LinearLayout.HORIZONTAL);
                    break;
                case R.id.btnVer:
                    //将布局改为垂直排列
                    layout.setOrientation(LinearLayout.VERTICAL);
                    break;
            }

        }
    }
}
