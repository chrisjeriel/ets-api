package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcctServFeeDist {

	private Integer reqId;
	private Integer sfeeMm;
	private Integer sfeeYear;
	private Integer groupId;
	private String groupName;
	private Float groupShrPct;
	private String currCd;
	private Float currRt;
	private BigDecimal groupShrAmt;
	private BigDecimal localAmt;
	private BigDecimal totalSfee;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
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
	public Float getGroupShrPct() {
		return groupShrPct;
	}
	public void setGroupShrPct(Float groupShrPct) {
		this.groupShrPct = groupShrPct;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public Float getCurrRt() {
		return currRt;
	}
	public void setCurrRt(Float currRt) {
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
	@Override
	public String toString() {
		return "AcctServFeeDist [reqId=" + reqId + ", sfeeMm=" + sfeeMm + ", sfeeYear=" + sfeeYear + ", groupId="
				+ groupId + ", groupName=" + groupName + ", groupShrPct=" + groupShrPct + ", currCd=" + currCd
				+ ", currRt=" + currRt + ", groupShrAmt=" + groupShrAmt + ", localAmt=" + localAmt + ", totalSfee="
				+ totalSfee + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
