package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.Response;

public class SaveTransactionsResponse extends Response {
	
	private Integer returnCode;

	public Integer getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}
	
	
}
