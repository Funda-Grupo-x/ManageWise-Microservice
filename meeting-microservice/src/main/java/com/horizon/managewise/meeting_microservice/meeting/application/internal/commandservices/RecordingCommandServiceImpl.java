package com.horizon.managewise.meeting_microservice.meeting.application.internal.commandservices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.aggregates.Meeting;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.commands.CreateRecordingCommand;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.commands.DeleteRecordingCommand;
import com.horizon.managewise.meeting_microservice.meeting.domain.model.entities.Recording;
import com.horizon.managewise.meeting_microservice.meeting.domain.services.RecordingCommandService;
import com.horizon.managewise.meeting_microservice.meeting.infrastructure.persistence.jpa.repositories.MeetingRepository;
import com.horizon.managewise.meeting_microservice.meeting.infrastructure.persistence.jpa.repositories.RecordingRepository;

@Service
public class RecordingCommandServiceImpl implements RecordingCommandService {

    @Autowired
    private RecordingRepository recordingRepository;

    @Autowired
    private MeetingRepository meetingRepository;

    @Override
    public Long handle(CreateRecordingCommand command) {
        // Buscar la reunión asociada usando el ID de la reunión proporcionado
        Meeting meeting = meetingRepository.findById(command.meetingId())  // Cambiado a command.meetingId()
                .orElseThrow(() -> new IllegalArgumentException("Meeting not found with ID: " + command.meetingId()));

        // Crear una nueva grabación con la reunión encontrada
        Recording recording = new Recording(meeting, command.recordingLink(), command.duration(), command.publicAccess());

        // Guardar la grabación en la base de datos
        Recording savedRecording = recordingRepository.save(recording);

        // Retornar el ID de la grabación guardada
        return savedRecording.getId();
    }

    @Override
    public void handle(DeleteRecordingCommand command) {
        if (!recordingRepository.existsById(command.recordingId())) {
            throw new IllegalArgumentException("Recording not found with ID: " + command.recordingId());
        }

        recordingRepository.deleteById(command.recordingId());
        System.out.println("Grabación eliminada con éxito con ID: " + command.recordingId());
    }
}

