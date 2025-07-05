package com.horizon.managewise.meeting_microservice.meeting.domain.model.commands;

public record CreateRecordingCommand(
        Long meetingId,
        String recordingLink,
        String duration,
        boolean publicAccess
) {}
