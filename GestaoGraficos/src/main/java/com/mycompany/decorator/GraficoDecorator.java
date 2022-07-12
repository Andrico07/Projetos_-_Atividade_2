package com.mycompany.decorator;

import com.mycompany.model.AbstractGrafico;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;


public abstract class GraficoDecorator extends AbstractGrafico {
    
    
    protected AbstractGrafico wrappee;
    
    
    public GraficoDecorator(AbstractGrafico wrappee) {
        super(wrappee.getTitulo(), wrappee.getTituloHorizontal(), wrappee.getTituloVertical(), wrappee.getDataset(), wrappee.getOrientacao(), wrappee.isLegenda(), wrappee.getGrafico());
        this.wrappee = wrappee;
    }

    
    @Override
    public ChartPanel exibirGrafico() {
        
        JFreeChart graficoDecorado = ChartFactory.createBarChart(this.titulo, 
                this.tituloHorizontal,
                this.tituloVertical,
                dataset,
                this.orientacao,
                this.legenda,
                false,
                false);
        
        this.grafico = graficoDecorado;
        
        ChartPanel painel = new ChartPanel(grafico);
        painel.setPreferredSize(new Dimension(800, 640));
        
        return painel;
        
    }
    

    
}
