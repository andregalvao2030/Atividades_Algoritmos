package Atividades;


public class Atv28_2_24 {
    public static void main(String[] args) {

        int idade = 2003;
        int idadeAtual = 2024 - idade;

        System.out.println("A sua idade em 2024 será:" + idadeAtual);

        double salario = 15500;
        double minimo = salario/1412;

        System.out.println("Você ganha " + minimo + "salários mínimos.");

        double diametro = 5;
        double area = (diametro/2)*(diametro/2)*(3.14);

        System.out.println("A área da circunferência, cujo diametro é " + diametro + " corresponde a: " + area);

        double preco = 10;
        double add = ((preco/20) +10)/3;
        double parcela2 = preco/2;
        double avista = preco - (preco * 0.05);

        System.out.println(" O preço do produto é: " + preco + " e o valor de cada parcela, " +
                    " em 3x, terá 5%de acrescimo. Dessa forma, o valor de cada parcela será: " + add);
        System.out.println(" Em apenas 2x, o preço de tabela é " + parcela2);
        System.out.println(" E a vista temos 5% de desconto, ficando só: " + avista);

        double a = 4;
        double b = 6;

        double op1 = a + b;
        double op2 = a - b;
        double op3 = a * b;
        double op4 = a / b;

        System.out.println("Estando em posse dos valores " + a + " e " + b + " podemos atribuir as 4 operações matemáticas: ");
        System.out.println("Adição: " + op1);
        System.out.println("Subtração: " + op2);
        System.out.println("Multiplicação: " + op3);
        System.out.println("Divisão: " + op4);

        double fab = 65500;
        double sailor = 0.25 * fab;
        double tax = 0.45 * fab;
        double car = (fab + sailor + tax);

        System.out.println("O custo do carro sera: " + car);

    }
}
