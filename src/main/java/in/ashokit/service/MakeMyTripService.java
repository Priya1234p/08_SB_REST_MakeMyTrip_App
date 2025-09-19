package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;
import org.springframework.beans.factory.annotation.Value;

@Service
public class MakeMyTripService {
	
	@Value("${irctc.endpoint.book_ticket}")
	private String IRCTC_BOOK_TICKET_URL;
	
	@Value("${irctc.endpoint.get_ticket}")
	private String IRCTC_GET_TICKET_URL;
	
    public Ticket getTicketInfo(String ticketId) {
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> responseEntity = rt.getForEntity(IRCTC_GET_TICKET_URL, Ticket.class, ticketId);
		int status = responseEntity.getStatusCodeValue();
		
		if(status == 200) {
			Ticket ticket = responseEntity.getBody();
			return ticket;
		}
		
		return null;
		}
	
	public Ticket processTicketBooking(Passenger passenger) {
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> responseEntity = rt.postForEntity(IRCTC_BOOK_TICKET_URL, passenger, Ticket.class);
		int statusCode = responseEntity.getStatusCodeValue();
		
		if(statusCode == 201) {
			Ticket ticket = responseEntity.getBody();
			return ticket;
		}
		
		return null;
	}

}
