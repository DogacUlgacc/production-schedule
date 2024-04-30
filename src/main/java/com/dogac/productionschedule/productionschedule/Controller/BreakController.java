package com.dogac.productionschedule.productionschedule.Controller;

import com.dogac.productionschedule.productionschedule.Entity.Break;
import com.dogac.productionschedule.productionschedule.Service.BreakService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/break")
public class BreakController
{
    BreakService breakService;
    public BreakController(BreakService breakService){
        this.breakService = breakService;
    }
    @GetMapping("/all")
    public List<Break> getAllBreak(){
        return breakService.getAllBreaks();
    }

}
