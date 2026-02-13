package Heranca_Polimorfismo.sobreCarga;

public class Main {
    public static void main(String[] args) {

        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee){

        System.out.printf("=====%s=====\n", employee.getClass().getSimpleName());

        switch (employee){
            case Manager manager ->{
                manager.setCode("12");
                manager.setName("Junio");
                manager.setSalary(5000);
                manager.setLogin("Junio123");
                manager.setPassword("123456");
                manager.setCommission(1200);

                System.out.println("Code: "+ manager.getCode());
                System.out.println("Nome: " + manager.getName());
                System.out.println("Salario: " + manager.getSalary());
                System.out.println("Login: " + manager.getLogin());
                System.out.println("Senha: " + manager.getPassword());
                System.out.println("Comission: " + manager.getCommission());
            }
            case Salesman salesman -> {
                salesman.setCode("113");
                salesman.setName("Maria");
                salesman.setSalary(2000);

                System.out.println("Code: " + salesman.getCode());
                System.out.println("Nome: "+ salesman.getName());
                System.out.println("Salario: "+ salesman.getSalary());

            }
        }

    }
}
