package com.mycompany.model;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class GraficoDeBarras {
    
    private CategoryDataset dataset = new DefaultCategoryDataset();
    private JFreeChart graficoDeBarras;
    
    

    public CategoryDataset getDataset() {
        return dataset;
    }

    public void setDataset(CategoryDataset dataset) {
        this.dataset = dataset;
    }

    public JFreeChart getGraficoDeBarras() {
        return graficoDeBarras;
    }

    public void setGraficoDeBarras(JFreeChart graficoDeBarras) {
        this.graficoDeBarras = graficoDeBarras;
    }

    
}
