package com.bits.dbms.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "prescription")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRESCRIPTION_ID")
    private Long prescriptionId;

    @Column(name = "CUST_ID")
    private Long customerId;

    @Column(name = "PRESCRIPTION")
    private String prescription;

    @Column(name = "ORDER_DATE")
    private LocalDateTime orderDate;

    @Column(name = "PHARMACIST_ID")
    private Long pharmacistId;

    @Column(name = "LAST_UPDATE_BY")
    private String lastUpdateBy;

    @Column(name = "LAST_UPDATE_DATE")
    private LocalDateTime lastUpdateDate;

}
