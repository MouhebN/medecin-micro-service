package esprit.microservices.medecin.DTO;

import java.util.UUID;

public record CreateMedecinRequest(
        String firstName,
        String lastName,
        String specialty,
        String licenseNumber,
        int experienceYears
) {}
