package com.horizon.managewise.meeting_microservice.meeting.interfaces.rest.resources;

public record RecordingResource(
        String recordingLink,
        String duration,
        boolean publicAccess
) {}
