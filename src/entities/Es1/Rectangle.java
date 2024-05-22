package entities.Es1;

public class Rectangle {
    private double base;
    private double altezza;


    public Rectangle(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;

    }

    public static String stampaRettangolo(Rectangle rettangolo) {
        return
                "L'area del rettangolo è " + rettangolo.getArea() + " " +
                        "il perimetro del rettangolo è " + rettangolo.getPerimetro();

    }

    public static String stampaDueRettangoli(Rectangle rettangolo, Rectangle rettangolo2) {
        return
                "L'area del primo rettangolo è " + rettangolo.getArea() + " " +
                        "l'area del secondo rettangolo è " + rettangolo2.getArea() + " " +
                        "la somma delle due aree è " + (rettangolo.getArea() + rettangolo2.getArea()) +
                        " " + "il perimetro del primo rettangolo è " + rettangolo.getPerimetro() +
                        "il perimetro del secondo rettangolo è " + rettangolo2.getPerimetro() + " " +
                        "la somma dei due perimetri è  " + (rettangolo.getPerimetro() + rettangolo2.getPerimetro());

    }

    public double getArea() {
        return
                this.base * this.altezza;
    }

    public double getPerimetro() {
        return
                (this.base + this.altezza) * 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
}