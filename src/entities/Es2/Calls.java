package entities.Es2;

public class Calls {

    private int durata;
    private int numeroTel;


    public Calls(int durata, int numeroTel) {
        this.durata = durata;
        this.numeroTel = numeroTel;

    }

    public static String stampaChiamata(Calls chiamata) {

        return "Ha chiamato il numero " + chiamata.numeroTel + " " + "la chiamata è durata " +
                chiamata.durata + "minuti";
    }
}
