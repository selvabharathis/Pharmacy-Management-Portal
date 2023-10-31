package com.bits.dbms.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUST_ID")
    private Long customerId;

    @Column(name = "CUST_NAME")
    private String customerName;

    @Column(name = "CONTACT_NUMBER")
    private Long contactNumber;

    @Column(name = "PRESCRIPTION_HISTORY")
    private String prescriptionHistoryId; // prescriptionIDs with comma seperated value

    @Column(name = "LAST_UPDATE_BY")
    private String lastUpdateBy;

    @Column(name = "LAST_UPDATE_DATE")
    private LocalDateTime lastUpdateDate;

}
