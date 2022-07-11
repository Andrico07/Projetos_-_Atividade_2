package com.mycompany.decorator;

import com.mycompany.model.AbstractGrafico;


public class TituloDosEixosDecorator extends GraficoDecorator {

    public TituloDosEixosDecorator(AbstractGrafico wrappee, String tituloHorizontal, String tituloVertical) {
        super(wrappee);
        this.tituloHorizontal = tituloHorizontal;
        this.tituloVertical = tituloVertical;
    }
    
    
    
}
