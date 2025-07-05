package com.horizon.managewise.meeting_microservice.meeting.interfaces.rest.transform;


import com.horizon.managewise.meeting_microservice.meeting.domain.model.commands.UpdateMeetingCommand;
import com.horizon.managewise.meeting_microservice.meeting.interfaces.rest.resources.MeetingResource;

public class UpdateMeetingCommandFromResourceAssembler {
    public static UpdateMeetingCommand toCommandFromResource(Long meetingId, MeetingResource resource) {
        return new UpdateMeetingCommand(meetingId, resource.title(), resource.dateStr(), resource.timeStr(), resource.link());
    }
}
