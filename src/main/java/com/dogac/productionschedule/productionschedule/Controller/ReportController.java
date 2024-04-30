package com.dogac.productionschedule.productionschedule.Controller;

import com.dogac.productionschedule.productionschedule.Entity.Report;
import com.dogac.productionschedule.productionschedule.Service.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportController {

    ReportService reportService ;

    public ReportController (ReportService reportService){
        this.reportService = reportService;
    }

    @GetMapping("/all")
    public List<Report> getAllReports(){
        return reportService.getAllReports();
    }

    @PostMapping("/push")
    public void updateReport()
    {
      reportService.updateReport();
    }
}
