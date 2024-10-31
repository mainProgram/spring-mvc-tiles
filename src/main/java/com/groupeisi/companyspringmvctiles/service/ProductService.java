package com.groupeisi.companyspringmvctiles.service;

import com.groupeisi.companyspringmvctiles.dao.IProductDao;
import com.groupeisi.companyspringmvctiles.dao.ProductDao;
import com.groupeisi.companyspringmvctiles.dto.ProductDto;
import com.groupeisi.companyspringmvctiles.entities.ProductEntity;
import com.groupeisi.companyspringmvctiles.mapper.ProductMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ProductService implements IProductService {

    private static final Logger logger = LoggerFactory.getLogger(PurchasesService.class);

    public void setProductDao(IProductDao productDao) {
        this.productDao = productDao;
    }

    private IProductDao productDao = new ProductDao();

    @Override
    public Optional<List<ProductDto>> findAll() {
        logger.info("PurchasesService - Tentative de liste des produits");

        List<ProductEntity> productEntities = productDao.list(new ProductEntity());
        List<ProductDto> productDtos = ProductMapper.toListProductDto(productEntities);
        return Optional.of(productDtos);
    }

    @Override
    public boolean save(ProductDto productDto) {
        logger.info("PurchasesService - Tentative d'enregistrement d'un produit : {}", productDto);
        ProductEntity productEntity = ProductMapper.toProductEntity(productDto);
        return productDao.save(productEntity);
    }

    @Override
    public Optional<ProductDto> findByRef(String ref) {
        Optional<ProductEntity> productEntity = productDao.findByRef(ref);
        return productEntity.map(ProductMapper::toProductDto);
    }

    @Override
    public boolean update(ProductDto productDto) {
        logger.info("PurchasesService - Tentative de modification d'un produit : {}", productDto);
        ProductEntity productEntity = ProductMapper.toProductEntity(productDto);
        return productDao.update(productEntity);
    }

    @Override
    public Optional<List<ProductDto>> findAllByRef(List<String> refs) {
        List<ProductDto> products = new ArrayList<>();

        refs.forEach(ref -> {
            Optional<ProductEntity> productEntity = productDao.findByRef(ref);
            productEntity.ifPresent(entity -> products.add(ProductMapper.toProductDto(entity)));
        });

        return products.isEmpty() ? Optional.empty() : Optional.of(products);
    }
}
