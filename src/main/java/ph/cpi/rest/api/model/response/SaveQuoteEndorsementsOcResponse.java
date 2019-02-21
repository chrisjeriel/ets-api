package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveQuoteEndorsementsOcResponse {
	private List<Error> errorList;
	private List<Message> messageList;
	private Integer returnCode;
	public List<Error> getErrorList() {
		return errorList;
	}
	public void setErrorList(List<Error> errorList) {
		this.errorList = errorList;
	}
	public List<Message> getMessageList() {
		return messageList;
	}
	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}
	public Integer getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SaveQuoteEndorsementsOcResponse [errorList=");
		builder.append(errorList);
		builder.append(", messageList=");
		builder.append(messageList);
		builder.append(", returnCode=");
		builder.append(returnCode);
		builder.append("]");
		return builder.toString();
	}
}
