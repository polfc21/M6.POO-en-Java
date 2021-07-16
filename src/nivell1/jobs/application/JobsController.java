package nivell1.jobs.application;

import nivell1.jobs.domain.AbsStaffMember;
import nivell1.jobs.domain.Employee;
import nivell1.jobs.domain.Volunteer;
import nivell1.jobs.persistence.EmployeeRepository;

import java.util.List;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
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
		Volunteer volunteer = new Volunteer(name, address, phone,  descripcio);
		repository.addMember(volunteer);
	}
	
	
	
}
