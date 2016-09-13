package com.verysoft.louis.myandroidlabs.LayoutMgr;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

import com.verysoft.louis.myandroidlabs.R;

/**
 * Created by Louis on 2016/9/11.
 */
public class LinearLayoutDemo2Activity extends Activity {
    private LinearLayout layout;
    private CheckBox[] chks;
    private  int[] gravity = {Gravity.TOP, Gravity.BOTTOM, Gravity.LEFT, Gravity.RIGHT, Gravity.CENTER};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //关联布局文件
        setContentView(R.layout.linear_layout_demo_2_activity);

        initControl();
    }

    private void initControl() {
        layout = (LinearLayout) findViewById(R.id.layout);
        //数组分配空间
        //得到容器中子控件的个数
        int count = layout.getChildCount();
        chks = new CheckBox[count];
        //关联
        CheckedChangeListener listener = new CheckedChangeListener();
        for (int i = 0; i < count; i++){
            chks[i] = (CheckBox) layout.getChildAt(i);
            chks[i].setOnCheckedChangeListener(listener);
        }

    }

    class CheckedChangeListener implements CompoundButton.OnCheckedChangeListener{

        /**
         *
         * @param buttonView 发出事件的源
         * @param isChecked 是否选中
         */
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            //考虑互斥性
            if (buttonView == chks[0]){
                if (isChecked){
                    chks[1].setChecked(false);
                }
            }
            if (buttonView == chks[1]){
                if (isChecked){
                    chks[0].setChecked(false);
                }
            }

            if (buttonView == chks[2]){
                if (isChecked){
                    chks[3].setChecked(false);
                }
            }
            if (buttonView == chks[3]){
                if (isChecked){
                    chks[2].setChecked(false);
                }
            }

            if (buttonView == chks[4]){
                if (isChecked){
                    chks[0].setChecked(false);
                    chks[1].setChecked(false);
                    chks[2].setChecked(false);
                    chks[3].setChecked(false);
                }
            }

            int checkGravity = 0;
            for (int i = 0; i < chks.length; i++){
                if(chks[i].isChecked())
                {
                    checkGravity |= gravity[i];
                }
            }

            layout.setGravity(checkGravity);
        }
    }

}
