package com.klef.fsad.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.exam.model.SupplierOrder;

public interface SupplierOrderRepository 
        extends JpaRepository<SupplierOrder, Integer>
{
}
