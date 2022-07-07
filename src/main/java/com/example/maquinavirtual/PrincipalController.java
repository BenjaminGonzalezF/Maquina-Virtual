package com.example.maquinavirtual;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class PrincipalController {
    @FXML
    private Label tester;

    @FXML
    protected void onHelloButtonClick() {
        tester.setText("Ejecutar");
    }
    @FXML
    protected void abrirArchivo() {
        FileChooser fc=new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF Files","*.pdf"));
        List<File> f=fc.showOpenMultipleDialog(null);
        for(File file:f) {
            tester.setText(file.getAbsolutePath());
        }
    }


}