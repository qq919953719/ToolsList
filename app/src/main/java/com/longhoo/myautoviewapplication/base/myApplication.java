package com.longhoo.myautoviewapplication.base;

import android.app.Activity;
import android.app.Application;

import java.util.LinkedList;
import java.util.List;

public class myApplication extends Application {
    public List<Activity> mActivityList = new LinkedList<>();

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public void removeAllActivity() {
        if (mActivityList.size() == 0) {
            return;
        }

        for (int i = 0; i <= mActivityList.size(); i++) {

            Activity mActivity = mActivityList.get(i);
            mActivity.finish();

        }
    }


    public void removeActivity(String strActivityName) {

        if (mActivityList.size() == 0) {
            return;
        }

        for (int i = 0; i <= mActivityList.size(); i++) {

            Activity mActivity = mActivityList.get(i);
            if (mActivity.getComponentName().getClassName().equals(strActivityName)) {
                mActivityList.remove(i);
                mActivity.finish();
            }


        }
    }
}
