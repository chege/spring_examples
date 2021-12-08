package io.chege.demos.layers.oneinterfaceadapter.web.client;

import java.util.HashMap;
import java.util.Map;

public class Symbol {

    private String symbol;
    private String name;
    private String baseCurrency;
    private String quoteCurrency;
    private String feeCurrency;
    private String market;
    private String baseMinSize;
    private String quoteMinSize;
    private String baseMaxSize;
    private String quoteMaxSize;
    private String baseIncrement;
    private String quoteIncrement;
    private String priceIncrement;
    private String priceLimitRate;
    private Boolean isMarginEnabled;
    private Boolean enableTrading;
    private Map<String, Object> additionalProperties = new HashMap<>();

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    public String getFeeCurrency() {
        return feeCurrency;
    }

    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getBaseMinSize() {
        return baseMinSize;
    }

    public void setBaseMinSize(String baseMinSize) {
        this.baseMinSize = baseMinSize;
    }

    public String getQuoteMinSize() {
        return quoteMinSize;
    }

    public void setQuoteMinSize(String quoteMinSize) {
        this.quoteMinSize = quoteMinSize;
    }

    public String getBaseMaxSize() {
        return baseMaxSize;
    }

    public void setBaseMaxSize(String baseMaxSize) {
        this.baseMaxSize = baseMaxSize;
    }

    public String getQuoteMaxSize() {
        return quoteMaxSize;
    }

    public void setQuoteMaxSize(String quoteMaxSize) {
        this.quoteMaxSize = quoteMaxSize;
    }

    public String getBaseIncrement() {
        return baseIncrement;
    }

    public void setBaseIncrement(String baseIncrement) {
        this.baseIncrement = baseIncrement;
    }

    public String getQuoteIncrement() {
        return quoteIncrement;
    }

    public void setQuoteIncrement(String quoteIncrement) {
        this.quoteIncrement = quoteIncrement;
    }

    public String getPriceIncrement() {
        return priceIncrement;
    }

    public void setPriceIncrement(String priceIncrement) {
        this.priceIncrement = priceIncrement;
    }

    public String getPriceLimitRate() {
        return priceLimitRate;
    }

    public void setPriceLimitRate(String priceLimitRate) {
        this.priceLimitRate = priceLimitRate;
    }

    public Boolean getIsMarginEnabled() {
        return isMarginEnabled;
    }

    public void setIsMarginEnabled(Boolean isMarginEnabled) {
        this.isMarginEnabled = isMarginEnabled;
    }

    public Boolean getEnableTrading() {
        return enableTrading;
    }

    public void setEnableTrading(Boolean enableTrading) {
        this.enableTrading = enableTrading;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
