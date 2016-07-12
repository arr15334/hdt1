/*
 *  Clase en donde se declaran los metodos que se implementaran en la interfaz
 */

/**
 *
 * @author Rodrigo Arriaza, Alejandro Chaclan, Sebastian Galindo
 */
public class usoRadio implements radio {
    /* atributos */
    private double emisora;
    private boolean frecuencia;
    private boolean encendido;
    private double[] emisorasAM = new double[12];
    private double[] emisorasFM = new double[12];

    /**
     * se declaran los valores iniciales para la radio al momento de que sea instanciada
     */
    public usoRadio() {
        setFrecuencia(true);
        setEncendido(true);
        setEmisora(87.9);
        for (int i = 0; i < 12; i++) {
            emisorasFM[i] = 87.9;
            emisorasAM[i] = 530;
        }
    }

    /* metodos para la implementacion de la interfaz */
    @Override
    public void setFrecuencia(boolean frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    @Override
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public void setEmisora(double emisora) {
        if (getFrecuencia()) {
            if (Double.compare(emisora, 108.1) == 0) {
                emisora = 87.9;
            }
            if (Double.compare(emisora, 87.7) == 0) {
                emisora = 107.9;
            }
        } else {
            if (Double.compare(emisora, 1620) == 0) {
                emisora = 530;
            }
            if (Double.compare(emisora, 520) == 0) {
                emisora = 1610;
            }
        }
        this.emisora = emisora;
    }

    @Override
    public void saveEmisora(int btn, double emisora) {
        if (getFrecuencia()){
            emisorasFM[btn] = emisora;
        } else {
            emisorasAM[btn] = emisora;
        }
    }

    @Override
    public double selectEmisora(int btn) {
        if (getFrecuencia()) {
            return emisorasFM[btn-1];
        } else {
            return emisorasAM[btn-1];
        }
    }

    @Override
    public boolean getEncendido() {
        return encendido;
    }

    @Override
    public boolean getFrecuencia() {
        return frecuencia;
    }

    @Override
    public double getEmisora() {
        return emisora;
    }
}