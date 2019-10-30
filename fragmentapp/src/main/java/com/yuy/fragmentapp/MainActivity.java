package com.yuy.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.yuy.fragmentapp.fragment.GiftFragment;
import com.yuy.fragmentapp.fragment.OrderFragment;
import com.yuy.fragmentapp.fragment.PhoneFragment;
import com.yuy.fragmentapp.fragment.ShopRankFragmnet;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //创建碎片管理器
    private FragmentManager mFragmentManager;

    //创建碎片事务
    private FragmentTransaction mTransaction;

    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragmentManager = getFragmentManager();
        mTransaction = mFragmentManager.beginTransaction();

        //默认碎片
        mTransaction.add(R.id.id_content_layout, new ShopRankFragmnet());

        //提交
        mTransaction.commit();

        initView();

        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);
        rb4.setOnClickListener(this);

    }


    public void initView(){
        rb1 = findViewById(R.id.id_rb1);
        rb2 = findViewById(R.id.id_rb2);
        rb3 = findViewById(R.id.id_rb3);
        rb4 = findViewById(R.id.id_rb4);
    }

    @Override
    public void onClick(View v) {

        mTransaction = mFragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.id_rb1:
                mTransaction.replace(R.id.id_content_layout, new ShopRankFragmnet());
                break;
            case R.id.id_rb2:
                mTransaction.replace(R.id.id_content_layout, new PhoneFragment());
                break;
            case R.id.id_rb3:
                mTransaction.replace(R.id.id_content_layout, new GiftFragment());
                break;
            case R.id.id_rb4:
                mTransaction.replace(R.id.id_content_layout, new OrderFragment());
                break;
                default:break;
        }

        //提交事务
        mTransaction.commit();
    }

}
