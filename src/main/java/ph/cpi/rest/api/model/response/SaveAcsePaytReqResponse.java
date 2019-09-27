package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveAcsePaytReqResponse {
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	private Integer returnCode;
	private String paytReqNo;
	private Integer reqIdOut;
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
	public String getPaytReqNo() {
		return paytReqNo;
	}
	public void setPaytReqNo(String paytReqNo) {
		this.paytReqNo = paytReqNo;
	}
	public Integer getReqIdOut() {
		return reqIdOut;
	}
	public void setReqIdOut(Integer reqIdOut) {
		this.reqIdOut = reqIdOut;
	}
	@Override
	public String toString() {
		return "SaveAcsePaytReqResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", paytReqNo=" + paytReqNo + ", reqIdOut=" + reqIdOut + "]";
	}
}
