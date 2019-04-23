package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SavePolicyDetailsResponse {

	private Integer coInsStatus;
	private Integer returnCode;
	private Integer policyId;
	private String policyNo; 
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	
	public Integer getCoInsStatus() {
		return coInsStatus;
	}
	public void setCoInsStatus(Integer coInsStatus) {
		this.coInsStatus = coInsStatus;
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
	@Override
	public String toString() {
		return "SavePolicyDetailsResponse [coInsStatus=" + coInsStatus + ", returnCode=" + returnCode + ", policyId="
				+ policyId + ", policyNo=" + policyNo + ", errorList=" + errorList + ", messageList=" + messageList
				+ "]";
	}
}
