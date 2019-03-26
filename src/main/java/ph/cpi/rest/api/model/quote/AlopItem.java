package ph.cpi.rest.api.model.quote;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class AlopItem {
	private Integer itemNo;
	private Integer quantity;
	private String description;
	private String importance;
	private String lossMin;
	private String createUserItem;
	private DateTime createDateItem;
	private String updateUserItem;
	private DateTime updateDateItem;

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
	public DateTime getCreateDateItem() {
		return createDateItem;
	}
	public void setCreateDateItem(DateTime createDateItem) {
		this.createDateItem = createDateItem;
	}
	public String getUpdateUserItem() {
		return updateUserItem;
	}
	public void setUpdateUserItem(String updateUserItem) {
		this.updateUserItem = updateUserItem;
	}
	public DateTime getUpdateDateItem() {
		return updateDateItem;
	}
	public void setUpdateDateItem(DateTime updateDateItem) {
		this.updateDateItem = updateDateItem;
	}
	@Override
	public String toString() {
		return "AlopItem [itemNo=" + itemNo + ", quantity=" + quantity + ", description=" + description
				+ ", importance=" + importance + ", lossMin=" + lossMin + ", createUserItem=" + createUserItem + ", createDateItem="
				+ createDateItem + ", updateUserItem=" + updateUserItem + ", updateDateItem=" + updateDateItem + "]";
	}
	
}
