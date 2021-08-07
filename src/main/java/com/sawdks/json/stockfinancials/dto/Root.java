package com.sawdks.json.stockfinancials.dto;

import lombok.*;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Root{
    private List<Result> results;
    private String status;
    private String request_id;
    private int count;
    private String next_url;
}






