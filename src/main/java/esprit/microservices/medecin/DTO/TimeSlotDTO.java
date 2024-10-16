package esprit.microservices.medecin.DTO;

public record TimeSlotDTO(
        String startTime,
        String endTime
) {}