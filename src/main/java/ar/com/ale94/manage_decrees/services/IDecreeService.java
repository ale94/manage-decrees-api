package ar.com.ale94.manage_decrees.services;

import ar.com.ale94.manage_decrees.dto.DecreeDTO;
import ar.com.ale94.manage_decrees.entities.DecreeEntity;

import java.util.List;

public interface IDecreeService {

    DecreeEntity save(DecreeDTO dto);

    List<DecreeEntity> getAll();

    DecreeEntity getByNumber(String number);

    DecreeEntity update(String number, DecreeDTO dto);

    void delete();
}
