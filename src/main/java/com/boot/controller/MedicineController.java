package com.boot.controller;

import com.boot.controller.MedicineStub;
import com.boot.model.Medicine;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Karol on 2018-01-16.
 */

@RestController
@RequestMapping("api/v1/") //ANGULAR TEGO WYMAGA!!!!!!!!!!!!!!!!!!!
public class MedicineController {

    @RequestMapping(value = "medicines", method = RequestMethod.GET)
    public List<Medicine> list()
    {
        return MedicineStub.list();
    }

    @RequestMapping(value = "medicines", method = RequestMethod.POST)
    public Medicine create(@RequestBody Medicine medicine)
    {
        return MedicineStub.create(medicine);
    }

    @RequestMapping(value = "medicines/{id}", method = RequestMethod.GET)
    public Medicine get(@PathVariable Long id)
    {
        return MedicineStub.get(id);
    }

    @RequestMapping(value = "medicines/{id}", method = RequestMethod.PUT)
    public Medicine update(@PathVariable Long id, @RequestBody Medicine medicine)
    {
        return MedicineStub.update(id,medicine);
    }

    @RequestMapping(value = "medicines", method = RequestMethod.DELETE)
    public Medicine delete(@PathVariable Long id)
    {
        return MedicineStub.delete(id);
    }
}
