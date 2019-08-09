package com.asylyum.evghenianghelcev.sibicon;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class TouchListener implements View.OnTouchListener {

    private ViewGroup mainLayout;
    public MainActivity mainActivity;

    private int xDelta;
    private int yDelta;

    public TouchListener(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @SuppressLint("ClickableViewAccessibility")

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        final int x = (int) motionEvent.getRawX();
        final  int y = (int) motionEvent.getRawY();

        switch (motionEvent.getAction()& MotionEvent.ACTION_MASK){
            case MotionEvent.ACTION_DOWN:
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();

                xDelta = x - layoutParams.leftMargin;
                yDelta = y - layoutParams.topMargin;
                break;
            case MotionEvent.ACTION_UP:
                break;

            case MotionEvent.ACTION_MOVE:
                RelativeLayout.LayoutParams layoutParams1 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                layoutParams1.leftMargin = x - xDelta;
                layoutParams1.topMargin = y - yDelta;
              //  layoutParams1.rightMargin = 0;
              //  layoutParams1.leftMargin = 0;
                view.setLayoutParams(layoutParams1);
                break;
        }
      //  mainLayout.invalidate();
        return true;
    }
}
