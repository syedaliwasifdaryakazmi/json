package com.sawdks.json.stockfinancials.entity;

import com.sawdks.json.stockfinancials.dto.Result;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.validation.annotation.Validated;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Document(collection = "stockFinancialsV2")
public class StockFinancialsV2   {


  @Field(name="ticker_date_id")
  @Indexed( unique = true )
  @Id
  private String tickerDateId;

  @Field(name="ticker")
  private String ticker;

  @Field(name = "source_date")
  private LocalDateTime date;

  @Field(name = "month")
  private int month;

  @Field(name = "year")
  private int year;

  @Field(name = "quarter")
  private int quarter;

  @Field(name = "update_date")
  private LocalDateTime updateDate;

  @Field(name = "source")
  private String source;

  @Field(name = "timestamp")
  private Timestamp timestamp; 
  
  @Field("fiscal_year")
  private String fiscalYear;

  @Field("source_filing_file_url")
  private String sourceFilingFileUrl;

  @Field("start_date")
  private String startDate;

  @Field("end_date")
  private String endDate;

  @Field("fiscal_period")
  private String fiscalPeriod;

  @Field("operating_expenses")
  private Float operatingExpenses;

  @Field("cost_of_revenue")
  private Float costOfRevenue;

  @Field("gross_profit")
  private Float grossProfit;

  @Field("operating_income_loss")
  private Float operatingIncomeLoss;

  @Field("interest_expense_operating")
  private Float interestExpenseOperating;

  @Field("net_income_loss")
  private Float netIncomeLoss;

  @Field("income_tax_expense_benefit_deferred")
  private Float incomeTaxExpenseBenefitDeferred;

  @Field("basic_earnings_per_share")
  private Float basicEarningsPerShare;

  @Field("costs_and_expenses")
  private Float costsAndExpenses;
  

  @Field("costs_andparticipating_securities_distributed_and_undistributed_earnings_loss_basic_expenses")
  private Float costsAndParticipatingSecuritiesDistributedAndUndistributedEarningsLossBasicExpenses;

  @Field("net_income_loss_available_to_common_stockholders_basic")
  private Float netIncomeLossAvailableToCommonStockHoldersBasic;

  @Field("nonoperating_income_loss")
  private Float nonOperatingIncomeLoss;

  @Field("benefits_costs_expenses")
  private Float benefitsCostsExpenses;

  @Field("diluted_earnings_per_share")
  private Float dilutedEarningsPerShare;

  @Field("net_income_loss_attributable_to_noncontrolling_interest")
  private Float netIncomeLossAttributableToNoncontrollingInterest;

  @Field("income_loss_from_continuing_operations_before_tax")
  private Float incomeLossFromContinuingOperationsBeforeTax;

  @Field("income_tax_expense_benefit")
  private Float incomeTaxExpenseBenefit;

  @Field("income_loss_from_continuing_operations_after_tax")
  private Float incomeLossFromContinuingOperationsAfterTax;

  @Field("net_income_loss_attributable_to_parent")
  private Float netIncomeLossAttributableToParent;

  @Field("preferred_stock_dividends_and_other_adjustments")
  private Float preferredStockDividendsAndOtherAdjustments;

  @Field("revenues")
  private Float revenues;

  @Field("equity_attributable_to_parent")
  private Float equityAttributableToParent;

  @Field("equity")
  private Float equity;

  @Field("assets")
  private Float assets;

  @Field("current_assets")
  private Float currentAssets;

  @Field("liabilities_and_equity")
  private Float liabilitiesAndEquity;

  @Field("noncurrent_assets")
  private Float noncurrentAssets;

  @Field("equity_attributable_to_noncontrolling_interest")
  private Float equityAttributableToNoncontrollingInterest;

  @Field("current_liabilities")
  private Float currentLiabilities;

  @Field("other_than_fixed_noncurrent_assets")
  private Float otherThanFixedNoncurrentAssets;

  @Field("liabilities")
  private Float liabilities;

  @Field("noncurrent_liabilities")
  private Float noncurrentLiabilities;

  @Field("fixed_assets")
  private Float fixedAssets;

  @Field("net_cash_flow_from_operating_activities")
  private Float netCashFlowFromOperatingActivities;

  @Field("net_cash_flow_from_investing_activities")
  private Float netCashFlowFromInvestingActivities;

  @Field("net_cash_flow_from_financing_activities_continuing")
  private Float netCashFlowFromFinancingActivitiesContinuing;

  @Field("net_cash_flow_continuing")
  private Float netCashFlowContinuing;

  @Field("net_cash_flow_from_financing_activities")
  private Float netCashFlowFromFinancingActivities;

  @Field("net_cash_flow_from_investing_activities_continuing")
  private Float netCashFlowFromInvestingActivitiesContinuing;

  @Field("net_cash_flow_from_operating_activities_continuing")
  private Float netCashFlowFromOperatingActivitiesContinuing;

  @Field("net_cash_flow")
  private Float netCashFlow;

  @Field("comprehensive_income_loss")
  private Float comprehensiveIncomeLoss;

  @Field("comprehensive_income_loss_attributable_to_noncontrolling_interest")
  private Float comprehensiveIncomeLossAttributableToNoncontrollingInterest;

  @Field("other_comprehensive_income_loss")
  private Float otherComprehensiveIncomeLoss;

  @Field("other_comprehensive_income_loss_attributable_to_parent")
  private Float otherComprehensiveIncomeLossAttributableToParent;

  @Field("comprehensive_income_loss_attributable_to_parent")
  private Float comprehensiveIncomeLossAttributableToParent;

    public StockFinancialsV2(Result result) {


    }
}