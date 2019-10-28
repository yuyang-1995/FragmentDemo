package com.yuy.dtfragment.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.yuy.dtfragment.R;

/**
 * Author: yuyang
 * Date:2019/10/28 10:17
 * Description:
 * Version:
 */
public class TitleFragment extends Fragment {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.title, null);
    }
}
