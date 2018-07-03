package appliFraisClient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import appliFraisServer.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;




public class StartClient{
	
	public static void main(String[] args) {
		System.out.println("Lancement du client \n");
		
		Scanner sc = new Scanner(System.in);

		ArrayList<Utilisateur> utilisateurs = new ArrayList<Utilisateur>(); 
		
		try {  
			
			//Creation des utilisateurs
			
			Remote r = Naming.lookup("rmi://127.0.0.1/AppliFrais/utilisateur");
			System.out.println(((Utilisateur) r).getAffichage());

			System.out.println("Ajout d'un utilisateur");
			System.out.println("Prenom : ");
			((Utilisateur) r).setPrenom(sc.nextLine());
			System.out.println("Noms : ");
			((Utilisateur) r).setNom(sc.nextLine());
			
			Remote rFrais = Naming.lookup("rmi://127.0.0.1/AppliFrais/frais");

			
			System.out.println("Ajout des frais de l'utilisateur");

			int stop;
			
			do {
				System.out.println("Ajout d'un frais");
				System.out.println("Date : ");
				((Frais) rFrais).setDate(sc.nextLine());
				System.out.println("Description : ");
				((Frais) rFrais).setDescription(sc.nextLine());
				System.out.println("Montant : ");
				((Frais) rFrais).setMontant(sc.nextFloat());
				
				D.addFrais(((Frais) rFrais));
				
				System.out.println("\n Ajouter un autre frais (1:oui, 0:non)");
				stop = sc.nextInt();
			} while (stop != 0);
		
		
			utilisateurs.add((Utilisateur) r);
			
			for(Utilisateur utilisateur : utilisateurs) {
				System.out.println(((Utilisateur) r).getAffichage());
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
