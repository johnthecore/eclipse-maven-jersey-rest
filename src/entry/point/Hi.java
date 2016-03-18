package entry.point;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Message;

@Path("hi")
public class Hi {
	
	@GET
	@Path("/get.json")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Message> getMessagesAsJSON() {
		
		ArrayList<Message> messages = new ArrayList();
		
		Message msg = new Message();
		msg.content = "Hello";
		messages.add(msg);
		
		msg = new Message();
		msg.content = "Hello again";
		messages.add(msg);
		
		return messages;
	}
	
	@GET
	@Path("/get.xml")
	@Produces(MediaType.APPLICATION_XML)
	// public ArrayList<Message> getMessagesAsXML() {
	public ArrayList<Message> getMessagesAsXML() {
		
		ArrayList<Message> messages = new ArrayList();
		
		Message msg = new Message();
		msg.content = "Hello";
		messages.add(msg);
		
		msg = new Message();
		msg.content = "Hello again";
		messages.add(msg);
		
		return messages;
	}
	
}
