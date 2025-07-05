package com.horizon.managewise.backlog_microservice.backlog.infrastructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.Epic;

import java.util.Optional;

@Repository
public interface EpicRepository extends JpaRepository<Epic, Long> {
    boolean existsByTitle(String title);
    boolean existsByTitleAndIdIsNot(String title, Long id);
    Optional<Epic> findByTitle(String title);
}
