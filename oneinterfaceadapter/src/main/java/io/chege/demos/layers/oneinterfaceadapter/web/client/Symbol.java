package io.chege.demos.layers.oneinterfaceadapter.web.client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Symbol {
    private final String symbol;
    private final String name;
    private final String baseCurrency;
    private final String quoteCurrency;
    private final String feeCurrency;
    private final String market;
    private final String baseMinSize;
    private final String quoteMinSize;
    private final String baseMaxSize;
    private final String quoteMaxSize;
    private final String baseIncrement;
    private final String quoteIncrement;
    private final String priceIncrement;
    private final String priceLimitRate;
    private final Boolean isMarginEnabled;
    private final Boolean enableTrading;


    public Symbol(@JsonProperty("symbol") String symbol,
                  @JsonProperty("name") String name,
                  @JsonProperty("baseCurrency") String baseCurrency,
                  @JsonProperty("quoteCurrency") String quoteCurrency,
                  @JsonProperty("feeCurrency") String feeCurrency,
                  @JsonProperty("market") String market,
                  @JsonProperty("baseMinSize") String baseMinSize,
                  @JsonProperty("quoteMinSize") String quoteMinSize,
                  @JsonProperty("baseMaxSize") String baseMaxSize,
                  @JsonProperty("quoteMaxSize") String quoteMaxSize,
                  @JsonProperty("baseIncrement") String baseIncrement,
                  @JsonProperty("quoteIncrement") String quoteIncrement,
                  @JsonProperty("priceIncrement") String priceIncrement,
                  @JsonProperty("priceLimitRate") String priceLimitRate,
                  @JsonProperty("isMarginEnabled") Boolean isMarginEnabled,
                  @JsonProperty("enableTrading") Boolean enableTrading) {
        this.symbol = symbol;
        this.name = name;
        this.baseCurrency = baseCurrency;
        this.quoteCurrency = quoteCurrency;
        this.feeCurrency = feeCurrency;
        this.market = market;
        this.baseMinSize = baseMinSize;
        this.quoteMinSize = quoteMinSize;
        this.baseMaxSize = baseMaxSize;
        this.quoteMaxSize = quoteMaxSize;
        this.baseIncrement = baseIncrement;
        this.quoteIncrement = quoteIncrement;
        this.priceIncrement = priceIncrement;
        this.priceLimitRate = priceLimitRate;
        this.isMarginEnabled = isMarginEnabled;
        this.enableTrading = enableTrading;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    public String getFeeCurrency() {
        return feeCurrency;
    }

    public String getMarket() {
        return market;
    }

    public String getBaseMinSize() {
        return baseMinSize;
    }

    public String getQuoteMinSize() {
        return quoteMinSize;
    }

    public String getBaseMaxSize() {
        return baseMaxSize;
    }

    public String getQuoteMaxSize() {
        return quoteMaxSize;
    }

    public String getBaseIncrement() {
        return baseIncrement;
    }

    public String getQuoteIncrement() {
        return quoteIncrement;
    }

    public String getPriceIncrement() {
        return priceIncrement;
    }

    public String getPriceLimitRate() {
        return priceLimitRate;
    }

    public Boolean getMarginEnabled() {
        return isMarginEnabled;
    }

    public Boolean getEnableTrading() {
        return enableTrading;
    }
}
