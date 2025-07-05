package com.horizon.managewise.meeting_microservice.meeting.domain.services;


import com.horizon.managewise.meeting_microservice.meeting.domain.model.commands.CreateRecordingCommand;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.commands.DeleteRecordingCommand;

public interface RecordingCommandService {
    Long handle(CreateRecordingCommand command);
    void handle(DeleteRecordingCommand command);
}


