package com.aqibmalik.usb_path;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class USBpath {

    private static Context context;
    private static String TAG = "USB Path: ";

    public USBpath(Context context){
        this.context = context;
    }


    public String getPath(){
        File storageDirectory = new File("/storage");
        if(!storageDirectory.exists()) {
            Log.e(TAG, "'/storage' does not exist on this device");
            return null;
        }

        File[] files = storageDirectory.listFiles();
        if(files == null) {
            Log.e(TAG, "Null when requesting directories inside '/storage'");
            return null;
        }

        List<String> possibleUSBStorageMounts = new ArrayList<String>();
        for (File file : files) {
            String path = file.getPath();
            if (path.contains("emulated") ||
                    path.contains("sdcard") ||
                    path.contains("self")) {
                Log.d(TAG, "getUSB: Found '" + path + "' - not USB");
            } else {
                possibleUSBStorageMounts.add(path);
            }
        }

        if (possibleUSBStorageMounts.size() == 0) {
            Log.e(TAG, "getUSB: Did not find any possible USB mounts");
            return null;
        }
        if(possibleUSBStorageMounts.size() > 0) {
            Log.d(TAG, "getUSB: Found possible USB mount points");
        }

        return possibleUSBStorageMounts.get(0);
    }

}
