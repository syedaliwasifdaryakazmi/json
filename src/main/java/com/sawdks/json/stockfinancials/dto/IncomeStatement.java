package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IncomeStatement{
    private BasicData gross_profit;
    private BasicData net_income_loss_attributable_to_parent;
    private BasicData net_income_loss_available_to_common_stockholders_basic;
    private BasicData benefits_costs_expenses;
    private BasicData participating_securities_distributed_and_undistributed_earnings_loss_basic;
    private BasicData interest_expense_operating;
    private BasicData net_income_loss_attributable_to_noncontrolling_interest;
    private BasicData income_tax_expense_benefit_deferred;
    private BasicData nonoperating_income_loss;
    private BasicData costs_and_expenses;
    private BasicData operating_income_loss;
    private BasicData diluted_earnings_per_share;
    private BasicData cost_of_revenue;
    private BasicData income_loss_from_continuing_operations_before_tax;
    private BasicData income_tax_expense_benefit;
    private BasicData income_loss_from_continuing_operations_after_tax;
    private BasicData net_income_loss;
    private BasicData preferred_stock_dividends_and_other_adjustments;
    private BasicData basic_earnings_per_share;
    private BasicData operating_expenses;
    private BasicData revenues;
    private BasicData income_loss_before_equity_method_investments;
}
