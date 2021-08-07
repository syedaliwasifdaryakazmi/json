package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CashFlowStatement{
    private NetCashFlowFromInvestingActivitiesContinuing net_cash_flow_from_investing_activities_continuing;
    private NetCashFlowFromOperatingActivitiesContinuing net_cash_flow_from_operating_activities_continuing;
    private NetCashFlow net_cash_flow;
    private NetCashFlowFromOperatingActivities net_cash_flow_from_operating_activities;
    private NetCashFlowFromInvestingActivities net_cash_flow_from_investing_activities;
    private NetCashFlowFromFinancingActivitiesContinuing net_cash_flow_from_financing_activities_continuing;
    private NetCashFlowContinuing net_cash_flow_continuing;
    private NetCashFlowFromFinancingActivities net_cash_flow_from_financing_activities;
}
