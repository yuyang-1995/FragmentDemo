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
 * Date:2019/10/28 16:07
 * Description: 展示结果的fragment
 * Version:
 */
public class ResultFragment extends Fragment {

    private TextView tv_show;

    /**
     * 第一次加载视图
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_result, null);

        tv_show = view.findViewById(R.id.id_tv_fc);
        //先去调用 getArgus 方法获取bundle

        Bundle bundle = getArguments();

        if (bundle != null) {
            String info = bundle.getString("info");
            tv_show.setText(info);
        }

        return view;
    }

}
