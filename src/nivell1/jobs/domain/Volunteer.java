package nivell1.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String descripcio;

	public Volunteer(String name, String address, String phone, String descripcio) throws Exception {
		super(name, address, phone);
		this.descripcio = descripcio;
	}

	@Override
	public String toString() {
		return "Vol [name="+name+", address="+address+", phone="+phone+", descripcio="+descripcio+", totalP="+totalPaid+"]\n";
	}

	@Override
	public void pay() {
		totalPaid = 0.0;
	}

}
