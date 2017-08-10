package net.ukr.jura.simple.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import net.ukr.jura.simple.base.BaseProvider;
import net.ukr.jura.simple.json_simple.Record;
import net.ukr.jura.simple.models.ParamComponent;
////import net.ukr.jura.simple.models.ModelFragment;
////import net.ukr.jura.simple.models.ModelSpinnerFragment;
//import net.ukr.jura.simple.models.ModelViewParam;
import net.ukr.jura.simple.models.WorkWithRecordsAndViews;

public class SpinnerAdapter extends BaseAdapter {
    private ParamComponent mSpinner;
    private BaseProvider provider;
    private WorkWithRecordsAndViews modelToView;

    public SpinnerAdapter(BaseProvider provider,
                          ParamComponent paramMV) {
        this.provider = provider;
        mSpinner = paramMV;
        modelToView = new WorkWithRecordsAndViews();
    }

    @Override
    public int getCount() {
        return provider.getCount();
    }

    @Override
    public Record getItem(int position) {
        return provider.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getDropDownView(int position, View view, ViewGroup parent) {
        Context context = parent.getContext();
        if (view == null) view = LayoutInflater.from(context).inflate(mSpinner.paramView.layoutTypeId[0], parent, false);
        modelToView.RecordToView((Record) provider.get(position), view);
        return view;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Context context = parent.getContext();
        if (view == null) view = LayoutInflater.from(context).inflate(mSpinner.paramView.layoutFurtherTypeId[0], parent, false);
        modelToView.RecordToView((Record) provider.get(position), view);
        return view;
    }
}
