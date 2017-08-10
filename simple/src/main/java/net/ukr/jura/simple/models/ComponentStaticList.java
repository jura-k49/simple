package net.ukr.jura.simple.models;
import android.util.Log;
import net.ukr.jura.simple.adapters.StaticListAdapter;
import net.ukr.jura.simple.base.BaseComponent;
import net.ukr.jura.simple.base.BaseProvider;
import net.ukr.jura.simple.components.StaticList;
import net.ukr.jura.simple.interfaces_classes.IBase;
import net.ukr.jura.simple.json_simple.Field;
import net.ukr.jura.simple.json_simple.ListRecords;
import net.ukr.jura.simple.tools.StaticVM;

public class ComponentStaticList extends BaseComponent {
    StaticList staticList;
    ListRecords listData;
//    BaseProvider provider;
    StaticListAdapter adapter;

    public ComponentStaticList(IBase iBase, ParamComponent paramMV) {
        super(iBase, paramMV);
    }

    @Override
    public void initView() {
        if (paramMV.paramView == null || paramMV.paramView.viewId == 0) {
            staticList = (StaticList) StaticVM.findViewByName(parentLayout, "baseStaticList");
        } else {
            staticList = (StaticList) parentLayout.findViewById(paramMV.paramView.viewId);
        }
        if (staticList == null) {
            Log.i("SMPL", "Не найден StaticList в " + paramMV.nameParentComponent);
            return;
        }
        listData = new ListRecords();
        provider = new BaseProvider(listData);
//        provider.setData(listData);
//        provider.setNavigator(paramMV.navigator);
        adapter = new StaticListAdapter(this);
        staticList.setAdapter(adapter, false);
    }

    @Override
    public void changeData(Field field) {
        listData.clear();
        listData.addAll((ListRecords) field.value);
        provider.setData(listData);
        adapter.notifyDataSetChanged();
    }
}
