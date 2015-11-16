package com.tusoapps.welcome.ui;

import android.view.View;

/**
 * Created by stephentuso on 11/15/15.
 */
public class DoneButton extends WelcomeScreenButton {

    public DoneButton(View button) {
        super(button);
    }

    @Override
    public void onPageSelected(int pageIndex, int maxPageIndex) {
        setVisibility(pageIndex == maxPageIndex);
    }


}
