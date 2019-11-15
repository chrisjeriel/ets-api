package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class ExtractReportResponse {


	private Integer returnCode;
	private Map<String, Object> params = new HashMap<String, Object>();
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	
	
	public Integer getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
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
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	@Override
	public String toString() {
		return "ExtractReportResponse [returnCode=" + returnCode + ", params=" + params + ", errorList=" + errorList
				+ ", messageList=" + messageList + "]";
	}
	
}
