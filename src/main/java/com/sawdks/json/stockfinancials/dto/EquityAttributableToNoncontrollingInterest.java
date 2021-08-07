package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquityAttributableToNoncontrollingInterest{
    private String label;
    private int value;
    private String unit;
    private int order;
}
