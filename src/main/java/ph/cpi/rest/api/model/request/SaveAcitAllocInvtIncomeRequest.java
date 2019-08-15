package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcitAllocInvtIncomeRequest {
	//ACIT_ALLOC_INVT_INCOME
		private String allocTranId;
		public String getAllocTranId() {
			return allocTranId;
		}
		public void setAllocTranId(String allocTranId) {
			this.allocTranId = allocTranId;
		}
   //ACIT_ALLOC_INVT_INCOME_DTL
		
		
		private List<saveAcitAllocInvtIncome> saveAcitAllocInvtIncome;
		private List<saveAcitAllocInvtIncome> delAcitAllocInvtIncome;
		
		public List<saveAcitAllocInvtIncome> getSaveAcitAllocInvtIncome() {
			return saveAcitAllocInvtIncome;
		}
		public void setSaveAcitAllocInvtIncome(List<saveAcitAllocInvtIncome> saveAcitAllocInvtIncome) {
			this.saveAcitAllocInvtIncome = saveAcitAllocInvtIncome;
		}
		public List<saveAcitAllocInvtIncome> getDelAcitAllocInvtIncome() {
			return delAcitAllocInvtIncome;
		}
		public void setDelAcitAllocInvtIncome(List<saveAcitAllocInvtIncome> delAcitAllocInvtIncome) {
			this.delAcitAllocInvtIncome = delAcitAllocInvtIncome;
		}
		@Override
		public String toString() {
			return "SaveAcitAllocInvtIncomeRequest [allocTranId=" + allocTranId + ", saveAcitAllocInvtIncome="
					+ saveAcitAllocInvtIncome + ", delAcitAllocInvtIncome=" + delAcitAllocInvtIncome + "]";
		}
}

class saveAcitAllocInvtIncome{
	
	private String refTranId;
	private String createDate;
	private String createUser;
	private String updateDate;
	private String updateUser;
	
	public String getRefTranId() {
		return refTranId;
	}
	public void setRefTranId(String refTranId) {
		this.refTranId = refTranId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
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
		return "saveAcitAllocInvtIncome [refTranId=" + refTranId + ", createDate=" + createDate + ", createUser="
				+ createUser + ", updateDate=" + updateDate + ", updateUser=" + updateUser + "]";
	}
}
