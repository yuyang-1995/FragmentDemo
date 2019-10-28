package com.yuy.fragmentlife.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yuy.fragmentlife.R;

/**
 * Author: yuyang
 * Date:2019/10/28 13:20
 * Description:
 * Version:
 */
public class ToutiaoFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         return inflater.inflate(R.layout.fragment_toutiao, null);
    }


}
