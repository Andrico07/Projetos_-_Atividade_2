package com.mycompany.decorator;

import com.mycompany.model.AbstractGrafico;
import java.awt.Color;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;


public class CorBarraDecorator extends GraficoDecorator {
    
    private int barra;
    Color cor;

    public CorBarraDecorator(AbstractGrafico wrappee, int barra, Color cor) {
        super(wrappee);
        this.barra = barra;
        this.cor = cor;
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
        
        CategoryPlot barraItem = this.grafico.getCategoryPlot();
        barraItem.getRenderer().setSeriesPaint(barra, cor);
        
        ChartPanel painel = new ChartPanel(grafico);
        painel.setPreferredSize(new Dimension(800, 640));
        
        return painel;
        
    }
    
    

    
}
