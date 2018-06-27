package appliFraisServer;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.UnknownHostException;
import java.rmi.registry.LocateRegistry;


public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws java.net.UnknownHostException {
	  try {
		  LocateRegistry.createRegistry(1099);
		    
		    UtilisateurImpl utilisateurImpl = new UtilisateurImpl();
		    FraisImpl fraisImpl				= new FraisImpl();
		    
		    String url = "rmi://127.0.0.1/AppliFrais/";
		    System.out.println("Enregistrement de l'objet avec l'url : " + url);
		    
		    Naming.rebind(url + "utilisateur", utilisateurImpl);
		    Naming.rebind(url + "frais", fraisImpl);
	
		    System.out.println("Serveur lancé");
		  } catch (RemoteException e) {
			  e.printStackTrace();
		  } catch (MalformedURLException e) {
			  e.printStackTrace();
		  } 
	}
}
