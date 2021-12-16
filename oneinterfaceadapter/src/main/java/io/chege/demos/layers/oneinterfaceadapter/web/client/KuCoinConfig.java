package io.chege.demos.layers.oneinterfaceadapter.web.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@ConstructorBinding
@ConfigurationProperties(prefix = "app.web.client.kucoin")
public class KuCoinConfig {
    private final String rootUri;


    public KuCoinConfig(String rootUri) {
        this.rootUri = rootUri;
    }

    public String getRootUri() {
        return rootUri;
    }
}
