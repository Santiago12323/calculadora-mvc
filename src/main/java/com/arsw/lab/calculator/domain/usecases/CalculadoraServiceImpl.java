package com.arsw.lab.calculator.domain.usecases;

import com.arsw.lab.calculator.domain.model.Operacion;
import com.arsw.lab.calculator.domain.ports.CalculadoraService;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements CalculadoraService {

    @Override
    public String calcular(Operacion operacion) {
        Double resultado = 0.0;

        switch(operacion.getOperacion()) {
            case "sumar":
                resultado = operacion.getNumero1() + operacion.getNumero2();
                break;
            case "restar":
                resultado = operacion.getNumero1() - operacion.getNumero2();
                break;
            case "multiplicar":
                resultado = operacion.getNumero1() * operacion.getNumero2();
                break;
            case "dividir":
                if (operacion.getNumero1() == 0) return "Error: División entre cero no posible";
                resultado = operacion.getNumero1() / operacion.getNumero2();
                break;
            case "ac":
                return "";
            default:
                return "Operación no válida";
        }

        return String.valueOf(resultado);
    }
}