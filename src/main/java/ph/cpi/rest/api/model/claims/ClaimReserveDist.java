package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class ClaimReserveDist {
	private String histCategory;
	private String histCategoryName;
	private String clmDistNo;
	private BigDecimal reserveAmt;
	private String currencyCd;
	private BigDecimal currencyRt;
	private String bookingMth;
	private Integer bookingYear;
	private String clmDistStat;
	private String clmDistStatName;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private List<ClaimReserveDistTreaty> treatyList;
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public String getHistCategoryName() {
		return histCategoryName;
	}
	public void setHistCategoryName(String histCategoryName) {
		this.histCategoryName = histCategoryName;
	}
	public String getClmDistNo() {
		return clmDistNo;
	}
	public void setClmDistNo(String clmDistNo) {
		this.clmDistNo = clmDistNo;
	}
	public BigDecimal getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(BigDecimal reserveAmt) {
		this.reserveAmt = reserveAmt;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public BigDecimal getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(BigDecimal currencyRt) {
		this.currencyRt = currencyRt;
	}
	public String getBookingMth() {
		return bookingMth;
	}
	public void setBookingMth(String bookingMth) {
		this.bookingMth = bookingMth;
	}
	public Integer getBookingYear() {
		return bookingYear;
	}
	public void setBookingYear(Integer bookingYear) {
		this.bookingYear = bookingYear;
	}
	public String getClmDistStat() {
		return clmDistStat;
	}
	public void setClmDistStat(String clmDistStat) {
		this.clmDistStat = clmDistStat;
	}
	public String getClmDistStatName() {
		return clmDistStatName;
	}
	public void setClmDistStatName(String clmDistStatName) {
		this.clmDistStatName = clmDistStatName;
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
	public List<ClaimReserveDistTreaty> getTreatyList() {
		return treatyList;
	}
	public void setTreatyList(List<ClaimReserveDistTreaty> treatyList) {
		this.treatyList = treatyList;
	}
	@Override
	public String toString() {
		return "ClaimReserveDist [histCategory=" + histCategory + ", histCategoryName=" + histCategoryName
				+ ", clmDistNo=" + clmDistNo + ", reserveAmt=" + reserveAmt + ", currencyCd=" + currencyCd
				+ ", currencyRt=" + currencyRt + ", bookingMth=" + bookingMth + ", bookingYear=" + bookingYear
				+ ", clmDistStat=" + clmDistStat + ", clmDistStatName=" + clmDistStatName + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", treatyList=" + treatyList + "]";
	}
	
	
}
