package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcseOrTransDtlRequest {
	private List<SaveOrTransDtl> saveOrTransDtl;
	private List<SaveOrTransDtl> delOrTransDtl;
	private List<SaveOrItemTaxes> delOrItemTaxes;
	
	public List<SaveOrTransDtl> getSaveOrTransDtl() {
		return saveOrTransDtl;
	}
	public void setSaveOrTransDtl(List<SaveOrTransDtl> saveOrTransDtl) {
		this.saveOrTransDtl = saveOrTransDtl;
	}
	public List<SaveOrTransDtl> getDelOrTransDtl() {
		return delOrTransDtl;
	}
	public void setDelOrTransDtl(List<SaveOrTransDtl> delOrTransDtl) {
		this.delOrTransDtl = delOrTransDtl;
	}
	public List<SaveOrItemTaxes> getDelOrItemTaxes() {
		return delOrItemTaxes;
	}
	public void setDelOrItemTaxes(List<SaveOrItemTaxes> delOrItemTaxes) {
		this.delOrItemTaxes = delOrItemTaxes;
	}
	@Override
	public String toString() {
		return "SaveAcseOrTransDtlRequest [saveOrTransDtl=" + saveOrTransDtl + ", delOrTransDtl=" + delOrTransDtl
				+ ", delOrItemTaxes=" + delOrItemTaxes + "]";
	}
}

@Alias("saveOrTransDtl")
class SaveOrTransDtl{
	private String tranId;
	private String billId;
	private String itemNo;
	private String itemName;
	private String currCd;
	private String currRate;
	private String currAmt;
	private String localAmt;
	private String refNo;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private List<SaveOrItemTaxes> taxAllocation;

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

	public String getCurrRate() {
		return currRate;
	}

	public void setCurrRate(String currRate) {
		this.currRate = currRate;
	}

	public String getCurrAmt() {
		return currAmt;
	}

	public void setCurrAmt(String currAmt) {
		this.currAmt = currAmt;
	}

	public String getLocalAmt() {
		return localAmt;
	}

	public void setLocalAmt(String localAmt) {
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

	public List<SaveOrItemTaxes> getTaxAllocation() {
		return taxAllocation;
	}

	public void setTaxAllocation(List<SaveOrItemTaxes> taxAllocation) {
		this.taxAllocation = taxAllocation;
	}

	@Override
	public String toString() {
		return "SaveOrTransDtl [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", itemName="
				+ itemName + ", currCd=" + currCd + ", currRate=" + currRate + ", currAmt=" + currAmt + ", localAmt="
				+ localAmt + ", refNo=" + refNo + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", taxAllocation=" + taxAllocation + "]";
	}
	
}

@Alias("saveOrItemTaxes")
class SaveOrItemTaxes{
	private String tranId;
	private String billId;
	private String itemNo;
	private String taxType;
	private String taxCd;
	private String rate;
	private String amount;
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
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getTaxCd() {
		return taxCd;
	}
	public void setTaxCd(String taxCd) {
		this.taxCd = taxCd;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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
		return "SaveOrItemTaxes [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", taxType="
				+ taxType + ", taxCd=" + taxCd + ", rate=" + rate + ", amount=" + amount + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
