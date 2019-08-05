package ph.cpi.rest.api.model.request;
import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcitJVAppPaytZeroRequest {
	private List<InwPol> saveZeroBal;
	private List<InwPol> deleteZeroBal;
	public List<InwPol> getSaveZeroBal() {
		return saveZeroBal;
	}
	public void setSaveZeroBal(List<InwPol> saveZeroBal) {
		this.saveZeroBal = saveZeroBal;
	}
	public List<InwPol> getDeleteZeroBal() {
		return deleteZeroBal;
	}
	public void setDeleteZeroBal(List<InwPol> deleteZeroBal) {
		this.deleteZeroBal = deleteZeroBal;
	}
	@Override
	public String toString() {
		return "SaveAcitJVAppPaytZeroRequest [saveZeroBal=" + saveZeroBal + ", deleteZeroBal=" + deleteZeroBal + "]";
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
	private BigDecimal prevPaytAmt;
	private BigDecimal adjBalAmt;
	private BigDecimal overdueInt;
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
	@Override
	public String toString() {
		return "ZeroBal [tranId=" + tranId + ", itemNo=" + itemNo + ", policyId=" + policyId + ", instNo=" + instNo
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", premAmt=" + premAmt + ", riComm=" + riComm
				+ ", riCommVat=" + riCommVat + ", charges=" + charges + ", netDue=" + netDue + ", prevPaytAmt="
				+ prevPaytAmt + ", adjBalAmt=" + adjBalAmt + ", overdueInt=" + overdueInt + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}