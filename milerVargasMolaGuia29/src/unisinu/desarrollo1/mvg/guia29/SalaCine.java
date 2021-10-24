package unisinu.desarrollo1.mvg.guia29;

/**
 *
 * @author Mier vargas mola 87223
 */
public class SalaCine {

    private int Aforo;
    private int Ocupadas;
    private String Película;
    private double Entrada;

    public SalaCine() {
        this.Aforo = 100;
        this.Ocupadas = 0;
        this.Película = "";
        this.Entrada = 5.0;
    }

    public int getAforo() {
        return Aforo;
    }

    public void setAforo(int Aforo) {
        this.Aforo = Aforo;
    }

    public int getOcupadas() {
        return Ocupadas;
    }

    public void setOcupadas(int Ocupadas) {
        this.Ocupadas = Ocupadas;
    }

    public String getPelícula() {
        return Película;
    }

    public void setPelícula(String Película) {
        this.Película = Película;
    }

    public double getEntrada() {
        return Entrada;
    }

    public void setEntrada(double Entrada) {
        this.Entrada = Entrada;
    }

//Método setLibres
    public void setLibres(int lib) {
        int ocu;

        ocu = Aforo - lib;
        this.Ocupadas = ocu;
    }

//Método getLibres
    public int getLibres() {
        int lib;
        lib = Aforo - Ocupadas;
        return lib;
    }

    //Método getPorcentaje
    public double getPorcentaje() {
        double por;
        por = (double) Ocupadas / (double) Aforo * 100.0;
        return por;
    }

    //Método getIngresos
    public double getIngresos() {
        double ingre;
        ingre = Ocupadas * Entrada;
        return ingre;
    }

    //Método Vaciar
    public void Vaciar() {
        Ocupadas = 0;
        Película = "";
    }

//Método entraUno
    public void entraUno() {
        Ocupadas++;
    }

}
