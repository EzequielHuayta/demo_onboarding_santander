package com.example.santander.dto.response;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ResponseDTO<T> {

    private T data;
}
