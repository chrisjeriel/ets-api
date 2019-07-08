package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.underwriting.ExpGenInfo;

public class SaveExpGenInfoRequest {
	private List<ExpGenInfo> saveExpRenewable;

	public List<ExpGenInfo> getSaveExpRenewable() {
		return saveExpRenewable;
	}

	public void setSaveExpRenewable(List<ExpGenInfo> saveExpRenewable) {
		this.saveExpRenewable = saveExpRenewable;
	}

	@Override
	public String toString() {
		return "SaveExpGenInfoRequest [saveExpRenewable=" + saveExpRenewable + "]";
	}
}
