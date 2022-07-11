package com.mycompany.decorator;

import com.mycompany.model.AbstractGrafico;


public class TituloDecorator extends GraficoDecorator {

    public TituloDecorator(AbstractGrafico wrappee, String titulo) {
        super(wrappee);
        this.titulo = titulo;
    }


    
}
