package ph.cpi.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

	private final SimpMessagingTemplate template;
	
	@Autowired
	WebSocketController(SimpMessagingTemplate template) {
		this.template = template;
	}
	
	@MessageMapping("/send/logs")
	public void onReceiveLog(String message) {
		this.template.convertAndSend("/logs", message);
	}
	
	@MessageMapping("/send/chat")
	public void onReceiveChat(String message) {
		this.template.convertAndSend("/chat", message);
	}
	
	@MessageMapping("/send/alert")
	public void onReceiveAlert(String message) {
		this.template.convertAndSend("/alert", message);
	}
}
