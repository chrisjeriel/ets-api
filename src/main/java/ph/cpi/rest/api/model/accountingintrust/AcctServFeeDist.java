package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcctServFeeDist {

	private Integer reqId;
	private Integer sfeeMm;
	private Integer sfeeYear;
	private Integer groupId;
	private String groupName;
	private Double groupShrPct;
	private String currCd;
	private Double currRt;
	private BigDecimal groupShrAmt;
	private BigDecimal localAmt;
	private BigDecimal totalSfee;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private String cedingId;
	private String cedingName;
	private Double actualShrPct;
	private BigDecimal actualShrAmt;
	private Double baseShrPct;
	private BigDecimal baseShrAmt;
	
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public Integer getSfeeMm() {
		return sfeeMm;
	}
	public void setSfeeMm(Integer sfeeMm) {
		this.sfeeMm = sfeeMm;
	}
	public Integer getSfeeYear() {
		return sfeeYear;
	}
	public void setSfeeYear(Integer sfeeYear) {
		this.sfeeYear = sfeeYear;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Double getGroupShrPct() {
		return groupShrPct;
	}
	public void setGroupShrPct(Double groupShrPct) {
		this.groupShrPct = groupShrPct;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public Double getCurrRt() {
		return currRt;
	}
	public void setCurrRt(Double currRt) {
		this.currRt = currRt;
	}
	public BigDecimal getGroupShrAmt() {
		return groupShrAmt;
	}
	public void setGroupShrAmt(BigDecimal groupShrAmt) {
		this.groupShrAmt = groupShrAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public BigDecimal getTotalSfee() {
		return totalSfee;
	}
	public void setTotalSfee(BigDecimal totalSfee) {
		this.totalSfee = totalSfee;
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
	public Double getActualShrPct() {
		return actualShrPct;
	}
	public void setActualShrPct(Double actualShrPct) {
		this.actualShrPct = actualShrPct;
	}
	public BigDecimal getActualShrAmt() {
		return actualShrAmt;
	}
	public void setActualShrAmt(BigDecimal actualShrAmt) {
		this.actualShrAmt = actualShrAmt;
	}
	public Double getBaseShrPct() {
		return baseShrPct;
	}
	public void setBaseShrPct(Double baseShrPct) {
		this.baseShrPct = baseShrPct;
	}
	public BigDecimal getBaseShrAmt() {
		return baseShrAmt;
	}
	public void setBaseShrAmt(BigDecimal baseShrAmt) {
		this.baseShrAmt = baseShrAmt;
	}
	@Override
	public String toString() {
		return "AcctServFeeDist [reqId=" + reqId + ", sfeeMm=" + sfeeMm + ", sfeeYear=" + sfeeYear + ", groupId="
				+ groupId + ", groupName=" + groupName + ", groupShrPct=" + groupShrPct + ", currCd=" + currCd
				+ ", currRt=" + currRt + ", groupShrAmt=" + groupShrAmt + ", localAmt=" + localAmt + ", totalSfee="
				+ totalSfee + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", cedingId=" + cedingId + ", cedingName=" + cedingName
				+ ", actualShrPct=" + actualShrPct + ", actualShrAmt=" + actualShrAmt + ", baseShrPct=" + baseShrPct
				+ ", baseShrAmt=" + baseShrAmt + "]";
	}
}
