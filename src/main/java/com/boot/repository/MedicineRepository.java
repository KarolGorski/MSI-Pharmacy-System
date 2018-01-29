package com.boot.repository;

import com.boot.model.Med;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Karol on 2018-01-21.
 */
public interface MedicineRepository extends JpaRepository<Med, Long> {
    List<Med> findAllByName(String query);
}
