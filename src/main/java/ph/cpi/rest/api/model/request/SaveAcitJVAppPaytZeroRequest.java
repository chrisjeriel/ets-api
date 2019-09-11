package ph.cpi.rest.api.model.request;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.type.Alias;

public class SaveAcitJVAppPaytZeroRequest {
	private Integer tranType;
	private Integer tranId;
	private List<ZeroBal> saveZeroBal;
	private List<ZeroBal> deleteZeroBal;
	
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
	public List<ZeroBal> getSaveZeroBal() {
		return saveZeroBal;
	}
	public void setSaveZeroBal(List<ZeroBal> saveZeroBal) {
		this.saveZeroBal = saveZeroBal;
	}
	public List<ZeroBal> getDeleteZeroBal() {
		return deleteZeroBal;
	}
	public void setDeleteZeroBal(List<ZeroBal> deleteZeroBal) {
		this.deleteZeroBal = deleteZeroBal;
	}
	@Override
	public String toString() {
		return "SaveAcitJVAppPaytZeroRequest [tranType=" + tranType + ", tranId=" + tranId + ", saveZeroBal="
				+ saveZeroBal + ", deleteZeroBal=" + deleteZeroBal + "]";
	}
	
}

@Alias ("ACITZeroBal")
class ZeroBal{
	private Integer tranId;
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
	private BigDecimal localAmt;
	private BigDecimal adjBalAmt;
	private BigDecimal overdueInt;
	private BigDecimal cumPayment;
	private BigDecimal balance;
	private BigDecimal totalPayt;
	private BigDecimal remainingBal;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String paytType;
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
	public BigDecimal getAdjBalAmt() {
		return adjBalAmt;
	}
	public void setAdjBalAmt(BigDecimal adjBalAmt) {
		this.adjBalAmt = adjBalAmt;
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
	
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	
	public String getPaytType() {
		return paytType;
	}
	public void setPaytType(String paytType) {
		this.paytType = paytType;
	}
	
	
	public BigDecimal getCumPayment() {
		return cumPayment;
	}
	public void setCumPayment(BigDecimal cumPayment) {
		this.cumPayment = cumPayment;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getTotalPayt() {
		return totalPayt;
	}
	public void setTotalPayt(BigDecimal totalPayt) {
		this.totalPayt = totalPayt;
	}
	public BigDecimal getRemainingBal() {
		return remainingBal;
	}
	public void setRemainingBal(BigDecimal remainingBal) {
		this.remainingBal = remainingBal;
	}
	@Override
	public String toString() {
		return "ZeroBal [tranId=" + tranId + ", itemNo=" + itemNo + ", policyId=" + policyId + ", instNo=" + instNo
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", premAmt=" + premAmt + ", riComm=" + riComm
				+ ", riCommVat=" + riCommVat + ", charges=" + charges + ", netDue=" + netDue + ", localAmt=" + localAmt
				+ ", adjBalAmt=" + adjBalAmt + ", overdueInt=" + overdueInt + ", cumPayment=" + cumPayment
				+ ", balance=" + balance + ", totalPayt=" + totalPayt + ", remainingBal=" + remainingBal
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", paytType=" + paytType + "]";
	}
	
}