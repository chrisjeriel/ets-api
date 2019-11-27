package ph.cpi.rest.api.model.request;

import java.util.List;

public class GenerateBatchOrNoRequest {
	
	private List<GenerateOrNo> orNoList;

	public List<GenerateOrNo> getOrNoList() {
		return orNoList;
	}

	public void setOrNoList(List<GenerateOrNo> orNoList) {
		this.orNoList = orNoList;
	}
	
	@Override
	public String toString() {
		return "GenerateBatchOrNoRequest [orNoList=" + orNoList + "]";
	}
}

class GenerateOrNo {
	
	private String tranId;
	private String orNo;
	private String orType;
	private String updateUser;
	private String updateDate;
	
	public String getOrType() {
		return orType;
	}
	public void setOrType(String orType) {
		this.orType = orType;
	}
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getOrNo() {
		return orNo;
	}
	public void setOrNo(String orNo) {
		this.orNo = orNo;
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
		return "GenerateOrNo [tranId=" + tranId + ", orNo=" + orNo
				+ ", orType=" + orType + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}

}