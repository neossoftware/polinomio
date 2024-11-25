import java.util.Scanner;
public class VistaPolinomio {
    Scanner scann= new Scanner(System.in);

    public int pideTam(){
        System.out.println("Dame el tamaño del polinomio");
        int tam= scann.nextInt();
        return tam;
    }

    public int pideCoef(int i){
        System.out.println("Dame el coeficiente del termino "+(i+1));
        int coef=scann.nextInt();
        return coef;
    }

    public int pideGrad(int i){
        System.out.println("Dame el grado del termino "+(i+1));
        int grad= scann.nextInt();
        return grad;
    }

    public double pideX(){
        System.out.println("Dame el valor de X");
        double x= scann.nextDouble();
        return x;
    }

    public double pideLimiteInferior() {
        System.out.println("Dame el limite inferior");
        double x = scann.nextDouble();
        return x;
    }

    public int pideNumeroCiclos() {
        System.out.println("Dame el número de ciclos");
        int x = scann.nextInt();
        return x;
    }

    public Termino pideTermi(int i){
        int coef= this.pideCoef(i);
        int grad= this.pideGrad(i);
        Termino t1= new Termino(grad, coef);
        return t1;
    }


    public void muestraPolinomio(Polinomio p1) {
        System.out.println(" --------------------------------");
        System.out.println( p1.visualizaPolinomio());
        System.out.println(" --------------------------------");
    }

    public void tabulaPolinomio(Polinomio p1, double limiteInf, int numciclos) {

        int j = 1;

        System.out.format("+-----------------+-----------------+%n");
        System.out.format("| X               | f(x )           |%n");
        System.out.format("+-----------------+-----------------+%n");
        String leftAlignment = "| %-15.2f | %-15.2f | %n";
        while (j<=numciclos) {
            double valor= limiteInf;
            p1.setX(valor);
            double resultado= p1.calculaResultado();
            System.out.format(leftAlignment, valor, resultado);
            System.out.format("+-----------------+-----------------+%n");
            limiteInf+=1;
            j++;
        }
    }
}