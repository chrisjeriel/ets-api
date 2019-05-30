package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class ExpItem {
	private String policyId; 
	private String projId; 
	private String itemNo; 
	private String quantity; 
	private String itemDesc; 
	private String makeYear; 
	private String deductibleTxt; 
	private String sumInsured; 
	private String stockType; 
	private String serialNo; 
	private String location; 
	private String chamberNo; 
	private String noClaimPd; 
	private String ipl; 
	private String relativeImp; 
	private String standbyUnit; 
	private String createUser; 
	private DateTime createDate; 
	private String updateUser; 
	private DateTime updateDate;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public String getMakeYear() {
		return makeYear;
	}
	public void setMakeYear(String makeYear) {
		this.makeYear = makeYear;
	}
	public String getDeductibleTxt() {
		return deductibleTxt;
	}
	public void setDeductibleTxt(String deductibleTxt) {
		this.deductibleTxt = deductibleTxt;
	}
	public String getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getStockType() {
		return stockType;
	}
	public void setStockType(String stockType) {
		this.stockType = stockType;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getChamberNo() {
		return chamberNo;
	}
	public void setChamberNo(String chamberNo) {
		this.chamberNo = chamberNo;
	}
	public String getNoClaimPd() {
		return noClaimPd;
	}
	public void setNoClaimPd(String noClaimPd) {
		this.noClaimPd = noClaimPd;
	}
	public String getIpl() {
		return ipl;
	}
	public void setIpl(String ipl) {
		this.ipl = ipl;
	}
	public String getRelativeImp() {
		return relativeImp;
	}
	public void setRelativeImp(String relativeImp) {
		this.relativeImp = relativeImp;
	}
	public String getStandbyUnit() {
		return standbyUnit;
	}
	public void setStandbyUnit(String standbyUnit) {
		this.standbyUnit = standbyUnit;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "ExpItem [policyId=" + policyId + ", projId=" + projId + ", itemNo=" + itemNo + ", quantity=" + quantity
				+ ", itemDesc=" + itemDesc + ", makeYear=" + makeYear + ", deductibleTxt=" + deductibleTxt
				+ ", sumInsured=" + sumInsured + ", stockType=" + stockType + ", serialNo=" + serialNo + ", location="
				+ location + ", chamberNo=" + chamberNo + ", noClaimPd=" + noClaimPd + ", ipl=" + ipl + ", relativeImp="
				+ relativeImp + ", standbyUnit=" + standbyUnit + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	} 
	
}
