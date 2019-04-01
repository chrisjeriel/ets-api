package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SavePolItemRequest {
	
	private Integer policyId;
	private Integer projId;
	private List<Items> saveItemLists;
	private List<Items> deleteItemLists;
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public List<Items> getSaveItemLists() {
		return saveItemLists;
	}
	public void setSaveItemLists(List<Items> saveItemLists) {
		this.saveItemLists = saveItemLists;
	}
	public List<Items> getDeleteItemLists() {
		return deleteItemLists;
	}
	public void setDeleteItemLists(List<Items> deleteItemLists) {
		this.deleteItemLists = deleteItemLists;
	}
	@Override
	public String toString() {
		return "SavePolItemRequest [policyId=" + policyId + ", projId=" + projId + ", saveItemLists=" + saveItemLists
				+ ", deleteItemLists=" + deleteItemLists + "]";
	}
	
		
}

@Alias("SavePolItem")
class Items {
	private Integer	itemNo;
	private Integer	quantity;
	private String	itemDesc;
	private String	makeYear;
	private String	deductibleTxt;
	private Integer	sumInsured;
	private String	stockType;
	private String	serialNo;
	private String	location;
	private String  chamberNo;
	private Integer	noClaimPd;
	private Integer ipl;
	private String  relativeImp;
	private String  standbyUnit;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
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
	public Integer getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(Integer sumInsured) {
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
	public Integer getNoClaimPd() {
		return noClaimPd;
	}
	public void setNoClaimPd(Integer noClaimPd) {
		this.noClaimPd = noClaimPd;
	}
	public Integer getIpl() {
		return ipl;
	}
	public void setIpl(Integer ipl) {
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
		return "Item [itemNo=" + itemNo + ", quantity=" + quantity + ", itemDesc=" + itemDesc
				+ ", makeYear=" + makeYear + ", deductibleTxt=" + deductibleTxt + ", sumInsured=" + sumInsured
				+ ", stockType=" + stockType + ", serialNo=" + serialNo + ", location=" + location + ", chamberNo="
				+ chamberNo + ", noClaimPd=" + noClaimPd + ", ipl=" + ipl + ", relativeImp=" + relativeImp
				+ ", standbyUnit=" + standbyUnit + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}

	
	
