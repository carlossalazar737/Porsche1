public class Porsche {
    private int potencia;
    private double velocidad;
    private static int numCarros = 0;
    private static final double IVA = 0.15;
    private static final double precio = 125000;

    public Porsche(int potencia, double velocidad){
        setPotencia(potencia);
        setvelocidad(velocidad);
        numCarros++;
    }
    public Porsche(){
        numCarros++;
    }
    public void setPotencia(int potencia) {
            if (potencia > 0)
                this.potencia = potencia;
    }

    public void setvelocidad(double velocidad) {
            if (velocidad < 0){
                velocidad = 0;
            this.velocidad = velocidad;
            }
    }

    public int getPotencia() {
        return potencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public static int getNumCarros() {
        return numCarros;
    }
    public static double getIVA(){
        return IVA;
    }
    public double calcularprecioFinal(){
        return precio + (precio*IVA);
    }
    public void acelerar(){
        velocidad+=potencia;
    }
    void frenar(){
        velocidad/= 2;
    }
}
