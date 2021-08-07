package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoncurrentLiabilities{
    private String label;
    private double value;
    private String unit;
    private int order;
}
