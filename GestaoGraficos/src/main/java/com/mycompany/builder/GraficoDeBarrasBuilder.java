package com.mycompany.builder;

import com.mycompany.model.GraficoDeBarras;
import com.mycompany.model.Pessoa;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class GraficoDeBarrasBuilder implements IBuilder {
    
    private GraficoDeBarras graficoDeBarras;
    

    @Override
    public void reset() {
        this.graficoDeBarras = new GraficoDeBarras();
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
    public void criarGrafico() {
        
        JFreeChart graficoDeBarrasChart = ChartFactory.createBarChart(" ", 
                " ",
                " ",
                this.graficoDeBarras.getDataset(),
                PlotOrientation.HORIZONTAL,
                true,
                false,
                false);
        
        this.graficoDeBarras.setGraficoDeBarras(graficoDeBarrasChart);
    }

    public GraficoDeBarras getGraficoDeBarras() {
        return graficoDeBarras;
    }
    
    
}
