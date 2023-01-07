package company;

public class Company {
    private String name;
    private int profit;
    private Employee owner;
    private Employee manager;

    public Company(String name , int profit , Employee owner){
        this.name=name;
        this.owner=owner;
        this.profit=profit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }

    public void hireManager(Employee manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }

    public Employee getOwner() {
        return owner;
    }

    public int getProfit() {
        return profit;
    }

    public void companyWork(){
        owner.work();
        manager.work();
        setProfit(profit+100);
    }

    @Override
    public String toString() {
        return "el nombre de la empresa es " + getName() + "\n" + "el profit de la empresa es " + getProfit() + "\n" + "el propietario es : "  +"\n" + owner.toString() + "\n" + "el director es : " + "\n" + manager.toString()  ;
    }
}
