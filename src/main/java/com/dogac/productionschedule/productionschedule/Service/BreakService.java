package com.dogac.productionschedule.productionschedule.Service;

import com.dogac.productionschedule.productionschedule.Entity.Break;
import com.dogac.productionschedule.productionschedule.Repository.BreakRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreakService {

    BreakRepository breakRepository;

    public BreakService(BreakRepository breakRepository){
        this.breakRepository = breakRepository;

    }

    public List<Break> getAllBreaks() {
    return breakRepository.findAll();
    }
}
