package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveAcitJVEntryListResponse {
	
	private List<Error> errorList;
	private List<Message> messageList;
	private Integer returnCode;
	private Integer tranIdOut;
	private String tranIdStr;
	
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
	public String getTranIdStr() {
		return tranIdStr;
	}
	public void setTranIdStr(String tranIdStr) {
		this.tranIdStr = tranIdStr;
	}
	@Override
	public String toString() {
		return "SaveAcitJVEntryListResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", tranIdOut=" + tranIdOut + ", tranIdStr=" + tranIdStr + "]";
	}
}
