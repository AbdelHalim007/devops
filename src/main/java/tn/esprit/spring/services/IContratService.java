package tn.esprit.spring.services;

import tn.esprit.spring.entities.Contrat;

public interface IContratService {

	public int ajouterContrat(Contrat contrat);
	//public void affecterContratAEmploye(int contratId, int employeId);
	public void deleteContratById(int contratId);
}
