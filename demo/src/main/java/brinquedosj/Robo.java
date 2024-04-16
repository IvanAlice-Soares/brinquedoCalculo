package brinquedosj;

public class Robo {
    private String nome;
    private int bateria;
    private String dat_fab;

    public Robo () {
        this.nome = "Robocop";
        this.bateria = 10;
        this.dat_fab = "16/04/24";
    }

    public void setNome (String nome) {
        this.nome = nome;
    } public String getNome () {
        return this.nome;
    }

    public void setBateria (int bateria) {
        this.bateria = bateria;
    } public int getBateria () {
        return this.bateria;
    }
    public void setDat_fab (String dat_fab) {
        this.dat_fab = dat_fab;
    } public String getDat_fab () {
        return this.dat_fab;
    }
}
