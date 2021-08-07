package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BalanceSheet{
    private NoncurrentLiabilities noncurrent_liabilities;
    private FixedAssets fixed_assets;
    private EquityAttributableToNoncontrollingInterest equity_attributable_to_noncontrolling_interest;
    private CurrentLiabilities current_liabilities;
    private EquityAttributableToParent equity_attributable_to_parent;
    private Equity equity;
    private Liabilities liabilities;
    private Assets assets;
    private OtherThanFixedNoncurrentAssets other_than_fixed_noncurrent_assets;
    private CurrentAssets current_assets;
    private LiabilitiesAndEquity liabilities_and_equity;
    private NoncurrentAssets noncurrent_assets;
}
