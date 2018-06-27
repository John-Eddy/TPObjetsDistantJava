package appliFraisServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class FraisImpl  extends UnicastRemoteObject implements Frais {
	private int id;
	private int idUtilisateur;
	private float montant;
	private String date;
	private String statut;
	
	public FraisImpl() throws RemoteException{
		// TODO Auto-generated constructor stub
		super();
	}

	public void setStatut(String statut) throws RemoteException {
		// TODO Auto-generated method stub
		this.statut = statut;
	}

	public void afficher() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.print("Date : " + this.date + ", montant : " + this.montant + ", status : " + this.statut + "\n");
	}

}
