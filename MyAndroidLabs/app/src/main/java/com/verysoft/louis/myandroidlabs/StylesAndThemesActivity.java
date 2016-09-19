package com.verysoft.louis.myandroidlabs;

import android.app.Activity;
import android.os.Bundle;

/**
 * 样式和主题
 * http://blog.csdn.net/candcplusplus/article/details/21797645
 * http://blog.csdn.net/dawanganban/article/details/17732701
 * Created by Administrator on 2016/9/19.
 */
public class StylesAndThemesActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_and_theme_activity);

        //查看成员
        //R.style
        //R.attr

    }
}

/*
样式（style）是用来指定视图或窗口的外观和格式的一组属性集合。
样式可以用来指定高度、填充、字体大小、背景颜色等等。样式在XML资源文件中定义，和指定布局的XML文件是分开的。
Android中的样式和网页设计中的CSS（级联样式表）践行同样的哲学：将设计和内容分开。

主题（theme）是应用到整个activity或者应用程序的样式。
而不是像上面的例子一样只应用到单个视图。当一个样式变成主题后，Activity或应用程序中的所有视图都将应用这个样式中它所支持的属性。
例如，你可以将上面例子中的GodeFont样式作为一个activity的主题，然后这个Activity中所有的文字都将变成monospace字体。
*/

/*
1. 定义样式（Defining Styles）
1.1 创建样式的步骤：
    1.在工程的res/values目录下创建一个XML文件。这个XML文件的根节点必须是<resources>。
    2.为每一个你要创建的样式创建一个<style>元素。并且用来识别每个<style>的name属性的值必须是独一无二的。
    3.为样式的每一个属性创建一个<item>元素，每个<item>都必须有一个name来表示样式属性，一个和name对应的值。
        这个值可以是关键字字符串、十六进制表示的颜色、对另一个资源类型的引用，或者其他值。
下面是一个只有单个样式的示例文件
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="CodeFont" parent="@android:style/TextAppearance.Medium">
        <item name="android:layout_width">fill_parent</item>
        <item name="android:layout_height">wrap_content</item>
        <item name="android:textColor">#00FF00</item>
        <item name="android:typeface">monospace</item>
    </style>
</resources>

<resources>的每个子元素在编译期间都会被转化为一个应用程序资源对象。
为每一个样式指定name后，IDE会在R文件中为这个样式创建一个ID，以后就可以在布局文件中根据@style/id来引用相应的样式。
比如要引用上面定义的样式，可以使用@style/CodeFont。

<style>元素的parent属性是可选的。
parent属性用来指定当前样式要继承属性的样式的id（样式之间是可以继承的）。你还可以覆写继承来的属性。

***********************
在XML文件中为一个应用程序或者Activity定义一个主题和为一个视图定义一个样式的方式是一模一样的。*
在上面定义的GodeFont样式即可以作为单个视图的样式，也可以作为一个应用程序或Activity的主题。
如何将一个样式应用到一个视图或者整个应用程序或Activity在稍后说明。

1.2 继承
<style>的parent属性可以指定一个你想要继承的属性。
你可以继承一个现有的样式然后定义你想要修改或添加的属性。
你可以继承你自己定义的属性，也可以继承平台内置的属性。比如，你可以继承Android平台的默认字体外观然后修改它。
    <style name="GreenText" parent="@android:style/TextAppearance">
        <item name="android:textColor">#00FF00</item>
    </style>

如果你要继承自己定义的样式，你不需要使用parent属性，只需要在把你新定义的样式的name的前缀名设为你要继承的属性的name。
前缀name和name用点号分开。例如，如果你要定义一个新颜色继承自CodeFont样式，然后把字体颜色设为红色，你可以这样定义这个样式：
    <style name="CodeFont.Red">
        <item name="android:textColor">#FF0000</item>
    </style>
注意：虽然这个样式没有使用parent属性，但是它的name前缀是CodeFont，所以这个演示继承了CodeFont样式的所有属性，但是将text颜色修改成了红色。
你可以用@style/CodeFont.Red来引用这个样式。

1.3 多层次继承
只要你愿意，你可以任意扩展继承层次。还是通过name来进行。
比如，你可以这样来继承CodeFont.Red：
    <style name="CodeFont.Red.Big">
        <item name="android:textSize">30sp</item>
    </style>
这个样式继承了CodeFont和CodeFont.Red样式所有属性，然后添加了一个android:textSize属性。
现在你可以用@/style/CodeFont.Red.Big来引用它。
***注意：通过改name来继承样式的方法只适用于你自己定义的样式。想要继承Android内置的样式，你还得用parent属性。

1.4 样式属性
现在你已经知道样式是怎么定义的了，你还得知道在<item>元素中哪些样式属性是可以利用的。
你可能已经熟悉了一些，比如layout_width和textColor。还有很多样式属性我们可以使用。
查看一个视图可以支持哪些属性，最好的地方是它对应的class reference，那儿列出了它能支持的所有XML属性。
比如，所有在EditText XML attributes表中列出的属性都可以在为EditText定义的样式中使用。
其中列出的一个属性是android:inputType，以前你可能在<EditText>元素中使用android:inputType，就像这样：
<EditText
    android:inputType="number"
    ... />
现在你可以为EditText创建一个样式，来包含这个属性
<style name="Numbers">
  <item name="android:inputType">number</item>
  ...
</style>
这样你就可以在布局文件中直接引用这个样式，而不是在布局文件中指定inputType属性（记住我们的哲学：设计和内容分开）
<EditText
    style="@style/Numbers"
    ... />
这个简单例子中，使用样式的方法好像比没使用样式方法多做了一些工作，
但是，当你需要很多样式属性时，我们就可以在很多地方重复利用这个定义的样式，这个回报是值得的。
（定义一次，多次使用）

想查看所有可能的样式属性，看R.attr reference。
记住，并不是所有的视图对象都支持相同的样式属性，所以你通常应该参考特定视图类型来查看所支持的样式属性。
然而，如果你将一个样式应用到一个视图，而这个视图并不支持这个样式中所有属性，视图将只应用它支持的属性，而忽略那些它不支持的属性。

一些样式属性，不适用于任何视图元素，只能应用到主题上。
这些样式属性适用于整个窗口而不是任何视图类型。
比如，一些主题的样式属性可以隐藏应用标题，隐藏工具栏，或者改变窗口的背景，这些属性就不属于任何视图对象。
想查看这些theme-only样式属性，查看R.attr参考中以”window“开通的属性。
比如windowNoTitle和windowBackground只有在样式作为主题应用到Activity或整个应用程序时才有效。

注意：不要忘记<item>中的属性名称都以命名空间android:开头。比如：<item name="android:inputType">


2. 为UI设置样式和主题
2.1 为单个视图设置样式
要为单个视图设置样式，你需要在XML布局文件中找到对应的视图标签，并为之添加sytle属性。

比如，下面的例子为一个TextView设置CodeFont样式。
<TextView
    style="@style/CodeFont"
    android:text="@string/hello" />
注意style属性没有用android:前缀

2.2 为Activity或应用程序设置主题
为Activity或应用程序设置主题，你需要在Androidmanifest.xml文件中为<activity>或<application>标签添加android:theme属性。
比如，下面的例子为整个应用程序设置主题：
<application android:theme="@style/CustomTheme">
下面的例子为一个Activity设置主题：
<activity android:theme="@android:style/Theme.Dialog">
或者你想让你的Activity背景透明，你可以使用Translucent主题
<activity android:theme="@android:style/Theme.Translucent">

如果你喜欢某个内置主题，但是想做细微的修改，你可以自定义一个主题并继承这内置主题。比如下面这样：
<color name="custom_theme_color">#b0b0ff</color>
<style name="CustomTheme" parent="android:Theme.Light">
    <item name="android:windowBackground">@color/custom_theme_color</item>
    <item name="android:colorBackground">@color/custom_theme_color</item>
</style>
然后，你就可以在Android Manifest为Activity指定主题了
<activity android:theme="@style/CustomTheme">

*/