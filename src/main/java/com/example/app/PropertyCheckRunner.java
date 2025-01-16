package com.example.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertyCheckRunner implements CommandLineRunner {

    private final Environment environment;

    public PropertyCheckRunner(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void run(String... args) throws Exception {
        // 현재 활성화된 프로파일 출력
        System.out.println("Active Profiles: " + String.join(", ", environment.getActiveProfiles()));

        // 특정 프로퍼티 출력
        System.out.println("Server Port: " + environment.getProperty("spring.application.name"));
        System.out.println("Datasource URL: " + environment.getProperty("spring.db.url"));
    }
}
