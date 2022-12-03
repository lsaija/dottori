package it.prova.dottori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.dottori.model.Dottore;
import it.prova.dottori.service.DottoreService;

@SpringBootApplication
public class DottoriApplication implements CommandLineRunner {
	@Autowired
	private DottoreService dottoreService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DottoriApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		dottoreService.inserisciNuovo(new Dottore("gianluca","provola","GianlucaProvola1"));
		
		dottoreService.inserisciNuovo(new Dottore("Pippo","Baudo","PippoBaudo1"));
	}

}
