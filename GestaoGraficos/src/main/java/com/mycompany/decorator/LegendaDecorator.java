package com.mycompany.decorator;

import com.mycompany.model.AbstractGrafico;


public class LegendaDecorator extends GraficoDecorator {

    public LegendaDecorator(AbstractGrafico wrappee, boolean legenda) {
        super(wrappee);
        this.legenda = legenda;        
    }
    
    

    
}
