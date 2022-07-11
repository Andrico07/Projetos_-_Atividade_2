package com.mycompany.decorator;

import com.mycompany.model.AbstractGrafico;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;


public abstract class GraficoDecorator extends AbstractGrafico {
    
    
    protected AbstractGrafico wrappee;
    
    

    public GraficoDecorator(AbstractGrafico wrappee) {
        this.titulo = wrappee.getTitulo();
        this.tituloHorizontal = wrappee.getTituloHorizontal();
        this.tituloVertical = wrappee.getTituloVertical();
        this.orientacao = wrappee.getOrientacao();
        this.legenda = wrappee.isLegenda();
        this.wrappee = wrappee;
    }


    
    public JFreeChart decorarGrafico(CategoryDataset dataset) {
        
        JFreeChart graficoDecorado = ChartFactory.createBarChart(this.titulo, 
                this.tituloHorizontal,
                this.tituloVertical,
                dataset,
                this.orientacao,
                this.legenda,
                false,
                false);
        
        return graficoDecorado;
        
    }
    

    
}
