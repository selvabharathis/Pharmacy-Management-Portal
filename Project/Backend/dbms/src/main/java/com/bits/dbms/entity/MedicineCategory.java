package com.bits.dbms.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "medicine_category")
public class MedicineCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID")
    private Long categoryId;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;

}
