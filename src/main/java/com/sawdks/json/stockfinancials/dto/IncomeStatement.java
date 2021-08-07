package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IncomeStatement{
    private GrossProfit gross_profit;
    private NetIncomeLossAttributableToParent net_income_loss_attributable_to_parent;
    private NetIncomeLossAvailableToCommonStockholdersBasic net_income_loss_available_to_common_stockholders_basic;
    private BenefitsCostsExpenses benefits_costs_expenses;
    private ParticipatingSecuritiesDistributedAndUndistributedEarningsLossBasic participating_securities_distributed_and_undistributed_earnings_loss_basic;
    private InterestExpenseOperating interest_expense_operating;
    private NetIncomeLossAttributableToNoncontrollingInterest net_income_loss_attributable_to_noncontrolling_interest;
    private IncomeTaxExpenseBenefitDeferred income_tax_expense_benefit_deferred;
    private NonoperatingIncomeLoss nonoperating_income_loss;
    private CostsAndExpenses costs_and_expenses;
    private OperatingIncomeLoss operating_income_loss;
    private DilutedEarningsPerShare diluted_earnings_per_share;
    private CostOfRevenue cost_of_revenue;
    private IncomeLossFromContinuingOperationsBeforeTax income_loss_from_continuing_operations_before_tax;
    private IncomeTaxExpenseBenefit income_tax_expense_benefit;
    private IncomeLossFromContinuingOperationsAfterTax income_loss_from_continuing_operations_after_tax;
    private NetIncomeLoss net_income_loss;
    private PreferredStockDividendsAndOtherAdjustments preferred_stock_dividends_and_other_adjustments;
    private BasicEarningsPerShare basic_earnings_per_share;
    private OperatingExpenses operating_expenses;
    private Revenues revenues;
    private IncomeLossBeforeEquityMethodInvestments income_loss_before_equity_method_investments;
}
