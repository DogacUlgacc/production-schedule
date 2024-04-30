package com.dogac.productionschedule.productionschedule.Entity;


import jakarta.persistence.*;
import lombok.Data;


import java.util.Date;

@Entity
@Data
@Table(name = "report")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_time")
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "finish_time")
    private Date finishTime;

    @Column(name = "total_time")
    private Double totalTime;

    @Column(name = "state")
    private String state;

    @Column(name = "break_reason")
    private String breakReason;


}
