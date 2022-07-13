package com.mycompany.presenter;

import com.mycompany.builder.Diretor;
import com.mycompany.builder.GraficoDeBarrasBuilder;
import com.mycompany.decorator.LegendaDecorator;
import com.mycompany.decorator.OrientacaoDecorator;
import com.mycompany.decorator.TituloDecorator;
import com.mycompany.decorator.TituloDosEixosDecorator;
import com.mycompany.loader.LeitorCSV;
import com.mycompany.model.AbstractGrafico;
import com.mycompany.model.Pessoa;
import com.mycompany.view.MainView;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.jfree.chart.plot.PlotOrientation;


public class MainPresenter {
    
    private MainView view;
    private AbstractGrafico grafico;
    private ArrayList<Pessoa> pessoas;
    private Diretor diretor;
    
    
    public MainPresenter() throws IOException {
        init();
    }
    
    public void init() {
        
        view = new MainView();
        view.setVisible(true);
        
        pessoas = new LeitorCSV().lerArquivo("pessoas.csv");
        diretor = new Diretor(new GraficoDeBarrasBuilder());
        grafico = diretor.criarGrafico(pessoas);
        
        view.getPnlGrafico().setLayout(new BorderLayout());
        view.getPnlGrafico().add(grafico.exibirGrafico());
        
        
        
        view.getBtnFechar().addActionListener((e) -> {
            fechar();
        });

        view.getBtnRestaurar().addActionListener((e) -> {
            restaurarPadrao();
        });

        view.getBtnDesfazer().addActionListener((e) -> {
            desfazer();
        });

        view.getCmbxGraficosPadrao().addActionListener((e) -> {
            trocarPadraoGrafico();
        });

        view.getCkbTitulo().addActionListener((e) -> {
            tituloDecorate();
        });

        view.getCkbLegenda().addActionListener((e) -> {
            legendaDecorate();
        });

        view.getCkbTituloEixos().addActionListener((e) -> {
            tituloEixosDecorate();
        });
        
        
        
        view.getCkbRotuloPorcento().setEnabled(false);
        view.getCkbRotuloValor().setEnabled(false);
        view.getCkbRotuloValorPorcento().setEnabled(false);
        view.getCkbCorBarras().setEnabled(false);
        view.getCkbCorBarrasGrupo().setEnabled(false);
        view.getCkbGrade().setEnabled(false);
        

        view.pack();
        
    }
    
    public void fechar() {
        view.dispose();
    }
    
    public void restaurarPadrao() {
        
        try {
            clearCkbBoxes();            
            view.getCmbxGraficosPadrao().setSelectedIndex(0);
            
            grafico = diretor.criarGrafico(pessoas);
            atualizarGrafico();
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao restaurar padrão: " + e.getMessage());
        }
        
    }
    
    public void desfazer() {
        
    }
    
    public void trocarPadraoGrafico() {
        
        try {
            switch (view.getCmbxGraficosPadrao().getSelectedItem().toString()) {
                case "Barras Horizontais":
                    
                    grafico = diretor.criarGrafico(pessoas);
                    clearCkbBoxes();
                    atualizarGrafico();
                    break;
                
                case "Barras Verticais":
                    
                    grafico = diretor.criarGrafico(pessoas);
                    grafico = new OrientacaoDecorator(grafico, PlotOrientation.VERTICAL);
                    clearCkbBoxes();
                    atualizarGrafico();
                    break;
                        
            }
        } catch (Exception e) {
            throw new RuntimeException ("Erro ao trocar o padrao do grafico " + e.getMessage());
        }
    }
    
    
    public void tituloDecorate() {
        
        try {
            if(view.getCkbTitulo().isSelected()) {
                grafico = new TituloDecorator(grafico, "Grafico Pessoas");
                atualizarGrafico();
                
            } else {
                grafico = new TituloDecorator(grafico, " ");
                atualizarGrafico();
            }
        
        } catch (Exception e) {
                    throw new RuntimeException ("Erro ao adicionar título" + e.getMessage());
        }
    }
    
    
    public void legendaDecorate() {
        
        try {
            if(view.getCkbLegenda().isSelected()) {
                grafico =  new LegendaDecorator(grafico, true);
                atualizarGrafico();
                
            } else {
                grafico = new LegendaDecorator(grafico, false);
                atualizarGrafico();
            }
        } catch (Exception e) {
            throw new RuntimeException ("Erro ao adicionar a legenda" + e.getMessage());
        }
    }
    
    
    public void tituloEixosDecorate() {
        
        try {
            if(view.getCkbTituloEixos().isSelected()) {
                grafico = new TituloDosEixosDecorator(grafico, "Horizontal", "Vertical");
                atualizarGrafico();
                
            } else {
                grafico = new TituloDosEixosDecorator(grafico, " ", " ");
                atualizarGrafico();
            }
        
        } catch (Exception e) {
                    throw new RuntimeException ("Erro ao adicionar título" + e.getMessage());
        }
    }
    
    
    public void atualizarGrafico() {
        
        view.getPnlGrafico().removeAll();
        view.getPnlGrafico().add(grafico.exibirGrafico());
        
        view.pack();
    
    }
    
    
    public void clearCkbBoxes() {
        
        view.getCkbTitulo().setSelected(false);
        view.getCkbLegenda().setSelected(false);
        view.getCkbTituloEixos().setSelected(false);
        
    }
    
    
    
}