package com.nelmer.wearcustomcard;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

/**
 * Created by Ros on 8/16/2016.
 */
public class CardFragmentActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //this is where we obtain an instance of the CardFragment in order to add it to the activity.
        FragmentManager fragmentManager = getFragmentManager();
        //and here we also use the FragmentTransaction to handle transactions.
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //so all the content we specified in the CardFragment we will add it to the container created in XML
        fragmentTransaction.add(R.id.frame_layout, new CustomCard());
        //and just like github don't forget to commit just to make sure this changes take effect
        fragmentTransaction.commit();
    }
}