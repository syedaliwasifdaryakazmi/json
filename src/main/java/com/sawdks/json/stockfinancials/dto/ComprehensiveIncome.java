package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComprehensiveIncome{
    private OtherComprehensiveIncomeLossAttributableToParent other_comprehensive_income_loss_attributable_to_parent;
    private ComprehensiveIncomeLossAttributableToParent comprehensive_income_loss_attributable_to_parent;
    private ComprehensiveIncomeLoss comprehensive_income_loss;
    private ComprehensiveIncomeLossAttributableToNoncontrollingInterest comprehensive_income_loss_attributable_to_noncontrolling_interest;
    private OtherComprehensiveIncomeLoss other_comprehensive_income_loss;
}
