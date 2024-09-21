package ar.com.ale94.manage_decrees.dto;

import java.time.LocalDate;

public class DecreeDTO {

    private String decreeNumber;
    private String title;
    private String description;
    private String inFavorOf;
    private LocalDate effectiveDate;
    private LocalDate expirationDate;
    private String attachment;
}
