package com.horizon.managewise.meeting_microservice.meeting.infrastructure.persistence.jpa.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.aggregates.Meeting;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.entities.Recording;

import java.util.List;

public interface    RecordingRepository extends JpaRepository<Recording, Long> {
    List<Recording> findByMeeting(Meeting meeting); // Buscar grabaciones por reunión
}
