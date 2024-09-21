package ar.com.ale94.manage_decrees.repositories;

import ar.com.ale94.manage_decrees.entities.DecreeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DecreeRepository extends JpaRepository<Long, DecreeEntity> {
}
