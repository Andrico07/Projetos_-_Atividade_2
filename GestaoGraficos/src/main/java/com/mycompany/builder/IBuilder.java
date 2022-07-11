package com.mycompany.builder;

import com.mycompany.model.Pessoa;
import java.util.ArrayList;
import org.jfree.chart.plot.PlotOrientation;


public interface IBuilder {
    
    public void reset();
    
    public void setTitulo(String titulo);

    public void setLegenda(boolean legenda);

    public void setTituloVertical(String tituloVertical);

    public void setTituloHorizontal(String tituloHorizontal);
    
    public void criarDataset(ArrayList<Pessoa> pessoas);

    public void setOrientacao(PlotOrientation orientacao);
    
    public void criarGrafico();
    
}
