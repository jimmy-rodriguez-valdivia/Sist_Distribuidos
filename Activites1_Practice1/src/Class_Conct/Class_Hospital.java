package Class_Conct;

public class Class_Hospital
	private String direction;
	private String telephone;
	private String name;
	private String fax;

	public String getTelephone() {
		return telephone;
	}

	public String getName() {
		return name;
	}

	public String getFax() {
		return fax;
	}

	public Class_Hospital(String direction, String telephone, String name, String fax) {
		super();
		this.direction = direction;
		this.telephone = telephone;
		this.name = name;
		this.fax = fax;
	}

	@Override
	public void SetDirection() {
	}

	@Override
	public String GetDirection(String direction) {
		return direction;
	}

	@Override
	public void Telephone() {
	}

	@Override
	public String GetTelephone(String telephone) {
		return telephone;
	}

	@Override
	public void SetName() {
	}

	@Override
	public String GetName(String name) {
		return name;
	}

	@Override
	public void SetFax() {
	}

	@Override
	public String GetFax(String Fax) {
		return fax;
	}

}
