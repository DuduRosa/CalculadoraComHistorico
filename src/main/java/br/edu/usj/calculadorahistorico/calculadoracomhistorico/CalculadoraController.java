package br.edu.usj.calculadorahistorico.calculadoracomhistorico;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculadoraController {

    Manter manter = new Manter();

    @PostMapping(value = "/index")
    public ModelAndView recebeHistorico(@RequestParam String n1H, @RequestParam String n2H,
            @RequestParam String operadorH, @RequestParam String resultH) {

        // ENVIA PARA A CLASSE DE PERSISTENCIA
        String numero1 = n2H;
        String operador = operadorH;
        String numero2 = n1H;
        String resultado = resultH;

        manter.adicionar(numero1, numero2, operador, resultado);

        // RETORNAR INFORÇÂO PARA MODEL

        List<Historico> retorno = manter.retornar();

        System.out.println(retorno);

        ModelAndView modelo = new ModelAndView("index");
        modelo.addObject("historico", retorno);

        return modelo;
    }

}