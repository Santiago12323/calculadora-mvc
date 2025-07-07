package com.arsw.lab.calculator.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operacion {
    private Double numero1;
    private Double numero2;
    private String operacion;
    private String resultado;

}