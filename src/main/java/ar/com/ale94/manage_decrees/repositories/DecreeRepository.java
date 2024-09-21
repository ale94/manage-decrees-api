package ar.com.ale94.manage_decrees.repositories;

import ar.com.ale94.manage_decrees.entities.DecreeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DecreeRepository extends JpaRepository<DecreeEntity, Long> {

    Optional<DecreeEntity> findByDecreeNumber(String number);
}
