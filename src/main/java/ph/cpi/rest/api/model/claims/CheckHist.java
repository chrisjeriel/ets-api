package ph.cpi.rest.api.model.claims;

public class CheckHist {
	private String distPolStat;
	private String withinLapse;
	private String withinPolTerm;
	private String hasUnpaidPrem;
	public String getDistPolStat() {
		return distPolStat;
	}
	public void setDistPolStat(String distPolStat) {
		this.distPolStat = distPolStat;
	}
	public String getWithinLapse() {
		return withinLapse;
	}
	public void setWithinLapse(String withinLapse) {
		this.withinLapse = withinLapse;
	}
	public String getWithinPolTerm() {
		return withinPolTerm;
	}
	public void setWithinPolTerm(String withinPolTerm) {
		this.withinPolTerm = withinPolTerm;
	}
	public String getHasUnpaidPrem() {
		return hasUnpaidPrem;
	}
	public void setHasUnpaidPrem(String hasUnpaidPrem) {
		this.hasUnpaidPrem = hasUnpaidPrem;
	}
	@Override
	public String toString() {
		return "CheckHist [distPolStat=" + distPolStat + ", withinLapse=" + withinLapse + ", withinPolTerm="
				+ withinPolTerm + ", hasUnpaidPrem=" + hasUnpaidPrem + "]";
	}
}
