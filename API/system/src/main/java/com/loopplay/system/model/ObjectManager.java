package com.loopplay.system.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ObjectManager {

    static String FILE_PATH = "C:\\Users\\jeans\\OneDrive\\Documentos\\TESTES-SPRINGBOOT\\API\\system\\src\\main\\java\\com\\loopplay\\system\\model\\nextID.txt";
    static String FILE_PATH2 = "C:\\Users\\jeans\\OneDrive\\Documentos\\TESTES-SPRINGBOOT\\NextUserID\\nextID.txt";
    static int gerarID(){
        try{
            BufferedReader leitor = new BufferedReader(new FileReader(new File(FILE_PATH2)));
            int id = Integer.valueOf(leitor.readLine());
            leitor.close();
            BufferedWriter salvarArquivo = new BufferedWriter(new FileWriter(new File(FILE_PATH2)));
            salvarArquivo.write(String.valueOf(id + 1));
            salvarArquivo.close();
            return id;
        }
        catch(IOException e){
            e.printStackTrace();
            return -1;
        }
        
    }

    
    
}
