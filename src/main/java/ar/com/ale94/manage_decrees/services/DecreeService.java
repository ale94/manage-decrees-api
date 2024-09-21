package ar.com.ale94.manage_decrees.services;

import ar.com.ale94.manage_decrees.dto.DecreeDTO;
import ar.com.ale94.manage_decrees.entities.DecreeEntity;
import ar.com.ale94.manage_decrees.repositories.DecreeRepository;
import ar.com.ale94.manage_decrees.utils.Status;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
@Slf4j
@AllArgsConstructor
public class DecreeService implements IDecreeService {

    private final DecreeRepository decreeRepository;

    @Override
    public DecreeEntity save(DecreeDTO dto) {
        var decreeToPersist = DecreeEntity.builder()
                .decreeNumber(dto.getDecreeNumber())
                .issueDate(LocalDate.now())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .inFavorOf(dto.getInFavorOf())
                .status(Status.high)
                .effectiveDate(dto.getEffectiveDate())
                .expirationDate(dto.getExpirationDate())
                .attachment(dto.getAttachment())
                .build();
        var decreePersisted = this.decreeRepository.save(decreeToPersist);
        log.info("Decree saved with id {}", decreePersisted.getId());
        return decreePersisted;
    }

    @Override
    public List<DecreeEntity> getAll() {
        return List.of();
    }

    @Override
    public DecreeEntity getByNumber(String number) {
        return null;
    }

    @Override
    public DecreeEntity update(String number, DecreeDTO dto) {
        return null;
    }

    @Override
    public void delete() {

    }
}
