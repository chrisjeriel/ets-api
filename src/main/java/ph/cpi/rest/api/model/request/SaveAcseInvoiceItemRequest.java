package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcseInvoiceItemRequest {
	
	private List<AcseInvoiceItem> invoiceItemList;
	private List<AcseInvoiceItem> invoiceDelItemList;
	
	public List<AcseInvoiceItem> getInvoiceDelItemList() {
		return invoiceDelItemList;
	}

	public void setInvoiceDelItemList(List<AcseInvoiceItem> invoiceDelItemList) {
		this.invoiceDelItemList = invoiceDelItemList;
	}

	public List<AcseInvoiceItem> getInvoiceItemList() {
		return invoiceItemList;
	}

	public void setInvoiceItemList(List<AcseInvoiceItem> invoiceItemList) {
		this.invoiceItemList = invoiceItemList;
	}
	
	@Override
	public String toString() {
		return "SaveAcseInvoiceItemRequest [invoiceItemList=" + invoiceItemList
				+ ", invoiceDelItemList=" + invoiceDelItemList + "]";
	}
}

class AcseInvoiceItem {
	
	private String invoiceId; 
	private String itemNo;
	private String itemDesc;
	private String currCd;
	private String currRate;
	private String itemAmt;
	private String localAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
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
	public String getItemAmt() {
		return itemAmt;
	}
	public void setItemAmt(String itemAmt) {
		this.itemAmt = itemAmt;
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
		return "AcseInvoiceItem [invoiceId=" + invoiceId + ", itemNo=" + itemNo
				+ ", itemDesc=" + itemDesc + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", itemAmt=" + itemAmt
				+ ", localAmt=" + localAmt + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
