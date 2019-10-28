package com.yuy.fragmentdemo.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.yuy.fragmentdemo.R;

/**
 * Author: yuyang
 * Date:2019/10/27 23:40
 * Description:
 * Version:
 */

/**
 * 创建和使用Fragment 的步骤
 * 1：创建子类继承Fragment
 * 2：重写onCreateView 方法主要是定义fragment 的布局，以View 的形式返回fragment的视图
 *
 */
public class TitleFragment extends Fragment {


    /**
     * 表示fragment第一次绘制界面时系统回调的方法
     * @param inflater  表示布局填充器，将xml 文件转成view对象
     * @param container  表示当前fragment插入activity 的布局视图对象
     * @param savedInstanceState  表示存储上一个fragment的信息
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_title, null);

        RelativeLayout relativeLayout = view.findViewById(R.id.id_rl_title);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "我是标题栏", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
