package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

public class SaveJVMultiOffsetRequest {

	private Integer tranId;
	private Integer tranType;
	private List<SaveMultoffIpb> saveIpb;
	private List<SaveMultoffIpb> delIpb;
	private List<SaveMultoffClm> saveClm;
	private List<SaveMultoffClm> delClm;
	private List<SaveMultoffTrty> saveTrty;
	private List<SaveMultoffTrty> delTrty;
	private List<SaveMultoffUnapp> saveUnapp;
	private List<SaveMultoffUnapp> delUnapp;
	private List<SaveMultoffInvPo> saveInvPo;
	private List<SaveMultoffInvPo> delInvPo;
	private List<SaveMultoffInvPl> saveInvPl;
	private List<SaveMultoffInvPl> delInvPl;
	private List<SaveMultoffLrd> saveLrd;
	private List<SaveMultoffLrd> delLrd;
	private List<SaveMultoffOth> saveOth;
	private List<SaveMultoffOth> delOth;
	
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
	public List<SaveMultoffIpb> getSaveIpb() {
		return saveIpb;
	}
	public void setSaveIpb(List<SaveMultoffIpb> saveIpb) {
		this.saveIpb = saveIpb;
	}
	public List<SaveMultoffIpb> getDelIpb() {
		return delIpb;
	}
	public void setDelIpb(List<SaveMultoffIpb> delIpb) {
		this.delIpb = delIpb;
	}
	public List<SaveMultoffClm> getSaveClm() {
		return saveClm;
	}
	public void setSaveClm(List<SaveMultoffClm> saveClm) {
		this.saveClm = saveClm;
	}
	public List<SaveMultoffClm> getDelClm() {
		return delClm;
	}
	public void setDelClm(List<SaveMultoffClm> delClm) {
		this.delClm = delClm;
	}
	public List<SaveMultoffTrty> getSaveTrty() {
		return saveTrty;
	}
	public void setSaveTrty(List<SaveMultoffTrty> saveTrty) {
		this.saveTrty = saveTrty;
	}
	public List<SaveMultoffTrty> getDelTrty() {
		return delTrty;
	}
	public void setDelTrty(List<SaveMultoffTrty> delTrty) {
		this.delTrty = delTrty;
	}
	public List<SaveMultoffUnapp> getSaveUnapp() {
		return saveUnapp;
	}
	public void setSaveUnapp(List<SaveMultoffUnapp> saveUnapp) {
		this.saveUnapp = saveUnapp;
	}
	public List<SaveMultoffUnapp> getDelUnapp() {
		return delUnapp;
	}
	public void setDelUnapp(List<SaveMultoffUnapp> delUnapp) {
		this.delUnapp = delUnapp;
	}
	public List<SaveMultoffInvPo> getSaveInvPo() {
		return saveInvPo;
	}
	public void setSaveInvPo(List<SaveMultoffInvPo> saveInvPo) {
		this.saveInvPo = saveInvPo;
	}
	public List<SaveMultoffInvPo> getDelInvPo() {
		return delInvPo;
	}
	public void setDelInvPo(List<SaveMultoffInvPo> delInvPo) {
		this.delInvPo = delInvPo;
	}
	public List<SaveMultoffInvPl> getSaveInvPl() {
		return saveInvPl;
	}
	public void setSaveInvPl(List<SaveMultoffInvPl> saveInvPl) {
		this.saveInvPl = saveInvPl;
	}
	public List<SaveMultoffInvPl> getDelInvPl() {
		return delInvPl;
	}
	public void setDelInvPl(List<SaveMultoffInvPl> delInvPl) {
		this.delInvPl = delInvPl;
	}
	public List<SaveMultoffLrd> getSaveLrd() {
		return saveLrd;
	}
	public void setSaveLrd(List<SaveMultoffLrd> saveLrd) {
		this.saveLrd = saveLrd;
	}
	public List<SaveMultoffLrd> getDelLrd() {
		return delLrd;
	}
	public void setDelLrd(List<SaveMultoffLrd> delLrd) {
		this.delLrd = delLrd;
	}
	public List<SaveMultoffOth> getSaveOth() {
		return saveOth;
	}
	public void setSaveOth(List<SaveMultoffOth> saveOth) {
		this.saveOth = saveOth;
	}
	public List<SaveMultoffOth> getDelOth() {
		return delOth;
	}
	public void setDelOth(List<SaveMultoffOth> delOth) {
		this.delOth = delOth;
	}
	@Override
	public String toString() {
		return "SaveJVMultiOffsetRequest [tranId=" + tranId + ", tranType=" + tranType + ", saveIpb=" + saveIpb
				+ ", delIpb=" + delIpb + ", saveClm=" + saveClm + ", delClm=" + delClm + ", saveTrty=" + saveTrty
				+ ", delTrty=" + delTrty + ", saveUnapp=" + saveUnapp + ", delUnapp=" + delUnapp + ", saveInvPo="
				+ saveInvPo + ", delInvPo=" + delInvPo + ", saveInvPl=" + saveInvPl + ", delInvPl=" + delInvPl
				+ ", saveLrd=" + saveLrd + ", delLrd=" + delLrd + ", saveOth=" + saveOth + ", delOth=" + delOth + "]";
	}
}

class SaveMultoffIpb {
	private Integer tranId;
	private Integer policyId;
	private Integer instNo;
	private String currCd;
	private BigDecimal currRate;
	private String cedingId;
	private BigDecimal premAmt;
	private BigDecimal riComm;
	private BigDecimal riCommVat;
	private BigDecimal charges;
	private BigDecimal netDue;
	private BigDecimal prevPaytAmt;
	private BigDecimal prevBalance;
	private BigDecimal balPaytAmt;
	private BigDecimal localAmt;
	private BigDecimal newPaytAmt;
	private BigDecimal newBalance;
	private BigDecimal overdueInt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private Integer paytType;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public Integer getInstNo() {
		return instNo;
	}
	public void setInstNo(Integer instNo) {
		this.instNo = instNo;
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
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getRiComm() {
		return riComm;
	}
	public void setRiComm(BigDecimal riComm) {
		this.riComm = riComm;
	}
	public BigDecimal getRiCommVat() {
		return riCommVat;
	}
	public void setRiCommVat(BigDecimal riCommVat) {
		this.riCommVat = riCommVat;
	}
	public BigDecimal getCharges() {
		return charges;
	}
	public void setCharges(BigDecimal charges) {
		this.charges = charges;
	}
	public BigDecimal getNetDue() {
		return netDue;
	}
	public void setNetDue(BigDecimal netDue) {
		this.netDue = netDue;
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
	public BigDecimal getBalPaytAmt() {
		return balPaytAmt;
	}
	public void setBalPaytAmt(BigDecimal balPaytAmt) {
		this.balPaytAmt = balPaytAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
	public BigDecimal getOverdueInt() {
		return overdueInt;
	}
	public void setOverdueInt(BigDecimal overdueInt) {
		this.overdueInt = overdueInt;
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
	public Integer getPaytType() {
		return paytType;
	}
	public void setPaytType(Integer paytType) {
		this.paytType = paytType;
	}
	@Override
	public String toString() {
		return "SaveMultoffIpb [tranId=" + tranId + ", policyId=" + policyId + ", instNo=" + instNo + ", currCd="
				+ currCd + ", currRate=" + currRate + ", cedingId=" + cedingId + ", premAmt=" + premAmt + ", riComm="
				+ riComm + ", riCommVat=" + riCommVat + ", charges=" + charges + ", netDue=" + netDue + ", prevPaytAmt="
				+ prevPaytAmt + ", prevBalance=" + prevBalance + ", balPaytAmt=" + balPaytAmt + ", localAmt=" + localAmt
				+ ", newPaytAmt=" + newPaytAmt + ", newBalance=" + newBalance + ", overdueInt=" + overdueInt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", paytType=" + paytType + "]";
	}
}

class SaveMultoffClm {
	private Integer tranId;
	private Integer claimId;
	private Integer projId;
	private Integer histNo;
	private String paymentFor;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal clmPaytAmt;
	private BigDecimal localAmt;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String cedingId;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
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
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	@Override
	public String toString() {
		return "SaveMultoffClm [tranId=" + tranId + ", claimId=" + claimId + ", projId=" + projId + ", histNo=" + histNo
				+ ", paymentFor=" + paymentFor + ", currCd=" + currCd + ", currRate=" + currRate + ", clmPaytAmt="
				+ clmPaytAmt + ", localAmt=" + localAmt + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", cedingId=" + cedingId + "]";
	}
}

class SaveMultoffTrty {
	private Integer tranId;
	private Integer qsoaId;
	private String quarterEnding;
	private String cedingId;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal prevPaytAmt;
	private BigDecimal prevBalance;
	private BigDecimal balanceAmt;
	private BigDecimal actualBalPaid;
	private BigDecimal localAmt;
	private BigDecimal newPaytAmt;
	private BigDecimal newBalance;
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
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
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
	public BigDecimal getBalanceAmt() {
		return balanceAmt;
	}
	public void setBalanceAmt(BigDecimal balanceAmt) {
		this.balanceAmt = balanceAmt;
	}
	public BigDecimal getActualBalPaid() {
		return actualBalPaid;
	}
	public void setActualBalPaid(BigDecimal actualBalPaid) {
		this.actualBalPaid = actualBalPaid;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
		return "SaveMultoffTrty [tranId=" + tranId + ", qsoaId=" + qsoaId + ", quarterEnding=" + quarterEnding
				+ ", cedingId=" + cedingId + ", currCd=" + currCd + ", currRate=" + currRate + ", prevPaytAmt="
				+ prevPaytAmt + ", prevBalance=" + prevBalance + ", balanceAmt=" + balanceAmt + ", actualBalPaid="
				+ actualBalPaid + ", localAmt=" + localAmt + ", newPaytAmt=" + newPaytAmt + ", newBalance=" + newBalance
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}

class SaveMultoffUnapp {
	private Integer tranId;
	private Integer unappliedId;
	private String cedingId;
	private String transdtlType;
	private String itemName;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal prevPaytAmt;
	private BigDecimal prevBalance;
	private BigDecimal unappliedAmt;
	private BigDecimal actualBalPaid;
	private BigDecimal localAmt;
	private BigDecimal newPaytAmt;
	private BigDecimal newBalance;
	private String refNo;
	private String remarks;
	private String returnTag;
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
	public Integer getUnappliedId() {
		return unappliedId;
	}
	public void setUnappliedId(Integer unappliedId) {
		this.unappliedId = unappliedId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getTransdtlType() {
		return transdtlType;
	}
	public void setTransdtlType(String transdtlType) {
		this.transdtlType = transdtlType;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
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
	public BigDecimal getUnappliedAmt() {
		return unappliedAmt;
	}
	public void setUnappliedAmt(BigDecimal unappliedAmt) {
		this.unappliedAmt = unappliedAmt;
	}
	public BigDecimal getActualBalPaid() {
		return actualBalPaid;
	}
	public void setActualBalPaid(BigDecimal actualBalPaid) {
		this.actualBalPaid = actualBalPaid;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getReturnTag() {
		return returnTag;
	}
	public void setReturnTag(String returnTag) {
		this.returnTag = returnTag;
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
		return "SaveMultoffUnapp [tranId=" + tranId + ", unappliedId=" + unappliedId + ", cedingId=" + cedingId
				+ ", transdtlType=" + transdtlType + ", itemName=" + itemName + ", currCd=" + currCd + ", currRate="
				+ currRate + ", prevPaytAmt=" + prevPaytAmt + ", prevBalance=" + prevBalance + ", unappliedAmt="
				+ unappliedAmt + ", actualBalPaid=" + actualBalPaid + ", localAmt=" + localAmt + ", newPaytAmt="
				+ newPaytAmt + ", newBalance=" + newBalance + ", refNo=" + refNo + ", remarks=" + remarks
				+ ", returnTag=" + returnTag + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}

class SaveMultoffInvPo {
	private Integer tranId;
	private Integer invtId;
	private String pulloutType;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal invtAmt;
	private BigDecimal incomeAmt;
	private BigDecimal bankCharge;
	private BigDecimal whtaxAmt;
	private BigDecimal maturityValue;
	private BigDecimal localAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private BigDecimal pullInvtAmt;
	private BigDecimal pullIncomeAmt;
	private BigDecimal pullBankCharge;
	private BigDecimal pullWhtaxAmt;
	private BigDecimal pullNetValue;
	private BigDecimal incomeBalance;
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getInvtId() {
		return invtId;
	}
	public void setInvtId(Integer invtId) {
		this.invtId = invtId;
	}
	public String getPulloutType() {
		return pulloutType;
	}
	public void setPulloutType(String pulloutType) {
		this.pulloutType = pulloutType;
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
	public BigDecimal getInvtAmt() {
		return invtAmt;
	}
	public void setInvtAmt(BigDecimal invtAmt) {
		this.invtAmt = invtAmt;
	}
	public BigDecimal getIncomeAmt() {
		return incomeAmt;
	}
	public void setIncomeAmt(BigDecimal incomeAmt) {
		this.incomeAmt = incomeAmt;
	}
	public BigDecimal getBankCharge() {
		return bankCharge;
	}
	public void setBankCharge(BigDecimal bankCharge) {
		this.bankCharge = bankCharge;
	}
	public BigDecimal getWhtaxAmt() {
		return whtaxAmt;
	}
	public void setWhtaxAmt(BigDecimal whtaxAmt) {
		this.whtaxAmt = whtaxAmt;
	}
	public BigDecimal getMaturityValue() {
		return maturityValue;
	}
	public void setMaturityValue(BigDecimal maturityValue) {
		this.maturityValue = maturityValue;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
	public BigDecimal getPullInvtAmt() {
		return pullInvtAmt;
	}
	public void setPullInvtAmt(BigDecimal pullInvtAmt) {
		this.pullInvtAmt = pullInvtAmt;
	}
	public BigDecimal getPullIncomeAmt() {
		return pullIncomeAmt;
	}
	public void setPullIncomeAmt(BigDecimal pullIncomeAmt) {
		this.pullIncomeAmt = pullIncomeAmt;
	}
	public BigDecimal getPullBankCharge() {
		return pullBankCharge;
	}
	public void setPullBankCharge(BigDecimal pullBankCharge) {
		this.pullBankCharge = pullBankCharge;
	}
	public BigDecimal getPullWhtaxAmt() {
		return pullWhtaxAmt;
	}
	public void setPullWhtaxAmt(BigDecimal pullWhtaxAmt) {
		this.pullWhtaxAmt = pullWhtaxAmt;
	}
	public BigDecimal getPullNetValue() {
		return pullNetValue;
	}
	public void setPullNetValue(BigDecimal pullNetValue) {
		this.pullNetValue = pullNetValue;
	}
	public BigDecimal getIncomeBalance() {
		return incomeBalance;
	}
	public void setIncomeBalance(BigDecimal incomeBalance) {
		this.incomeBalance = incomeBalance;
	}
	@Override
	public String toString() {
		return "SaveMultoffInvPo [tranId=" + tranId + ", invtId=" + invtId + ", pulloutType=" + pulloutType
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", invtAmt=" + invtAmt + ", incomeAmt=" + incomeAmt
				+ ", bankCharge=" + bankCharge + ", whtaxAmt=" + whtaxAmt + ", maturityValue=" + maturityValue
				+ ", localAmt=" + localAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", pullInvtAmt=" + pullInvtAmt
				+ ", pullIncomeAmt=" + pullIncomeAmt + ", pullBankCharge=" + pullBankCharge + ", pullWhtaxAmt="
				+ pullWhtaxAmt + ", pullNetValue=" + pullNetValue + ", incomeBalance=" + incomeBalance + "]";
	}
}

class SaveMultoffInvPl {
	private Integer tranId;
	private Integer invtId;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal invtAmt;
	private BigDecimal localAmt;
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
	public Integer getInvtId() {
		return invtId;
	}
	public void setInvtId(Integer invtId) {
		this.invtId = invtId;
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
	public BigDecimal getInvtAmt() {
		return invtAmt;
	}
	public void setInvtAmt(BigDecimal invtAmt) {
		this.invtAmt = invtAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
		return "SaveMultoffInvPl [tranId=" + tranId + ", invtId=" + invtId + ", currCd=" + currCd + ", currRate="
				+ currRate + ", invtAmt=" + invtAmt + ", localAmt=" + localAmt + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}

class SaveMultoffLrd {
	private Integer tranId;
	private String cedingId;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal lossresdepAmt;
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
	public BigDecimal getLossresdepAmt() {
		return lossresdepAmt;
	}
	public void setLossresdepAmt(BigDecimal lossresdepAmt) {
		this.lossresdepAmt = lossresdepAmt;
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
		return "SaveMultoffLrd [tranId=" + tranId + ", cedingId=" + cedingId + ", currCd=" + currCd + ", currRate="
				+ currRate + ", lossresdepAmt=" + lossresdepAmt + ", localAmt=" + localAmt + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}

class SaveMultoffOth {
	private Integer tranId;
	private Integer itemNo;
	private String cedingId;
	private String itemName;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal currAmt;
	private BigDecimal localAmt;
	private String refNo;
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
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
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
	public BigDecimal getCurrAmt() {
		return currAmt;
	}
	public void setCurrAmt(BigDecimal currAmt) {
		this.currAmt = currAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
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
		return "SaveMultoffOth [tranId=" + tranId + ", itemNo=" + itemNo + ", cedingId=" + cedingId + ", itemName="
				+ itemName + ", currCd=" + currCd + ", currRate=" + currRate + ", currAmt=" + currAmt + ", localAmt="
				+ localAmt + ", refNo=" + refNo + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}