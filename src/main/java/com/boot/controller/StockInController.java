package com.boot.controller;

import com.boot.model.StockIn;
import com.boot.repository.StockInRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Karol on 2018-01-16.
 */

@RestController
@RequestMapping("api/v1/") //ANGULAR TEGO WYMAGA!!!!!!!!!!!!!!!!!!!
public class StockInController {

    @Autowired
    private StockInRepository stockinRepository;


    @RequestMapping(value = "stockins", method = RequestMethod.GET)
    public List<StockIn> list()
    {
        return stockinRepository.findAll();
    }

    @RequestMapping(value = "stockins", method = RequestMethod.POST)
    public StockIn create(@RequestBody StockIn stockin)
   {
        return stockinRepository.saveAndFlush(stockin);
   }

    @RequestMapping(value = "stockins/{id}", method = RequestMethod.GET)
    public StockIn get(@PathVariable Long id)
    {
        return stockinRepository.findOne(id);
    }

    @RequestMapping(value = "stockins/{id}", method = RequestMethod.PUT)
    public StockIn update(@PathVariable Long id, @RequestBody StockIn stockin)
    {
        StockIn existingStockIn = stockinRepository.findOne(id);
        BeanUtils.copyProperties(stockin,existingStockIn);
        return stockinRepository.saveAndFlush(existingStockIn);
    }

    @RequestMapping(value = "stockins/{id}", method = RequestMethod.DELETE)
    public StockIn delete(@PathVariable Long id)
    {
        StockIn existingStockIn = stockinRepository.findOne(id);
        stockinRepository.delete(existingStockIn);
        return existingStockIn;
    }

    @RequestMapping(value = "stockinsearch", method = RequestMethod.GET)
    public List<StockIn> search(@RequestParam Long query) {
        return stockinRepository.findBy_idLike(query);
    }

}
