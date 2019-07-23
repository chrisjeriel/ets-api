package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveAcitArTransResponse {
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	private Integer returnCode;
	private Integer outTranId;
	
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
	public Integer getOutTranId() {
		return outTranId;
	}
	public void setOutTranId(Integer outTranId) {
		this.outTranId = outTranId;
	}
	
	@Override
	public String toString() {
		return "SaveAcitArTransResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", outTranId=" + outTranId + "]";
	}
}
