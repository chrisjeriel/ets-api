package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcitJVPremResRelRequest {
	private Integer tranType;
	private Integer tranId;
	private List<premResRel> savePremResRel;
	private List<premResRel> deletePremResRel;
	
	public Integer getTranType() {
		return tranType;
	}
	public void setTranType(Integer tranType) {
		this.tranType = tranType;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public List<premResRel> getSavePremResRel() {
		return savePremResRel;
	}
	public void setSavePremResRel(List<premResRel> savePremResRel) {
		this.savePremResRel = savePremResRel;
	}
	public List<premResRel> getDeletePremResRel() {
		return deletePremResRel;
	}
	public void setDeletePremResRel(List<premResRel> deletePremResRel) {
		this.deletePremResRel = deletePremResRel;
	}
	@Override
	public String toString() {
		return "SaveAcitJVPremResRelRequest [tranType=" + tranType + ", tranId=" + tranId + ", savePremResRel="
				+ savePremResRel + ", deletePremResRel=" + deletePremResRel + "]";
	}
}


@Alias ("ACITPremResRel")
class premResRel {
	private Integer tranId;
	private String cedingId;
	private Integer itemNo;
	private String quarterEnding;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal interestAmt;
	private BigDecimal whtaxAmt;
	private BigDecimal releaseAmt;
	private BigDecimal localAmt;
	private BigDecimal premResQuota;
	private BigDecimal premRes1surplus;
	private BigDecimal premRes2surplus;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private BigDecimal totalWhtaxAmt;
	private BigDecimal totalInterestAmt;
	private BigDecimal interestRt;
	private BigDecimal whtaxRt;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public String getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(String quarterEnding) {
		this.quarterEnding = quarterEnding;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getInterestAmt() {
		return interestAmt;
	}
	public void setInterestAmt(BigDecimal interestAmt) {
		this.interestAmt = interestAmt;
	}
	public BigDecimal getWhtaxAmt() {
		return whtaxAmt;
	}
	public void setWhtaxAmt(BigDecimal whtaxAmt) {
		this.whtaxAmt = whtaxAmt;
	}
	public BigDecimal getReleaseAmt() {
		return releaseAmt;
	}
	public void setReleaseAmt(BigDecimal releaseAmt) {
		this.releaseAmt = releaseAmt;
	}
	
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public BigDecimal getPremResQuota() {
		return premResQuota;
	}
	public void setPremResQuota(BigDecimal premResQuota) {
		this.premResQuota = premResQuota;
	}
	public BigDecimal getPremRes1surplus() {
		return premRes1surplus;
	}
	public void setPremRes1surplus(BigDecimal premRes1surplus) {
		this.premRes1surplus = premRes1surplus;
	}
	public BigDecimal getPremRes2surplus() {
		return premRes2surplus;
	}
	public void setPremRes2surplus(BigDecimal premRes2surplus) {
		this.premRes2surplus = premRes2surplus;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public BigDecimal getTotalWhtaxAmt() {
		return totalWhtaxAmt;
	}
	public void setTotalWhtaxAmt(BigDecimal totalWhtaxAmt) {
		this.totalWhtaxAmt = totalWhtaxAmt;
	}
	public BigDecimal getTotalInterestAmt() {
		return totalInterestAmt;
	}
	public void setTotalInterestAmt(BigDecimal totalInterestAmt) {
		this.totalInterestAmt = totalInterestAmt;
	}
	public BigDecimal getInterestRt() {
		return interestRt;
	}
	public void setInterestRt(BigDecimal interestRt) {
		this.interestRt = interestRt;
	}
	public BigDecimal getWhtaxRt() {
		return whtaxRt;
	}
	public void setWhtaxRt(BigDecimal whtaxRt) {
		this.whtaxRt = whtaxRt;
	}
	@Override
	public String toString() {
		return "premResRel [tranId=" + tranId + ", cedingId=" + cedingId + ", itemNo=" + itemNo + ", quarterEnding="
				+ quarterEnding + ", currCd=" + currCd + ", currRate=" + currRate + ", interestAmt=" + interestAmt
				+ ", whtaxAmt=" + whtaxAmt + ", releaseAmt=" + releaseAmt + ", localAmt=" + localAmt + ", premResQuota="
				+ premResQuota + ", premRes1surplus=" + premRes1surplus + ", premRes2surplus=" + premRes2surplus
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", totalWhtaxAmt=" + totalWhtaxAmt + ", totalInterestAmt="
				+ totalInterestAmt + ", interestRt=" + interestRt + ", whtaxRt=" + whtaxRt + "]";
	}
	
}