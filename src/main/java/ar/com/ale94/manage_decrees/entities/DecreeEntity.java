package ar.com.ale94.manage_decrees.entities;

import ar.com.ale94.manage_decrees.utils.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "decree")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DecreeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number")
    private String decreeNumber;
    private LocalDate issueDate;
    private String title;
    private String description;
    private String inFavorOf;
    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDate effectiveDate;
    private LocalDate expirationDate;
    private String attachment;
}
