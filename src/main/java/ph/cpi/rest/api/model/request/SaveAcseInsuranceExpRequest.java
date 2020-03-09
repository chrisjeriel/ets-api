package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcseInsuranceExpRequest {
	private List<InsExpAcse> deleteInsuranceExp;
	private List<InsExpAcse> saveInsuranceExp;
	private List<SaveCvItemTaxes> delCvItemTaxes;
	private String fromTaxMdl;
	public List<InsExpAcse> getDeleteInsuranceExp() {
		return deleteInsuranceExp;
	}
	public void setDeleteInsuranceExp(List<InsExpAcse> deleteInsuranceExp) {
		this.deleteInsuranceExp = deleteInsuranceExp;
	}
	public List<InsExpAcse> getSaveInsuranceExp() {
		return saveInsuranceExp;
	}
	public void setSaveInsuranceExp(List<InsExpAcse> saveInsuranceExp) {
		this.saveInsuranceExp = saveInsuranceExp;
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
		return "SaveAcseInsuranceExpRequest [deleteInsuranceExp=" + deleteInsuranceExp + ", saveInsuranceExp="
				+ saveInsuranceExp + ", delCvItemTaxes=" + delCvItemTaxes + ", fromTaxMdl=" + fromTaxMdl + "]";
	}
}

class InsExpAcse {
	private String reqId;
	private String itemNo;
	private String insuredTypeCd;
	private String insuredCd;
	private String insuredName;
	private String insuranceType;
	private String currCd;
	private String currRate;
	private String insuredAmt;
	private String localAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String reimburseTag;
	private String accruedTag;
	private String remarks;
	private String vatTag;
	
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
	public String getInsuredTypeCd() {
		return insuredTypeCd;
	}
	public void setInsuredTypeCd(String insuredTypeCd) {
		this.insuredTypeCd = insuredTypeCd;
	}
	public String getInsuredCd() {
		return insuredCd;
	}
	public void setInsuredCd(String insuredCd) {
		this.insuredCd = insuredCd;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
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
	public String getInsuredAmt() {
		return insuredAmt;
	}
	public void setInsuredAmt(String insuredAmt) {
		this.insuredAmt = insuredAmt;
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
	public String getReimburseTag() {
		return reimburseTag;
	}
	public void setReimburseTag(String reimburseTag) {
		this.reimburseTag = reimburseTag;
	}
	public String getAccruedTag() {
		return accruedTag;
	}
	public void setAccruedTag(String accruedTag) {
		this.accruedTag = accruedTag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public List<SaveCvItemTaxes> getTaxAllocation() {
		return taxAllocation;
	}
	public void setTaxAllocation(List<SaveCvItemTaxes> taxAllocation) {
		this.taxAllocation = taxAllocation;
	}
	public String getVatTag() {
		return vatTag;
	}
	public void setVatTag(String vatTag) {
		this.vatTag = vatTag;
	}
	@Override
	public String toString() {
		return "InsExpAcse [reqId=" + reqId + ", itemNo=" + itemNo + ", insuredTypeCd=" + insuredTypeCd + ", insuredCd="
				+ insuredCd + ", insuredName=" + insuredName + ", insuranceType=" + insuranceType + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", insuredAmt=" + insuredAmt + ", localAmt=" + localAmt + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", reimburseTag=" + reimburseTag + ", accruedTag=" + accruedTag + ", remarks=" + remarks
				+ ", vatTag=" + vatTag + ", taxAllocation=" + taxAllocation + "]";
	}
}