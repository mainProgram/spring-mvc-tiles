package com.groupeisi.companyspringmvctiles.service;

import com.groupeisi.companyspringmvctiles.dao.IClientDao;
import com.groupeisi.companyspringmvctiles.dao.ClientDao;
import com.groupeisi.companyspringmvctiles.dto.ClientDto;
import com.groupeisi.companyspringmvctiles.entities.ClientEntity;
import com.groupeisi.companyspringmvctiles.mapper.ClientMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class ClientService implements IClientService{

    private static final Logger logger = LoggerFactory.getLogger(ClientService.class);

    private IClientDao clientDao = new ClientDao();

    @Override
    public Optional<List<ClientDto>> findAll() {
        logger.info(" - Tentative de liste des clients");

        List<ClientEntity> clientEntities = clientDao.list(new ClientEntity());
        List<ClientDto> clientDtos = ClientMapper.toListClientDto(clientEntities);
        return Optional.of(clientDtos);
    }

    @Override
    public boolean save(ClientDto clientDto) {
        return false;
    }

    @Override
    public Optional<ClientDto> findById(Long id) {
        ClientEntity client = new ClientEntity();
        Optional<ClientEntity> clientEntity = Optional.ofNullable(clientDao.get(id, client));
        return clientEntity.map(ClientMapper::toClientDto);
    }
}
