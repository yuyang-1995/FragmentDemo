package com.yuy.valuetransform.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yuy.valuetransform.R;

/**
 * Author: yuyang
 * Date:2019/10/28 21:14
 * Description:
 * Version:
 */
public class RightFragment extends Fragment {


    private TextView mTextView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_right, null);

        mTextView = view.findViewById(R.id.id_tv_fr);
        return view;

    }



    //定义函数给TV 赋值

    public void setTextView(String textView) {
        mTextView.setText(textView);
    }

}
