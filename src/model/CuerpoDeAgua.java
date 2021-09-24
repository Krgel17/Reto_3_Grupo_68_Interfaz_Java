package model;

import java.sql.SQLException;

public class CuerpoDeAgua extends ObjetoGeografico {

    public CuerpoDeAgua(){
    }

    public CuerpoDeAgua(String nombre, String cod_id, String municipio, String tipo_agua, String tipo_cuerp, String c_irca){
        super(nombre, cod_id, municipio, tipo_agua, tipo_cuerp, c_irca);
    }

    public String nivel1(){
        
        String nivel2 = "";
        
        if (getIrca() >=0 && getIrca() <=5){
            nivel2 = "SIN RIESGO";
        }
        else if (getIrca() >=5.1 && getIrca() <=14){
            nivel2 = "BAJO";
        }
        else if (getIrca() >= 14.1 && getIrca() <= 35) {
            nivel2 = "MEDIO";
        }
        else if (getIrca() >= 35.1 && getIrca() <= 80) {
            nivel2 = "ALTO";
        }
        else if (getIrca() >= 80.1 && getIrca() <= 100) {
            nivel2 = "INVIABLE SANITARIAMENTE";
        }
        else {
            nivel2 = "INVIABLE SANITARIAMENTE";
        }
        return nivel2;
    }

    public String nivel(double dato){
                
        if (dato >=0 && dato<=5){
            return "SIN RIESGO";
        }
        else if (dato >=5.1 && dato<=14){
            return "BAJO";
        }
        else if (dato >= 14.1 && dato <= 35) {
            return "MEDIO";
        }
        else if (dato >= 35.1 && dato <= 80) {
            return "ALTO";
        }
        else if (dato >= 80.1 && dato <= 100) {
            return "INVIABLE SANITARIAMENTE";
        }
        else {
            return "INVIABLE SANITARIAMENTE";
        }
    }

}

