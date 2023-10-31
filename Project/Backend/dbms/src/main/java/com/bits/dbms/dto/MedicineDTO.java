package com.bits.dbms.dto;

import lombok.Data;
import java.time.LocalDateTime;
@Data
public class MedicineDTO {

    private Long medicineId;
    private String medicineName;
    private Long medicineCategoryId;
    private Long quantityAvailable;
    private String dosage;
    private String description;
    private Long price;
    private LocalDateTime expiryDate;
    private LocalDateTime manufactureDate;
    private String lastUpdateBy;
    private LocalDateTime lastUpdateDate;

}
