public class Termino {

    private int grado;
    private double coeficiente;
    private double x;

    public Termino()
    {
        coeficiente = 0;
        x = 0;
        grado = 0;
    }

    public Termino(int grado, double coeficiente)
    {
        this.coeficiente = coeficiente;
        this.grado = grado;
    }
    public double calculaResultado(){
        return coeficiente * Math.pow(x,grado);
    }

    public void setGrado(int grado){
        if(grado<0){
            this.grado=0;
        }else{
            this.grado=grado;
        }
    }
    public void setCoeficiente(double coeficiente){
        this.coeficiente = coeficiente;
    }
    public void setX(double x){
        this.x = x;
    }

    public double getX(){
        return this.x;
    }
    public double getCoeficiente(){
        return this.coeficiente;
    }
    public int getGrado(){
        return this.grado;
    }
}