package com.boot.controller;

import com.boot.model.Med;
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
    public List<Med> list()
    {
        return medicineRepository.findAll();
    }

    @RequestMapping(value = "medicines", method = RequestMethod.POST)
    public Med create(@RequestBody Med medicine)
    {
        return medicineRepository.saveAndFlush(medicine);
    }

    @RequestMapping(value = "medicines/{id}", method = RequestMethod.GET)
    public Med get(@PathVariable Long id)
    {
        return medicineRepository.findOne(id);
    }

    @RequestMapping(value = "medicines/{id}", method = RequestMethod.PUT)
    public Med update(@PathVariable Long id, @RequestBody Med medicine)
    {
        Med existingMedicine = medicineRepository.findOne(id);
        BeanUtils.copyProperties(medicine,existingMedicine);
        return medicineRepository.saveAndFlush(existingMedicine);
    }

    @RequestMapping(value = "medicines/{id}", method = RequestMethod.DELETE)
    public Med delete(@PathVariable Long id)
    {
        Med existingMedicine = medicineRepository.findOne(id);
        medicineRepository.delete(existingMedicine);
        return existingMedicine;
    }

    @RequestMapping(value = "search/{query}")
    public List<Med> search(@PathVariable String query) {
        return medicineRepository.findAllByName(query);
    }
}
