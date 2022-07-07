package com.example.maquinavirtual;

import javafx.stage.FileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.OutputStream;
import java.util.List;

public class GestionArchivo {
    PrincipalController ui;

    public GestionArchivo(PrincipalController ui) {
        this.ui = ui;
    }
    void AbirExplorador() {
        String texto = "";
        String direccionArchivo = null;
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("ASM", "*.asm"));
        List<File> f = fc.showOpenMultipleDialog(null);

        for (File file : f) {
            direccionArchivo = file.getAbsolutePath();
        }
        try{
            BufferedReader bf=new BufferedReader(new FileReader(direccionArchivo));
            String temp="";
            String bfRead;
            while((bfRead=bf.readLine())!=null){
                temp=temp+bfRead;
            }
            texto = temp;
        }catch(Exception e) {
            System.err.println("No se encontro archivo");
        }
        ui.texto.setText(texto);
    }
}
