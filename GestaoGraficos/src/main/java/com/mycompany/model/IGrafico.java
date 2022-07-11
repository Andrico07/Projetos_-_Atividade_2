package com.mycompany.model;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;


public interface IGrafico {
    
    
    public CategoryDataset getDataset();


    public void setDataset(CategoryDataset dataset);


    public JFreeChart getGrafico();
    

    public void setGrafico(JFreeChart grafico);
    
}
