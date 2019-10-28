package com.yuy.dtfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.yuy.dtfragment.fragment.ContentFragment;
import com.yuy.dtfragment.fragment.TitleFragment;

/**
 * 演示fragment的动态演示
 *
 * 1:  创建碎片管理器对象
 * 2： 获取fragment事务对象， fragment的替换通过事务管理
 * 3： 有了事务， 通过事务动态方法，动态添加移除替换fragment
 * 4： 提交事务
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1：创建FragmnetManager 对象
        FragmentManager manager = getFragmentManager();

        //2： 获取Fragmnet 的事物对象并开启事物
        FragmentTransaction transaction = manager.beginTransaction();

        //3： 调用事物的动态方法 操作fragment
        transaction.add(R.id.title_layout, new TitleFragment());

        transaction.add(R.id.content_layout, new ContentFragment());
//        transaction.remove(arg0); remove(需要移除的fragment对象)
//        transaction.replace(arg0, arg1); 替换fragment

        //4:  提交事务
        transaction.commit();

    }
}
