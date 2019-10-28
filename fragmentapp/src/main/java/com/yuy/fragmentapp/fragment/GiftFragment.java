package com.yuy.fragmentapp.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yuy.fragmentapp.R;

/**
 * Author: yuyang
 * Date:2019/10/28 11:33
 * Description:
 * Version:
 */
public class GiftFragment extends Fragment {

    //第一次绘制Fragment 回调的方法
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_gift, null);
    }


    //系统创建Fragment 回调方法
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //当用户离开Fragment 回调的方法
    @Override
    public void onPause() {
        super.onPause();
    }



}
