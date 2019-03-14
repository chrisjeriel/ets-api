package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveQuoteGeneralInfoOcResponse {

	private List<Error> errorList;
	private List<Message> messageList;
	private Integer returnCode;
	private Integer outQuoteIdOc;
	private String openQuotationNo;
	
	public Integer getQuoteIdOc() {
		return outQuoteIdOc;
	}
	public void setQuoteIdOc(Integer quoteIdOc) {
		this.outQuoteIdOc = quoteIdOc;
	}
	public String getOpenQuotationNo() {
		return openQuotationNo;
	}
	public void setOpenQuotationNo(String openQuotationNo) {
		this.openQuotationNo = openQuotationNo;
	}
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
	public Integer getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}
	
	@Override
	public String toString() {
		return "SaveQuoteGeneralInfoOcResponse [errorList=" + errorList + ", messageList=" + messageList
				+ ", returnCode=" + returnCode + ", outQuoteIdOc=" + outQuoteIdOc + ", openQuotationNo=" + openQuotationNo
				+ "]";
	}
	
}
