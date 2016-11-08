package com.devstepbcn.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;

/**
 * Created by alecrobinson on 11/8/16.
 */
public class ScanBroadcastReceiver extends BroadcastReceiver {

    private ScanResultsAvailable mContext;

    public ScanBroadcastReceiver(ScanResultsAvailable context) {
        mContext = context;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        mContext.onReceiveScanResults();
    }
}
