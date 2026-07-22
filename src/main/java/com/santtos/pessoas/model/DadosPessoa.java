package com.santtos.pessoas.model;

import org.springframework.stereotype.Component;


public class DadosPessoa{

private String cpf;
private String cep;
private String telefone;
private String email; 

public DadosPessoa (){}

public DadosPessoa(String cpf, String cep, String telefone,String email){
    this.cpf = cpf;
    this.cep = cep;
    this.telefone = telefone;
    this.email = email;
}

public String getCpf (){
    return cpf;
}

public void setCpf (String cpf){
    this.cpf = cpf;
}

public String getCep (){
    return cep;
}

public void setCep (String cep){
    this.cep = cep;
}

public String getTelefone (){
    return telefone;
}

public void setTelefone (String telefone){
    this.telefone = telefone; 
}

public String getEmail(){
    return email;
}

public void setEmail(String email){
    this.email = email;
}

@Override
public String toString() {
    return "* " + nome + 
    "documento" + 
    ", cpf " + cpf +
    ", rg " + cep +
    ", telefone " + telefone +
    ", e-mail " + email;
}

}