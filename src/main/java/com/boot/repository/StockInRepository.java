package com.boot.repository;

import com.boot.model.StockIn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Karol on 2018-01-21.
 */
public interface StockInRepository extends JpaRepository<StockIn, Long> {
    List<StockIn> findBy_idLike(Long query);
}
