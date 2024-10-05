package com.groupeisi.companyspringmvctiles.service;

import com.groupeisi.companyspringmvctiles.dto.SalesDto;
import com.groupeisi.companyspringmvctiles.entities.Sales;

import java.util.List;
import java.util.Optional;

public interface ISalesService {
    Optional<List<SalesDto>> findAll();

    boolean save(SalesDto salesDto);
    boolean saleTransactional(Sales sales);
}
