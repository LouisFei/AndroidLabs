package com.verysoft.louis.myandroidlabs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by Louis on 2016/9/5.
 */
public class ImageDemoActivity extends Activity{

    //1.声明控件
    private ImageView image;
    private Button btnChange;
    private ImageButton imgBtn;

    //声明数组，存储资源
    private int[] resIds = {
            R.drawable.android_logo,
            R.drawable.apple,
            R.drawable.android_worldreader
    };
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_demo_activity);

        //2.关联
        image = (ImageView) findViewById(R.id.imageView1);
        btnChange = (Button) findViewById(R.id.btnChange);
        imgBtn = (ImageButton) findViewById(R.id.imageButton1);

        imgBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //image.setImageResource(R.drawable.android_logo);
                index++;
                if (index > resIds.length - 1){
                    index = 0;
                }
                image.setImageResource(resIds[index]);
            }
        });
    }

    private int flag = 0;

    /**
     * 定义回调方法
     * @param view
     */
    public void changeImage(View view){
        //事件处理程序
        if(flag == 0)
        {
            flag = 1;
            image.setImageResource(R.drawable.apple);
        }
        else{
            flag = 0;
            image.setImageResource(R.drawable.android_worldreader);
        }

    }
}
