package com.horizon.managewise.backlog_microservice.backlog.infrastructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.Sprint;

import java.util.Optional;

@Repository
public interface SprintRepository extends JpaRepository<Sprint, Long> {
    //para validaciones
    boolean existsByTitle(String title);
    boolean existsByTitleAndIdIsNot(String title, Long id);
    Optional<Sprint> findByTitle(String title);
}
