package com.yuy.valuetransform.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.yuy.valuetransform.R;

/**
 * Author: yuyang
 * Date:2019/10/28 21:14
 * Description:
 * Version:
 */
public class LeftFragment extends Fragment {


    private Button mButton;
    private EditText mEditText;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_left, null);

        mButton = view.findViewById(R.id.id_btn_lf);

        mEditText = view.findViewById(R.id.id_et_lf);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String info = mEditText.getText().toString().trim();

                //方式1 ：获取右侧碎片 执行方法findFragmentById
//             RightFragment rightFragment = (RightFragment) getFragmentManager().findFragmentById(R.id.id_m3_fr);
//               调用右侧碎片中的方法传递数据
//             rightFragment.setTextView(info);

                //方式2： 直接获取右侧控件
                // 先调用getFragmentManager 获得  FragmentManager对象，
                //然后 调用findFragmentById  获取右侧 fragment 对象
                //再调用 getView 获得右侧 fragment 的view 对象， 最后调用 view 的findViewById 获取TextView 的实例
//                TextView textView = getFragmentManager().findFragmentById(R.id.id_m3_fr).getView().findViewById(R.id.id_tv_fr);
//
//                textView.setText(info);


                //方式3： 当为两个碎片为静态加载
                // 由于碎片实例显示在活动中 可以直接通过 Activity 控件 id 获得获取目标控件
                TextView textView1 = (TextView) getActivity().findViewById(R.id.id_tv_fr);

                textView1.setText(info);

            }
        });

        return view;
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }


}
