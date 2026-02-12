package Heranca_Polimorfismo;

public non-sealed class Salesman extends Employee{
    private double percentPerSold;

    public Salesman(String code,
                    String name,
                    String address,
                    int age,
                    double salary)
    {
        super(code, name, address, age, salary);
    }

    public Salesman(){

    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }
}
