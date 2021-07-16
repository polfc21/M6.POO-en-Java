package nivell2.jobs.domain;

public class Senior extends Employee{

    public Senior(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception{
        super(name, address, phone, salaryPerMonth, paymentRate);
    }

    @Override
    public void pay() {
        totalPaid=paymentRate.pay(salaryPerMonth);
    }

    @Override
    public String toString() {
        return "Sen [name="+name+", address="+address+", phone="+phone+", salaryPerMonth="+salaryPerMonth+", totalP="+totalPaid+"]\n";
    }
}
