package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveClaimHistoryRequest {
	private List<ClmHist> saveClaimHistory;

	public List<ClmHist> getSaveClaimHistory() {
		return saveClaimHistory;
	}

	public void setSaveClaimHistory(List<ClmHist> saveClaimHistory) {
		this.saveClaimHistory = saveClaimHistory;
	}

	@Override
	public String toString() {
		return "SaveClaimHistoryRequest [saveClaimHistory=" + saveClaimHistory + "]";
	}
}

class ClmHist {
	private String  claimId;
	private String  projId;
	private String  histNo;
	private String 	histCategory;
	private String 	histType;
	private String	bookingMth;
	private String	bookingYear;
	private String 	exGratia;
	private String 	currencyCd;
	private String  currencyRt;
	private String  reserveAmt;
	//private String  paytAmt;
	private String 	refNo;
	private String  refDate;
	private String 	remarks;
	private String 	createUser;
	private String  createDate;
	private String 	updateUser;
	private String  updateDate;
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public String getHistType() {
		return histType;
	}
	public void setHistType(String histType) {
		this.histType = histType;
	}
	public String getBookingMth() {
		return bookingMth;
	}
	public void setBookingMth(String bookingMth) {
		this.bookingMth = bookingMth;
	}
	public String getBookingYear() {
		return bookingYear;
	}
	public void setBookingYear(String bookingYear) {
		this.bookingYear = bookingYear;
	}
	public String getExGratia() {
		return exGratia;
	}
	public void setExGratia(String exGratia) {
		this.exGratia = exGratia;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(String currencyRt) {
		this.currencyRt = currencyRt;
	}
	public String getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(String reserveAmt) {
		this.reserveAmt = reserveAmt;
	}
//	public String getPaytAmt() {
//		return paytAmt;
//	}
//	public void setPaytAmt(String paytAmt) {
//		this.paytAmt = paytAmt;
//	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getRefDate() {
		return refDate;
	}
	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		return "ClmHist [claimId=" + claimId + ", projId=" + projId + ", histNo=" + histNo + ", histCategory="
				+ histCategory + ", histType=" + histType + ", bookingMth=" + bookingMth + ", bookingYear="
				+ bookingYear + ", exGratia=" + exGratia + ", currencyCd=" + currencyCd + ", currencyRt=" + currencyRt
				+ ", reserveAmt=" + reserveAmt 
				//+ ", paytAmt=" + paytAmt 
				+ ", refNo=" + refNo + ", refDate=" + refDate
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}