package com.gmail.haruhiko.iwata;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.Scanner;
import java.util.ArrayList;

import java.io.IOException;
import java.util.Scanner;

public class App{

    public static void main(String[] args) throws IOException {
      Scanner r = new Scanner(System.in);

      Alunos aluno;

      ArrayList<Alunos> alunos = new ArrayList<Alunos>();

      int i=0;
      int x=0;
      char sn;
      int a=1;
      int n=0;

      System.out.println("BEM VINDO AO CADASTRO DE ALUNOS");

      do{

        System.out.println("< 1 > - Cadastrar");
        System.out.println("< 2 > - Consultar");
        System.out.println("< 3 > - Sair");
        x = r.nextInt();
        r.nextLine();
        switch (x){
          case 1:
            System.out.println("Informe os dados:");
            do{

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

              if(alunos.size() == 0){
                alunos.add(aluno);
              }else{
                n=0;
                for(i=0; i<alunos.size() ;i++){
                  if(aluno.getNome().equals(alunos.get(i).getNome()) ){
                    n=1;
                    System.out.println("Aluno ja cadastrado!");
                    break;
                  }
                  if(aluno.getRA().equals(alunos.get(i).getRA())){
                    n=1;
                    System.out.println("RA ja cadastrado!");
                    break;
                  }
                }
                if( n == 0 ){
                  alunos.add(aluno);
                }
              }

              i = alunos.size();
              System.out.println("Prosseguir para o proximo? <S/N>");
              sn = (char)System.in.read();
              r.nextLine();
              if(sn == 's' || sn == 'S'){
                x=1;
              }else{
                x=0;
              }

          }while(x==1);
            break;

          case 2:
            i = alunos.size();
            for(n=0; n<i ; n++){
              aluno = alunos.get(n);
              System.out.println("Alunos: "+aluno.getNome()+" "+aluno.getRA()+" "+aluno.getCurso());
            }
            break;

          case 3:
            a = 0;
            break;
          default:
            System.out.println("Opção Inválida");
        }
      }while(a == 1);
    }
}
