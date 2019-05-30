package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class ExtractExpiringPolicyResponse {

	private List<Error> errorList;
	private List<Message> messageList;
	private Integer returnCode;
	private Integer recordCount;
	
	public List<Error> getErrorList() {
		if (errorList == null) {
			errorList = new ArrayList<Error>();
		}
		return errorList;
	}
	
	public void setErrorList(List<Error> errorList) {
		this.errorList = errorList;
	}
	
	public List<Message> getMessageList() {
		if (messageList == null) {
			messageList = new ArrayList<Message>();
		}
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

	public Integer getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}

	@Override
	public String toString() {
		return "ExtractExpiringPolicyResponse [errorList=" + errorList + ", messageList=" + messageList
				+ ", returnCode=" + returnCode + ", recordCount=" + recordCount + "]";
	}
	
}
