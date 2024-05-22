package entities.Es2;

public class Main {
    public static void main(String[] args) {


        Calls calls1 = new Calls(20, 3486669);
        Calls calls2 = new Calls(18, 34753669);
        Calls calls3 = new Calls(45, 33843765);
        Calls calls4 = new Calls(31, 329765544);
        Calls calls5 = new Calls(56, 34812789);

        System.out.println(Calls.stampaChiamata(calls1));

        Sim sim1 = new Sim(35967543);

        System.out.println(Sim.stampaSim(sim1));

    }

}
