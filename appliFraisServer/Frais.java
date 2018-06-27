package appliFraisServer;
import java.rmi.*;

public interface Frais extends Remote{
	void setStatut(String statut)throws RemoteException ;
	void afficher() throws RemoteException;
}
