package com.dogac.productionschedule.productionschedule.Controller;

import com.dogac.productionschedule.productionschedule.Entity.Production;
import com.dogac.productionschedule.productionschedule.Service.ProductionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/production")
public class ProductionController {
    ProductionService productionService ;

    public ProductionController(ProductionService productionService) {
        this.productionService = productionService;
    }

    @GetMapping("/all")
    public List<Production> getAllProduction(){
        return productionService.getAllProduction();
    }
}
