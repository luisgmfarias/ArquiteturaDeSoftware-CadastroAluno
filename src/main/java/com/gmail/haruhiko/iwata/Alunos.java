package com.gmail.haruhiko.iwata;
public class Alunos{

   private String nome;
   private String RA;
   private String curso;

   public Alunos(){
     
   }

   public String getNome(){
     return nome;
   }

   public void setNome(String name){
     this.nome = name;
   }

   public String getRA(){
     return RA;
   }

   public void setRA(String r ){
     this.RA = r;
   }

   public String getCurso(){
     return curso;
   }

   public void setCurso(String cur){
     this.curso = cur;
   }
}
