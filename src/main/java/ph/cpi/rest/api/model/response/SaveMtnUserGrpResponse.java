package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.Response;

public class SaveMtnUserGrpResponse extends Response {

	private Integer returnCode;

	public Integer getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}

	@Override
	public String toString() {
		return "SaveMtnUserGrpResponse [returnCode=" + returnCode + ", getReturnCode()=" + getReturnCode()
				+ ", getMessageList()=" + getMessageList() + ", getErrorList()=" + getErrorList() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
