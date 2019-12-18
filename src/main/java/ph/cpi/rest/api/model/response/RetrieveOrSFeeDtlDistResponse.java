package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.accountingintrust.AcctServFeeDist;

public class RetrieveOrSFeeDtlDistResponse {
	private AcctServFeeDist servFeeDist;
	
	public AcctServFeeDist getServFeeDist() {
		return servFeeDist;
	}
	public void setServFeeDist(AcctServFeeDist servFeeDist) {
		this.servFeeDist = servFeeDist;
	}
	
	@Override
	public String toString() {
		return "RetrieveOrSFeeDtlDistResponse [servFeeDist=" + servFeeDist + "]";
	}
	
}
