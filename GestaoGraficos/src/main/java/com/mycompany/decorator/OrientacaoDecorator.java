package com.mycompany.decorator;

import com.mycompany.model.AbstractGrafico;
import org.jfree.chart.plot.PlotOrientation;


public class OrientacaoDecorator extends GraficoDecorator {

    public OrientacaoDecorator(AbstractGrafico wrappee, PlotOrientation orientacao) {
        super(wrappee);
        this.orientacao = orientacao;
    }
    
    

    
}
