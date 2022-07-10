package com.mycompany.builder;

import com.mycompany.model.GraficoPizza;
import com.mycompany.model.Pessoa;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class GraficoPizzaBuilder implements IBuilder {
    
    private GraficoPizza graficoPizza;

    @Override
    public void reset() {
        this.graficoPizza = new GraficoPizza();
    }

    @Override
    public void criarDataset(ArrayList<Pessoa> pessoas) {
        
        DefaultPieDataset dataset = new DefaultPieDataset();
        
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

        dataset.setValue("Homem Solteiro(a)", soltM);
        dataset.setValue("Mulher Solteiro(a)", soltF);
        dataset.setValue("Homem Casado(a)", casM);
        dataset.setValue("Mulher Casado(a)", casF);
        
        this.graficoPizza.setDataset(dataset);
        
    }

    @Override
    public void criarGrafico() {
        
        JFreeChart graficoPizzaChart = ChartFactory.createPieChart(" ",
                this.graficoPizza.getDataset(),
                false, 
                false, 
                false);
        
        this.graficoPizza.setGraficoPizza(graficoPizzaChart);
    }

    public GraficoPizza getGraficoPizza() {
        return graficoPizza;
    }
    
    
    
}
