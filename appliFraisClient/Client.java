package appliFraisClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;



public class Client {
	private Client() {}
	public static void main(String[] args) {
		System.out.println("Lancement du client");

		try {  
			Remote r = Naming.lookup("rmi://127.0.0.1/AppliFrais/utilisateur");
			
			System.out.println(r);
			if (r instanceof UtilisateurImpl) {
				float montant = ((UtilisateurImpl) r).getMontantTotal();
			}
		
			
		} catch (MalformedURLException e) {
		      e.printStackTrace();
	    } catch (RemoteException e) {
	      e.printStackTrace();
	    } catch (NotBoundException e) {
	      e.printStackTrace();
	    }
		
		
		System.out.println("Fin du client");

	}
}
