package io.chege.demos.layers.bizlayer.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class OpenBreweryDb {
    private final WebClient client;

    public OpenBreweryDb(WebClient.Builder builder, Config config) {
        this.client = builder
                .baseUrl(config.baseUri)
                .build();
    }

    public ResponseEntity<List<Brewery>> allBreweries() {
        return client.get()
                .uri("/breweries")
                .retrieve()
                .toEntityList(Brewery.class)
                .block();
    }

    public ResponseEntity<Brewery> get(String id) {
        return client.get()
                .uri(builder -> builder.path("/breweries/{id}").build(id))
                .retrieve()
                .toEntity(Brewery.class)
                .block();
    }

    @ConstructorBinding
    @ConfigurationProperties("app.web.client.openbrewerydb")
    public static class Config {
        private final String baseUri;

        public Config(String baseUri) {
            this.baseUri = baseUri;
        }
    }
}
