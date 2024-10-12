package com.groupeisi.companyspringmvctiles.service;

import com.groupeisi.companyspringmvctiles.dto.ClientDto;

import java.util.List;
import java.util.Optional;

public class ClientService implements IClientService{

    @Override
    public Optional<List<ClientDto>> findAll() {
        return Optional.empty();
    }

    @Override
    public boolean save(ClientDto clientDto) {
        return false;
    }
}
