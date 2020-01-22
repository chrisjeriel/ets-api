package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitInvestmentsListRequest {
	
	private Integer 	invtId;
	private String 		invtCd;
	private String  	bank;
	private String 		bankCd;
	private String		invtType;
	private String		invtSecCd;
	private String  	invtStatus;
	private Integer 	matPeriod;
	private String 		durUnit;
	private String 		purDate;	
	private String 		matDateFrom;
	private String 		matDateTo;
	private String 		currCd;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public Integer getInvtId() {
		return invtId;
	}
	public void setInvtId(Integer invtId) {
		this.invtId = invtId;
	}
	public String getInvtCd() {
		return invtCd;
	}
	public void setInvtCd(String invtCd) {
		this.invtCd = invtCd;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBankCd() {
		return bankCd;
	}
	public void setBankCd(String bankCd) {
		this.bankCd = bankCd;
	}
	public String getInvtType() {
		return invtType;
	}
	public void setInvtType(String invtType) {
		this.invtType = invtType;
	}
	public String getInvtSecCd() {
		return invtSecCd;
	}
	public void setInvtSecCd(String invtSecCd) {
		this.invtSecCd = invtSecCd;
	}
	public String getInvtStatus() {
		return invtStatus;
	}
	public void setInvtStatus(String invtStatus) {
		this.invtStatus = invtStatus;
	}
	public Integer getMatPeriod() {
		return matPeriod;
	}
	public void setMatPeriod(Integer matPeriod) {
		this.matPeriod = matPeriod;
	}
	public String getDurUnit() {
		return durUnit;
	}
	public void setDurUnit(String durUnit) {
		this.durUnit = durUnit;
	}
	public String getPurDate() {
		return purDate;
	}
	public void setPurDate(String purDate) {
		this.purDate = purDate;
	}
	public String getMatDateFrom() {
		return matDateFrom;
	}
	public void setMatDateFrom(String matDateFrom) {
		this.matDateFrom = matDateFrom;
	}
	public String getMatDateTo() {
		return matDateTo;
	}
	public void setMatDateTo(String matDateTo) {
		this.matDateTo = matDateTo;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public PaginationRequest getPaginationRequest() {
		return paginationRequest;
	}
	public void setPaginationRequest(PaginationRequest paginationRequest) {
		this.paginationRequest = paginationRequest;
	}
	public SortRequest getSortRequest() {
		return sortRequest;
	}
	public void setSortRequest(SortRequest sortRequest) {
		this.sortRequest = sortRequest;
	}
	
	@Override
	public String toString() {
		return "RetrieveAcitInvestmentsListRequest [invtId=" + invtId + ", invtCd=" + invtCd + ", bank=" + bank
				+ ", bankCd=" + bankCd + ", invtType=" + invtType + ", invtSecCd=" + invtSecCd + ", invtStatus="
				+ invtStatus + ", matPeriod=" + matPeriod + ", durUnit=" + durUnit + ", purDate=" + purDate
				+ ", matDateFrom=" + matDateFrom + ", matDateTo=" + matDateTo + ", currCd=" + currCd
				+ ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
	}

}
