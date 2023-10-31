package com.bits.dbms.dto;

import lombok.Data;
import java.time.LocalDateTime;
@Data
public class InventoryDTO {

    private Long inventoryId;
    private Long medicineId;
    private LocalDateTime inDate;
    private LocalDateTime outDate;
    private Long inQuantity;
    private Long outQuantity;
    private Long customerId;
    private String lastUpdateBy;
    private LocalDateTime lastUpdateDate;

}
