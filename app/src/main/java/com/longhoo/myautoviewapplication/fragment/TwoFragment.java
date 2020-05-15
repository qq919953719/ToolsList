package com.longhoo.myautoviewapplication.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.longhoo.myautoviewapplication.R;
import com.longhoo.myautoviewapplication.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends BaseFragment {







    @Override
    protected int getContentId() {
        return R.layout.fragment_two;
    }

    @Override
    protected void InitView(View view) {

    }

    @Override
    protected void ToolBar() {

    }

    @Override
    protected void InitData() {
        Log.e("fragmentone","懒加载2");
    }

}
