package entities.Es1;

public class Main {
    public static void main(String[] args) {


        Rectangle rettangolo1 = new Rectangle(4.5, 5.4);

        System.out.println(Rectangle.stampaRettangolo(rettangolo1));

        Rectangle rettangolo2 = new Rectangle(8.1, 9.2);

        System.out.println(Rectangle.stampaDueRettangoli(rettangolo1, rettangolo2));
    }
}