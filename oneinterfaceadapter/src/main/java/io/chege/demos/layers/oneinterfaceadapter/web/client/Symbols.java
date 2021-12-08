package io.chege.demos.layers.oneinterfaceadapter.web.client;

import java.util.ArrayList;
import java.util.List;

public class Symbols {

    private String code;
    private List<Symbol> data = new ArrayList<>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Symbol> getData() {
        return data;
    }

    public void setData(List<Symbol> data) {
        this.data = data;
    }

}
