package com.epam.training.ticketservice.repository;

import com.epam.training.ticketservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    Optional<Movie> findByTitle(String title);

    boolean existsByTitleIgnoreCase(String title);

    @Transactional
    void deleteByTitle(String title);
}
