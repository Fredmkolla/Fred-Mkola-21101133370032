package com.Mkola.Gross.Profit.Service;


import com.Mkola.Gross.Profit.Entity.GrossProfitEnt;
import com.Mkola.Gross.Profit.Repository.GrossProfitRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class GrossProfitServiceImpl implements GrossProfitService {

    @Autowired
    private GrossProfitRepository grossProfitRepository;

    @Override
    public GrossProfitEnt createGrossProfit(GrossProfitEnt grossProfit) {
        return grossProfitRepository.save(grossProfit);
    }

    @Override
    public GrossProfitEnt updateGrossProfit(Long id, GrossProfitEnt grossProfit) {
        GrossProfitEnt existingGrossProfit = grossProfitRepository.findById(id).orElse(null);
        if (existingGrossProfit == null) {
            return null;
        }
        existingGrossProfit.setProductName(grossProfit.getProductName());
        existingGrossProfit.setCostPrice(grossProfit.getCostPrice());
        existingGrossProfit.setSellingPrice(grossProfit.getSellingPrice());
        return grossProfitRepository.save(existingGrossProfit);
    }

    @Override
    public void deleteGrossProfit(Long id) {
        grossProfitRepository.deleteById(id);
    }


    @Override
    public GrossProfitEnt getGrossProfitById(Long id) {
        return grossProfitRepository.findById(id).orElse(null);
    }

    @Override
    public List<GrossProfitEnt> getAllGrossProfits() {
        return grossProfitRepository.findAll();

    }
}