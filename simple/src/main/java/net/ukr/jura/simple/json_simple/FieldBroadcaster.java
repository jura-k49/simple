package net.ukr.jura.simple.json_simple;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

import net.ukr.jura.simple.interfaces_classes.IBase;
import net.ukr.jura.simple.tools.Constants;

public class FieldBroadcaster extends Field{
    public FieldBroadcaster(String name, int type, Object value) {
        super(name, type, value);
    }

//    public FieldBroadcaster() {
//    }
//
//    public FieldBroadcaster(String name, int type, Object value) {
//        this.name = name;
//        this.type = type;
//        this.value = value;
//    }

    @Override
    public void setValue(Object value, int viewId, IBase iBase) {
        this.value = value;
        Intent intentBroad = new Intent(name);
        intentBroad.putExtra(Constants.SIMPLE_ViewId, viewId);
        LocalBroadcastManager.getInstance(iBase.getBaseActivity()).sendBroadcast(intentBroad);
    }
}
