package exercicios.metodos;

public class main {

public static void main(String[] args){

    System.out.println("Exercicio calculadora");
    calculadora.soma(3,6);
    calculadora.subtracao(9,1.8);
    calculadora.multiplicacao(7,8);
    calculadora.divisao(5,2.5);

    System.out.println("Exercicio menssagem");
    menssagem.obterMenssagem(9);
    menssagem.obterMenssagem(14);
    menssagem.obterMenssagem(1);

    System.out.println("Exercicio emprestimo");
    emprestimo.calcular(1000, emprestimo.getDuasParcelas());
    emprestimo.calcular(1000, emprestimo.getTresParcelas());
    emprestimo.calcular(1000, 5);


}


}
