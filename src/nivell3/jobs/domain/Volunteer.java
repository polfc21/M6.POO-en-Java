package nivell3.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	protected String descripcio;
	protected boolean ajutGovernamental;

	public Volunteer(String name, String address, String phone, String descripcio, boolean ajutGovernamental) throws Exception {
		super(name, address, phone);
		this.descripcio = descripcio;
		this.ajutGovernamental = ajutGovernamental;
	}

	@Override
	public String toString() {
		return "Vol [name="+name+", address="+address+", phone="+phone+", descripcio="+descripcio+", totalP="+totalPaid+
				"€, cobra ajut governamental="+ajutGovernamental+"]\n";
	}

	@Override
	public void pay() {
		if (ajutGovernamental) totalPaid = 300.0;
		else totalPaid = 0.0;
	}

	@Override
	public void payBonus() {	}
}
