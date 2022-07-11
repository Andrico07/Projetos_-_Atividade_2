package com.mycompany.builder;

import com.mycompany.model.GraficoDeBarras;
import com.mycompany.model.Pessoa;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class GraficoDeBarrasBuilder implements IBuilder {
    
    private String titulo;
    private boolean legenda;
    private String tituloVertical;
    private String tituloHorizontal;
    private CategoryDataset dataset = new DefaultCategoryDataset();
    private PlotOrientation orientacao;
    

    @Override
    public void reset() {
        this.graficoDeBarras = new GraficoDeBarras();
    }
    
    @Override
    public void setTitulo(String titulo) {
        graficoDeBarras.
    }

    @Override
    public void setTituloVertical(String tituloVertical) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setTituloHorizontal(String tituloHorizontal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void criarDataset(ArrayList<Pessoa> pessoas) {
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        int soltM = 0;
        int soltF = 0;
        int casM = 0;
        int casF = 0;
        
        for(Pessoa pessoa : pessoas) {
            if(pessoa.getEstadoCivil().equals("Solteiro(a)") && pessoa.getSexo().equals("Masculino"))
                soltM++;
            if(pessoa.getEstadoCivil().equals("Solteiro(a)") && pessoa.getSexo().equals("Feminino"))
                soltF++;
            if(pessoa.getEstadoCivil().equals("Casado(a)") && pessoa.getSexo().equals("Masculino"))
                casM++;
            if(pessoa.getEstadoCivil().equals("Casado(a)") && pessoa.getSexo().equals("Feminino"))
                casF++;
        }
        
        dataset.addValue(soltM, "Homem Solteiro(a)", "");
        dataset.addValue(soltF, "Mulher Solteiro(a)", "");
        dataset.addValue(casM, "Homem Casado(a)", "");
        dataset.addValue(casF, "Mulher Casado(a)", "");
        
        this.graficoDeBarras.setDataset(dataset);
        
    }
    
    @Override
    public void setOrientacao(PlotOrientation orientacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void setLegenda(boolean legenda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void criarGrafico() {
        
        JFreeChart graficoDeBarrasChart = ChartFactory.createBarChart(" ", 
                " ",
                " ",
                this.graficoDeBarras.getDataset(),
                PlotOrientation.HORIZONTAL,
                true,
                false,
                false);
        
        this.graficoDeBarras.setGrafico(graficoDeBarrasChart);
    }

    public GraficoDeBarras getGraficoDeBarras() {
        return graficoDeBarras;
    }

    
    
}
