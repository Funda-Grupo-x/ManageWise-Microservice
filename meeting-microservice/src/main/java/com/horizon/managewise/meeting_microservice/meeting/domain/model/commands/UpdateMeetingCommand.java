package com.horizon.managewise.meeting_microservice.meeting.domain.model.commands;


public record UpdateMeetingCommand(Long meetingId, String title, String dateStr, String timeStr, String link) {
}
