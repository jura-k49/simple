package net.ukr.jura.simple.models;

import android.widget.EditText;

import net.ukr.jura.simple.base.BaseComponent;
import net.ukr.jura.simple.interfaces_classes.IBase;
import net.ukr.jura.simple.json_simple.Field;

public class ComponentSearch extends BaseComponent {

    EditText search;

    public ComponentSearch(IBase iBase, ParamComponent paramMV) {
        super(iBase, paramMV);
    }

    @Override
    public void initView() {
        search = (EditText) parentLayout.findViewById(paramMV.paramView.viewId);
    }

    @Override
    public void changeData(Field field) {

    }
}
