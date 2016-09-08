package com.nelmer.wearcustomcard;

import android.os.Bundle;
import android.support.wearable.view.CardFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ros on 8/16/2016.
 */
public class CustomCard extends CardFragment {
    //the second ViewGroup argument of this method refers to the Activity you are about to attach this Fragment to.
    @Override
    public View onCreateContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //here you are inflating the custom layout you created to put inside the Fragment.
        return inflater.inflate(R.layout.custom_layout, container, false);
    }
}
