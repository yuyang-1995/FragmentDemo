package com.yuy.valuetransform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import com.yuy.valuetransform.fragment.ResourceFragment;

public class Main2Activity extends AppCompatActivity implements ResourceFragment.MyListener{

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mTextView = findViewById(R.id.id_tv_context);
    }

    private OwnListener mOwnListener = new OwnListener();


    class OwnListener implements ResourceFragment.MyListener {
        @Override
        public void sendMsg(String info) {
            mTextView.setText(info);
        }
    }

    @Override

    public void sendMsg(String info) {

        if (!TextUtils.isEmpty(info)) {

            mTextView.setText(info);

        }

    }
}
