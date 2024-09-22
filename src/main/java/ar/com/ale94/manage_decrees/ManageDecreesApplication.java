package ar.com.ale94.manage_decrees;

import ar.com.ale94.manage_decrees.entities.DecreeEntity;
import ar.com.ale94.manage_decrees.repositories.DecreeRepository;
import ar.com.ale94.manage_decrees.utils.Status;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ManageDecreesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageDecreesApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(DecreeRepository repository) {
        return (args) -> {
            var decree1 = DecreeEntity.builder()
                    .decreeNumber("D-2023-001")
                    .issueDate(LocalDate.now())
                    .title("Prohibición de uso de plásticos de un solo uso")
                    .description("Se prohíbe el uso y comercialización de plásticos de un solo uso en todo el territorio nacional")
                    .inFavorOf("Ministerio de Medio Ambiente")
                    .status(Status.high)
                    .effectiveDate(LocalDate.now())
                    .expirationDate(LocalDate.now())
                    .attachment("prohibicion_plasticos.pdf")
                    .build();

            var decree2 = DecreeEntity.builder()
                    .decreeNumber("D-2022-019")
                    .issueDate(LocalDate.now())
                    .title("Incremento del salario mínimo")
                    .description("Se establece un incremento del 5% en el salario mínimo para todos los sectores productivos")
                    .inFavorOf("Trabajadores")
                    .status(Status.high)
                    .effectiveDate(LocalDate.now())
                    .expirationDate(LocalDate.now())
                    .attachment("incremento_salario.pdf")
                    .build();

            var decree3 = DecreeEntity.builder()
                    .decreeNumber("D-2021-007")
                    .issueDate(LocalDate.now())
                    .title("Creación del Fondo Nacional de Salud")
                    .description("Se crea un fondo especial para financiar el sistema de salud pública")
                    .inFavorOf("Ciudadanos")
                    .status(Status.high)
                    .effectiveDate(LocalDate.now())
                    .expirationDate(LocalDate.now())
                    .attachment("fondo_nacional_salud.pdf")
                    .build();

            repository.save(decree1);
            repository.save(decree2);
            repository.save(decree3);
        };
    }

}
