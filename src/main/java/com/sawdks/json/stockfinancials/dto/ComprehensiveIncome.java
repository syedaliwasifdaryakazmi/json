package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComprehensiveIncome{
    private BasicData other_comprehensive_income_loss_attributable_to_parent;
    private BasicData comprehensive_income_loss_attributable_to_parent;
    private BasicData comprehensive_income_loss;
    private BasicData comprehensive_income_loss_attributable_to_noncontrolling_interest;
    private BasicData other_comprehensive_income_loss;
}
