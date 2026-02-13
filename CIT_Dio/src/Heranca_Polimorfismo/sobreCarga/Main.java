package Heranca_Polimorfismo.sobreCarga;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Salesman salesman = new Salesman();
        Manager manager = new Manager();

        System.out.println(employee instanceof Employee);
        System.out.println(salesman instanceof  Employee);
        System.out.println(manager instanceof  Employee);
        System.out.println(manager instanceof Manager);
        System.out.println(salesman instanceof Salesman);
        System.out.println(employee instanceof Employee);

    }
}
