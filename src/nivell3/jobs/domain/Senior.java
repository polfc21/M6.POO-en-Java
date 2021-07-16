package nivell3.jobs.domain;

import java.text.DecimalFormat;

public class Senior extends Employee {

    public Senior(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception{
        super(name, address, phone, salaryPerMonth, paymentRate);
    }

    @Override
    public void pay() {
        totalPaid=paymentRate.pay(salaryPerMonth);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.##");
        return "Sen [name="+name+", address="+address+", phone="+phone+
                ", salaryPerMonthBrut="+df.format(salaryPerMonth)+
                "€, salaryPerMonthNet="+df.format(totalPaid)+
                "€, salaryPerYearBrut="+df.format(salaryPerMonth*12)+
                "€, salaryPerYearNet="+df.format(totalPaid*12)+
                "€]\n";
    }
}
