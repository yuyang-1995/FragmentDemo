package com.yuy.valuetransform;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.yuy.valuetransform.fragment.ResultFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentManager mFragmentManager;

    private FragmentTransaction mTransaction;

    private EditText mEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.id_et_content);

        mFragmentManager = getFragmentManager();

        mTransaction = mFragmentManager.beginTransaction();
        mTransaction.add(R.id.id_ll_content, new ResultFragment());

        mTransaction.commit();

    }

    /**
     * 点击按钮将et 中的数据传递到 resultfragment
     * @param view
     */
    public void sendVal(View view) {

        //所需要传递的数据
        String info = mEditText.getText().toString().trim();

        ResultFragment resultFragment = new ResultFragment();

        //创建Bundle 对象， 将需要传递的值赋给bundle
        Bundle bundle = new Bundle();
        bundle.putString("info", info);

        //调用碎片的 setArguments 将bundle赋值给 碎片
        resultFragment.setArguments(bundle);

        mFragmentManager = getFragmentManager();
        mTransaction = mFragmentManager.beginTransaction();

        mTransaction.replace(R.id.id_ll_content, resultFragment);
        mTransaction.commit();

    }
}
