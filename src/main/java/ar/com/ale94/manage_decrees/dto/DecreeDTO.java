package ar.com.ale94.manage_decrees.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DecreeDTO {
    private String decreeNumber;
    private String title;
    private String description;
    private String inFavorOf;
    private LocalDate effectiveDate;
    private LocalDate expirationDate;
    private String attachment;
}
