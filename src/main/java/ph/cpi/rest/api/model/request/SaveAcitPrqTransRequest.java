package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveAcitPrqTransRequest {
	private List<PrqTrans> deletePrqTrans;
	private List<PrqTrans> savePrqTrans;
	public List<PrqTrans> getDeletePrqTrans() {
		return deletePrqTrans;
	}
	public void setDeletePrqTrans(List<PrqTrans> deletePrqTrans) {
		this.deletePrqTrans = deletePrqTrans;
	}
	public List<PrqTrans> getSavePrqTrans() {
		return savePrqTrans;
	}
	public void setSavePrqTrans(List<PrqTrans> savePrqTrans) {
		this.savePrqTrans = savePrqTrans;
	}
	@Override
	public String toString() {
		return "SaveAcitPrqTransRequest [deletePrqTrans=" + deletePrqTrans + ", savePrqTrans=" + savePrqTrans + "]";
	}
}

class PrqTrans {
	private String reqId;
	private String itemNo;
	private String tranTypeCd;
	private String claimId;
	private String projId;
	private String histNo;
	private String policyId;
	private String instNo;
	private String quarterEnding;
	private String invtId;
	private String refNo;
	private String transdtlType;
	private String itemName;
	private String paymentFor;
	private String currCd;
	private String currRate;
	private String currAmt;
	private String localAmt;
	private String allotedAmt;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private SavePrqInwPolLoc inwPol;
	
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(String quarterEnding) {
		this.quarterEnding = quarterEnding;
	}
	public String getInvtId() {
		return invtId;
	}
	public void setInvtId(String investmentId) {
		this.invtId = investmentId;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getTransdtlType() {
		return transdtlType;
	}
	public void setTransdtlType(String transdtlType) {
		this.transdtlType = transdtlType;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getPaymentFor() {
		return paymentFor;
	}
	public void setPaymentFor(String paymentFor) {
		this.paymentFor = paymentFor;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getCurrRate() {
		return currRate;
	}
	public void setCurrRate(String currRate) {
		this.currRate = currRate;
	}
	public String getCurrAmt() {
		return currAmt;
	}
	public void setCurrAmt(String currAmt) {
		this.currAmt = currAmt;
	}
	public String getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(String localAmt) {
		this.localAmt = localAmt;
	}
	public String getAllotedAmt() {
		return allotedAmt;
	}
	public void setAllotedAmt(String allotedAmt) {
		this.allotedAmt = allotedAmt;
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
	public SavePrqInwPolLoc getInwPol() {
		return inwPol;
	}
	public void setInwPol(SavePrqInwPolLoc inwPol) {
		this.inwPol = inwPol;
	}
	@Override
	public String toString() {
		return "PrqTrans [reqId=" + reqId + ", itemNo=" + itemNo + ", tranTypeCd=" + tranTypeCd + ", claimId=" + claimId
				+ ", projId=" + projId + ", histNo=" + histNo + ", policyId=" + policyId + ", instNo=" + instNo
				+ ", quarterEnding=" + quarterEnding + ", invtId=" + invtId + ", refNo=" + refNo + ", transdtlType="
				+ transdtlType + ", itemName=" + itemName + ", paymentFor=" + paymentFor + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", currAmt=" + currAmt + ", localAmt=" + localAmt + ", allotedAmt="
				+ allotedAmt + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", inwPol=" + inwPol + "]";
	}
}
	
class SavePrqInwPolLoc {
		private String reqId;
		private String itemNo;
		private String premAmt;
		private String riComm;
		private String riCommVat;
		private String prevPaytAmt;
		private String prevBalance;
		private String newPaytAmt;
		private String newBalance;
		private String netDue;
		private String charges;
		private String returnAmt;
		private String createUser;
		private String createDate;
		private String updateUser;
		private String updateDate;
		public String getReqId() {
			return reqId;
		}
		public void setReqId(String reqId) {
			this.reqId = reqId;
		}
		public String getItemNo() {
			return itemNo;
		}
		public void setItemNo(String itemNo) {
			this.itemNo = itemNo;
		}
		public String getPremAmt() {
			return premAmt;
		}
		public void setPremAmt(String premAmt) {
			this.premAmt = premAmt;
		}
		public String getRiComm() {
			return riComm;
		}
		public void setRiComm(String riComm) {
			this.riComm = riComm;
		}
		public String getRiCommVat() {
			return riCommVat;
		}
		public void setRiCommVat(String riCommVat) {
			this.riCommVat = riCommVat;
		}
		public String getPrevPaytAmt() {
			return prevPaytAmt;
		}
		public void setPrevPaytAmt(String prevPaytAmt) {
			this.prevPaytAmt = prevPaytAmt;
		}
		public String getPrevBalance() {
			return prevBalance;
		}
		public void setPrevBalance(String prevBalance) {
			this.prevBalance = prevBalance;
		}
		public String getNewPaytAmt() {
			return newPaytAmt;
		}
		public void setNewPaytAmt(String newPaytAmt) {
			this.newPaytAmt = newPaytAmt;
		}
		public String getNewBalance() {
			return newBalance;
		}
		public void setNewBalance(String newBalance) {
			this.newBalance = newBalance;
		}
		public String getNetDue() {
			return netDue;
		}
		public void setNetDue(String netDue) {
			this.netDue = netDue;
		}
		public String getCharges() {
			return charges;
		}
		public void setCharges(String charges) {
			this.charges = charges;
		}
		public String getReturnAmt() {
			return returnAmt;
		}
		public void setReturnAmt(String returnAmt) {
			this.returnAmt = returnAmt;
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
			return "SavePrqInwPolLoc [reqId=" + reqId + ", itemNo=" + itemNo + ", premAmt=" + premAmt + ", riComm="
					+ riComm + ", riCommVat=" + riCommVat + ", prevPaytAmt=" + prevPaytAmt + ", prevBalance="
					+ prevBalance + ", newPaytAmt=" + newPaytAmt + ", newBalance=" + newBalance + ", netDue=" + netDue
					+ ", charges=" + charges + ", returnAmt=" + returnAmt + ", createUser=" + createUser
					+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
		}
}
