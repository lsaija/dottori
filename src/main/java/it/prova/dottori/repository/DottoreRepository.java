package it.prova.dottori.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.prova.dottori.model.Dottore;

public interface DottoreRepository extends CrudRepository<Dottore, Long> {
	@Query("from Dottore d where d.codiceDottore = :codiceDottore")
	Dottore caricaDottoreFromCodiceDottore(String codiceDottore);

	@Query("select d from Dottore d where d.codFiscalePazienteAttualmenteInVisita=?1")
	Dottore findDottoreByCodFiscalePazienteAttualmenteInVisita(String codFiscalePazienteAttualmenteInVisitaInput);

}
