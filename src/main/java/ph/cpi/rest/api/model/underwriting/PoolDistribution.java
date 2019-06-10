package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class PoolDistribution {
	private Integer riskDistId;
	private Integer treatyId;
	private String section;
	private String treatyAbbr;
	private String trtyCedId;
	private String cedingId;
	private String cedingName;
	private Double retOneLines;
	private Double retOneTsiAmt;
	private Double retOnePremAmt;
	private Double retTwoLines;
	private Double retTwoTsiAmt;
	private Double retTwoPremAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getRiskDistId() {
		return riskDistId;
	}
	public void setRiskDistId(Integer riskDistId) {
		this.riskDistId = riskDistId;
	}
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getTreatyAbbr() {
		return treatyAbbr;
	}
	public void setTreatyAbbr(String treatyAbbr) {
		this.treatyAbbr = treatyAbbr;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public Double getRetOneLines() {
		return retOneLines;
	}
	public void setRetOneLines(Double retOneLines) {
		this.retOneLines = retOneLines;
	}
	public Double getRetOneTsiAmt() {
		return retOneTsiAmt;
	}
	public void setRetOneTsiAmt(Double retOneTsiAmt) {
		this.retOneTsiAmt = retOneTsiAmt;
	}
	public Double getRetOnePremAmt() {
		return retOnePremAmt;
	}
	public void setRetOnePremAmt(Double retOnePremAmt) {
		this.retOnePremAmt = retOnePremAmt;
	}
	public Double getRetTwoLines() {
		return retTwoLines;
	}
	public void setRetTwoLines(Double retTwoLines) {
		this.retTwoLines = retTwoLines;
	}
	public Double getRetTwoTsiAmt() {
		return retTwoTsiAmt;
	}
	public void setRetTwoTsiAmt(Double retTwoTsiAmt) {
		this.retTwoTsiAmt = retTwoTsiAmt;
	}
	public Double getRetTwoPremAmt() {
		return retTwoPremAmt;
	}
	public void setRetTwoPremAmt(Double retTwoPremAmt) {
		this.retTwoPremAmt = retTwoPremAmt;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "PoolDistribution [riskDistId=" + riskDistId + ", treatyId=" + treatyId + ", section=" + section
				+ ", treatyAbbr=" + treatyAbbr + ", trtyCedId=" + trtyCedId + ", cedingId=" + cedingId + ", cedingName="
				+ cedingName + ", retOneLines=" + retOneLines + ", retOneTsiAmt=" + retOneTsiAmt + ", retOnePremAmt="
				+ retOnePremAmt + ", retTwoLines=" + retTwoLines + ", retTwoTsiAmt=" + retTwoTsiAmt + ", retTwoPremAmt="
				+ retTwoPremAmt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}
