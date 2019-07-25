package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;
import ph.cpi.rest.api.model.claims.UpdateClaim;

public class UpdateClaimStatusResponse {
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	private Integer returnCode;
	private List<UpdateClaim> updateResult = new ArrayList<UpdateClaim>();
	
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
	public List<UpdateClaim> getUpdateResult() {
		return updateResult;
	}
	public void setUpdateResult(List<UpdateClaim> updateResult) {
		this.updateResult = updateResult;
	}
	
	@Override
	public String toString() {
		return "UpdateClaimStatusResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", updateResult=" + updateResult + "]";
	}
}
