package com.dogac.productionschedule.productionschedule.Service;

import com.dogac.productionschedule.productionschedule.Entity.Report;
import com.dogac.productionschedule.productionschedule.Repository.ReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    ReportRepository reportRepository;

    public ReportService (ReportRepository reportRepository){
        this.reportRepository = reportRepository;
    }

    public List<Report> getAllReports() {
       return reportRepository.findAll();
    }
}
