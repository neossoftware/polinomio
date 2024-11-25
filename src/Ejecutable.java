public class Ejecutable {
    public static void main(String[] args) {
        VistaPolinomio vp= new VistaPolinomio();
        int tamano= vp.pideTam();
        Polinomio p1= new Polinomio(tamano);
        for (int i=0;i<tamano; i++){
            Termino termino= vp.pideTermi(i);
            p1.addTermino(termino);
        }

        vp.muestraPolinomio(p1);
        double limiteInf = vp.pideLimiteInferior();
        int numciclos = vp.pideNumeroCiclos();

        vp.tabulaPolinomio(p1, limiteInf, numciclos);


    }
}
