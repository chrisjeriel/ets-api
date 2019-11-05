package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;
import ph.cpi.rest.api.model.underwriting.BatchDistribution;

public class BatchDistributionResponse {
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	private Integer returnCode;
	private List<BatchDistribution> updateResult = new ArrayList<BatchDistribution>();
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
	public List<BatchDistribution> getUpdateResult() {
		return updateResult;
	}
	public void setUpdateResult(List<BatchDistribution> updateResult) {
		this.updateResult = updateResult;
	}
	@Override
	public String toString() {
		return "BatchDistributionResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", updateResult=" + updateResult + "]";
	}
	
	
}
