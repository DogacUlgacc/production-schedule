package com.dogac.productionschedule.productionschedule.Repository;

import com.dogac.productionschedule.productionschedule.Entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<Report,Long> {
}
