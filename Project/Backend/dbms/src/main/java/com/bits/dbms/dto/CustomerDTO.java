package com.bits.dbms.dto;

import lombok.Data;
import java.time.LocalDateTime;
@Data
public class CustomerDTO {

    private Long customerId;
    private String customerName;
    private Long contactNumber;
    private String prescriptionHistoryId; // prescriptionIDs with comma seperated value
    private String lastUpdateBy;
    private LocalDateTime lastUpdateDate;

}
