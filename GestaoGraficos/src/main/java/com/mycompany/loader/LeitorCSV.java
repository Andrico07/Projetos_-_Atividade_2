package com.mycompany.loader;

import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
import com.mycompany.model.Pessoa;


public class LeitorCSV {
    
    private Scanner input;
    private final ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    
    
    public ArrayList<Pessoa> lerArquivo(String file){
        
        try {
            
            input = new Scanner(Paths.get(file));            
            input.nextLine();
            
            while(input.hasNext()) {
                String[] data = input.nextLine().split(",");
                Pessoa pessoa = new Pessoa(data[0], data[1], data[2]);
                pessoas.add(pessoa);
            }
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        
        return pessoas;
    }

    
}
