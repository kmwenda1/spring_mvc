package org.store.springmvc;

import org.springframework.data.jpa.repository.JpaRepository;

interface PhoneRepository extends JpaRepository<Phone, Long> {
}