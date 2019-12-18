package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class SaveAcitJVUnappCollRequest {
	private List<unappliedColl> saveUnappliedColl;
	private List<unappliedColl> delUnappliedColl;
	
	public List<unappliedColl> getSaveUnappliedColl() {
		return saveUnappliedColl;
	}

	public void setSaveUnappliedColl(List<unappliedColl> saveUnappliedColl) {
		this.saveUnappliedColl = saveUnappliedColl;
	}
	
	
	public List<unappliedColl> getDelUnappliedColl() {
		return delUnappliedColl;
	}

	public void setDelUnappliedColl(List<unappliedColl> delUnappliedColl) {
		this.delUnappliedColl = delUnappliedColl;
	}

	@Override
	public String toString() {
		return "SaveAcitJVUnappCollRequest [saveUnappliedColl=" + saveUnappliedColl + ", delUnappliedColl="
				+ delUnappliedColl + "]";
	}
}

class unappliedColl {
	private Integer tranId;
	private Integer refTranId;
	private Integer refBillId;
	private Integer refItemNo;
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
	public Integer getRefTranId() {
		return refTranId;
	}
	public void setRefTranId(Integer refTranId) {
		this.refTranId = refTranId;
	}
	
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public Integer getRefBillId() {
		return refBillId;
	}
	public void setRefBillId(Integer refBillId) {
		this.refBillId = refBillId;
	}
	public Integer getRefItemNo() {
		return refItemNo;
	}
	public void setRefItemNo(Integer refItemNo) {
		this.refItemNo = refItemNo;
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
		return "unappliedColl [tranId=" + tranId + ", refTranId=" + refTranId + ", refBillId=" + refBillId
				+ ", refItemNo=" + refItemNo + ", cedingId=" + cedingId + ", transdtlType=" + transdtlType
				+ ", itemName=" + itemName + ", currCd=" + currCd + ", currRate=" + currRate + ", prevPaytAmt="
				+ prevPaytAmt + ", prevBalance=" + prevBalance + ", unappliedAmt=" + unappliedAmt + ", actualBalPaid="
				+ actualBalPaid + ", localAmt=" + localAmt + ", newPaytAmt=" + newPaytAmt + ", newBalance=" + newBalance
				+ ", refNo=" + refNo + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
	
}
