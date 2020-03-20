package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class DistPolWtreaty {
	private Integer treatyId;
	private String treatyAbbr;
	private String section;
	private String trtyCedId;
	private String trtyCedName;
	private BigDecimal pctShare;
	private BigDecimal siAmt;
	private BigDecimal premAmt;
	private BigDecimal commRt;
	private BigDecimal commAmt;
	private BigDecimal vatRiComm;
	private BigDecimal netDue;
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
	public BigDecimal getPctShare() {
		return pctShare;
	}
	public void setPctShare(BigDecimal pctShare) {
		this.pctShare = pctShare;
	}
	public BigDecimal getSiAmt() {
		return siAmt;
	}
	public void setSiAmt(BigDecimal siAmt) {
		this.siAmt = siAmt;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getCommRt() {
		return commRt;
	}
	public void setCommRt(BigDecimal commRt) {
		this.commRt = commRt;
	}
	public BigDecimal getCommAmt() {
		return commAmt;
	}
	public void setCommAmt(BigDecimal commAmt) {
		this.commAmt = commAmt;
	}
	public BigDecimal getVatRiComm() {
		return vatRiComm;
	}
	public void setVatRiComm(BigDecimal vatRiComm) {
		this.vatRiComm = vatRiComm;
	}
	public BigDecimal getNetDue() {
		return netDue;
	}
	public void setNetDue(BigDecimal netDue) {
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
