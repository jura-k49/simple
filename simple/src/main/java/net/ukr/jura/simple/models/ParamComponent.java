package net.ukr.jura.simple.models;

import net.ukr.jura.simple.base.BaseComponent;
import net.ukr.jura.simple.interfaces_classes.MoreWork;
import net.ukr.jura.simple.interfaces_classes.Navigator;

public class ParamComponent <T>{
    public static enum TC {PANEL, PANEL_ENTER, PANEL_MULTI, SPINNER,
        RECYCLER, RECYCLER_HORIZONTAL, RECYCLER_GRID, RECYCLER_LEVEL, RECYCLER_STICKY,
        MENU,
        STATIC_LIST, MODEL, PAGER_V, PAGER_F};
    public ParamComponent () {
        additionalWork = null;
    }
    public String nameParentComponent;
    public String name;
    public TC type;
//    public BaseComponent component;
    public int eventComponent;
    public MoreWork moreWork;
    public BaseComponent baseComponent;
//    public String additionalWork;
    public ParamModel paramModel;
    public ParamView paramView;
    public Navigator navigator;
    public Class<T> additionalWork;
}
