package com.groupeisi.companyspringmvctiles.service;

import com.groupeisi.companyspringmvctiles.dao.IPanierDao;
import com.groupeisi.companyspringmvctiles.dao.PanierDao;
import com.groupeisi.companyspringmvctiles.dto.PanierDto;
import com.groupeisi.companyspringmvctiles.entities.PanierEntity;
import com.groupeisi.companyspringmvctiles.mapper.PanierMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class PanierService implements IPanierService{

    private static final Logger logger = LoggerFactory.getLogger(PanierService.class);

    private IPanierDao panierDao = new PanierDao();

    @Override
    public Optional<List<PanierDto>> findAll() {
        logger.info(" - Tentative de liste des paniers");

        List<PanierEntity> panierEntities = panierDao.list(new PanierEntity());
        List<PanierDto> panierDtos = PanierMapper.toListPanierDto(panierEntities);
        return Optional.of(panierDtos);
    }

    @Override
    public boolean save(PanierDto panierDto) {
        return false;
    }
}
