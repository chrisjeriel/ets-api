package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SavePolAlopItemRequest {
	
	private Integer policyId;
	private List<PolAlopItem> saveAlopItemList;
	
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public List<PolAlopItem> getSaveAlopItemList() {
		return saveAlopItemList;
	}
	public void setSaveAlopItemList(List<PolAlopItem> saveAlopItemList) {
		this.saveAlopItemList = saveAlopItemList;
	}
	@Override
	public String toString() {
		return "SavePolAlopItemRequest [policyId=" + policyId + ", saveAlopItemList=" + saveAlopItemList
				+ "]";
	}
	
}

@Alias("SavePolAlopItem")
class PolAlopItem {
	private Integer itemNo;
	private Integer quantity;
	private String description;
	private String importance;
	private String lossMin;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	public String getLossMin() {
		return lossMin;
	}

	public void setLossMin(String lossMin) {
		this.lossMin = lossMin;
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
		return "AlopItem [itemNo=" + itemNo + ", quantity=" + quantity + ", description=" + description
				+ ", importance=" + importance + ", lossMin=" + lossMin + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}

}
