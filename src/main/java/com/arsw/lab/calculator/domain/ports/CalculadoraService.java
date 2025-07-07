package com.arsw.lab.calculator.domain.ports;

import com.arsw.lab.calculator.domain.model.Operacion;

public interface CalculadoraService {
    String calcular(Operacion operacion);
}
