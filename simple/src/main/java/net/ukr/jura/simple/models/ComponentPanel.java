package net.ukr.jura.simple.models;

import android.util.Log;
import android.view.View;
import net.ukr.jura.simple.base.BaseComponent;
import net.ukr.jura.simple.interfaces_classes.IBase;
import net.ukr.jura.simple.json_simple.Field;
import net.ukr.jura.simple.json_simple.Record;

public class ComponentPanel extends BaseComponent {
    @Override
    public void initView() {
    }

    @Override
    public void changeData(Field field) {
        if (field == null) return;
        Record rec = (Record)field.value;
        viewComponent = parentLayout.findViewById(paramMV.paramView.viewId);
//        WorkWithRecordsAndViews rv = new WorkWithRecordsAndViews();
        workWithRecordsAndViews.RecordToView(rec, viewComponent);
    }

    public ComponentPanel(IBase iBase, ParamComponent paramMV) {
        super(iBase, paramMV);
    }
}
