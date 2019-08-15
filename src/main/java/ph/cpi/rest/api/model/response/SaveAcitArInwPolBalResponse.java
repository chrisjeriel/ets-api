package ph.cpi.rest.api.model.response;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.Message;

public class SaveAcitArInwPolBalResponse {
	private List<Error> errorList = new ArrayList<Error>();
	private List<Message> messageList = new ArrayList<Message>();
	private Integer returnCode;
	private BigDecimal newPrem;
	private BigDecimal newRiComm;
	private BigDecimal newRiCommVat;
	private BigDecimal newCharges;
	private Integer custReturnCode;
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
	public BigDecimal getNewPrem() {
		return newPrem;
	}
	public void setNewPrem(BigDecimal newPrem) {
		this.newPrem = newPrem;
	}
	public BigDecimal getNewRiComm() {
		return newRiComm;
	}
	public void setNewRiComm(BigDecimal newRiComm) {
		this.newRiComm = newRiComm;
	}
	public BigDecimal getNewRiCommVat() {
		return newRiCommVat;
	}
	public void setNewRiCommVat(BigDecimal newRiCommVat) {
		this.newRiCommVat = newRiCommVat;
	}
	public BigDecimal getNewCharges() {
		return newCharges;
	}
	public void setNewCharges(BigDecimal newCharges) {
		this.newCharges = newCharges;
	}
	public Integer getCustReturnCode() {
		return custReturnCode;
	}
	public void setCustReturnCode(Integer custReturnCode) {
		this.custReturnCode = custReturnCode;
	}
	@Override
	public String toString() {
		return "SaveAcitArInwPolBalResponse [errorList=" + errorList + ", messageList=" + messageList + ", returnCode="
				+ returnCode + ", newPrem=" + newPrem + ", newRiComm=" + newRiComm + ", newRiCommVat=" + newRiCommVat
				+ ", newCharges=" + newCharges + ", custReturnCode=" + custReturnCode + "]";
	}
	
}
