package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.maintenance.PremPlan;

public class RetrieveMtnPremPlanResponse {
	private List<PremPlan> list;

	public List<PremPlan> getList() {
		return list;
	}

	public void setList(List<PremPlan> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "RetrieveMtnPremPlanResponse []";
	}
	
}
