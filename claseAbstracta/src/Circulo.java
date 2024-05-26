public class Circulo implements Figura, Rotable,Dibujable {
    private double radio;
    //constructor
    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        double PI = 3.1416;
        double resultado = PI * radio * radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando");
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando");
    }
}
