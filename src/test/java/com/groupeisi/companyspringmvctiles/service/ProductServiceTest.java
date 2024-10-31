package com.groupeisi.companyspringmvctiles.service;


import com.groupeisi.companyspringmvctiles.dao.AccountUserDao;
import com.groupeisi.companyspringmvctiles.dao.ProductDao;
import com.groupeisi.companyspringmvctiles.dto.ProductDto;
import com.groupeisi.companyspringmvctiles.entities.ProductEntity;
import com.groupeisi.companyspringmvctiles.mapper.ProductMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class ProductServiceTest {

    private ProductDao productDao;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    void init() {
        productDao = mock(ProductDao.class);
        productService.setProductDao(productDao);
    }

    @Test
    void findAll() {
        List<ProductEntity> productEntities = Arrays.asList(
                new ProductEntity("ref1", "product1", 10.0),
                new ProductEntity("ref2", "product2", 20.0)
        );

        when(productDao.list(any(ProductEntity.class))).thenReturn(productEntities);

        Optional<List<ProductDto>> productDtos = productService.findAll();
        Assertions.assertTrue(productDtos.isPresent());
        Assertions.assertEquals(2, productDtos.get().size());
    }

    @Test
    void save(){
        ProductDto productDto = new ProductDto("ref1", "prod1", 10.0);
        when(productDao.save(any(ProductEntity.class))).thenReturn(true);

        boolean saved = productService.save(productDto);
        Assertions.assertTrue(saved);
    }
}
