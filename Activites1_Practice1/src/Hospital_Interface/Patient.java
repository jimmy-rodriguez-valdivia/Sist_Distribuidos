package Hospital_Interface;

public interface Patient extends Person_SuperInterface, Sanatorium_Servicos_SuperInterface {
	public void SetIdPatient();
	public String GetIdPatient(String idPatient);
}
