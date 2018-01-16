package com.boot.controller;

import com.boot.model.Medicine;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Karol on 2018-01-16.
 */

@RestController
@RequestMapping("api/v1/")
public class MedicineController {

   // @RequestMapping(value = "medicines", method = RequestMethod.GET)
   // public List<Medicine> list();
}
