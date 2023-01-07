package company;

public class Employee extends Person{
    private int dinero;
    private MobilePhone phone;

    public Employee(String name, String DNI, int weight, int height , int dinero , MobilePhone phone) {
        super(name, DNI, weight, height);
        this.dinero=dinero;
        this.phone=phone;
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

    public void setPhone(MobilePhone phone) {
        this.phone = phone;
    }

    public MobilePhone getPhone() {
        return phone;
    }

    public void ganarDeniro(int importe){
        setDinero(this.dinero+importe);
    }
    public void gastarDeniro( int importe){
        setDinero(this.dinero-importe);
    }

    @Override
    public String toString() {
        return "el nombre es " + getName() + "\n" +" EL PESO es " + getHeight() + "\n" +" el dinero es : " + getDinero() + "\n" +" la bateria del movil es : " + phone.getBattery() + "%";
    }
    public void work(){
        phone.use();
        ganarDeniro(10);
    }
}
