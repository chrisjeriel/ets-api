package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;
import ph.cpi.rest.api.model.underwriting.DistCoIns;

public class NegateDistributionResponse {
	private List<Error> errorList;
	private List<Message> messageList;
	private List<DistCoIns> postedDist;
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
	public List<DistCoIns> getPostedDist() {
		return postedDist;
	}
	public void setPostedDist(List<DistCoIns> postedDist) {
		this.postedDist = postedDist;
	}
	@Override
	public String toString() {
		return "NegateDistributionResponse [errorList=" + errorList + ", messageList=" + messageList + ", postedDist="
				+ postedDist + ", returnCode=" + returnCode + "]";
	}
	
	
}
