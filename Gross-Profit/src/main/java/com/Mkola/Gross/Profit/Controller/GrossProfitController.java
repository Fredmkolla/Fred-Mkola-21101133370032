package com.Mkola.Gross.Profit.Controller;

import com.Mkola.Gross.Profit.Entity.GrossProfitEnt;
import com.Mkola.Gross.Profit.Service.GrossProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/gross-profits")
public class GrossProfitController {

    @Autowired
    private GrossProfitService grossProfitService;

    @PostMapping
    public ResponseEntity<GrossProfitEnt> createGrossProfit(@RequestBody GrossProfitEnt grossProfit) {
        GrossProfitEnt createdGrossProfit = grossProfitService.createGrossProfit(grossProfit);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdGrossProfit);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GrossProfitEnt> updateGrossProfit(@PathVariable("id") Long id,
                                                            @RequestBody GrossProfitEnt grossProfit) {
        GrossProfitEnt updatedGrossProfit = grossProfitService.updateGrossProfit(id, grossProfit);
        if (updatedGrossProfit == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedGrossProfit);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGrossProfit(@PathVariable("id") Long id) {
        grossProfitService.deleteGrossProfit(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GrossProfitEnt> getGrossProfitById(@PathVariable("id") Long id) {
        GrossProfitEnt grossProfit = grossProfitService.getGrossProfitById(id);
        if (grossProfit == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(grossProfit);
    }

    @GetMapping
    public ResponseEntity<Object> getAllGrossProfits() {
        List<GrossProfitEnt> grossProfits = grossProfitService.getAllGrossProfits();
        return ResponseEntity.ok(grossProfits);
    }
}