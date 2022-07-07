package com.example.maquinavirtual;

import javafx.fxml.FXML;
import javafx.scene.control.*;


public class PrincipalController {
    @FXML
    Label texto;
    ListView memoria;


    @FXML
    protected void onHelloButtonClick() {
        texto.setText("Ejecutar");
    }

    @FXML
    protected void abrirArchivo() {
        GestionArchivo gestionArchivo = new GestionArchivo(this);
        gestionArchivo.AbirExplorador();

    }


}