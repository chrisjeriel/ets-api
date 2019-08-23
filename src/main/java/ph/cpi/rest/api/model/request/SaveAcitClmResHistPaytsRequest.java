package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcitClmResHistPaytsRequest {
	
	private List<resHistPayts> saveResHistPayments;
	private List<resHistPayts> delResHistPayments;
	
	public List<resHistPayts> getSaveResHistPayments() {
		return saveResHistPayments;
	}

	public void setSaveResHistPayments(List<resHistPayts> saveResHistPayments) {
		this.saveResHistPayments = saveResHistPayments;
	}
	

	public List<resHistPayts> getDelResHistPayments() {
		return delResHistPayments;
	}

	public void setDelResHistPayments(List<resHistPayts> delResHistPayments) {
		this.delResHistPayments = delResHistPayments;
	}

	@Override
	public String toString() {
		return "SaveAcitClmResHistPaytsRequest [saveResHistPayments=" + saveResHistPayments + ", delResHistPayments="
				+ delResHistPayments + "]";
	}
}

@Alias ("ACITResHistPayts")
class resHistPayts{
	private Integer tranId;
	private Integer claimId;
	private Integer projId;
	private Integer histNo;
	private String histCategory;
	private Integer histType;
	private String exGratia;
	private BigDecimal reserveAmt;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal paytAmt;
	private BigDecimal localAmt;
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
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public Integer getHistType() {
		return histType;
	}
	public void setHistType(Integer histType) {
		this.histType = histType;
	}
	public String getExGratia() {
		return exGratia;
	}
	public void setExGratia(String exGratia) {
		this.exGratia = exGratia;
	}
	public BigDecimal getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(BigDecimal reserveAmt) {
		this.reserveAmt = reserveAmt;
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
	public BigDecimal getPaytAmt() {
		return paytAmt;
	}
	public void setPaytAmt(BigDecimal paytAmt) {
		this.paytAmt = paytAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
	
}