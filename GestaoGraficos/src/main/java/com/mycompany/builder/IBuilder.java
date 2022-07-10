package com.mycompany.builder;

import com.mycompany.model.Pessoa;
import java.util.ArrayList;


public interface IBuilder {
    
    public void reset();
    
    public void criarDataset(ArrayList<Pessoa> pessoas);
    
    public void criarGrafico();
    
}
