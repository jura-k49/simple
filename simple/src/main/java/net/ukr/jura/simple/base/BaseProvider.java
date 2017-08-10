package net.ukr.jura.simple.base;

import net.ukr.jura.simple.json_simple.ListRecords;
import net.ukr.jura.simple.json_simple.Record;

public class BaseProvider {
    protected ListRecords listData;

    public BaseProvider(ListRecords listData) {
        this.listData = listData;
    }

    public void setData(ListRecords listData) {
        this.listData = listData;
    }

    public int getCount() {
        return listData.size();
    }

    public Record get(int position) {
        return listData.get(position);
    }
}
