package com.verysoft.louis.myandroidlabs.MessageShow;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.verysoft.louis.myandroidlabs.R;

/**
 * 消息提示 Toast
 * 使用静态方法 makeText()
 * 使用构造函数
 */
public class ToastDemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast_demo);
    }

    /**
     * 事件处理函数
     * @param view 事件源
     */
    public void displayToast(View view) {

        Log.i("DEBUG", String.valueOf(view.getId()));

        switch(view.getId())
        {
            case R.id.btnSimpleToast:
                //使用静态方法makeText构建Toast
                //参数： @context 上下文   @text 消息内容  持续时间
                // .show() 显示
                //下面两种写法都可以。
                Toast.makeText(getApplicationContext(), "使用静态方法makeText", Toast.LENGTH_SHORT).show();
                //Toast.makeText(this, "使用静态方法makeText", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnConstructorToast:{
                //使用构造函数构建Toast
                Toast toast = new Toast(this);
                //创建要显示的view
                ImageView image = new ImageView(this);
                image.setImageResource(R.drawable.apple);
                //设置属性
                toast.setView(image);
                toast.setDuration(1000); //可以使用固定值，或常量值。单位为毫秒。
                toast.show();
                break;
            }

            case R.id.btnConstructorToast2:{
                //显示出有图标和文字的Toast
                //创建view （动态解析布局文件）
                View toastView = LayoutInflater.from(this).inflate(R.layout.toast_view, null);
                //构造
                Toast toast = new Toast(this);
                //设置
                toast.setView(toastView);

                break;
            }
        }
    }
}
