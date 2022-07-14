package com.mycompany.presenter;

import com.mycompany.decorator.TituloDecorator;
import com.mycompany.view.TituloView;
import java.io.IOException;


public class TituloPresenter {
    
    private TituloView view;
    
    public TituloPresenter(MainPresenter main) throws IOException {
        init(main);
    
    }
    
    public void init(MainPresenter main) {
        
        view = new TituloView();
        view.setVisible(true);
        
        view.getBtnOk().addActionListener((e) -> {
            alterarTitulo(main);
        });
        
        view.getBtnCancelar().addActionListener((e) -> {
            cancelar(main);
        });
    }
    
    public void alterarTitulo(MainPresenter main) {
        
        try {
            main.decorateGrafico(new TituloDecorator(main.getGrafico(), view.getTextTitulo().getText()));
            main.atualizarGrafico();
            view.dispose();
        } catch (Exception e) {
            throw new RuntimeException ("Erro ao adicionar o título" + e.getMessage());
        }
        
    }
    
    public void cancelar(MainPresenter main) {
        main.getView().getCkbTitulo().setSelected(false);
        view.dispose();
    }
}
