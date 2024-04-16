package brinquedosj;

public class Calculadora {
    private Robo robo;

    public Calculadora (Robo robo) {
        this.robo = robo;
    }

    public void setRobo (Robo robo) {
    this.robo = robo;
    } public Robo getRobo () {
    return this.robo;
    }

    public float Somar (float numero1, float numero2) {
        return numero1 + numero2;
    }
    public float Subtrair (float numero1, float numero2) {
        return numero1 - numero2; //Metodos de calculo;
    }
    public float Multiplicar (float numero1, float numero2) {
        return numero1 * numero2;
    }
    public float Dividir (float numero1, float numero2) {
        return numero1 / numero2;
    }
}
