package it.prova.dottori.service;

import java.util.List;

import it.prova.dottori.model.Dottore;

public interface DottoreService {
	List<Dottore> listAllElements();

	Dottore caricaSingoloElemento(Long id);

	Dottore aggiorna(Dottore dottoreInstance);

	Dottore inserisciNuovo(Dottore dottoreInstance);

	void rimuovi(Long idToRemove);

	Dottore findByCodFiscalePazienteAttualmenteInVisita(String codFiscalePazienteAttualmenteInVisitaInstance);

	Dottore findByCodiceDottore(String codiceDottoreInstance);

}