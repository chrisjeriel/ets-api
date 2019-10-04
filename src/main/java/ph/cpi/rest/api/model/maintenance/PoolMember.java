package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class PoolMember {
	private String currencyCd;
	private Integer retHistId;
	private String cedingId;
	private String cedingName;
	private Integer retLine1;
	private Integer retLine2;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String okDelete;
	
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getRetHistId() {
		return retHistId;
	}
	public void setRetHistId(Integer retHistId) {
		this.retHistId = retHistId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public Integer getRetLine1() {
		return retLine1;
	}
	public void setRetLine1(Integer retLine1) {
		this.retLine1 = retLine1;
	}
	public Integer getRetLine2() {
		return retLine2;
	}
	public void setRetLine2(Integer retLine2) {
		this.retLine2 = retLine2;
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
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
	@Override
	public String toString() {
		return "PoolMember [currencyCd=" + currencyCd + ", retHistId=" + retHistId + ", cedingId=" + cedingId
				+ ", cedingName=" + cedingName + ", retLine1=" + retLine1 + ", retLine2=" + retLine2 + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", okDelete=" + okDelete + "]";
	}
}
