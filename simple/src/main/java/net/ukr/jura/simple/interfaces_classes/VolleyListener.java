package net.ukr.jura.simple.interfaces_classes;

import com.android.volley.VolleyError;

public interface VolleyListener<T> {
    public void onErrorResponse(VolleyError error);

    public void onResponse(T response);
}
