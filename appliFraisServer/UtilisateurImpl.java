package appliFraisServer;

import java.rmi.RemoteException;
import java.rmi.server.RemoteObject;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collection;

public class UtilisateurImpl extends UnicastRemoteObject implements Utilisateur {

	private int id;
	private String nom;
	private String prenom;
	private boolean isComptable; 
	private ArrayList <FraisImpl> listeFraisImpl;
	
	public UtilisateurImpl()  throws RemoteException {
		// TODO Auto-geneated constructor stub
		super();
	}

	public void addFrais(FraisImpl FraisImpl) throws RemoteException {
		// TODO Auto-generated method stub

	}

	public FraisImpl getFrais(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ArrayList<Frais> getAllFrais() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteFrais(int id) throws RemoteException {
		// TODO Auto-generated method stub

	}

	public boolean isComptable() throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	public float getMontantTotal() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addFrais(Frais frais) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
