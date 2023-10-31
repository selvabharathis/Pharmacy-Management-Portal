package com.bits.dbms.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PrescriptionDTO {

    private Long prescriptionId;
    private Long customerId;
    private String prescription;
    private LocalDateTime orderDate;
    private Long pharmacistId;
    private String lastUpdateBy;
    private LocalDateTime lastUpdateDate;

}
