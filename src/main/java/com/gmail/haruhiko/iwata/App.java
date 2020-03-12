package com.gmail.haruhiko.iwata;
//import org.apache.commons.codec.digest.DigestUtils;
//import java.util.Scanner; Uso mínimo de recursos

import java.util.ArrayList;

import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {
        Scanner r = new Scanner(System.in);

        Alunos aluno;

        ArrayList<Alunos> alunos = new ArrayList<Alunos>();

        //int i=0; Uso mínimo de recursos
        //int x=0; Nome de variaveis compreensiveis
        int option = 0;
        char sn;
        //int a=1; Codigo limpo e de facil entendimento
        int aux = 1;
        //int n=0; Uso mínimo de recursos

        System.out.println("BEM VINDO AO CADASTRO DE ALUNOS");

        do {

            System.out.println("< 1 > - Cadastrar");
            System.out.println("< 2 > - Consultar");
            System.out.println("< 3 > - Sair");
            option = r.nextInt();
            r.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Informe os dados:");
                    do {

                        System.out.println("Nome: ");
                        String nome = r.nextLine();

                        System.out.println("RA: ");
                        String ra = r.nextLine();

                        System.out.println("Curso: ");
                        String curso = r.nextLine();

                        aluno = new Alunos();

                        aluno.setNome(nome);
                        aluno.setRA(ra);
                        aluno.setCurso(curso);

                        //if(alunos.size() == 0){ Programação funcional
                        if (alunos.isEmpty()) {
                            alunos.add(aluno);
                        } else {
                            //n=0;
                            
                            if (verificaAluno(aluno, alunos)) {
                                alunos.add(aluno);
                            }
                            
                            /*for (int i = 0; i < alunos.size(); i++) {
                                if (aluno.getNome().equals(alunos.get(i).getNome())) {
                                    //n=1;
                                    System.out.println("Aluno ja cadastrado!");
                                    break;
                                } else if (aluno.getRA().equals(alunos.get(i).getRA())) {
                                    //n=1;
                                    System.out.println("RA ja cadastrado!");
                                    break;
                                }

                            }*/ //Criação de funções para um código mais enxuto e organizado

                            /*if( n == 0 ){ Uso minimo recursos e utilizar melhor variaveis existentes
                      alunos.add(aluno);
                    }*/
                        }

                        //i = alunos.size(); Uso mínimo de recursos
                        System.out.println("Prosseguir para o proximo? <S/N>");
                        sn = (char) System.in.read();
                        r.nextLine();
                        if (sn == 's' || sn == 'S') {
                            option = 1;
                        } else {
                            option = 0;
                        }

                    } while (option == 1);
                    break;

                case 2:
                    //i = alunos.size(); Nome de variaveis compreensiveis e Uso minimo de recursos
                    for (int n = 0; n < alunos.size(); n++) {
                        aluno = alunos.get(n);
                        System.out.println("Alunos: " + aluno.getNome() + " " + aluno.getRA() + " " + aluno.getCurso());
                    }
                    break;

                case 3:
                    aux = 0;
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        } while (aux == 1);
    }

    public static boolean verificaAluno(Alunos aluno, ArrayList<Alunos> lista) {

        //n=0;
        for (int i = 0; i < lista.size(); i++) {
            if (aluno.getNome().equals(lista.get(i).getNome())) {
                //n=1;
                System.out.println("Aluno ja cadastrado!");
                return false;
            } else if (aluno.getRA().equals(lista.get(i).getRA())) {
                //n=1;
                System.out.println("RA ja cadastrado!");
                return false;
            }
        }
        return true;

    }

}
