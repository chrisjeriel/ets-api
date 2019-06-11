package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;
import ph.cpi.rest.api.model.underwriting.PolicyAsIs;
import ph.cpi.rest.api.model.underwriting.PolicyNonRenewal;
import ph.cpi.rest.api.model.underwriting.PolicyWithChanges;

public class ProcessRenewablePolicyResponse {
	private List<PolicyAsIs> renAsIsPolicyList;
	private List<PolicyWithChanges> renWithChangesPolicyList;
	private List<PolicyNonRenewal> nonRenPolicyList;
	private List<Error> errorList;
	private List<Message> messageList;
	private Integer returnCode;
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

	public List<PolicyAsIs> getRenAsIsPolicyList() {
		if (renAsIsPolicyList == null) {
			renAsIsPolicyList = new ArrayList<PolicyAsIs>();
		}
		return renAsIsPolicyList;
	}
	public void setRenAsIsPolicyList(List<PolicyAsIs> renAsIsPolicyList) {
		this.renAsIsPolicyList = renAsIsPolicyList;
	}
	public List<PolicyWithChanges> getRenWithChangesPolicyList() {
		if (renWithChangesPolicyList == null) {
			renWithChangesPolicyList = new ArrayList<PolicyWithChanges>();
		}
		return renWithChangesPolicyList;
	}
	public void setRenWithChangesPolicyList(List<PolicyWithChanges> renWithChangesPolicyList) {
		this.renWithChangesPolicyList = renWithChangesPolicyList;
	}
	public List<PolicyNonRenewal> getNonRenPolicyList() {
		if (nonRenPolicyList == null) {
			nonRenPolicyList = new ArrayList<PolicyNonRenewal>();
		}
		return nonRenPolicyList;
	}
	public void setNonRenPolicyList(List<PolicyNonRenewal> nonRenPolicyList) {
		this.nonRenPolicyList = nonRenPolicyList;
	}
	
	
}
