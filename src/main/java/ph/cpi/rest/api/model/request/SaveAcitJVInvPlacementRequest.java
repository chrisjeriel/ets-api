package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcitJVInvPlacementRequest {
	private List<InvPlacement> saveInvPlacement;
	private List<InvPlacement> delInvPlacement;
	public List<InvPlacement> getSaveInvPlacement() {
		return saveInvPlacement;
	}

	public void setSaveInvPlacement(List<InvPlacement> saveInvPlacement) {
		this.saveInvPlacement = saveInvPlacement;
	}

	public List<InvPlacement> getDelInvPlacement() {
		return delInvPlacement;
	}

	public void setDelInvPlacement(List<InvPlacement> delInvPlacement) {
		this.delInvPlacement = delInvPlacement;
	}

	@Override
	public String toString() {
		return "SaveAcitJVInvPlacementRequest [saveInvPlacement=" + saveInvPlacement + ", delInvPlacement="
				+ delInvPlacement + "]";
	}
	
}

@Alias ("ACITInvPlacement")
class InvPlacement {
	private Integer tranId;
    private Integer itemNo;
    private Integer invtId;
    private String bank;
    private String bankAcct;
    private String currCd;
    private BigDecimal currRate;
    private BigDecimal invtAmt;
    private String createUser;
    private String createDate;
    private String updateUser;
    private String updateDate;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public Integer getInvtId() {
		return invtId;
	}
	public void setInvtId(Integer invtId) {
		this.invtId = invtId;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBankAcct() {
		return bankAcct;
	}
	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getInvtAmt() {
		return invtAmt;
	}
	public void setInvtAmt(BigDecimal invtAmt) {
		this.invtAmt = invtAmt;
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
		return "InvPlacement [tranId=" + tranId + ", itemNo=" + itemNo + ", invtId=" + invtId + ", bank=" + bank
				+ ", bankAcct=" + bankAcct + ", currCd=" + currCd + ", currRate=" + currRate + ", invtAmt=" + invtAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}