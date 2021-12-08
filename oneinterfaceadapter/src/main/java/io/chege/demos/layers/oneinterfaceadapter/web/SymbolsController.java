package io.chege.demos.layers.oneinterfaceadapter.web;

import io.chege.demos.layers.oneinterfaceadapter.web.client.KuCoin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/symbols")
@RestController
public class SymbolsController {
    private final KuCoin kuCoin;

    public SymbolsController(KuCoin kuCoin) {
        this.kuCoin = kuCoin;
    }

    @GetMapping
    List<Symbol> get() {
        return kuCoin.symbols()
                .getData()
                .stream()
                .map(this::toSymbol)
                .collect(Collectors.toList());

    }

    private Symbol toSymbol(io.chege.demos.layers.oneinterfaceadapter.web.client.Symbol s) {
        return new Symbol(
                s.getSymbol()
        );
    }

}
