package com.dogac.productionschedule.productionschedule.Repository;

import com.dogac.productionschedule.productionschedule.Entity.Break;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreakRepository extends JpaRepository<Break,Long> {
}
