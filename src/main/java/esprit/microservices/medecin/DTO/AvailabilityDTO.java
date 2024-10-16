package esprit.microservices.medecin.DTO;

import java.time.DayOfWeek;
import java.util.List;

public record AvailabilityDTO(
        DayOfWeek dayOfWeek,
        List<TimeSlotDTO> timeSlots
) {}