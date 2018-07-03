package appliFraisServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class FraisImpl  extends UnicastRemoteObject implements Frais {
	private float montant;
	private String description;
	private String date;
	
	public FraisImpl() throws RemoteException{
		// TODO Auto-generated constructor stub
		super();
		this.montant = 0;
		this.description = "";
		this.date = "";
	}
	
	public FraisImpl(float montant, String description, String date) throws RemoteException{
		// TODO Auto-generated constructor stub
		super();
		this.montant = montant;
		this.description = description;
		this.date = date;
	}

	public String getAffichage() {
		// TODO Auto-generated method stub
		return "Date : " + this.date + ", description : " + this.description + ", montant : " + this.montant + "\n";
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public FraisImpl getFraisImpl() {
		// TODO Auto-generated method stub
		return this;
	}

}
