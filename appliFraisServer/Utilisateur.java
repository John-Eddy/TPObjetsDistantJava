package appliFraisServer;

import java.util.ArrayList;
import java.util.Collection;
import java.rmi.*;


public interface Utilisateur extends Remote {
	void addFrais(Frais frais) throws RemoteException;
	FraisImpl getFrais(int index) throws RemoteException;
	void deleteFrais(int index) throws RemoteException;
	float getMontantTotal() throws RemoteException;
	
	public String getNom() throws RemoteException;
	public void setNom(String nom) throws RemoteException;
	public String getPrenom() throws RemoteException;
	public void setPrenom(String prenom) throws RemoteException;
	public ArrayList<FraisImpl> getListeFraisImpl() throws RemoteException;
	public void setListeFraisImpl( ArrayList<FraisImpl>  listeFraisImpl) throws RemoteException;
	public String getAffichage() throws RemoteException;

}
