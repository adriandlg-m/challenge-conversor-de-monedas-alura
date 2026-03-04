package com.alura.conversor.modelos;

public record Tasas(
        String base_code,
        String target_code,
        double conversion_rate,
        double conversion_result) {
}
