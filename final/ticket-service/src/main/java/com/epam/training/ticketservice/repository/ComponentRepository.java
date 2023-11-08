package com.epam.training.ticketservice.repository;

import com.epam.training.ticketservice.model.PriceComponent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ComponentRepository extends JpaRepository<PriceComponent, Long> {

    public Optional<PriceComponent> findByName(String name);
}