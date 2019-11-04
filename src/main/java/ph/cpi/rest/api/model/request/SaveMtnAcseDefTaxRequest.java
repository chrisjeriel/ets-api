package ph.cpi.rest.api.model.request;
import java.util.List;

public class SaveMtnAcseDefTaxRequest {
	private List<defTaxes> saveDefTax;
	private List<defTaxes> delDefTax;
	private List<defWhTaxes> saveDefWhTax;
	private List<defWhTaxes> delDefWhTax;
	public List<defTaxes> getSaveDefTax() {
		return saveDefTax;
	}
	public void setSaveDefTax(List<defTaxes> saveDefTax) {
		this.saveDefTax = saveDefTax;
	}
	public List<defTaxes> getDelDefTax() {
		return delDefTax;
	}
	public void setDelDefTax(List<defTaxes> delDefTax) {
		this.delDefTax = delDefTax;
	}
	public List<defWhTaxes> getSaveDefWhTax() {
		return saveDefWhTax;
	}
	public void setSaveDefWhTax(List<defWhTaxes> saveDefWhTax) {
		this.saveDefWhTax = saveDefWhTax;
	}
	public List<defWhTaxes> getDelDefWhTax() {
		return delDefWhTax;
	}
	public void setDelDefWhTax(List<defWhTaxes> delDefWhTax) {
		this.delDefWhTax = delDefWhTax;
	}
	@Override
	public String toString() {
		return "SaveMtnAcseDefTaxRequest [saveDefTax=" + saveDefTax + ", delDefTax=" + delDefTax + ", saveDefWhTax="
				+ saveDefWhTax + ", delDefWhTax=" + delDefWhTax + "]";
	}
	
}

class defTaxes{
	private String tranClass;
	private Integer tranTypeCd;
	private Integer taxId;
	private String particulars;
	private String activeTag;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public Integer getTaxId() {
		return taxId;
	}
	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "defTaxes [tranClass=" + tranClass + ", tranTypeCd=" + tranTypeCd + ", taxId=" + taxId + ", particulars="
				+ particulars + ", activeTag=" + activeTag + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}

class defWhTaxes {
	private String tranClass;
	private String tranTypeCd;
	private Integer whTaxId;
	private String particulars;
	private String activeTag;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public Integer getWhTaxId() {
		return whTaxId;
	}
	public void setWhTaxId(Integer whTaxId) {
		this.whTaxId = whTaxId;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "defWhTaxes [tranClass=" + tranClass + ", tranTypeCd=" + tranTypeCd + ", whTaxId=" + whTaxId
				+ ", particulars=" + particulars + ", activeTag=" + activeTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}