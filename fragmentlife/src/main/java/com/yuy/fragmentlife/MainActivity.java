package com.yuy.fragmentlife;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.yuy.fragmentlife.fragment.HotFragment;
import com.yuy.fragmentlife.fragment.ToutiaoFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final static String TAG = MainActivity.class.getSimpleName();

    private TextView tv_hot, tv_tt;
    private FragmentManager mFragmentManager;
    private FragmentTransaction mTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "---MainActivity onCreate ---");

        tv_hot = findViewById(R.id.id_tv_hotspot);
        tv_tt = findViewById(R.id.id_tv_toutiao);

        tv_tt.setOnClickListener(this);
        tv_hot.setOnClickListener(this);

        mFragmentManager = getFragmentManager();
        mTransaction = mFragmentManager.beginTransaction();

        mTransaction.add(R.id.id_ll_content, new HotFragment());
        mTransaction.commit();


    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "---MainActivity onStart ---");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "---MainActivity onResume ---");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "---MainActivity onPause ---");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "---MainActivity onStop ---");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "---MainActivity onRestart ---");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "---MainActivity onDestroy ---");
    }


    @Override
    public void onClick(View v) {

        mTransaction = mFragmentManager.beginTransaction();
        switch (v.getId()) {

            case R.id.id_tv_hotspot:

                mTransaction.replace(R.id.id_ll_content, new HotFragment());
                break;

            case R.id.id_tv_toutiao:
                mTransaction.replace(R.id.id_ll_content, new ToutiaoFragment());

                break;
        }

        mTransaction.commit();
    }
}
