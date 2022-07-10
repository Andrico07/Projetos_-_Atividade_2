package com.mycompany.builder;

import com.mycompany.model.Pessoa;
import java.util.ArrayList;


public class Diretor {
    
    private IBuilder builder;

    public Diretor(IBuilder builder) {
        this.builder = builder;
    }
    
    public void changeBuilder(IBuilder builder) {
        this.builder = builder;
    }
    
    public void criarGrafico(ArrayList<Pessoa> pessoas){
        
        builder.reset();
        builder.criarDataset(pessoas);
        builder.criarGrafico();
        
    }
}
