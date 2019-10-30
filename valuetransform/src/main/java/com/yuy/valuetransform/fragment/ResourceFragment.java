package com.yuy.valuetransform.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.yuy.valuetransform.R;

/**
 * Author: yuyang
 * Date:2019/10/28 20:00
 * Description:
 * Version:
 */
public class ResourceFragment extends Fragment {

      Button button;

      private EditText mEditText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //由于Activity 实现了 MyListener 接口， 因此可直接碎片对应的Activity 强转
        //调用 getActivity 方法获取加载碎片的活动 强转
        mMyListener = (MyListener) getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_resource, null);

        mEditText =  view.findViewById(R.id.id_et);

        button = view.findViewById(R.id.id_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String info = mEditText.getText().toString().trim();

                if (mMyListener != null) {
                    //回调给 活动
                    mMyListener.sendMsg(info);
                }
            }
        });

        return view;
    }

    private  MyListener mMyListener;


    //定义接口 接口中定义回传数据的函数
   public interface MyListener{

        void sendMsg(String info);

    }
}
