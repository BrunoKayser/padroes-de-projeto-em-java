package br.com.alura.loja;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontoTemplateMethod {

    public static void main(String[] args) {
        var primeiro = new Orcamento(new BigDecimal("200"), 6);
        var segundo = new Orcamento(new BigDecimal("1000"), 1);
        var calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));

    }

}
