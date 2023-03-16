package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.MotoSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class MotoSave {

    private final MotoSaveService motoSaveService;

    public Moto saveMoto(Moto moto){
        return motoSaveService.saveMoto(moto);
    }

}
