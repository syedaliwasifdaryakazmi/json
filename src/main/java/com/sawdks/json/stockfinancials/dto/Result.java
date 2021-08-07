package com.sawdks.json.stockfinancials.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result{
    private Financials financials;
    private String start_date;
    private String end_date;
    private String cik;
    private String company_name;
    private String fiscal_period;
    private String fiscal_year;
    private String source_filing_url;
    private String source_filing_file_url;
}
