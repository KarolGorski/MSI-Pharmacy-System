package com.boot.controller;

import com.boot.controller.MedicineStub;
import com.boot.model.Medicine;
import com.boot.repository.MedicineRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Karol on 2018-01-16.
 */

@RestController
@RequestMapping("api/v1/") //ANGULAR TEGO WYMAGA!!!!!!!!!!!!!!!!!!!
public class MedicineController {

    @Autowired
    private MedicineRepository medicineRepository;


    @RequestMapping(value = "medicines", method = RequestMethod.GET)
    public List<Medicine> list()
    {
        return medicineRepository.findAll();
    }

    @RequestMapping(value = "medicines", method = RequestMethod.POST)
    public Medicine create(@RequestBody Medicine medicine)
    {
        return medicineRepository.saveAndFlush(medicine);
    }

    @RequestMapping(value = "medicines/{id}", method = RequestMethod.GET)
    public Medicine get(@PathVariable Long id)
    {
        return medicineRepository.findOne(id);
    }

    @RequestMapping(value = "medicines/{id}", method = RequestMethod.PUT)
    public Medicine update(@PathVariable Long id, @RequestBody Medicine medicine)
    {
        Medicine existingMedicine = medicineRepository.findOne(id);
        BeanUtils.copyProperties(medicine,existingMedicine);
        return medicineRepository.saveAndFlush(existingMedicine);
    }

    @RequestMapping(value = "medicines", method = RequestMethod.DELETE)
    public Medicine delete(@PathVariable Long id)
    {
        Medicine existingMedicine = medicineRepository.findOne(id);
        medicineRepository.delete(existingMedicine);
        return existingMedicine;
    }
}
