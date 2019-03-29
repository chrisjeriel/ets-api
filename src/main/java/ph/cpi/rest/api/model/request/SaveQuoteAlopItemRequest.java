package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveQuoteAlopItemRequest {
	private Integer quoteId;
	private List<AlopItem> saveAlopItemList;
	private List<AlopItem> deleteAlopItemList;
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public List<AlopItem> getSaveAlopItemList() {
		return saveAlopItemList;
	}
	public void setSaveAlopItemList(List<AlopItem> saveAlopItemList) {
		this.saveAlopItemList = saveAlopItemList;
	}
	public List<AlopItem> getDeleteAlopItemList() {
		return deleteAlopItemList;
	}
	public void setDeleteAlopItemList(List<AlopItem> deleteAlopItemList) {
		this.deleteAlopItemList = deleteAlopItemList;
	}
	@Override
	public String toString() {
		return "SaveQuoteAlopItemRequest [quoteId=" + quoteId + ", saveAlopItemList=" + saveAlopItemList
				+ ", deleteAlopItemList=" + deleteAlopItemList + "]";
	}
	
	
	
	
}

@Alias("SaveQuoteAlopItem")
class AlopItem{
	private Integer optionId;
	private Integer itemNo ;
	private Integer quantity;
	private String description;
	private String importance;
	private String lossMin;
	private String createUserItem;
	private String createDateItem;
	private String updateUserItem;
	private String updateDateItem;
	
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
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
	public String getCreateUserItem() {
		return createUserItem;
	}
	public void setCreateUserItem(String createUserItem) {
		this.createUserItem = createUserItem;
	}
	public String getCreateDateItem() {
		return createDateItem;
	}
	public void setCreateDateItem(String createDateItem) {
		this.createDateItem = createDateItem;
	}
	public String getUpdateUserItem() {
		return updateUserItem;
	}
	public void setUpdateUserItem(String updateUserItem) {
		this.updateUserItem = updateUserItem;
	}
	public String getUpdateDateItem() {
		return updateDateItem;
	}
	public void setUpdateDateItem(String updateDateItem) {
		this.updateDateItem = updateDateItem;
	}
	@Override
	public String toString() {
		return "AlopItem [optionId=" + optionId + ", itemNo=" + itemNo + ", quantity=" + quantity + ", description="
				+ description + ", importance=" + importance + ", lossMin=" + lossMin + ", createUserItem="
				+ createUserItem + ", createDateItem=" + createDateItem + ", updateUserItem=" + updateUserItem
				+ ", updateDateItem=" + updateDateItem + "]";
	}
}