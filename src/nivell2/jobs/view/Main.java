package nivell2.jobs.view;

import nivell2.jobs.application.JobsController;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		controller.createBossEmployee("Pepa Boss", "Dirección molona", "666666666", 10000.0);
		controller.createEmployeeSenior("Mariano Senior", "Dirección molona", "666666666", 3000.0);
		controller.createEmployeeMid("Pol Mid", "Dirección molona 2", "665266666", 2000.0);
		controller.createEmployeeJunior("Laura Junior", "Dirección molona 3", "625266666", 1000.0);
		controller.createVolunteer("Juanita Volunteer", "Dirección molona 4", "614266666", "No cobra!");
		controller.createManagerEmployee("Pedro Manager", "Dirección molona 2", "665226666", 4000.0);
		
		
		controller.payAllEmployeers();
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("EMPLOYEES:\n" + allEmployees + " \n");
		
	}

}
