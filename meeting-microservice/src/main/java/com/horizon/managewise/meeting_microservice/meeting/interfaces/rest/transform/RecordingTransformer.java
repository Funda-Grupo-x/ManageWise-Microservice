package com.horizon.managewise.meeting_microservice.meeting.interfaces.rest.transform;

// src/main/java/pe/edu/upc/center/platform/meeting/domain/transform/RecordingTransformer.java

import org.springframework.stereotype.Component;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.RecordingDTO;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.entities.Recording;

@Component
public class RecordingTransformer {
    public RecordingDTO toDTO(Recording recording) {
        RecordingDTO dto = new RecordingDTO();
        dto.setId(recording.getId());
        if (recording.getMeeting() != null) {
            dto.setMeetingId(recording.getMeeting().getId());
            dto.setMeetingTitle(recording.getMeeting().getTitle()); // Obtén el título de la reunión
        }
        dto.setRecordingLink(recording.getRecordingLink());
        dto.setDuration(recording.getDuration());
        dto.setPublicAccess(recording.isPublicAccess());
        return dto;
    }
}
