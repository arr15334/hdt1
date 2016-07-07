/*
 *  Clase en donde se declaran los metodos que se implementaran en la interfaz
 */

/**
 *
 * @author Rodrigo Arriaza;
 */
public class usoRadio implements radio {
    /* atributos */
    private double estacion;
    private boolean frecuencia;
    private boolean encendido;

    /* metodos set y get */
    public double getEstacion() {
        return estacion;
    }

    public void setEstacion(double estacion) {
        this.estacion = estacion;
    }

    public boolean isFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(boolean frecuencia) {
        this.frecuencia = frecuencia;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    /* metodos para la implementacion de la interfaz */

    @Override
    public void setEmisora(double emisora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveEmisora(int btn, double emisora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double selectEmisora(int btn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getEncendido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getFrecuencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getEmisora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
