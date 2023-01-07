package company;

public class Program {
    public static void main(String [] arg){
        MobilePhone mobile = new MobilePhone("631548965" , 90);
        Employee e = new Employee("oussama" , "y7655367u" , 85 , 185 , 500 , mobile);
        System.out.println(e.toString());
        e.work();
        e.work();
        System.out.println("-------------------------------------------");
        System.out.println(e.toString());




    }
}
