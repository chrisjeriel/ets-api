package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class Parameters {
	private String paramType;
	private String paramName;
	private String paramValueN;
	private String paramValueV;
	private String paramValueD;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public String getParamType() {
		return paramType;
	}
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	public String getParamValueN() {
		return paramValueN;
	}
	public void setParamValueN(String paramValueN) {
		this.paramValueN = paramValueN;
	}
	public String getParamValueV() {
		return paramValueV;
	}
	public void setParamValueV(String paramValueV) {
		this.paramValueV = paramValueV;
	}
	public String getParamValueD() {
		return paramValueD;
	}
	public void setParamValueD(String paramValueD) {
		this.paramValueD = paramValueD;
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
	@Override
	public String toString() {
		return "Parameters [paramType=" + paramType + ", paramName=" + paramName + ", paramValueN=" + paramValueN
				+ ", paramValueV=" + paramValueV + ", paramValueD=" + paramValueD + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
