package ph.cpi.rest.api.model.request;
import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;
public class SaveAcitJVAcctTrtyBalRequest {
	private Integer tranType;
	private Integer tranId;
	private List<TreatyAcc> saveAcctTrty;
	private List<TreatyAcc> delAcctTrty;
	private List<acctTreaty> saveInwPolOffset;
	private List<acctTreaty> delInwPolOffset;
	
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
	public List<TreatyAcc> getSaveAcctTrty() {
		return saveAcctTrty;
	}
	public void setSaveAcctTrty(List<TreatyAcc> saveAcctTrty) {
		this.saveAcctTrty = saveAcctTrty;
	}
	public List<TreatyAcc> getDelAcctTrty() {
		return delAcctTrty;
	}
	public void setDelAcctTrty(List<TreatyAcc> delAcctTrty) {
		this.delAcctTrty = delAcctTrty;
	}
	public List<acctTreaty> getSaveInwPolOffset() {
		return saveInwPolOffset;
	}
	public void setSaveInwPolOffset(List<acctTreaty> saveInwPolOffset) {
		this.saveInwPolOffset = saveInwPolOffset;
	}
	public List<acctTreaty> getDelInwPolOffset() {
		return delInwPolOffset;
	}
	public void setDelInwPolOffset(List<acctTreaty> delInwPolOffset) {
		this.delInwPolOffset = delInwPolOffset;
	}
	@Override
	public String toString() {
		return "SaveAcitJVAcctTrtyBalRequest [tranType=" + tranType + ", tranId=" + tranId + ", saveAcctTrty="
				+ saveAcctTrty + ", delAcctTrty=" + delAcctTrty + ", saveInwPolOffset=" + saveInwPolOffset
				+ ", delInwPolOffset=" + delInwPolOffset + "]";
	}
}

@Alias ("acctTreaty")
class acctTreaty {
	private Integer tranId;
	private Integer quarterNo;
	private Integer itemNo;
	private Integer policyId;
	private Integer instNo;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal premAmt;
	private BigDecimal riComm;
	private BigDecimal riCommVat;
	private BigDecimal charges;
	private BigDecimal netDue;
	private BigDecimal prevPaytAmt;
	private BigDecimal balPaytAmt;
	private BigDecimal localAmt;
	private BigDecimal overdueInt;
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

	public BigDecimal getOverdueInt() {
		return overdueInt;
	}

	public void setOverdueInt(BigDecimal overdueInt) {
		this.overdueInt = overdueInt;
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
		return "acctTreaty [tranId=" + tranId + ", quarterNo=" + quarterNo + ", itemNo=" + itemNo + ", policyId="
				+ policyId + ", instNo=" + instNo + ", currCd=" + currCd + ", currRate=" + currRate + ", premAmt="
				+ premAmt + ", riComm=" + riComm + ", riCommVat=" + riCommVat + ", charges=" + charges + ", netDue="
				+ netDue + ", prevPaytAmt=" + prevPaytAmt + ", balPaytAmt=" + balPaytAmt + ", localAmt=" + localAmt
				+ ", overdueInt=" + overdueInt + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}


@Alias ("acitTreaty")
class TreatyAcc {
	private Integer tranId;
	private Integer quarterNo;
	private String quarterEnding;
	private String cedingId;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal balanceAmt;
	private BigDecimal localAmt;
	private BigDecimal actualBalPaid;
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
	@Override
	public String toString() {
		return "Treaty [tranId=" + tranId + ", quarterNo=" + quarterNo + ", quarterEnding=" + quarterEnding
				+ ", cedingId=" + cedingId + ", currCd=" + currCd + ", currRate=" + currRate + ", balanceAmt="
				+ balanceAmt + ", localAmt=" + localAmt + ", actualBalPaid=" + actualBalPaid + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
}