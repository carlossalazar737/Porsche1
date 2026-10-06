public class Porsche {
    private int potencia;
    private double velocidad;
    public void setPotencia(int potencia){
        if(potencia > 0)
        this.potencia = potencia;
    }
    public void setVelocidad(double velocidad){
        if(velocidad < 0)
            velocidad = 0;
        this.velocidad = velocidad;
    }

    public void acelerar(){
        velocidad+=potencia;
    }
    public void mostrarinformacion(){
        System.out.println("La potencia del carro es: " + potencia + " y la velocidad es: " + velocidad);
    }
    void frenar(){
        velocidad/=potencia;
    }
    public void Frenar(){
        System.out.println("Freno y quedo a una velocidad de: "+ velocidad );
    }

}
