package nivell2.jobs.domain;

public class Mid extends Employee{

    public Mid(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception{
        super(name, address, phone, salaryPerMonth, paymentRate);
    }

    @Override
    public void pay() {
        totalPaid=paymentRate.pay(salaryPerMonth);
    }

    @Override
    public String toString() {
        return "Mid [name="+name+", address="+address+", phone="+phone+", salaryPerMonth="+salaryPerMonth+", totalP="+totalPaid+"]\n";
    }
}
