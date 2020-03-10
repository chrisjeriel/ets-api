package ph.cpi.rest.api.model.request;

import java.util.List;


public class SaveAcsePrqTransRequest {
	private String reqId;
	private String tranTypeCd;
	private String createUser;
	private String updateUser;
	
	private List<PrqTransAcse> deletePrqTrans;
	private List<PrqTransAcse> savePrqTrans;
	private List<SaveCvItemTaxes> delCvItemTaxes;
	private String fromTaxMdl;
	
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public List<PrqTransAcse> getDeletePrqTrans() {
		return deletePrqTrans;
	}
	public void setDeletePrqTrans(List<PrqTransAcse> deletePrqTrans) {
		this.deletePrqTrans = deletePrqTrans;
	}
	public List<PrqTransAcse> getSavePrqTrans() {
		return savePrqTrans;
	}
	public void setSavePrqTrans(List<PrqTransAcse> savePrqTrans) {
		this.savePrqTrans = savePrqTrans;
	}
	public List<SaveCvItemTaxes> getDelCvItemTaxes() {
		return delCvItemTaxes;
	}
	public void setDelCvItemTaxes(List<SaveCvItemTaxes> delCvItemTaxes) {
		this.delCvItemTaxes = delCvItemTaxes;
	}
	public String getFromTaxMdl() {
		return fromTaxMdl;
	}
	public void setFromTaxMdl(String fromTaxMdl) {
		this.fromTaxMdl = fromTaxMdl;
	}
	@Override
	public String toString() {
		return "SaveAcsePrqTransRequest [reqId=" + reqId + ", tranTypeCd=" + tranTypeCd + ", createUser=" + createUser
				+ ", updateUser=" + updateUser + ", deletePrqTrans=" + deletePrqTrans + ", savePrqTrans=" + savePrqTrans
				+ ", delCvItemTaxes=" + delCvItemTaxes + ", fromTaxMdl=" + fromTaxMdl + "]";
	}
}

class PrqTransAcse {
	private String reqId;
	private String itemNo;
	private String tranTypeCd;
	private String itemName;
	private String glAcctId;
	private String refNo;
	private String remarks;
	private String currCd;
	private String currRate;
	private String currAmt;
	private String localAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private List<SaveCvItemTaxes> taxAllocation;
	
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(String glAcctId) {
		this.glAcctId = glAcctId;
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
	public List<SaveCvItemTaxes> getTaxAllocation() {
		return taxAllocation;
	}
	public void setTaxAllocation(List<SaveCvItemTaxes> taxAllocation) {
		this.taxAllocation = taxAllocation;
	}
	@Override
	public String toString() {
		return "PrqTransAcse [reqId=" + reqId + ", itemNo=" + itemNo + ", tranTypeCd=" + tranTypeCd + ", itemName="
				+ itemName + ", glAcctId=" + glAcctId + ", refNo=" + refNo + ", remarks=" + remarks + ", currCd="
				+ currCd + ", currRate=" + currRate + ", currAmt=" + currAmt + ", localAmt=" + localAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", taxAllocation=" + taxAllocation + "]";
	}
}

class SaveCvItemTaxes{
	private String reqId;
	private String itemNo;
	private String taxSeqNo;
	private String taxType;
	private String taxCd;
	private String taxRate;
	private String taxAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String genType;
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getTaxSeqNo() {
		return taxSeqNo;
	}
	public void setTaxSeqNo(String taxSeqNo) {
		this.taxSeqNo = taxSeqNo;
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
	@Override
	public String toString() {
		return "SaveCvItemTaxes [reqId=" + reqId + ", itemNo=" + itemNo + ", taxSeqNo=" + taxSeqNo + ", taxType="
				+ taxType + ", taxCd=" + taxCd + ", taxRate=" + taxRate + ", taxAmt=" + taxAmt + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", genType=" + genType + "]";
	}
	
}
