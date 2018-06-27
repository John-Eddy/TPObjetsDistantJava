package appliFraisServer;

import java.util.ArrayList;
import java.util.Collection;
import java.rmi.*;


public interface Utilisateur extends Remote {
	void addFrais(Frais frais) throws RemoteException;
	Frais getFrais(int id) throws RemoteException;
	ArrayList<Frais> getAllFrais() throws RemoteException;
	void deleteFrais(int id) throws RemoteException;
	boolean isComptable() throws RemoteException;
	float getMontantTotal() throws RemoteException;

}
