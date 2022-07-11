package com.mycompany.model;

import org.jfree.chart.plot.PlotOrientation;


public abstract class AbstractGrafico {
    
    protected String titulo;
    protected String tituloHorizontal;
    protected String tituloVertical;
    protected PlotOrientation orientacao;
    protected boolean legenda;
    
    

    public AbstractGrafico(String titulo, String tituloHorizontal, String tituloVertical, PlotOrientation orientacao, boolean legenda) {
        this.titulo = titulo;
        this.tituloHorizontal = tituloHorizontal;
        this.tituloVertical = tituloVertical;
        this.orientacao = orientacao;
        this.legenda = legenda;
    }    
    
    

    public String getTitulo() {
        return titulo;
    }

    public String getTituloHorizontal() {
        return tituloHorizontal;
    }

    public String getTituloVertical() {
        return tituloVertical;
    }

    public PlotOrientation getOrientacao() {
        return orientacao;
    }

    public boolean isLegenda() {
        return legenda;
    }
    

    
}
