package com.yuy.valuetransform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import com.yuy.valuetransform.fragment.ResourceFragment;

/**
 * Coder: yuyang
 * Date:  2019/10/30
 * Description:  碎片向Activity 传递信息
 * Version:
 */
public class Main2Activity extends AppCompatActivity implements ResourceFragment.MyListener{
       //活动实现对应碎片的接口
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextView = findViewById(R.id.id_tv_context);

    }

    @Override
    public void sendMsg(String info) {

        if (!TextUtils.isEmpty(info)) {

            mTextView.setText(info);

        }

    }
}
