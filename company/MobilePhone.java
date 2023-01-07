package company;

public class MobilePhone {
    private String numbre;
    private int battery;
    public MobilePhone(String numbre , int battery){
        this.numbre=numbre;
        this.battery=battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setNumbre(String numbre) {
        this.numbre = numbre;
    }

    public int getBattery() {
        return battery;
    }

    public String getNumbre() {
        return numbre;
    }

    public void use(){
        setBattery(getBattery()-1);
    }
}
