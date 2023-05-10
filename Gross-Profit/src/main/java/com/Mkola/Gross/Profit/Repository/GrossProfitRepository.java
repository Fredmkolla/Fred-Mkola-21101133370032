package com.Mkola.Gross.Profit.Repository;

import com.Mkola.Gross.Profit.Entity.GrossProfitEnt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrossProfitRepository extends JpaRepository<GrossProfitEnt, Long> {
}
