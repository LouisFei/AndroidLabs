package com.verysoft.louis.myandroidlabs;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * 选项控件Demo
 * Created by Administrator on 2016/9/7.
 */
public class OptionControlActivity extends Activity {
    //声明控件
    private RadioGroup rgCourse;
    private TextView tvChoice, tvChoice2;
    private RadioButton radJava, radAndroid, radPhp;
    private CheckBox chkJava, chkAndroid, chkPhp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_control);

        //关联控件
        rgCourse = (RadioGroup) findViewById(R.id.rgCourse);
        tvChoice = (TextView) findViewById(R.id.tvChoice);
        radJava = (RadioButton) findViewById(R.id.radJava);
        radAndroid = (RadioButton) findViewById(R.id.radAndroid);
        radPhp = (RadioButton) findViewById(R.id.radPhp);

        tvChoice2 = (TextView) findViewById(R.id.tvChoice2);
        chkJava = (CheckBox) findViewById(R.id.chkJava);
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkPhp = (CheckBox) findViewById(R.id.chkPhp);

        //设置事件
        rgCourse.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            /**
             *
             * @param radioGroup 事件源
             * @param i 选中的单选按钮的ID
             */
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                /*Log.i("TEST", "onCheckedChanged-" + i);
                Log.i("TEST", "Java Id:" + R.id.radJava);*/

                /*switch (i){
                    case R.id.radJava:
                        tvChoice.setText("课程：Java");
                        break;
                    case R.id.radAndroid:
                        tvChoice.setText("课程：Android");
                        break;
                    case R.id.radPhp:
                        tvChoice.setText("课程：PHP");
                        break;
                }*/

                if(radJava.isChecked()){
                    tvChoice.setText("课程：Java");
                }else if(radAndroid.isChecked()){
                    tvChoice.setText("课程：Android");
                }else if(radPhp.isChecked()){
                    tvChoice.setText("课程：PHP");
                }
            }
        });

        //设置默认属性
        radPhp.setChecked(true);

        chkPhp.setChecked(true);

        //设置事件监听
        CheckedChangeListener listener = new CheckedChangeListener();
        chkJava.setOnCheckedChangeListener(listener);
        chkAndroid.setOnCheckedChangeListener(listener);
        chkPhp.setOnCheckedChangeListener(listener);
    }

    //内部类
    class CheckedChangeListener implements CompoundButton.OnCheckedChangeListener{

        StringBuilder sb = new StringBuilder("你选的课程是：");
        String str;

        /**
         * 状态改变事件
         * @param compoundButton 事件源
         * @param isChecked 选中状态，选中为true，反之为false
         */
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
            Log.i("TEST", "onCheckedChanged：" + isChecked);

            switch (compoundButton.getId()){
                case R.id.chkJava:
                    str = "Java ";
                    changeString(str, isChecked);
                    break;
                case R.id.chkAndroid:
                    str = "Android ";
                    changeString(str, isChecked);
                    break;
                case R.id.chkPhp:
                    str = "PHP ";
                    changeString(str, isChecked);
                    break;
            }

            //显示结果
            tvChoice2.setText(sb.toString());
        }

        /**
         * 修改字符串
         * @param str
         * @param isChecked
         */
        private  void changeString(String str, boolean isChecked){
            if(isChecked){
                //字符串连接
                sb.append(str);
            }
            else{
                //字符串删除
                int start = sb.indexOf(str);
                if(start != -1){
                    //字符串存在
                    int end = str.length() + start;
                    sb.delete(start, end);
                }
            }
        }
    }
}
