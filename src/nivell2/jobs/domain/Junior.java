package nivell2.jobs.domain;

public class Junior extends Employee{
    public Junior(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception{
        super(name, address, phone, salaryPerMonth, paymentRate);
    }

    @Override
    public void pay() {
        totalPaid=paymentRate.pay(salaryPerMonth);
    }

    @Override
    public String toString() {
        return "Jun [name="+name+", address="+address+", phone="+phone+", salaryPerMonth="+salaryPerMonth+", totalP="+totalPaid+"]\n";
    }
}
