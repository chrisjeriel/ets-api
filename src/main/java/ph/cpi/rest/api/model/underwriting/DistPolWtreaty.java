package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class DistPolWtreaty {
	private Integer treatyId;
	private String treatyAbbr;
	private String section;
	private String trtyCedId;
	private String trtyCedName;
	private Double pctShare;
	private Double siAmt;
	private Double premAmt;
	private Double commRt;
	private Double commAmt;
	private Double vatRiComm;
	private Double netDue;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String retLayer;
	
	
	public String getRetLayer() {
		return retLayer;
	}
	public void setRetLayer(String retLayer) {
		this.retLayer = retLayer;
	}
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTreatyAbbr() {
		return treatyAbbr;
	}
	public void setTreatyAbbr(String treatyAbbr) {
		this.treatyAbbr = treatyAbbr;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getTrtyCedName() {
		return trtyCedName;
	}
	public void setTrtyCedName(String trtyCedName) {
		this.trtyCedName = trtyCedName;
	}
	public Double getPctShare() {
		return pctShare;
	}
	public void setPctShare(Double pctShare) {
		this.pctShare = pctShare;
	}
	public Double getSiAmt() {
		return siAmt;
	}
	public void setSiAmt(Double siAmt) {
		this.siAmt = siAmt;
	}
	public Double getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(Double premAmt) {
		this.premAmt = premAmt;
	}
	public Double getCommRt() {
		return commRt;
	}
	public void setCommRt(Double commRt) {
		this.commRt = commRt;
	}
	public Double getCommAmt() {
		return commAmt;
	}
	public void setCommAmt(Double commAmt) {
		this.commAmt = commAmt;
	}
	public Double getVatRiComm() {
		return vatRiComm;
	}
	public void setVatRiComm(Double vatRiComm) {
		this.vatRiComm = vatRiComm;
	}
	public Double getNetDue() {
		return netDue;
	}
	public void setNetDue(Double netDue) {
		this.netDue = netDue;
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
		return "DistPolWtreaty [treatyId=" + treatyId + ", treatyAbbr=" + treatyAbbr + ", section=" + section
				+ ", trtyCedId=" + trtyCedId + ", trtyCedName=" + trtyCedName + ", pctShare=" + pctShare + ", siAmt="
				+ siAmt + ", premAmt=" + premAmt + ", commRt=" + commRt + ", commAmt=" + commAmt + ", vatRiComm="
				+ vatRiComm + ", netDue=" + netDue + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", retLayer=" + retLayer + "]";
	}
}
