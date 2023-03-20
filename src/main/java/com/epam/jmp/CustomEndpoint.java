package com.epam.jmp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "custom")
public class CustomEndpoint {

    private Map<String, Ad> statistics = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Ad> ads() {
        return statistics;
    }

    @ReadOperation
    public Ad ad(@Selector String name) {
        return statistics.get(name);
    }

    @WriteOperation
    public void configureAd(@Selector String name, Ad ad) {
        statistics.put(name, ad);
    }

    @DeleteOperation
    public void deleteAd(@Selector String name) {
        statistics.remove(name);
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Setter
    @Getter
    public static class Ad {
        private String name;
        private int count;
        private int sold;
    }
}