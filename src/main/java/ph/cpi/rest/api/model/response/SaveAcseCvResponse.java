package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveAcseCvResponse {
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	private Integer returnCode;
	private Integer tranIdOut;
	private Integer cvNoOut;
	private Integer mainTranIdOut;
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
	public Integer getTranIdOut() {
		return tranIdOut;
	}
	public void setTranIdOut(Integer tranIdOut) {
		this.tranIdOut = tranIdOut;
	}
	public Integer getCvNoOut() {
		return cvNoOut;
	}
	public void setCvNoOut(Integer cvNoOut) {
		this.cvNoOut = cvNoOut;
	}
	public Integer getMainTranIdOut() {
		return mainTranIdOut;
	}
	public void setMainTranIdOut(Integer mainTranIdOut) {
		this.mainTranIdOut = mainTranIdOut;
	}
	@Override
	public String toString() {
		return "SaveAcseCvResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", tranIdOut=" + tranIdOut + ", cvNoOut=" + cvNoOut + ", mainTranIdOut=" + mainTranIdOut
				+ "]";
	}
}
