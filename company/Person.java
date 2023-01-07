package company;

public class Person {
    private String name;
    private String DNI;
    int weight;
    int height;
    public Person(String name , String DNI , int weight , int height){
        this.name=name;
        this.DNI=DNI;
        this.height=height;
        this.weight=weight;
    }
    public  Person(String DNI){
        this.DNI=DNI;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDNI(String DNI){
        this.DNI=DNI;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public void setHeight(int height){
        this.height=height;
    }

    public String getName() {
        return name;
    }

    public String getDNI() {
        return DNI;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
    public String toString(){
        return "el nombre es " + getName() + "EL PESO es " + getHeight();
    }
}

