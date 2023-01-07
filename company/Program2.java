package company;

public class Program2 {
    public static void main(String [] arg){
        MobilePhone mobile = new MobilePhone("698256547" , 60);
        Employee e = new Employee("nabil" , "5584267u" , 105 , 170 , 1000 , mobile);
        MobilePhone mobile1 = new MobilePhone("631548965" , 90);
        Employee e1 = new Employee("oussama" , "y7655367u" , 85 , 185 , 500 , mobile1);
        Company c = new Company("SLMN SL." , 100000 , e1);
        c.hireManager(e);
        System.out.println(c.toString());
        c.companyWork();
        c.companyWork();
        System.out.println("-----------------------------------------");
        System.out.println(c.toString());


    }
}
