package com.horizon.managewise.meeting_microservice.meeting.application.internal.queryservices;


import org.springframework.stereotype.Service;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.aggregates.Meeting;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.queries.GetAllMeetingsQuery;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.queries.GetMeetingByIdQuery;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.queries.GetMeetingByTitleQuery;
import com.horizon.managewise.meeting_microservice.meeting.domain.services.MeetingQueryService;
import com.horizon.managewise.meeting_microservice.meeting.infrastructure.persistence.jpa.repositories.MeetingRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MeetingQueryServiceImpl implements MeetingQueryService {

    private final MeetingRepository meetingRepository;

    public MeetingQueryServiceImpl(MeetingRepository meetingRepository) {
        this.meetingRepository = meetingRepository;
    }

    @Override
    public List<Meeting> handle(GetAllMeetingsQuery query) {
        return this.meetingRepository.findAll();
    }

    @Override
    public Optional<Meeting> handle(GetMeetingByIdQuery query) {
        return this.meetingRepository.findById(query.meetingId());
    }

    @Override
    public Optional<Meeting> handle(GetMeetingByTitleQuery query) {
        return this.meetingRepository.findByTitle(query.title());
    }
}
