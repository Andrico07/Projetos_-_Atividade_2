package com.mycompany.builder;

import com.mycompany.model.GraficoDeBarras;
import com.mycompany.model.Pessoa;
import java.util.ArrayList;
import org.jfree.chart.plot.PlotOrientation;


public class Diretor {
    
    private Builder builder;

    public Diretor(Builder builder) {
        this.builder = builder;
    }
    
    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }
    
    public GraficoDeBarras criarGrafico(ArrayList<Pessoa> pessoas){
        
        builder.setTitulo(" ");
        builder.setTituloHorizontal(" ");
        builder.setTituloVertical(" ");
        builder.criarDataset(pessoas);
        builder.setOrientacao(PlotOrientation.HORIZONTAL);
        builder.setLegenda(false);
        builder.criarGrafico();
        
        return builder.getGraficoDeBarras();
        
    }
}
