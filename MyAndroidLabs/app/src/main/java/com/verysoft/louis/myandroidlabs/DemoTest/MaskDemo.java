package com.verysoft.louis.myandroidlabs.DemoTest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.verysoft.louis.myandroidlabs.R;

/**
 * 遮罩效果的实现
 * http://blog.csdn.net/jueblog/article/details/12668215
 * Created by Administrator on 2016/9/14.
 */
public class MaskDemo extends Activity {

    private FrameLayout layout = null;
    private TextView textView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_mask);

        initControl();
    }

    private void initControl() {
        layout = (FrameLayout) findViewById(R.id.layout);
    }

    public void imageview_onclick(View view){
        Toast.makeText(this, "你点击了图片", 500).show();
    }

    public  void btnShowMask_onclick(View view){
        //Toast.makeText(this, "你点击了按钮，功能即将实现", 500).show();
        textView = new TextView(this);
        textView.setTextColor(Color.BLUE);
        textView.setTextSize(20);
        textView.setText("滚滚长江东逝水，浪花淘尽英雄。\n" + "是非成败转头空，\n"
                            + "青山依旧在，几度夕阳红。\n" + "白发渔樵江渚上，惯看秋月春风。 \n"
                            + "一壶浊酒喜相逢，\n" + "古今多少事，都付笑谈中。");
        textView.setGravity(Gravity.CENTER);
        //textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));
        textView.setBackgroundColor(Color.parseColor("#86222222"));

        layout.addView(textView);
    }

}
