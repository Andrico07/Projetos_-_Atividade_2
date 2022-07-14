package com.mycompany.presenter;

import com.mycompany.decorator.TituloDosEixosDecorator;
import com.mycompany.view.TituloEixosView;
import java.io.IOException;


public class TituloEixosPresenter {
    
    private TituloEixosView view;
    
    public TituloEixosPresenter(MainPresenter main) throws IOException {
        init(main);
    
    }
    
    public void init(MainPresenter main) {
        
        view = new TituloEixosView();
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
            main.decorateGrafico(new TituloDosEixosDecorator(main.getGrafico(), view.getTextTituloHorizontal().getText(), view.getTextTituloVertical().getText()));
            main.atualizarGrafico();
            view.dispose();
        } catch (Exception e) {
            throw new RuntimeException ("Erro ao adicionar os título" + e.getMessage());
        }
        
    }
    
    public void cancelar(MainPresenter main) {
        main.getView().getCkbTituloEixos().setSelected(false);
        view.dispose();
    }
}
