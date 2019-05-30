package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

public class SaveMtnParametersRequest {
	private List<MtnParameters> delParameters;
	private List<MtnParameters> saveParameters;
	public List<MtnParameters> getDelParameters() {
		return delParameters;
	}
	public void setDelParameters(List<MtnParameters> delParameters) {
		this.delParameters = delParameters;
	}
	public List<MtnParameters> getSaveParameters() {
		return saveParameters;
	}
	public void setSaveParameters(List<MtnParameters> saveParameters) {
		this.saveParameters = saveParameters;
	}
	@Override
	public String toString() {
		return "SaveMtnParametersRequest [delParameters=" + delParameters + ", saveParameters=" + saveParameters + "]";
	}
}

@Alias ("MtnParameters")
class MtnParameters{
	private String paramType;
	private String paramName;
	private String paramValueN;
	private String paramValueV;
	private String paramValueD;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
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
		return "MtnParameters [paramType=" + paramType + ", paramName=" + paramName + ", paramValueN=" + paramValueN
				+ ", paramValueV=" + paramValueV + ", paramValueD=" + paramValueD + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}