package com.groupeisi.companyspringmvctiles.dao;

import com.groupeisi.companyspringmvctiles.entities.ProductEntity;
import com.groupeisi.companyspringmvctiles.entities.Sales;
import com.groupeisi.companyspringmvctiles.exception.NotAvailableQuantityException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.transaction.Transactional;
import java.util.Optional;

public class SalesDao extends RepositoryImpl<Sales> implements ISalesDao {

}
