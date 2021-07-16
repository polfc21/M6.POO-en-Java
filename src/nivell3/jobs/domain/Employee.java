package nivell3.jobs.domain;

import java.text.DecimalFormat;

public class Employee extends AbsStaffMember {

	protected double salaryPerMonth;
	protected IPaymentRate paymentRate;

	public Employee(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate) throws Exception {
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
				
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
	}

	
	@Override
	public void pay() {
		totalPaid=paymentRate.pay(salaryPerMonth);
	}

	public void payBonus(){
		totalPaid*=1.10;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###.##");
		return "Emp [name="+name+", address="+address+", phone="+phone+
				", salaryPerMonthBrut="+df.format(salaryPerMonth)+
				"€, salaryPerMonthNet="+df.format(totalPaid)+
				"€, salaryPerYearBrut="+df.format(salaryPerMonth*12)+
				"€, salaryPerYearNet="+df.format(totalPaid*12)+
				"€]\n";
	}
}
