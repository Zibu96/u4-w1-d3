package entities.Es2;

public class Sim {

    private int tel;
    private int credit;
    private Calls[] calls;

    public Sim(int tel) {

        this.tel = tel;
        this.credit = 0;
        this.calls = new Calls[5];
    }

    public static String stampaSim(Sim call) {

        return "la SIM del numero " + call.tel + "ha credito " + call.credit +
                "e le seguenti chiamate " + call.calls;
    }


}
