package com.mycompany.model;

import org.jfree.chart.JFreeChart;
import org.jfree.data.general.PieDataset;
import org.jfree.data.general.DefaultPieDataset;


public class GraficoPizza {
    
    private PieDataset dataset = new DefaultPieDataset();
    private JFreeChart graficoPizza;
    
    

    public PieDataset getDataset() {
        return dataset;
    }

    public void setDataset(PieDataset dataset) {
        this.dataset = dataset;
    }

    public JFreeChart getGraficoPizza() {
        return graficoPizza;
    }

    public void setGraficoPizza(JFreeChart graficoPizza) {
        this.graficoPizza = graficoPizza;
    }

    
}
