package it.prova.dottori.dto;

import it.prova.dottori.model.Dottore;

public class DottorePazienteDTO {
	private String codiceDottore;
	private String codFiscalePazienteAttualmenteInVisita;

	public DottorePazienteDTO() {
		// TODO Auto-generated constructor stub
	}

	public DottorePazienteDTO(String codiceDottore, String codFiscalePazienteAttualmenteInVisita) {
		super();
		this.codiceDottore = codiceDottore;
		this.codFiscalePazienteAttualmenteInVisita = codFiscalePazienteAttualmenteInVisita;
	}

	public String getCodiceDottore() {
		return codiceDottore;
	}

	public void setCodiceDottore(String codiceDottore) {
		this.codiceDottore = codiceDottore;
	}

	public String getCodFiscalePazienteAttualmenteInVisita() {
		return codFiscalePazienteAttualmenteInVisita;
	}

	public void setCodFiscalePazienteAttualmenteInVisita(String codFiscalePazienteAttualmenteInVisita) {
		this.codFiscalePazienteAttualmenteInVisita = codFiscalePazienteAttualmenteInVisita;
	}

	public static DottorePazienteDTO buildDottoreDTOFromModel(Dottore dottoreModel) {
		DottorePazienteDTO result = new DottorePazienteDTO(dottoreModel.getCodiceDottore(),
				dottoreModel.getCodFiscalePazienteAttualmenteInVisita());
		return result;
	}

}
