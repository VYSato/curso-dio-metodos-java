package br.com.dio;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(9, 7);
        Calculadora.subtracao(26, 58);
        Calculadora.multiplicacao(8, 15);
        Calculadora.divisao(250, 25);

        // Mensagem

        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1200, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1500, 6);

    }
}
