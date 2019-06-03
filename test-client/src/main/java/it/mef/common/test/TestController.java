package it.mef.common.test;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.mef.common.documentale.client.DocumentaleDocumentoClientImpl;
import it.mef.common.documentale.client.DocumentaleFolderClientImpl;
import it.mef.common.documentale.client.DocumentaleTypeClientImpl;
import it.mef.common.documentale.client.exception.DocumentaleException;
import it.mef.common.documentale.model.SearchCriteria;
import it.mef.common.documentale.model.response.DocumentsResponse;

@RestController
@CrossOrigin("*")
public class TestController {
//	@Autowired
//	NotificheServiceClient client;
//	
//	@Autowired
//	protected AmministrazioniControllerApiClient amministrazioniControllerApiClient;
//	
////	@Autowired
////	protected CittadinanzeControllerApiClient cittadinanzeControllerApiClient;
////	
//	@Autowired
//	protected CreateMessageControllerApiClient createMessageControllerApiClient;
//	
//	@Autowired
//	protected MessaggisticaControllerApiClient messaggisticaControllerApiClient;
//	
//	@Autowired
//	protected StatoMatricolareControllerApiClient statoMatricolareControllerApiClient;
	
//	@Autowired
//	protected RecuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataApiClient recuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataApiClient;
//	
	ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
	
	/**
	 * Gets the all aree.
	 *
	 * @return the all aree
	 */
	@RequestMapping(value = "/testclient", method = RequestMethod.GET)
	public String testClient() {
		
//		ResponseEntity<Response<TipoMessaggioResponse>> b = client.getTypeByDescr("MAIL_BASE");
//		System.out.println(b.getBody().getResult());
//		 TipoMessaggioResponse response = (TipoMessaggioResponse) b.getBody().getResult();
//		 return response;
//		System.out.println(response);
//		ResponseEntity<Response> a = client.sendMessage(new SendMessageModel());
//		System.out.println(a.getBody());
//		CreateMessageModel model = new CreateMessageModel();
//		model.setIdUser("Emiliano");
//		model.setUsername("USERNTA");
//		//model.setIdMessageType(2120L);
//		model.setDescriptionTypeMessage("WEB_INOLTRO_ISTANZA_SM");
//		//model.setRoleId("28");
//		ResponseEntity<Response<Long>> message = createMessageControllerApiClient.createmessage(model);
//		message.getStatusCode();
//		List<String> mail = new ArrayList<>();
//		mail.add("emiliano.cerbara@dxc.com");
//		SendMessageModel sendMail = new SendMessageModel();
//		sendMail.setMailAddress(mail);
//		sendMail.setUsername("Emiliano");
//		sendMail.setIdUser("Emiliano");
//		sendMail.setIdMessageType(1740L);
//		ResponseEntity<Response<Long>> message1 = createMessageControllerApiClient.sendMailCCAllegati(sendMail);
//		message1.getBody();
////		
//		ResponseEntity<List<DAmministrazioni>> a = amministrazioniControllerApiClient.findAllAmministrazioniUsingGET();
//		a.getBody();
////		ResponseEntity<List<DCittadinanze>> citt = cittadinanzeControllerApiClient.findAllUsingGET();
////		citt.getBody();
//		 ResponseEntity<it.mef.gestionemessaggi.model.Response<String>> res = messaggisticaControllerApiClient.readDettagliDelMessaggioUsingGET("E9090", "it");
//		 String messaggio = res.getBody().getResult();
//		 System.out.println(messaggio);
		
//		ResponseEntity<it.mef.gestionemessaggi.model.Response> readUsingGET = messaggisticaControllerApiClient.readUsingGET("SWE", "it");
//	    
//		
//		Object result = readUsingGET.getBody().getResult();
//		
//		ResponseEntity<it.mef.gestionemessaggi.model.Response<String>> readDett = messaggisticaControllerApiClient.readDettagliDelMessaggioUsingGET("I0001", "it");
//		
//		Object result2 = readDett.getBody().getResult();
//		
//		return readUsingGET.getBody().getMessage();
		
//		SearchCriteria criteria = new SearchCriteria();
//		HashMap<String, Object> params = new HashMap<String, Object>();
//		params.put("nome_tipo", "GENERIC");
//		HashMap<String, Object> paramsPropEstese = new HashMap<String, Object>();
//
//		String idIstanza = "747";
//		paramsPropEstese.put("idIstanza", String.valueOf(idIstanza ));
//		params.put("proprietaEstese", paramsPropEstese);
//
//		criteria.setParams(params);
////		String username = SecurityUtils.getUserName();
//		DocumentaleDocumentoClientImpl client = new DocumentaleDocumentoClientImpl("http://localhost:8080/documentale-ms/"); 
//		try {
//			DocumentsResponse documents = client.getDocuments("aaa", "/SHARED_ALL");
//		} catch (DocumentaleException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			DocumentsResponse documentsResponse = client.searchDocuments("testClient", criteria);
//			documentsResponse.getMessage();
//		} catch (DocumentaleException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}// getDocuments(this.getUsername(),"/SHARED_ALL");
		
//		StatoMatricolareRequestDTO request = new StatoMatricolareRequestDTO();
//		
//		request.setIdAmministrato("wwL1msYm_char_43_o0_char_61_");
//		request.setIdAmministrazione("wwL1msYm_char_43_o0_char_61_");
//		//request.setAllaData();
//		
//		Date dt = new Date();
//		
//		ResponseEntity<Strutture> struttureUsingPOST = statoMatricolareControllerApiClient.getStruttureUsingPOST(request);
//		Strutture body = struttureUsingPOST.getBody();
//		ResponseEntity<it.mef.gestionemessaggi.model.Response> readUsingGET = messaggisticaControllerApiClient.readUsingGET("SWE", "IT");
//		readUsingGET.getBody();
//		
//		ResponseEntity<it.mef.gestionemessaggi.model.Response<String>> readDettagliDelMessaggioUsingGET = messaggisticaControllerApiClient.readDettagliDelMessaggioUsingGET("tooltipMensLordo2", "it");
//		readDettagliDelMessaggioUsingGET.getBody();
//		
//		RecuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataRequest request = new RecuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataRequest();
//		
//		request.setFkAmmtoAmmne("qZjTXemToDM_char_61_");
//		request.dataRiferimento("2018-03-14");
//		
//		ResponseEntity<RecuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataResponse> response = recuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataApiClient.recuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataUsingPOST(request);
//		
//		response.getBody();
//		RecuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataRequest req = new RecuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataRequest();
//		
//		req.setFkAmmtoAmmne("au3_char_47_rLxxUng_char_61_");
//		req.setDataRiferimento("2018-03-14");
//		
//		ResponseEntity<RecuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataResponse> recuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataUsingPOST = recuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataApiClient.recuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataUsingPOST(req);
//		recuperaContrattiIndividualiComandatiInDaFkAmmtoAmmeEDataUsingPOST.getBody();
//		DocumentaleDocumentoClientImpl client = new DocumentaleDocumentoClientImpl("http://localhost:8080/documentale-ms/");
//		try {
//			DocumentsResponse documents = client.getDocuments("aaa", "/SHARED_ALL");
//		} catch (DocumentaleException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		DocumentaleTypeClientImpl client = new DocumentaleTypeClientImpl("http://localhost:8080/documentale-ms/");
		client.deleteDocumentType("test", "TEST_DEL_TIPO_1");
		
		
		
		return null;
	}
	
//	@RequestMapping(value = "/testdownloaddocumentale", method = RequestMethod.GET)
//	public ContentResponse downloadDocument() {
//		
//		DocumentaleDocumentoClientImpl client = new DocumentaleDocumentoClientImpl("http://192.168.200.102:10050/documentale-ms/");
//		ContentResponse b=null;
//		try {
//			b = client.downloadDocument("5b3b6e6efe64fd108a7d6c8a", "ciao", false);
//		} catch (DocumentaleException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(b.getMessage());
//		return b;
////		System.out.println(response);
////		ResponseEntity<Response> a = client.sendMessage(new SendMessageModel());
////		System.out.println(a.getBody());
//	}
//	
//	@RequestMapping(value = "/testNaturaVoci", method = RequestMethod.GET)
//	public ResponseEntity<BasicRoot> findAllNaturaVociUsingGET() {
//		
//		//ResponseEntity<List<DNaturaVoci>> b = client.findAllNaturaVociUsingGET();
//		//System.out.println(b.getBody());
////		ResponseEntity<BasicRoot> res = client.calcoloVociRetribuzioni(new CalcoloVociFormuleRequest()); 
//		return null;
//	}
	
}
