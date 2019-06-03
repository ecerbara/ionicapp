package it.mef.common.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin("*")
public class TestParseController {

	ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
	
	/**
	 * Gets the all aree.
	 *
	 * @return the all aree
	 */
	@RequestMapping(value = "/helloIonic", method = RequestMethod.GET)
	public Saluto testClient() {
		System.out.println("entrati con app");
	
		return new Saluto("nome", "ciao Ionic");
	}
	
	private class Saluto{
		private String nome;
		private String valore;
		
		public Saluto(String nome, String valore) {
			super();
			this.nome = nome;
			this.valore = valore;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getValore() {
			return valore;
		}

		public void setValore(String valore) {
			this.valore = valore;
		}
	}
}
