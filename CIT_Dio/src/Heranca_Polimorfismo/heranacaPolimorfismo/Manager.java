package Heranca_Polimorfismo.heranacaPolimorfismo;

public non-sealed class Manager extends Employee{
    private String login;
    private String name;
    private double commission;
    private String password;

    public Manager(String code,
                   String name,
                   String address,
                   int age,
                   double salary)
    {
        super(code, name, address, age, salary);
    }

    @Override
    public String getCode(){
        return "MN" + super.getCode();
    }
    public Manager(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
