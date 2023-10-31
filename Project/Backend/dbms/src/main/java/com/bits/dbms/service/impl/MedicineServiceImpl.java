package com.bits.dbms.service.impl;

import com.bits.dbms.repository.MedicineRepository;
import com.bits.dbms.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service(value="medicineService")
@Transactional
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineRepository medicineRepository;
}
