package com.example.banco.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
@Builder
public record ApiError(
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss") LocalDateTime timestamp,
    Integer code,
    String status,
    List<String> errors) {}
