package com.mycompany.model;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;


public abstract class AbstractGrafico {
    
    protected String titulo;
    protected String tituloHorizontal;
    protected String tituloVertical;
    protected CategoryDataset dataset;
    protected PlotOrientation orientacao;
    protected boolean legenda;
    protected JFreeChart grafico;
    
    

    public AbstractGrafico(String titulo, String tituloHorizontal, String tituloVertical, CategoryDataset dataset, PlotOrientation orientacao, boolean legenda, JFreeChart grafico) {
        this.titulo = titulo;
        this.tituloHorizontal = tituloHorizontal;
        this.tituloVertical = tituloVertical;
        this.dataset = dataset;
        this.orientacao = orientacao;
        this.legenda = legenda;
        this.grafico = grafico;
    }
    
    public abstract ChartPanel exibirGrafico();
    

    public String getTitulo() {
        return titulo;
    }

    public String getTituloHorizontal() {
        return tituloHorizontal;
    }

    public String getTituloVertical() {
        return tituloVertical;
    }
    
    public CategoryDataset getDataset() {
        return dataset;
    }

    public PlotOrientation getOrientacao() {
        return orientacao;
    }

    public boolean isLegenda() {
        return legenda;
    }
    
    public JFreeChart getGrafico() {
        return grafico;
    }
    
 
}
