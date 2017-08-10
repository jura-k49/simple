package net.ukr.jura.simple.models;

import net.ukr.jura.simple.base.BaseComponent;
import net.ukr.jura.simple.interfaces_classes.IBase;
import net.ukr.jura.simple.interfaces_classes.ParentModel;
import net.ukr.jura.simple.json_simple.Field;

public class ComponentModel extends BaseComponent {

    @Override
    public void initView() {

    }

    @Override
    public void changeData(Field field) {
        ParentModel pm = iBase.getParentModel(paramMV.name);
        pm.field = field;
        for (BaseComponent bc : pm.componentList) {
            bc.setParentData(field);
        }
    }

    public ComponentModel(IBase iBase, ParamComponent paramMV) {
        super(iBase, paramMV);
    }
}
