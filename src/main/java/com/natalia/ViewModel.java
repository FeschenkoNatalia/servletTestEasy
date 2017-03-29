package com.natalia;

import com.natalia.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by User on 18.03.2017.
 */

public class ViewModel {
    private String view;
    private final Map<String, Object> attributes = new HashMap<>();

    public ViewModel() {}

    public ViewModel(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public ViewModel withAttribute(String attr, Object value) {
        attributes.put(attr, value);
        return this;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public Object getAttribute(String attr) {
        return attributes.get(attr);
    }
}


/*public class ViewModel {
    private String view;
    public ViewModel (String view){
        this.view = view;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
}*/
