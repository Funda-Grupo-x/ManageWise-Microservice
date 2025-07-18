package com.horizon.managewise.meeting_microservice.meeting.interfaces.rest.transform;

import com.horizon.managewise.meeting_microservice.meeting.domain.model.aggregates.Meeting;
import com.horizon.managewise.meeting_microservice.meeting.interfaces.rest.resources.MeetingResource;
import com.horizon.managewise.meeting_microservice.meeting.interfaces.rest.resources.RecordingResource;

public class MeetingResourceFromEntityAssembler {

  public static MeetingResource toResourceFromEntity(Meeting entity) {
    RecordingResource recordingResource = null;
    if (entity.getRecordings() != null && !entity.getRecordings().isEmpty()) {
      var recording = entity.getRecordings().get(0);
      recordingResource = new RecordingResource(
        recording.getRecordingLink(),
        recording.getDuration(),
        recording.isPublicAccess()
      );
    }

    return new MeetingResource(
      entity.getId(),
      entity.getTitle(),
      entity.getMeetingDate().toString(),
      entity.getMeetingTime().toString(),
      entity.getLink(),
      entity.getAccessCode(),
      recordingResource,
      entity.getHostId(),
      entity.getMembers() // No se necesita mapear, ya que es una lista de Long
    );
  }
}
