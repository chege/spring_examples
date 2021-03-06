package io.chege.demos.layers.oneinterfaceadapter.web.client;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class KuCoin {
    private final RestTemplate template;

    public KuCoin(RestTemplateBuilder builder, KuCoinConfig config) {
        this.template = builder
                .rootUri(config.getRootUri())
                .build();
    }


    public Symbols symbols() {
        return template.getForObject(
                "/api/v1/symbols",
                Symbols.class
        );
    }

    @ConstructorBinding
    @ConfigurationProperties(prefix = "app.web.client.kucoin")
    public static class KuCoinConfig {
        private final String rootUri;


        public KuCoinConfig(String rootUri) {
            this.rootUri = rootUri;
        }

        public String getRootUri() {
            return rootUri;
        }
    }
}
