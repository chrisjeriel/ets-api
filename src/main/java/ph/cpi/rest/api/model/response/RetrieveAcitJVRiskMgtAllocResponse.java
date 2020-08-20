package ph.cpi.rest.api.model.response;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

import ph.cpi.rest.api.model.accountingintrust.RiskMgtAlloc;

public class RetrieveAcitJVRiskMgtAllocResponse {
	
	private List<RiskMgtAlloc> riskMgtAllocList;

	public List<RiskMgtAlloc> getRiskMgtAllocList() {
		return riskMgtAllocList;
	}
	public void setRiskMgtAllocList(List<RiskMgtAlloc> riskMgtAllocList) {
		this.riskMgtAllocList = riskMgtAllocList;
	}
	@Override
	public String toString() {
		return "RetrieveAcitJVRiskMgtAllocResponse [riskMgtAllocList=" + riskMgtAllocList + "]";
	}
}
