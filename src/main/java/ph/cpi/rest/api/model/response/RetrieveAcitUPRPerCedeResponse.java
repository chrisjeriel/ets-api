package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.accountingintrust.AcitUPRPerLine;
import ph.cpi.rest.api.model.accountingintrust.AcitUPRPerPolicy;

public class RetrieveAcitUPRPerCedeResponse {
	private List<AcitUPRPerLine> perLine;
	private List<AcitUPRPerPolicy> perPol;
	public List<AcitUPRPerLine> getPerLine() {
		return perLine;
	}
	public void setPerLine(List<AcitUPRPerLine> perLine) {
		this.perLine = perLine;
	}
	public List<AcitUPRPerPolicy> getPerPol() {
		return perPol;
	}
	public void setPerPol(List<AcitUPRPerPolicy> perPol) {
		this.perPol = perPol;
	}
	@Override
	public String toString() {
		return "RetrieveAcitUPRPerCedeResponse [perLine=" + perLine + ", perPol=" + perPol + "]";
	}
	
}
