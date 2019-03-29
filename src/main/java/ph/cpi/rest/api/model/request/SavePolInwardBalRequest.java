package ph.cpi.rest.api.model.request;

import java.util.List;


public class SavePolInwardBalRequest {
	
	private String policyId; 
	private List<savePolInward> savePolInward;
	private List<savePolInward> delPolInward;
	private List<savePolOtherCharges> saveOtherCharges;
	private List<savePolOtherCharges> delOtherCharges;
	private List<savePolInward> newSavePolInward;
	
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public List<savePolInward> getSavePolInward() {
		return savePolInward;
	}
	public void setSavePolInward(List<savePolInward> savePolInward) {
		this.savePolInward = savePolInward;
	}
	public List<savePolInward> getDelPolInward() {
		return delPolInward;
	}
	public void setDelPolInward(List<savePolInward> delPolInward) {
		this.delPolInward = delPolInward;
	}
	
	public List<savePolOtherCharges> getSaveOtherCharges() {
		return saveOtherCharges;
	}
	public void setSaveOtherCharges(List<savePolOtherCharges> saveOtherCharges) {
		this.saveOtherCharges = saveOtherCharges;
	}
	public List<savePolOtherCharges> getDelOtherCharges() {
		return delOtherCharges;
	}
	public void setDelOtherCharges(List<savePolOtherCharges> delOtherCharges) {
		this.delOtherCharges = delOtherCharges;
	}
	
	public List<savePolInward> getNewSavePolInward() {
		return newSavePolInward;
	}
	public void setNewSavePolInward(List<savePolInward> newSavePolInward) {
		this.newSavePolInward = newSavePolInward;
	}
	@Override
	public String toString() {
		return "SavePolInwardBalRequest [policyId=" + policyId + ", savePolInward=" + savePolInward + ", delPolInward="
				+ delPolInward + ", saveOtherCharges=" + saveOtherCharges + ", delOtherCharges=" + delOtherCharges
				+ ", newSavePolInward=" + newSavePolInward + "]";
	}
	
}

class savePolInward{
	private String instNo;
	private String dueDate;
	private String bookingDate;
	private String premAmt;
	private String otherChargesInw;
	private String amtDue;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private List<savePolOtherCharges> otherCharges;
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(String premAmt) {
		this.premAmt = premAmt;
	}
	public String getOtherChargesInw() {
		return otherChargesInw;
	}
	public void setOtherChargesInw(String otherChargesInw) {
		this.otherChargesInw = otherChargesInw;
	}
	public String getAmtDue() {
		return amtDue;
	}
	public void setAmtDue(String amtDue) {
		this.amtDue = amtDue;
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
	public List<savePolOtherCharges> getOtherCharges() {
		return otherCharges;
	}
	public void setOtherCharges(List<savePolOtherCharges> otherCharges) {
		this.otherCharges = otherCharges;
	}
	@Override
	public String toString() {
		return "savePolInward [instNo=" + instNo + ", dueDate=" + dueDate + ", bookingDate=" + bookingDate
				+ ", premAmt=" + premAmt + ", otherChargesInw=" + otherChargesInw + ", amtDue=" + amtDue
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", otherCharges=" + otherCharges + "]";
	}
	
	
		
}

class savePolOtherCharges{
	private String instNo ;
	private String chargeCd;
	private String amount;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getChargeCd() {
		return chargeCd;
	}
	public void setChargeCd(String chargeCd) {
		this.chargeCd = chargeCd;
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
		return "savePolOtherCharges [instNo=" + instNo + ", chargeCd=" + chargeCd + ", amount=" + amount
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}

	
	
}