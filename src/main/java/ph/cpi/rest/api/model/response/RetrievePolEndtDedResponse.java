package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.underwriting.Deductibles;

public class RetrievePolEndtDedResponse {
	private List<Deductibles> deductibles;

	public List<Deductibles> getDeductibles() {
		return deductibles;
	}

	public void setDeductibles(List<Deductibles> deductibles) {
		this.deductibles = deductibles;
	}

	@Override
	public String toString() {
		return "RetrievePolEndtDedResponse [deductibles=" + deductibles + "]";
	}
}
