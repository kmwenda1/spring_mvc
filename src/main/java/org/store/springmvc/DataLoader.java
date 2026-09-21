package org.store.springmvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
class DataLoader implements CommandLineRunner {

    private final PhoneRepository repository;

    DataLoader(PhoneRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        if (repository.count() == 0) {
            repository.saveAll(List.of(
                    new Phone("Samsung", "Galaxy S24", new BigDecimal("899.99"), 15),
                    new Phone("Apple", "iPhone 15", new BigDecimal("999.00"), 8),
                    new Phone("Google", "Pixel 8", new BigDecimal("699.00"), 12),
                    new Phone("Xiaomi", "Redmi Note 13", new BigDecimal("249.50"), 40)
            ));
        }
    }
}