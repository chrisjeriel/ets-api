package ph.cpi.rest.api.model.workflow;

public class DashboardTran {

	private String tranTitle;
	private String tranText;
	private Integer tranCount;
	
	public String getTranTitle() {
		return tranTitle;
	}
	public void setTranTitle(String tranTitle) {
		this.tranTitle = tranTitle;
	}
	public String getTranText() {
		return tranText;
	}
	public void setTranText(String tranText) {
		this.tranText = tranText;
	}
	public Integer getTranCount() {
		return tranCount;
	}
	public void setTranCount(Integer tranCount) {
		this.tranCount = tranCount;
	}
	
	@Override
	public String toString() {
		return "DashboardTran [tranTitle=" + tranTitle + ", tranText=" + tranText + ", tranCount=" + tranCount + "]";
	}
}
