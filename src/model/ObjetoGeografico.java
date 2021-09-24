package model;
import java.util.Locale;
    
public class ObjetoGeografico {

    private String nombre;
    private double id;
    private String municipio;
    private String tipo_agua;
    private String tipo_cuerp;
    private double irca;
    public int length;


    public ObjetoGeografico() {
    }
    

    public ObjetoGeografico(String nombre, String id, String municipio, String tipo_agua, String tipo_cuerp, String irca) {
        
        this.nombre = nombre;
        this.id = Double.parseDouble(id);
        this.municipio = municipio;
        this.tipo_agua = tipo_agua;
        this.tipo_cuerp = tipo_cuerp;
        this.irca = Double.parseDouble(irca);
    }

    public ObjetoGeografico(String nombre, double id, String municipio, String tipo_agua, String tipo_cuerp, double irca) {
        
        this.nombre = nombre;
        this.id = id;
        this.municipio = municipio;
        this.tipo_agua = tipo_agua;
        this.tipo_cuerp = tipo_cuerp;
        this.irca = irca;
    }

    public String getTipo_cuerp() {
        return this.tipo_cuerp;
    }

    public void setTipo_cuerp(String tipo_cuerp) {
        this.tipo_cuerp = tipo_cuerp;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipo_agua() {
        return this.tipo_agua;
    }

    public void setTipo_agua(String tipo_agua) {
        this.tipo_agua = tipo_agua;
    }

    public double getIrca() {
        return this.irca;
    }

    public void setIrca(double irca) {
        this.irca = irca;
    }

    @Override
    public String toString() {
        Locale.setDefault(new Locale("en", "US"));
        return 
        
            "" + getNombre() + "" + "\n" +
            "" + (String.format("%.2f",getId())) + "" + "\n" +
            "" + getMunicipio() + "" + "\n" +
            "" + getTipo_cuerp() + "" + "\n" +
            "" + getTipo_agua() + "" + "\n" +
            "" + (String.format("%.2f",getIrca())) + "" + "\n" + "\n" ;
    }



}
