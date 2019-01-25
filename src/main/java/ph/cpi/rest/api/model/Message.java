package ph.cpi.rest.api.model;

public class Message {

	private String messageCode;
	private String message;
	
	public String getMessageCode() {
		return messageCode;
	}
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Message [messageCode=" + messageCode + ", message=" + message + "]";
	}
	
}
