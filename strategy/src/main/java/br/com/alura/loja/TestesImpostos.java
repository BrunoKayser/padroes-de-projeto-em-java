package br.com.alura.loja;

import br.com.alura.loja.strategy.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.strategy.imposto.ICMS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        var orcamento = new Orcamento(new BigDecimal("100"), 1);
        var calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ICMS()));

    }

}
