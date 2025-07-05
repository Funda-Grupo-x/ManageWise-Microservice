package com.horizon.managewise.meeting_microservice.meeting.domain.model.commands;

public record CreateMeetingCommand(String title, String dateStr, String timeStr, String link) {
}
