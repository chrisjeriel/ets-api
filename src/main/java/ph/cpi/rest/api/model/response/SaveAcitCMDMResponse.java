package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;
import ph.cpi.rest.api.model.accountingintrust.AcitCMDM;

public class SaveAcitCMDMResponse {
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	private Integer returnCode;
	private String paytReqNo;
	private List<AcitCMDM> cmdm;
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
	public List<AcitCMDM> getCmdm() {
		return cmdm;
	}
	public void setCmdm(List<AcitCMDM> cmdm) {
		this.cmdm = cmdm;
	}
	@Override
	public String toString() {
		return "SaveAcitCMDMResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", paytReqNo=" + paytReqNo + ", cmdm=" + cmdm + "]";
	}
}
