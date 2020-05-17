package br.edu.usj.calculadorahistorico.calculadoracomhistorico;

import java.util.ArrayList;
import java.util.List;

public class Manter {

    List<Historico> lista = new ArrayList<>();

    void adicionar(String n1,String n2,String ope, String res){
        
       Historico historico = new Historico();
       historico.setNumero1(n1);
       historico.setNumero2(n2);
       historico.setOperador(ope);
       historico.setResultado(res);

       lista.add(historico);

    }

    List<Historico> retornar() {
        return lista;
    }

}