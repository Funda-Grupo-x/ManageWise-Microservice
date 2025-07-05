package com.horizon.managewise.meeting_microservice.meeting.domain.services;


import com.horizon.managewise.meeting_microservice.meeting.domain.model.aggregates.Meeting;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.queries.GetAllMeetingsQuery;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.queries.GetMeetingByIdQuery;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.queries.GetMeetingByTitleQuery;

import java.util.List;
import java.util.Optional;

public interface MeetingQueryService {
    List<Meeting> handle(GetAllMeetingsQuery query);
    Optional<Meeting> handle(GetMeetingByIdQuery query);
    Optional<Meeting> handle(GetMeetingByTitleQuery query);
}
