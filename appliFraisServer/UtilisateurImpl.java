package appliFraisServer;

import java.rmi.RemoteException;
import java.rmi.server.RemoteObject;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collection;

public class UtilisateurImpl extends UnicastRemoteObject implements Utilisateur {

	private String nom;
	private String prenom;
	private ArrayList <FraisImpl> listeFraisImpl;
	
	public UtilisateurImpl()  throws RemoteException {
		// TODO Auto-geneated constructor stub
		super();
		this.nom = "";
		this.prenom = "";
		this.listeFraisImpl = new ArrayList <FraisImpl>();
	}

	public void addFrais(Frais frais) throws RemoteException {
		FraisImpl fraisImpl = new FraisImpl(frais.getMontant(), frais.getDescription(), frais.getDate());
		// TODO Auto-generated method stub
		this.listeFraisImpl.add(fraisImpl);
	}
	
	public FraisImpl getFrais(int index) throws RemoteException {
		// TODO Auto-generated method stub
		return this.listeFraisImpl.get(index);
	}
	

	public void deleteFrais(int index) throws RemoteException {
		// TODO Auto-generated method stub
		this.listeFraisImpl.remove(index);
	}

	public float getMontantTotal() throws RemoteException {
		// TODO Auto-generated method stub
		float total = 0;
		for(FraisImpl fraisImpl : this.listeFraisImpl) {
			total = total + fraisImpl.getMontant();
		}
		return total;
	}

	public String getNom()  throws RemoteException{
		return nom;
	}

	public void setNom(String nom)  throws RemoteException{
		this.nom = nom;
	}

	public String getPrenom()  throws RemoteException{
		return prenom;
	}

	public void setPrenom(String prenom)  throws RemoteException{
		this.prenom = prenom;
	}

	public ArrayList<FraisImpl> getListeFraisImpl()  throws RemoteException{
		return listeFraisImpl;
	}

	public void setListeFraisImpl ( ArrayList<FraisImpl>  listeFraisImpl)  throws RemoteException{
		this.listeFraisImpl = listeFraisImpl;
	}

	public String getAffichage() {
		String message = "Utilisateur  : \n";
		message = message +  "Prenom  : " + this.prenom + "\n";
		message = message + "Nom  : " + this.nom + "\n";
		message = message + "\nFrais : \n";
		
		for(FraisImpl fraisImpl : this.listeFraisImpl) {
			message = message + fraisImpl.getAffichage();
		}
		
		return message;
	}
}
