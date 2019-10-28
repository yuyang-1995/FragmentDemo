package com.yuy.fragmentapp.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yuy.fragmentapp.R;

/**
 * Author: yuyang
 * Date:2019/10/28 11:33
 * Description:
 * Version:
 */
public class PhoneFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fg_phone, null);
    }

}
