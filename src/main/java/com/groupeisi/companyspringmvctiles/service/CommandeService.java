package com.groupeisi.companyspringmvctiles.service;

import com.groupeisi.companyspringmvctiles.dto.CommandeDto;

import java.util.List;
import java.util.Optional;

public class CommandeService implements ICommandeService{

    @Override
    public Optional<List<CommandeDto>> findAll() {
        return Optional.empty();
    }

    @Override
    public boolean save(CommandeDto commandeDto) {
        return false;
    }
}
