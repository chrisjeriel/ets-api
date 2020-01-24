package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;
public class SaveAcitJvNegTrtyRequest {
	private Integer tranId;
	private Integer tranType;
	private List<negativeTreaty> saveNegTrty;
	private List<negativeTreaty> deleteNegTrty;
	private List<ClaimOffset> saveClmOffset;
	private List<ClaimOffset> deleteClmOffset;
	
	public List<negativeTreaty> getSaveNegTrty() {
		return saveNegTrty;
	}

	public Integer getTranId() {
		return tranId;
	}

	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}

	public Integer getTranType() {
		return tranType;
	}

	public void setTranType(Integer tranType) {
		this.tranType = tranType;
	}

	public void setSaveNegTrty(List<negativeTreaty> saveNegTrty) {
		this.saveNegTrty = saveNegTrty;
	}
	
	public List<negativeTreaty> getDeleteNegTrty() {
		return deleteNegTrty;
	}

	public void setDeleteNegTrty(List<negativeTreaty> deleteNegTrty) {
		this.deleteNegTrty = deleteNegTrty;
	}
	
	
	public List<ClaimOffset> getSaveClmOffset() {
		return saveClmOffset;
	}

	public void setSaveClmOffset(List<ClaimOffset> saveClmOffset) {
		this.saveClmOffset = saveClmOffset;
	}

	public List<ClaimOffset> getDeleteClmOffset() {
		return deleteClmOffset;
	}

	public void setDeleteClmOffset(List<ClaimOffset> deleteClmOffset) {
		this.deleteClmOffset = deleteClmOffset;
	}

	@Override
	public String toString() {
		return "SaveAcitJvNegTrtyRequest [tranId=" + tranId + ", tranType=" + tranType + ", saveNegTrty=" + saveNegTrty
				+ ", deleteNegTrty=" + deleteNegTrty + ", saveClmOffset=" + saveClmOffset + ", deleteClmOffset="
				+ deleteClmOffset + "]";
	}
	
}

@Alias ("ACITNegative")
class negativeTreaty {
	private Integer tranId;
	private String qsoaId;
	private Integer quarterNo;
	private String quarterEnding;
	private String cedingId;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal balanceAmt;
	private BigDecimal localAmt;
	private BigDecimal actualBalPaid;
	private Integer claimId;
	private Integer projId;
	private Integer histNo;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private BigDecimal prevPaytAmt;
	private BigDecimal prevBalance;
	private BigDecimal newPaytAmt;
	private BigDecimal newBalance;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	
	public String getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(String qsoaId) {
		this.qsoaId = qsoaId;
	}
	public Integer getQuarterNo() {
		return quarterNo;
	}
	public void setQuarterNo(Integer quarterNo) {
		this.quarterNo = quarterNo;
	}
	public String getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(String quarterEnding) {
		this.quarterEnding = quarterEnding;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
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
	public BigDecimal getBalanceAmt() {
		return balanceAmt;
	}
	public void setBalanceAmt(BigDecimal balanceAmt) {
		this.balanceAmt = balanceAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public BigDecimal getActualBalPaid() {
		return actualBalPaid;
	}
	public void setActualBalPaid(BigDecimal actualBalPaid) {
		this.actualBalPaid = actualBalPaid;
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
	
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public BigDecimal getPrevPaytAmt() {
		return prevPaytAmt;
	}
	public void setPrevPaytAmt(BigDecimal prevPaytAmt) {
		this.prevPaytAmt = prevPaytAmt;
	}
	public BigDecimal getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(BigDecimal prevBalance) {
		this.prevBalance = prevBalance;
	}
	public BigDecimal getNewPaytAmt() {
		return newPaytAmt;
	}
	public void setNewPaytAmt(BigDecimal newPaytAmt) {
		this.newPaytAmt = newPaytAmt;
	}
	public BigDecimal getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(BigDecimal newBalance) {
		this.newBalance = newBalance;
	}
	@Override
	public String toString() {
		return "negativeTreaty [tranId=" + tranId + ", qsoaId=" + qsoaId + ", quarterNo=" + quarterNo
				+ ", quarterEnding=" + quarterEnding + ", cedingId=" + cedingId + ", currCd=" + currCd + ", currRate="
				+ currRate + ", balanceAmt=" + balanceAmt + ", localAmt=" + localAmt + ", actualBalPaid="
				+ actualBalPaid + ", claimId=" + claimId + ", projId=" + projId + ", histNo=" + histNo + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", prevPaytAmt=" + prevPaytAmt + ", prevBalance=" + prevBalance + ", newPaytAmt="
				+ newPaytAmt + ", newBalance=" + newBalance + "]";
	}
}


@Alias ("ACITClmOffset")
class ClaimOffset{
	private Integer tranId;
	private Integer quarterNo;
	private Integer itemNo;
	private Integer claimId;
	private Integer projId;
	private Integer histNo;
	private String paymentFor;
	private String currCd;
	private BigDecimal currRate;
	private String histCategory;
	private Integer histType;
	private String exGratia;
	private BigDecimal reserveAmt;
	private BigDecimal clmPaytAmt;
	private BigDecimal localAmt;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getQuarterNo() {
		return quarterNo;
	}
	public void setQuarterNo(Integer quarterNo) {
		this.quarterNo = quarterNo;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public String getPaymentFor() {
		return paymentFor;
	}
	public void setPaymentFor(String paymentFor) {
		this.paymentFor = paymentFor;
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
	
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public Integer getHistType() {
		return histType;
	}
	public void setHistType(Integer histType) {
		this.histType = histType;
	}
	public String getExGratia() {
		return exGratia;
	}
	public void setExGratia(String exGratia) {
		this.exGratia = exGratia;
	}
	public BigDecimal getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(BigDecimal reserveAmt) {
		this.reserveAmt = reserveAmt;
	}
	public BigDecimal getClmPaytAmt() {
		return clmPaytAmt;
	}
	public void setClmPaytAmt(BigDecimal clmPaytAmt) {
		this.clmPaytAmt = clmPaytAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	@Override
	public String toString() {
		return "ClaimOffset [tranId=" + tranId + ", quarterNo=" + quarterNo + ", itemNo=" + itemNo + ", claimId="
				+ claimId + ", projId=" + projId + ", histNo=" + histNo + ", paymentFor=" + paymentFor + ", currCd="
				+ currCd + ", currRate=" + currRate + ", clmPaytAmt=" + clmPaytAmt + ", localAmt=" + localAmt
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
