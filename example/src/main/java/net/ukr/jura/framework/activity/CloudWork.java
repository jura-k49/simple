package net.ukr.jura.framework.activity;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import net.ukr.jura.simple.components.SimpleImageView;
import net.ukr.jura.simple.interfaces_classes.MoreWork;
import net.ukr.jura.simple.json_simple.Record;
import net.ukr.jura.simple.tools.StaticVM;

public class CloudWork extends MoreWork{
    @Override
    public void afterBindViewHolder(Record record, RecyclerView.ViewHolder holder) {
        float goal = record.getFloat("Goal");
        Float f = record.getFloat("PendingBalance");
        float pendingBalance;
        if (f == null) {
            pendingBalance = 0f;
        } else {
            pendingBalance = f;
        }

        float availableBalance;
        f = record.getFloat("AvailableBalance");
        if (f == null) {
            availableBalance = 0f;
        } else {
            availableBalance = f;
        }
        View itemView = holder.itemView;
        LinearLayout max = (LinearLayout) StaticVM.findViewByName(itemView, "max");
        LinearLayout percent = (LinearLayout) StaticVM.findViewByName(itemView, "percent");
        int wMax = max.getWidth();
        float sum = pendingBalance + availableBalance;
        float per = goal / sum;
        int p = (int) (wMax * per);
        if (p > wMax) {
            p = wMax;
        }
        RelativeLayout.LayoutParams ll = new RelativeLayout.LayoutParams(p, ViewGroup.LayoutParams.MATCH_PARENT);
        percent.setLayoutParams(ll);
//        SimpleImageView img = (SimpleImageView) StaticVM.findViewByName(itemView, "PictureUrl");
//        int ii = img.getPlaceholder();
//        Log.d("QWERT","II="+ii);
//        img.setBackgroundResource(ii);
    }
}
