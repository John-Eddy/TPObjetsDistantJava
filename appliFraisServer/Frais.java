package appliFraisServer;
import java.rmi.*;

public interface Frais extends Remote{
	public String getAffichage() throws RemoteException;
	public void setMontant(float montant) throws RemoteException;
	public void setDate(String date) throws RemoteException;
	public void setDescription(String description) throws RemoteException;
	public float getMontant() throws RemoteException;
	public String getDescription() throws RemoteException;
	public String getDate() throws RemoteException;
	public FraisImpl getFraisImpl() throws RemoteException;
}
