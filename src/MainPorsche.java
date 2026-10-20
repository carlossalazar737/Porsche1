public class MainPorsche {
    static void main(){
            System.out.println("El numero de objetos de tipo Porsche creados son: "+ Porsche.getNumCarros());
            Porsche C1= new Porsche(2,60);
            Porsche C2= new Porsche(-5,-100);
            Porsche C3 = new Porsche();
            System.out.println("El numero de objetos de tipo Porsche creados son: "+ Porsche.getNumCarros());
            System.out.println("El precio de venta publico del Porsche es: "+ C1.calcularprecioFinal());
            System.out.println("La potencia del Porsche es: "+ C1.getPotencia()+"La velocidad del Porsche es: " + C1.getVelocidad());
            System.out.println("La potencia del Porsche es: "+ C2.getPotencia()+"La velocidad del Porsche es: " + C2.getVelocidad());
            System.out.println("La potencia del Porsche es: "+ C3.getPotencia()+"La velocidad del Porsche es: " + C3.getVelocidad());
            C1.acelerar();
            C1.acelerar();
            C1.frenar();
    }
}
