package in.ashokit.response;

import lombok.Data;

@Data
public class Ticket {
	
	private Integer ticketId;
	private String fromplace;
	private String to;
	private String ticketStatus;
	private String tktCost;
	private String trainNum;

}
