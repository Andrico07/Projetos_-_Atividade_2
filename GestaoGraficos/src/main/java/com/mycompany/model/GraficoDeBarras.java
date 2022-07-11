package com.mycompany.model;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;


public class GraficoDeBarras extends AbstractGrafico {
    

    private CategoryDataset dataset;
    private JFreeChart grafico;

    public GraficoDeBarras(String titulo, String tituloHorizontal, String tituloVertical, CategoryDataset dataset, PlotOrientation orientacao, boolean legenda, JFreeChart grafico) {
        super(titulo, tituloHorizontal, tituloVertical, orientacao, legenda);
        this.dataset = dataset;
        this.grafico = grafico;
    }
    
    

    

    public CategoryDataset getDataset() {
        return dataset;
    }


    public void setDataset(CategoryDataset dataset) {
        this.dataset = dataset;
    }


    public JFreeChart getGrafico() {
        return grafico;
    }


    public void setGrafico(JFreeChart grafico) {
        this.grafico = grafico;
    }
    
    
    

    
}
