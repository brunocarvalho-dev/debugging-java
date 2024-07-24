package br.com.dio.debbuging;

import java.util.Scanner;
/**
 * <h1>Calculadora de Medias</h1>
 * Programa desenvolvido para calculo de média das notas dos alunas
 * <p>
 * Solicita ao usuário que entre com o valor da <b>Notas</b> dos alunos para o calculo de média, <b>utilizando um método criado</b>;
 *
 * @author BrunoCarvalho
 * @version 1.0
 * @since Codigo para cálculo de média da turma, programa Dio - java
 */
public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        Double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.2f", media);
    }
/**
 * <h1>Calculo Média Turma</h1>
 * Recebe o nomes dos alunos, e o método Scanner, mostra para o usuário o nome do aluno solicitando o valor da nota, apoós receber todas as notas, retorna a média das notas;
 * <p>
 * 
 * @param alunos Recebe um Array com os nomes dos alunos
 * @param scanner Recebe a armazena em uma váriavel a nota dos alunos para calculo da média final da sala;
 * @return Retorna média da sala
 */
    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
    	double nota = 0;
        double soma = 0;
        for(String aluno : alunos) {
            System.out.println("Nota do aluno: " + aluno);
            nota = scanner.nextDouble();
            soma += nota;
        }

        return (soma / alunos.length);
    }

}
