package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CashFlowStatement{
    private BasicData net_cash_flow_from_investing_activities_continuing;
    private BasicData net_cash_flow_from_operating_activities_continuing;
    private BasicData net_cash_flow;
    private BasicData net_cash_flow_from_operating_activities;
    private BasicData net_cash_flow_from_investing_activities;
    private BasicData net_cash_flow_from_financing_activities_continuing;
    private BasicData net_cash_flow_continuing;
    private BasicData net_cash_flow_from_financing_activities;
}
