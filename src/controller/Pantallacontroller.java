package controller;

import java.util.ArrayList;
import java.util.Locale;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.CuerpoDeAgua;
import model.ObjetoGeografico;

public class Pantallacontroller {

    @FXML
    private TextField nombre;

    @FXML
    private TextField id;

    @FXML
    private TextField municipio;

    @FXML
    private TextField tipocuerp;

    @FXML
    private TextField tipoagua;

    @FXML
    private TextField clasirca;

    @FXML
    private Button btningresar;

    @FXML
    private Button btnprocesar;

    @FXML
    private TextArea mostrar1;

    @FXML
    private TextArea mostrar2;

    @FXML
    private Button btnLimpiar;

    @FXML
    void Limpiar(ActionEvent event) {

        this.nombre.clear();
        this.id.clear();
        this.municipio.clear();
        this.tipocuerp.clear();
        this.tipoagua.clear();
        this.clasirca.clear();
        this.mostrar1.clear();
        this.mostrar2.clear();
        listadatos.clear();
        listad.clear();
        System.out.println("Datos borrados");

    }

    //DATOS 

    public int contador2 = 0;

    ArrayList<ObjetoGeografico> listadatos = new ArrayList<>();
    ArrayList<String> listad = new ArrayList<>();


        /// BOTON INGRESAR DATOS

    @FXML
    void ingresar(ActionEvent event) {
        Locale.setDefault(new Locale("en", "US"));

        if (!nombre.getText().isEmpty()) {
            if (!id.getText().isEmpty()) {
                if (!municipio.getText().isEmpty()) {
                    if (!tipocuerp.getText().isEmpty()) {
                        if (!tipoagua.getText().isEmpty()) {
                            if (!clasirca.getText().isEmpty()) {

                                String nom = this.nombre.getText();
                                String cod_id = this.id.getText();
                                String mun = this.municipio.getText();
                                String t_cuerp = this.tipocuerp.getText();
                                String t_agua = this.tipoagua.getText();
                                String c_irca = this.clasirca.getText();
                                String data = "";

                                ObjetoGeografico lista = new ObjetoGeografico(nom, cod_id, mun, t_agua, t_cuerp, c_irca);
                                listadatos.add(lista);
                                listad.add(lista.toString());

                                for (int i = 0; i < listad.size(); i++) {
                                    data+=listad.get(i);
                                }
                                mostrar1.appendText(data);

                                this.nombre.clear();
                                this.id.clear();
                                this.municipio.clear();
                                this.tipocuerp.clear();
                                this.tipoagua.clear();
                                this.clasirca.clear();
                                this.nombre.requestFocus();
                                listad.clear();
                                mostrar2.clear();

                            
                                System.out.println("Registro exitoso");
                                contador2++;

                            } else {
                                Alert alerta = new Alert(AlertType.INFORMATION, "Nivel IRCA vacío");
                                alerta.showAndWait();
                                clasirca.requestFocus();
                            }
                        } else {
                            Alert alerta = new Alert(AlertType.INFORMATION, "Tipo de Agua vacío");
                            alerta.showAndWait();
                            tipoagua.requestFocus();
                        }
                    } else {
                        Alert alerta = new Alert(AlertType.INFORMATION, "Tipo de Cuerpo vacío");
                        alerta.showAndWait();
                        tipocuerp.requestFocus();
                    }
                } else {
                    Alert alerta = new Alert(AlertType.INFORMATION, "Municipio vacío");
                    alerta.showAndWait();
                    municipio.requestFocus();
                }
            } else {
                Alert alerta = new Alert(AlertType.INFORMATION, "Codigo ID vacío");
                alerta.showAndWait();
                id.requestFocus();
            }
        } else {
            Alert alerta = new Alert(AlertType.INFORMATION, "Nombre vacío");
            alerta.showAndWait();
            nombre.requestFocus();
        }
    }


    /// BOTON PROCESAR DATOS
    @FXML
    void procesar(ActionEvent event) {

        if (listadatos.size() == 0) {
            Alert alerta = new Alert(AlertType.INFORMATION, "Datos vacíos " + "\n" + "Por favor ingrese los datos");
            alerta.showAndWait();
            nombre.requestFocus();
        } else {

            Locale.setDefault(new Locale("en", "US"));

            double nogob = 0, sum = 0, contador = 0, cuerp = 0, riesg = 0;
            String parse = "", clasw = "";
            ArrayList<String> proceso = new ArrayList<>();

            for (int i = 0; i < listadatos.size(); i++) {
                riesg = listadatos.get(i).getIrca();
                cuerp = listadatos.get(i).getId(); 

                CuerpoDeAgua CDA = new CuerpoDeAgua();

                parse +=CDA.nivel(riesg);

                mostrar2.appendText(parse + " " + (String.format("%.2f", cuerp)) + "\n"); 
                parse = "" ;riesg = 0;cuerp = 0;
            
            }

            this.nombre.clear();
            this.id.clear();
            this.municipio.clear();
            this.tipocuerp.clear();
            this.tipoagua.clear();
            this.clasirca.clear();
            //this.mostrar1.clear();
            
            System.out.println("Proceso exitoso");
        }
        //System.out.println("Proceso exitoso");

    }


}
