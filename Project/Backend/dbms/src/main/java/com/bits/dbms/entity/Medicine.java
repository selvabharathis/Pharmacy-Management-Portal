package com.bits.dbms.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "medicine")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MED_ID")
    private Long medicineId;

    @Column(name = "MED_NAME")
    private String medicineName;

    @Column(name = "MED_CATEGORY_ID")
    private Long medicineCategoryId;

    @Column(name = "QUANTITY_AVAILABLE")
    private Long quantityAvailable;

    @Column(name = "DOSAGE")
    private String dosage;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private Long price;

    @Column(name = "EXP_DATE")
    private LocalDateTime expiryDate;

    @Column(name = "MFG_DATE")
    private LocalDateTime manufactureDate;

    @Column(name = "LAST_UPDATE_BY")
    private String lastUpdateBy;

    @Column(name = "LAST_UPDATE_DATE")
    private LocalDateTime lastUpdateDate;

}
