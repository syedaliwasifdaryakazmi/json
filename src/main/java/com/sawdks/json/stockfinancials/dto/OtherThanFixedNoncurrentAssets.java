package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OtherThanFixedNoncurrentAssets{
    private String label;
    private double value;
    private String unit;
    private int order;
}
