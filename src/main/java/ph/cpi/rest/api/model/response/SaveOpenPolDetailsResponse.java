package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveOpenPolDetailsResponse {
	private Integer policyIdOc;
	private String openPolNo;
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	private Integer returnCode;
	
	public Integer getPolicyIdOc() {
		return policyIdOc;
	}
	public void setPolicyIdOc(Integer policyIdOc) {
		this.policyIdOc = policyIdOc;
	}
	public String getOpenPolNo() {
		return openPolNo;
	}
	public void setOpenPolNo(String openPolNo) {
		this.openPolNo = openPolNo;
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
	public Integer getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}
	
	@Override
	public String toString() {
		return "SaveOpenPolDetailsResponse [policyIdOc=" + policyIdOc + ", openPolNo=" + openPolNo + ", errorList="
				+ errorList + ", messageList=" + messageList + ", returnCode=" + returnCode + "]";
	}
}
