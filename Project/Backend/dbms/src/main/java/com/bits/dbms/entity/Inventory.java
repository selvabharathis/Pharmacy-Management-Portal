package com.bits.dbms.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "INV_ID")
    private Long inventoryId;

    @Column(name = "MED_ID")
    private Long medicineId;

    @Column(name = "IN_DATE")
    private LocalDateTime inDate;

    @Column(name = "OUT_DATE")
    private LocalDateTime outDate;

    @Column(name = "IN_QUANTITY")
    private Long inQuantity;

    @Column(name = "OUT_QUANTITY")
    private Long outQuantity;

    @Column(name = "CUST_ID")
    private Long customerId;

    @Column(name = "LAST_UPDATE_BY")
    private String lastUpdateBy;

    @Column(name = "LAST_UPDATE_DATE")
    private LocalDateTime lastUpdateDate;

}
