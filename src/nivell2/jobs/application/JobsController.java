package nivell2.jobs.application;

import nivell2.jobs.domain.*;
import nivell2.jobs.persistence.EmployeeRepository;

import java.util.List;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		if (salaryPerMonth < 8000) throw new Exception();
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}

	public void createEmployeeSenior(String name, String address, String phone, double salaryPerMonth) throws Exception{
		if (salaryPerMonth < 2700 || salaryPerMonth > 4000) throw new Exception();
		Senior senior = new Senior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployeeSenior());
		repository.addMember(senior);
	}

	public void createEmployeeMid(String name, String address, String phone, double salaryPerMonth) throws Exception{
		if (salaryPerMonth < 1800 || salaryPerMonth > 2500) throw new Exception();
		Mid mid = new Mid(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployeeMid());
		repository.addMember(mid);
	}

	public void createEmployeeJunior(String name, String address, String phone, double salaryPerMonth) throws Exception{
		if (salaryPerMonth < 900 || salaryPerMonth > 1600) throw new Exception();
		Junior junior = new Junior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployeeJunior());
		repository.addMember(junior);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		if (salaryPerMonth < 3000 || salaryPerMonth > 5000) throw new Exception();
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManagerEmployee());
		repository.addMember(manager);
	}


	public void payAllEmployeers() {
		List<AbsStaffMember> llistaEmpleats = repository.getAllMembers();
		for (int i = 0; i < llistaEmpleats.size(); i++){
			llistaEmpleats.get(i).pay();
		}
	}

	public String getAllEmployees() {
		String llistaEmpleatsString = "";
		List<AbsStaffMember> llistaEmpleats = repository.getAllMembers();
		for (int i = 0; i < llistaEmpleats.size(); i++){
			llistaEmpleatsString += llistaEmpleats.get(i).toString();
		}
		return llistaEmpleatsString;
	}

	public void createVolunteer(String name, String address, String phone, String descripcio) throws Exception{
		if (!descripcio.equals("No cobra!")) throw new Exception();
		Volunteer volunteer = new Volunteer(name, address, phone,  descripcio);
		repository.addMember(volunteer);
	}
	
	
	
}
