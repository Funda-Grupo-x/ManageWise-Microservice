package com.horizon.managewise.meeting_microservice.meeting.interfaces.rest.transform;


import com.horizon.managewise.meeting_microservice.meeting.domain.model.commands.CreateMeetingCommand;
import com.horizon.managewise.meeting_microservice.meeting.interfaces.rest.resources.CreateMeetingResource;

public class CreateMeetingCommandFromResourceAssembler {
    public static CreateMeetingCommand toCommandFromResource(CreateMeetingResource resource) {
        return new CreateMeetingCommand(resource.title(), resource.dateStr(), resource.timeStr(), resource.link());
    }
}
