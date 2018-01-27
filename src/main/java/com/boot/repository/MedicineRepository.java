package com.boot.repository;

import com.boot.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Karol on 2018-01-21.
 */
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
}
