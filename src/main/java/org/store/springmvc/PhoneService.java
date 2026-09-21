package org.store.springmvc;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
class PhoneService {

    private final PhoneRepository repository;

    PhoneService(PhoneRepository repository) {
        this.repository = repository;
    }

    List<Phone> findAll() {
        return repository.findAll();
    }
}