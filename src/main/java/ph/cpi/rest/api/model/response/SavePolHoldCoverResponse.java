package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SavePolHoldCoverResponse {
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	private Integer returnCode;
	private String polHoldCoverNo;
	private Integer polHoldCoverId;
	
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
	public String getPolHoldCoverNo() {
		return polHoldCoverNo;
	}
	public void setPolHoldCoverNo(String polHoldCoverNo) {
		this.polHoldCoverNo = polHoldCoverNo;
	}
	public Integer getPolHoldCoverId() {
		return polHoldCoverId;
	}
	public void setPolHoldCoverId(Integer polHoldCoverId) {
		this.polHoldCoverId = polHoldCoverId;
	}
	
	@Override
	public String toString() {
		return "SavePolHoldCoverResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", polHoldCoverNo=" + polHoldCoverNo + ", polHoldCoverId=" + polHoldCoverId + "]";
	}
}
