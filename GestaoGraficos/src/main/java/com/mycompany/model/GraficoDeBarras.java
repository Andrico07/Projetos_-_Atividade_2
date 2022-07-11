package com.mycompany.model;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class GraficoDeBarras extends AbstractGrafico {
    

    private CategoryDataset dataset = new DefaultCategoryDataset(); 
    private JFreeChart grafico;
    

    

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
