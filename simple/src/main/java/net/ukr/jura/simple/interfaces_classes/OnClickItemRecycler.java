package net.ukr.jura.simple.interfaces_classes;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public interface OnClickItemRecycler {
    void onClick(RecyclerView.ViewHolder holder, View view, int position);
}
