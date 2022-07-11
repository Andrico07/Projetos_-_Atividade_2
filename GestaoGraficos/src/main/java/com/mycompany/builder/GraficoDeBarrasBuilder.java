package com.mycompany.builder;

import com.mycompany.model.GraficoDeBarras;
import com.mycompany.model.Pessoa;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;


public class GraficoDeBarrasBuilder extends Builder {
    
    

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void setTituloHorizontal(String tituloHorizontal) {
        this.tituloHorizontal = tituloHorizontal;
    }

    @Override
    public void setTituloVertical(String tituloVertical) {
        this.tituloVertical = tituloVertical;
    }

    @Override
    public void criarDataset(ArrayList<Pessoa> pessoas) {
        
        dataset = new DefaultCategoryDataset();
        
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
        
    }
    
    @Override
    public void setOrientacao(PlotOrientation orientacao) {
        this.orientacao = orientacao;
    }

    @Override
    public void setLegenda(boolean legenda) {
        this.legenda = legenda;
    }

    @Override
    public void criarGrafico() {
        
        JFreeChart graficoDeBarrasChart = ChartFactory.createBarChart(this.titulo, 
                this.tituloHorizontal,
                this.tituloVertical,
                dataset,
                this.orientacao,
                this.legenda,
                false,
                false);
        
        this.graficoDeBarras = graficoDeBarrasChart;
    }

    
    
}
