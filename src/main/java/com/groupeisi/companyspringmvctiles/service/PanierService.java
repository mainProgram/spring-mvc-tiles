package com.groupeisi.companyspringmvctiles.service;

import com.groupeisi.companyspringmvctiles.dto.PanierDto;

import java.util.List;
import java.util.Optional;

public class PanierService implements IPanierService{


    @Override
    public Optional<List<PanierDto>> findAll() {
        return Optional.empty();
    }

    @Override
    public boolean save(PanierDto panierDto) {
        return false;
    }
}
