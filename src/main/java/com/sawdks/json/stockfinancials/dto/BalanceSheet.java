package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BalanceSheet{
    private BasicData noncurrent_liabilities;
    private BasicData fixed_assets;
    private BasicData equity_attributable_to_noncontrolling_interest;
    private BasicData current_liabilities;
    private BasicData equity_attributable_to_parent;
    private BasicData equity;
    private BasicData liabilities;
    private BasicData assets;
    private BasicData other_than_fixed_noncurrent_assets;
    private BasicData current_assets;
    private BasicData liabilities_and_equity;
    private BasicData noncurrent_assets;
}
