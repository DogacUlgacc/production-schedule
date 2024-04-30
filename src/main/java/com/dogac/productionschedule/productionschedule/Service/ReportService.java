package com.dogac.productionschedule.productionschedule.Service;

import com.dogac.productionschedule.productionschedule.Entity.Break;
import com.dogac.productionschedule.productionschedule.Entity.Production;
import com.dogac.productionschedule.productionschedule.Entity.Report;
import com.dogac.productionschedule.productionschedule.Repository.BreakRepository;
import com.dogac.productionschedule.productionschedule.Repository.ProductionRepository;
import com.dogac.productionschedule.productionschedule.Repository.ReportRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReportService {

    ReportRepository reportRepository;
    ProductionRepository productionRepository;
    BreakRepository breakRepository;

    public ReportService (ReportRepository reportRepository,ProductionRepository productionRepository,BreakRepository breakRepository){
        this.reportRepository = reportRepository;
        this.productionRepository = productionRepository;
        this.breakRepository = breakRepository;
    }

    public List<Report> getAllReports() {
       return reportRepository.findAll();
    }

    public void updateReport() {
        List<Production> productionList = productionRepository.findAll();

        for (Production production : productionList) {
            Report report = new Report();
            report.setState(production.getState());
            report.setFinishTime(production.getEndTime());
            report.setStartTime(production.getStartTime());
            report.setTotalTime(production.getTotalTime());
            reportRepository.save(report);
        }
        List<Break> breakList = breakRepository.findAll();
        for (Break breakData : breakList) {
            Report report = new Report();
            report.setBreakReason(breakData.getBreakReason());
            report.setStartTime(breakData.getStartTime());
            report.setFinishTime(breakData.getFinishedTime());

            if(breakData.getId() == 1){
                report.setTotalTime(0.25);

            }
            else if(breakData.getId() == 2){
                report.setTotalTime(0.5);
            }
            else if(breakData.getId()== 3){
                report.setTotalTime(0.25);
            }
            reportRepository.save(report);
        }

    }
}
