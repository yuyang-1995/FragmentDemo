package com.yuy.fragmentapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/**
 * Author: yuyang
 * Date:2019/10/28 11:08
 * Description:
 * Version:
 */
@SuppressLint("AppCompatCustomView")
public class MyRadioButton extends RadioButton {

    private Drawable drawable;

    public MyRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
//        drawable = getResources().getDrawable(R.drawable.radio_choose);
        drawable.setBounds(0, 0, 50, 50);
        setCompoundDrawables(null, null, drawable, null);

    }


}
