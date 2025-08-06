package net.zubricky.AndroidKeyboardAdjust;

import android.app.Activity;
import android.view.WindowManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class AndroidKeyboardAdjustModule extends ReactContextBaseJavaModule {

    public AndroidKeyboardAdjustModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "AndroidKeyboardAdjust";
    }

    private void setSoftInputMode(final int mode) {
        final Activity activity = getCurrentActivity();
        if (activity == null) return;

        activity.runOnUiThread(() ->
            activity.getWindow().setSoftInputMode(mode)
        );
    }

    @ReactMethod public void setStateUnspecified()  { setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_UNSPECIFIED); }
    @ReactMethod public void setAdjustNothing()     { setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING); }
    @ReactMethod public void setAdjustPan()         { setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN); }
    @ReactMethod public void setAdjustResize()      { setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE); }
    @ReactMethod public void setAdjustUnspecified() { setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED); }
    @ReactMethod public void setAlwaysHidden()      { setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN); }
    @ReactMethod public void setAlwaysVisible()     { setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE); }
    @ReactMethod public void setVisible()           { setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE); }
    @ReactMethod public void setHidden()            { setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN); }
    @ReactMethod public void setUnchanged()         { setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_UNCHANGED); }
}
