package com.yuy.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;

/**
 *  静态
 *  步骤
 *  1： 继承Fragment 重写onCreateView 设置Fragment 布局文件
 *  2： 在Activity 中声明Fragment 使用方式与View相同
 *
 *  效果：
 *   2个Fragment一个标题Fragment 一个内容Fragment
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //去除标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
    }


}
