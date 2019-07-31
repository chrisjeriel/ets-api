package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class CedingHist {
	private String membershipTag;
	private String treatyTag;
	private String activeTag;
	private String withdrawTag;
	private DateTime membershipDate;
	private DateTime inactiveDate;
	private DateTime withdrawDate;
	private String processedBy;
	private DateTime processedDate;
	public String getMembershipTag() {
		return membershipTag;
	}
	public void setMembershipTag(String membershipTag) {
		this.membershipTag = membershipTag;
	}
	public String getTreatyTag() {
		return treatyTag;
	}
	public void setTreatyTag(String treatyTag) {
		this.treatyTag = treatyTag;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getWithdrawTag() {
		return withdrawTag;
	}
	public void setWithdrawTag(String withdrawTag) {
		this.withdrawTag = withdrawTag;
	}
	public DateTime getMembershipDate() {
		return membershipDate;
	}
	public void setMembershipDate(DateTime membershipDate) {
		this.membershipDate = membershipDate;
	}
	public DateTime getInactiveDate() {
		return inactiveDate;
	}
	public void setInactiveDate(DateTime inactiveDate) {
		this.inactiveDate = inactiveDate;
	}
	public DateTime getWithdrawDate() {
		return withdrawDate;
	}
	public void setWithdrawDate(DateTime withdrawDate) {
		this.withdrawDate = withdrawDate;
	}
	public String getProcessedBy() {
		return processedBy;
	}
	public void setProcessedBy(String processedBy) {
		this.processedBy = processedBy;
	}
	public DateTime getProcessedDate() {
		return processedDate;
	}
	public void setProcessedDate(DateTime processedDate) {
		this.processedDate = processedDate;
	}
	@Override
	public String toString() {
		return "CedingHist [membershipTag=" + membershipTag + ", treatyTag=" + treatyTag + ", activeTag=" + activeTag
				+ ", withdrawTag=" + withdrawTag + ", membershipDate=" + membershipDate + ", inactiveDate="
				+ inactiveDate + ", withdrawDate=" + withdrawDate + ", processedBy=" + processedBy + ", processedDate="
				+ processedDate + "]";
	}	
}
