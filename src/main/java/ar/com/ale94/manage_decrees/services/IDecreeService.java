package ar.com.ale94.manage_decrees.services;

import ar.com.ale94.manage_decrees.entities.DecreeEntity;

import java.util.List;

public interface IDecreeService {

    DecreeEntity save();

    List<DecreeEntity> getAll();

    DecreeEntity getByNumber();

    DecreeEntity update();

    void delete();
}
