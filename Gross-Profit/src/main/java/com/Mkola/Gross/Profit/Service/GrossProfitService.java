package com.Mkola.Gross.Profit.Service;

import com.Mkola.Gross.Profit.Entity.GrossProfitEnt;

import java.util.List;

public interface GrossProfitService {

    GrossProfitEnt createGrossProfit(GrossProfitEnt grossProfit);

    GrossProfitEnt updateGrossProfit(Long id, GrossProfitEnt grossProfit);

    GrossProfitEnt getGrossProfitById(Long id);

    List<GrossProfitEnt> getAllGrossProfits();

    void deleteGrossProfit(Long grossProfitId);

}

