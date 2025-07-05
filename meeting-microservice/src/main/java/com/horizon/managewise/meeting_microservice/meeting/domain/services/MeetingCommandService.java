package com.horizon.managewise.meeting_microservice.meeting.domain.services;

import com.horizon.managewise.meeting_microservice.meeting.domain.model.aggregates.Meeting;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.commands.CreateMeetingCommand;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.commands.DeleteMeetingCommand;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.commands.UpdateMeetingCommand;

import java.util.Optional;

public interface MeetingCommandService {
    Long handle(CreateMeetingCommand command);
    Optional<Meeting> handle(UpdateMeetingCommand command);
    void handle(DeleteMeetingCommand command);
}
