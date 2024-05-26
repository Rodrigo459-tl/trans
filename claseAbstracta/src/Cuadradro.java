public class Cuadradro implements Figura,Dibujable{
    private double lado;

    public Cuadradro(double lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea(){
        double resultado = lado * lado;
        return resultado;
    }
    public void dibujar(){
        System.out.println("Estoy dibujando un cuadrado");
    }
}
