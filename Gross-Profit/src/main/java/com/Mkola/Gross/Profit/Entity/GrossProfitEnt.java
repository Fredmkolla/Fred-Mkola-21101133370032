package com.Mkola.Gross.Profit.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GrossProfit_det")

public class GrossProfitEnt {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private Double costPrice;
    @Column(nullable = false)
    private Double sellingPrice;
    @Column(nullable = false)
    private Double grossProfit;



}
