package it.prova.dottori.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.prova.dottori.model.Dottore;
import it.prova.dottori.repository.DottoreRepository;

@Service
@Transactional
public class DottoreServiceImpl implements DottoreService {

	@Autowired
	private DottoreRepository repository;

	@Override
	public List<Dottore> listAllElements() {
		return (List<Dottore>) repository.findAll();
	}

	@Override
	public Dottore caricaSingoloElemento(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Dottore aggiorna(Dottore dottoreInstance) {
		return repository.save(dottoreInstance);
	}

	@Override
	public Dottore inserisciNuovo(Dottore dottoreInstance) {
		return repository.save(dottoreInstance);
	}

	@Override
	public void rimuovi(Long idToRemove) {
		repository.deleteById(idToRemove);
	}

	@Override
	public Dottore findByCodFiscalePazienteAttualmenteInVisita(String codFiscalePazienteAttualmenteInVisitaInstance) {
		return repository
				.findDottoreByCodFiscalePazienteAttualmenteInVisita(codFiscalePazienteAttualmenteInVisitaInstance);
	}

	@Override
	public Dottore findByCodiceDottore(String codiceDottoreInstance) {
		return repository.findByCodiceDottore(codiceDottoreInstance);

	}

}
