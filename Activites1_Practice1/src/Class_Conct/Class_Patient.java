package Class_Conct;

import Hospital_Interface.Patient;
import Hospital_Interface.Person_SuperInterface;

public class Class_Patient implements Patient{
	private String fullName;
	private String dni;
	private String direction;
	private String telephone;
	private String idPatient;
	
	public Class_Patient(String fullName, String dni, String direction, String telephone, String idPatient) {
		super();
		this.fullName = fullName;
		this.dni = dni;
		this.direction = direction;
		this.telephone = telephone;
		this.idPatient = idPatient;
	}

	@Override
	public void SetFullName() {
	}

	@Override
	public String GetFullName(String fullName) {
		return fullName;
	}

	@Override
	public void SetDNI() {
	}

	@Override
	public String GetDNI(String DNI) {
		return dni;
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
	public void SetIdPatient() {
	}

	@Override
	public String GetIdPatient(String idPatient) {
		return idPatient;
	}

	@Override
	public void SetCargo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String GetCargo() {
		// TODO Auto-generated method stub
		return null;
	}

}