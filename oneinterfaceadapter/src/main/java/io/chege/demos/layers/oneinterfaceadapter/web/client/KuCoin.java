package io.chege.demos.layers.oneinterfaceadapter.web.client;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class KuCoin {
    private final RestTemplate template;

    public KuCoin(RestTemplateBuilder builder) {
        this.template = builder.rootUri("https://api.kucoin.com/").build();
    }


    public Symbols symbols() {
        return template.getForObject(
                "/api/v1/symbols",
                Symbols.class
        );
    }
}
