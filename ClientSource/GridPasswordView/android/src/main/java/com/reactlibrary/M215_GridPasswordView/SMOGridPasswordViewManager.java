package com.reactlibrary.M215_GridPasswordView;

import java.util.Map;
import javax.annotation.Nullable;

import android.view.View;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.Map;

import javax.annotation.Nullable;

public class SMOGridPasswordViewManager extends SimpleViewManager<SMOGridPasswordView> {
    protected static final String REACT_CLASS = "M215_GridPasswordView_GridPasswordView";

    public static final int COMMAND_ON_RECEIVE = 1;

    @Override
    public String getName() {
        return REACT_CLASS;
    }
  
    @Override
    public SMOGridPasswordView createViewInstance(ThemedReactContext context) {
        SMOGridPasswordView password = new SMOGridPasswordView(context);
        return password;
    }
    
    // 发送事件给服务端端, 参数通过event封装, ios为onChange
    public void sendNativeEvent(View view, WritableMap event) {
      ReactContext reactContext = (ReactContext)view.getContext();
      
      reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(
          view.getId(),
          "topChange",
          event);
    }
   
    @Override
    public @Nullable Map<String, Integer> getCommandsMap() {
        return MapBuilder.of(
            "onReceive", COMMAND_ON_RECEIVE
        );
    }
    
    @Override
    public void receiveCommand(SMOGridPasswordView root, int commandId, @Nullable ReadableArray args) {
        switch (commandId) {
            case COMMAND_ON_RECEIVE:
                // 收到服务端指令
                if(args.size() > 0){
                    //服务端参数内容params
                    ReadableMap params = args.getMap(0);
                }
                break;
        }
    }

    
    @ReactProp(name = "PasswordType")
    public void setPasswordType(SMOGridPasswordView view, @Nullable String PasswordType) {
        view.setPasswordType(PasswordType);
    }

    @ReactProp(name = "PasswordVisibility")
    public void setPasswordVisibility(SMOGridPasswordView view,  Boolean PasswordVisibility) {
        view.setPasswordVisibility(PasswordVisibility);
    }
    @ReactProp(name = "Password")
    public void setPassword(SMOGridPasswordView view, @Nullable String Password) {
        view.setPassword(Password);
    }

  
}