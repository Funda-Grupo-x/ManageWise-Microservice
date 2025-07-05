package com.horizon.managewise.meeting_microservice.meeting.interfaces.rest.resources;



public record CreateMeetingResource(String title, String dateStr, String timeStr, String link) {
}
