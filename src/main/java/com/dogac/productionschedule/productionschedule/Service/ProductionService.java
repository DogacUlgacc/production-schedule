package com.dogac.productionschedule.productionschedule.Service;

import com.dogac.productionschedule.productionschedule.Entity.Production;
import com.dogac.productionschedule.productionschedule.Repository.ProductionRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductionService {

    ProductionRepository productionRepository;

    public ProductionService(ProductionRepository productionRepository){
        this.productionRepository = productionRepository;
    }

    public List<Production> getAllProduction() {
        return productionRepository.findAll();
    }
}
