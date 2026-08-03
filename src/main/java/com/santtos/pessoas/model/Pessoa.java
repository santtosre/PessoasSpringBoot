package com.santtos.pessoas.model;

public class Pessoa {
    
    private String nome;
    private DadosPessoa dadosPessoa;

    public Pessoa (){

    }

    public Pessoa (String nome, DadosPessoa dadosPessoa){
        this.nome = nome;
        this.dadosPessoa = dadosPessoa;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString(){
         return nome +
         "dados" + dadosPessoa;
    }

}
