package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.Response;

public class SaveMtnUserResponse extends Response{
	
	private Integer returnCode;

	public Integer getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}

	@Override
	public String toString() {
		return "SaveMtnUserResponse [returnCode=" + returnCode + ", getMessageList()=" + getMessageList()
				+ ", getErrorList()=" + getErrorList() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
