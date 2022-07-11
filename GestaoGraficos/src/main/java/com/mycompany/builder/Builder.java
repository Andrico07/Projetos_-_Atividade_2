package com.mycompany.builder;

import com.mycompany.model.GraficoDeBarras;
import com.mycompany.model.Pessoa;
import java.util.ArrayList;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public abstract class Builder {
    
    protected String titulo;
    protected String tituloHorizontal;
    protected String tituloVertical;
    protected DefaultCategoryDataset dataset;
    protected PlotOrientation orientacao;
    protected boolean legenda;
    protected JFreeChart graficoDeBarras;
    

    public abstract void setTitulo(String titulo);

    public abstract void setTituloHorizontal(String tituloHorizontal);

    public abstract void setTituloVertical(String tituloVertical);

    public abstract void criarDataset(ArrayList<Pessoa> pessoas);

    public abstract void setOrientacao(PlotOrientation orientacao);

    public abstract void setLegenda(boolean legenda);
    
    public abstract void criarGrafico();
    
    public final GraficoDeBarras getGraficoDeBarras() {
        
        return new GraficoDeBarras(this.titulo, this.tituloHorizontal, this.tituloVertical, this.dataset, this.orientacao, this.legenda, this.graficoDeBarras);
        
    }
    
    
    
    
}
