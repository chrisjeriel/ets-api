package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class ProcessRenewablePolicyResponse {

	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	private Integer returnCodeAI;
	private Integer returnCodeWC;
	private Integer returnCodeNR;
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
	
	public Integer getReturnCodeAI() {
		return returnCodeAI;
	}
	public void setReturnCodeAI(Integer returnCodeAI) {
		this.returnCodeAI = returnCodeAI;
	}
	
	public Integer getReturnCodeWC() {
		return returnCodeWC;
	}
	public void setReturnCodeWC(Integer returnCodeWC) {
		this.returnCodeWC = returnCodeWC;
	}
	public Integer getReturnCodeNR() {
		return returnCodeNR;
	}
	public void setReturnCodeNR(Integer returnCodeNR) {
		this.returnCodeNR = returnCodeNR;
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
		return "ProcessRenewablePolicyResponse [errorList=" + errorList + ", messageList=" + messageList
				+ ", returnCodeAI=" + returnCodeAI + ", returnCodeWC=" + returnCodeWC + ", returnCodeNR=" + returnCodeNR
				+ ", policyId=" + policyId + ", policyNo=" + policyNo + "]";
	}
	
}
