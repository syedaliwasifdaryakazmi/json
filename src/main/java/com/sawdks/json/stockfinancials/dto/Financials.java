package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Financials{
    private IncomeStatement income_statement;
    private BalanceSheet balance_sheet;
    private CashFlowStatement cash_flow_statement;
    private ComprehensiveIncome comprehensive_income;
}
