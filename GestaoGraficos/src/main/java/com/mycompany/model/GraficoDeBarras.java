package com.mycompany.model;

import java.awt.Dimension;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;


public class GraficoDeBarras extends AbstractGrafico {
    

    public GraficoDeBarras(String titulo, String tituloHorizontal, String tituloVertical, CategoryDataset dataset, PlotOrientation orientacao, boolean legenda, JFreeChart grafico) {
        super(titulo, tituloHorizontal, tituloVertical, dataset, orientacao, legenda, grafico);
    }

    @Override
    public ChartPanel exibirGrafico() {
        
        ChartPanel painel = new ChartPanel(grafico);
        painel.setPreferredSize(new Dimension(800, 640));
        
        return painel;
    }
    

    
}
