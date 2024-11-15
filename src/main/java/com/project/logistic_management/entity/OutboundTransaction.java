package com.project.logistic_management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "outbound_transaction")
public class OutboundTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "schedule_id")
    private Integer scheduleId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "approved_time")
    private Date approvedTime;

    @Column(name = "total_amount")
    private Float totalAmount;

    @Column(name = "status")
    private Integer status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;
}