package io.chege.demos.layers.oneinterfaceadapter.web.client;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Symbols {
    private final String code;
    private final List<Symbol> data;

    public Symbols(@JsonProperty("code") String code, @JsonProperty("data") List<Symbol> data) {
        this.code = code;
        this.data = data;
    }

    public String getCode() {
        return code;
    }


    public List<Symbol> getData() {
        return data;
    }


}
