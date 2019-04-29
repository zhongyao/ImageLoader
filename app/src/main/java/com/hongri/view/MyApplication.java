package com.hongri.view;

import android.app.Application;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * @author zhongyao
 * @date 2018/8/20
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Fresco初始化
        Fresco.initialize(this);
    }

    //TODO
    /*@Override
    public void onCreate() {
        super.onCreate();
        if (ContextCompat.checkSelfPermission(this,permission.READ_EXTERNAL_STORAGE)
            != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ContextCompat.shouldShowRequestPermissionRationale(
                permission.READ_EXTERNAL_STORAGE)) {
                // Explain to the user why we need to read the contacts
            }

            requestPermissions(new String[] {permission.READ_EXTERNAL_STORAGE},
                MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE);

            // MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE is an
            // app-defined int constant that should be quite unique

            return;
        }
    }*/
}


