package com.reactlibrary.M215_GridPasswordView;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.jungly.gridpasswordview.GridPasswordView;
import com.jungly.gridpasswordview.PasswordType;


public class SMOGridPasswordView extends FrameLayout {

    private static String TAG="RNSMOBILERPASSWORD";
    private PasswordType _PasswordType;
    private Boolean _PasswordVisibility;
    private String _Password;
    private GridPasswordView mView;
    private Context CONTEXT;
    private SMOGridPasswordView MYSELF;

    public SMOGridPasswordView(Context context) {
        super(context);
        CONTEXT = context;
        MYSELF = this;
        _PasswordType = PasswordType.NUMBER;

        mView = new GridPasswordView(context, null, 0);
        this.addView(mView);

        mView.setOnPasswordChangedListener(new GridPasswordView.OnPasswordChangedListener() {
            @Override
            public void onTextChanged(String psw) {
                Log.d(TAG,psw + " 开始回调");
                ReactContext reactContext = (ReactContext)CONTEXT;
                WritableMap event = Arguments.createMap();
                event.putString("password", psw);
                reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
                        MYSELF.getId(),
                        "topChange",
                        event);
            }

            @Override
            public void onInputFinish(String psw) {
            }
        });
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

    public void setPassword(String Password) {
        if(Password.length() > 0)
        {
            mView.setPassword(Password);
        }
    }
    public void setPasswordType(String type) {
        if(type.equals("numberPassword")){
            mView.setPasswordType(PasswordType.NUMBER);
        }else if(type.equals("textPassword")){
            mView.setPasswordType(PasswordType.TEXT);
        }else if(type.equals("textVisiblePassword")){
            mView.setPasswordType(PasswordType.TEXTVISIBLE);
        }else {
            mView.setPasswordType(PasswordType.TEXTWEB);
        }

    }

    public void setPasswordVisibility(Boolean PasswordVisibility) {
        mView.setPasswordVisibility(PasswordVisibility);
    }

}
