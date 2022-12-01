package it.prova.dottori.dto;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;

import it.prova.dottori.model.Dottore;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DottoreDTO {
	private Long id;
	private String nome;
	private String cognome;
	@NotBlank(message = "{codiceFiscale.notblank}")
	private String codiceDottore;
	private String codFiscalePazienteAttualmenteInVisita;
	private boolean inVisita;
	private boolean inServizio;

	public DottoreDTO() {
		// TODO Auto-generated constructor stub
	}

	public DottoreDTO(@NotBlank(message = "{codiceFiscale.notblank}") String codiceDottore) {
		super();
		this.codiceDottore = codiceDottore;
	}

	public DottoreDTO(Long id, String nome, String cognome,
			@NotBlank(message = "{codiceFiscale.notblank}") String codiceDottore,
			String codFiscalePazienteAttualmenteInVisita, boolean inVisita, boolean inServizio) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.codiceDottore = codiceDottore;
		this.codFiscalePazienteAttualmenteInVisita = codFiscalePazienteAttualmenteInVisita;
		this.inVisita = inVisita;
		this.inServizio = inServizio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
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

	public boolean isInVisita() {
		return inVisita;
	}

	public void setInVisita(boolean inVisita) {
		this.inVisita = inVisita;
	}

	public boolean isInServizio() {
		return inServizio;
	}

	public void setInServizio(boolean inServizio) {
		this.inServizio = inServizio;
	}
	
	public Dottore buildPazienteModel() {
		Dottore result = new Dottore(this.id, this.nome, this.cognome, this.codiceDottore, this.codFiscalePazienteAttualmenteInVisita,
				this.inVisita, this.inServizio);
		return result;
	}

	public static DottoreDTO buildDottoreDTOFromModel(Dottore dottoreModel) {
		DottoreDTO result = new DottoreDTO(dottoreModel.getId(), dottoreModel.getNome(), dottoreModel.getCognome(),
				dottoreModel.getCodiceDottore(), dottoreModel.getCodFiscalePazienteAttualmenteInVisita(),
				dottoreModel.isInVisita(), dottoreModel.isInServizio());

		return result;
	}

	public static List<DottoreDTO> createDottoreDTOListFromModelList(List<Dottore> modelListInput) {
		return modelListInput.stream().map(dottoreEntity -> {
			return DottoreDTO.buildDottoreDTOFromModel(dottoreEntity);
		}).collect(Collectors.toList());
	}

	public static Set<DottoreDTO> createDottoreDTOSetFromModelSet(Set<Dottore> modelListInput) {
		return modelListInput.stream().map(dottoreEntity -> {
			return DottoreDTO.buildDottoreDTOFromModel(dottoreEntity);
		}).collect(Collectors.toSet());
	}
}
