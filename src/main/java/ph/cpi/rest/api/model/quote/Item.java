package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;
@Alias("QuoteItem")
public class Item {
	private Integer	itemNo;
	private Integer	quantity;
	private String	itemDesc;
	private String	makeYear;
	private String	deductibleTxt;
	private BigDecimal	sumInsured;
	private String	stockType;
	private String	serialNo;
	private String	location;
	private String  chamberNo;
	private String	noClaimPd;
	private Integer ipl;
	private String  relativeImp;
	private String  standbyUnit;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String section;
	
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
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
	
	public BigDecimal getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(BigDecimal sumInsured) {
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
	
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	@Override
	public String toString() {
		return "Item [itemNo=" + itemNo + ", quantity=" + quantity + ", itemDesc=" + itemDesc + ", makeYear=" + makeYear
				+ ", deductibleTxt=" + deductibleTxt + ", sumInsured=" + sumInsured + ", stockType=" + stockType
				+ ", serialNo=" + serialNo + ", location=" + location + ", chamberNo=" + chamberNo + ", noClaimPd="
				+ noClaimPd + ", ipl=" + ipl + ", relativeImp=" + relativeImp + ", standbyUnit=" + standbyUnit
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", section=" + section + "]";
	}
	
	
}
