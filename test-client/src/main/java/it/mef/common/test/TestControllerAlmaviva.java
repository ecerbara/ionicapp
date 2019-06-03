package it.mef.common.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.mef.gestionemessaggi.client.MessaggisticaControllerApiClient;
import it.mef.gestionemessaggi.model.Response;

@RestController
@CrossOrigin("*")
public class TestControllerAlmaviva {

	
	@Autowired
	protected MessaggisticaControllerApiClient client;
	
	/**
	 * Gets the all aree.
	 *
	 * @return the all aree
	 */
	@RequestMapping(value = "/testclientalmaviva", method = RequestMethod.GET)
	public String testClient() {
		
		ResponseEntity<Response<String>> responseClient = client.readDettagliDelMessaggioUsingGET("error.calcolo.lordo", "IT");
		Response<String> body = responseClient.getBody();
		String result = body.getResult();
		return result;
	}
	
}
