package com.arsw.lab.calculator;

import com.arsw.lab.calculator.domain.model.Operacion;
import com.arsw.lab.calculator.domain.ports.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("operacion", new Operacion());
        return "index";
    }

    @PostMapping("/calcular")
    public String calcular(@ModelAttribute Operacion operacion, Model model) {
        String resultado = service.calcular(operacion);
        operacion.setResultado(resultado);
        model.addAttribute("operacion", operacion);
        return "index";
    }
}
