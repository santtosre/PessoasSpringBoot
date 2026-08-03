package com.santtos.pessoas.service;
import com.santtos.pessoas.model.*;

import org.springframework.stereotype.Service;

@Service
public class GerenciadorPessoa {
    
    private Pessoa pessoa;

    public String criarPessoa (Pessoa pessoa){
        pessoa.add(pessoa);
    }

 
}


