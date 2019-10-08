package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcseOrServFeeRequest {
	private String tranId;
	private String billId;
	private String billType;
	private String totalLocalAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private List<ServFeeOr> saveServFee;
	private List<ServFeeOr> delServFee;
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public String getTotalLocalAmt() {
		return totalLocalAmt;
	}
	public void setTotalLocalAmt(String totalLocalAmt) {
		this.totalLocalAmt = totalLocalAmt;
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
	public List<ServFeeOr> getSaveServFee() {
		return saveServFee;
	}
	public void setSaveServFee(List<ServFeeOr> saveServFee) {
		this.saveServFee = saveServFee;
	}
	public List<ServFeeOr> getDelServFee() {
		return delServFee;
	}
	public void setDelServFee(List<ServFeeOr> delServFee) {
		this.delServFee = delServFee;
	}
	@Override
	public String toString() {
		return "SaveAcseOrServFeeRequest [tranId=" + tranId + ", billId=" + billId + ", billType=" + billType
				+ ", totalLocalAmt=" + totalLocalAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", saveServFee=" + saveServFee
				+ ", delServFee=" + delServFee + "]";
	}
	
}


@Alias("servFeeOr")
class ServFeeOr{
	private String tranId;
	private String billId;
	private String itemNo;
	private String quarterEnding;
	private String currCd;
	private String currRate;
	private String servFeeAmt;
	private String localAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
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
	public String getCurrRate() {
		return currRate;
	}
	public void setCurrRate(String currRate) {
		this.currRate = currRate;
	}
	public String getServFeeAmt() {
		return servFeeAmt;
	}
	public void setServFeeAmt(String servFeeAmt) {
		this.servFeeAmt = servFeeAmt;
	}
	public String getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(String localAmt) {
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
		return "ServFeeOr [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", quarterEnding="
				+ quarterEnding + ", currCd=" + currCd + ", currRate=" + currRate + ", servFeeAmt=" + servFeeAmt
				+ ", localAmt=" + localAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}