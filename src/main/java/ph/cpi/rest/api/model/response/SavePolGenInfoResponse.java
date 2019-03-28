package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SavePolGenInfoResponse {

	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	private Integer returnCode;
	private Integer policyId;
	private String policyNo;
	
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
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	@Override
	public String toString() {
		return "SavePolGenInfoResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", policyId=" + policyId + ", policyNo=" + policyNo + "]";
	}
}
