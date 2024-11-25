public class Polinomio {

    private Termino[] terminos;
    private double x;
    private int cont=0;

    public Polinomio() {

    }

    public Polinomio(int numterminos) {
        this.terminos = new Termino[numterminos];
    }

    public void addTermino(Termino termino){
        terminos[cont] = termino;
        cont++;
    }

    public double calculaResultado() {
        double resultado = 0;
        for (Termino t: this.terminos) {
            t.setX(this.x);
            resultado = resultado + t.calculaResultado();
        }
        return resultado;
    }

    public void setX(double x) {
        this.x= x;
    }

    public String visualizaPolinomio() {
        String polinomio="";
        String x ="";
        String coeficiente;
        int i=1;
        for (Termino t: this.terminos){
            if (t.getGrado()==1) {
                 x= "x";
            } else if (t.getGrado()>1){
                x="x^"+t.getGrado();
            } else {
                x ="";
            }

            if (t.getCoeficiente()>0 && i>1) {
                coeficiente = "+"+t.getCoeficiente();
            } else {
               coeficiente = ""+t.getCoeficiente();
            }

            polinomio = polinomio+coeficiente+x;
         i++;
        }
        return polinomio;
    }
}
