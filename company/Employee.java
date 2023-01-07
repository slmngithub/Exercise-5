package company;

public class Employee extends Person{
    private int dinero;


    public Employee(String name, String DNI, int weight, int height , int dinero) {
        super(name, DNI, weight, height);
        this.dinero=dinero;
    }
    public Employee(String DNI) {
        super(DNI);

    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }
    public void ganarDeniro( int importe){
        setDinero(this.dinero+importe);
    }
    public void gastarDeniro( int importe){
        setDinero(this.dinero-importe);
    }

    @Override
    public String toString() {
        return "el nombre es " + getName() + " EL PESO es " + getHeight() + " el dinero es : " + getDinero();
    }
}
