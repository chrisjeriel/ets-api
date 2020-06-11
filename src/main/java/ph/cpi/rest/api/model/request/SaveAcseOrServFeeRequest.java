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
	
	private List<saveOrItemTaxesServFee> delOrItemTaxes;
	private String fromTaxMdl;
	
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
	public List<saveOrItemTaxesServFee> getDelOrItemTaxes() {
		return delOrItemTaxes;
	}
	public void setDelOrItemTaxes(List<saveOrItemTaxesServFee> delOrItemTaxes) {
		this.delOrItemTaxes = delOrItemTaxes;
	}
	public String getFromTaxMdl() {
		return fromTaxMdl;
	}
	public void setFromTaxMdl(String fromTaxMdl) {
		this.fromTaxMdl = fromTaxMdl;
	}
	@Override
	public String toString() {
		return "SaveAcseOrServFeeRequest [tranId=" + tranId + ", billId=" + billId + ", billType=" + billType
				+ ", totalLocalAmt=" + totalLocalAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", saveServFee=" + saveServFee
				+ ", delServFee=" + delServFee + ", delOrItemTaxes=" + delOrItemTaxes + ", fromTaxMdl=" + fromTaxMdl
				+ "]";
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
	private String invoiceId;
	private String vatTag;
	
	private List<saveOrItemTaxesServFee> taxAllocation;
	
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
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getVatTag() {
		return vatTag;
	}
	public void setVatTag(String vatTag) {
		this.vatTag = vatTag;
	}
	public List<saveOrItemTaxesServFee> getTaxAllocation() {
		return taxAllocation;
	}
	public void setTaxAllocation(List<saveOrItemTaxesServFee> taxAllocation) {
		this.taxAllocation = taxAllocation;
	}
	@Override
	public String toString() {
		return "ServFeeOr [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", quarterEnding="
				+ quarterEnding + ", currCd=" + currCd + ", currRate=" + currRate + ", servFeeAmt=" + servFeeAmt
				+ ", localAmt=" + localAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", invoiceId=" + invoiceId + ", vatTag="
				+ vatTag + ", taxAllocation=" + taxAllocation + "]";
	}
}

@Alias("saveOrItemTaxesServFee")
class saveOrItemTaxesServFee{
	private String tranId;
	private String billId;
	private String itemNo;
	private String taxType;
	private String taxCd;
	private String taxRate;
	private String taxAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String genType;
	private String taxBaseAmt;
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
	public String getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
	public String getTaxAmt() {
		return taxAmt;
	}
	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
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
	public String getGenType() {
		return genType;
	}
	public void setGenType(String genType) {
		this.genType = genType;
	}
	public String getTaxBaseAmt() {
		return taxBaseAmt;
	}
	public void setTaxBaseAmt(String taxBaseAmt) {
		this.taxBaseAmt = taxBaseAmt;
	}
	@Override
	public String toString() {
		return "saveOrItemTaxesServFee [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", taxType="
				+ taxType + ", taxCd=" + taxCd + ", taxRate=" + taxRate + ", taxAmt=" + taxAmt + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", genType=" + genType + ", taxBaseAmt=" + taxBaseAmt + "]";
	}
}