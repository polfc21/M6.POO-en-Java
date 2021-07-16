package nivell3.jobs.application;

import nivell3.jobs.domain.IPaymentRate;

public class PaymentFactory {

	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				salaryPerMonth -= salaryPerMonth*0.32;
				return salaryPerMonth;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployeeSenior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				salaryPerMonth -= salaryPerMonth*0.24;
				return salaryPerMonth;
			}
		};
	}

	public static IPaymentRate createPaymentRateEmployeeMid(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				salaryPerMonth -= salaryPerMonth*0.15;
				return salaryPerMonth;
			}
		};
	}

	public static IPaymentRate createPaymentRateEmployeeJunior(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				salaryPerMonth -= salaryPerMonth*0.02;
				return salaryPerMonth;
			}
		};
	}

	public static IPaymentRate createPaymentRateManagerEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				salaryPerMonth -= salaryPerMonth*0.26;
				return salaryPerMonth;
			}
		};
	}
}
