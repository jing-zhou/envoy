package com.via.envoy.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Service {
    private ExecutorService executor = Executors.newFixedThreadPool(10);

    public void run() {
        executor.submit(() -> {
            // Service implementation
        });
    }
}
