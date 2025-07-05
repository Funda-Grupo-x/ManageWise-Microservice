package com.horizon.managewise.meeting_microservice.meeting.domain.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.aggregates.Meeting;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.entities.Recording;
import com.horizon.managewise.meeting_microservice.meeting.infrastructure.persistence.jpa.repositories.RecordingRepository;

import java.util.List;

@Service
public class RecordingService {
    @Autowired
    private RecordingRepository recordingRepository;

    public List<Recording> getAllRecordings() {
        return recordingRepository.findAll();
    }

    public List<Recording> getRecordingsByMeeting(Meeting meeting) {
        return recordingRepository.findByMeeting(meeting);
    }
}
