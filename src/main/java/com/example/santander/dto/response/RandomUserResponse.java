package com.example.santander.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RandomUserResponse {

    private List<Result> results;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Name {
        private String title;
        private String first;
        private String last;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Result {
        private Name name;
        private String email;
    }
}