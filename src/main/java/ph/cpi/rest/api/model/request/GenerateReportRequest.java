package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.utils.ACITR052;
import ph.cpi.rest.api.model.utils.ACITR061;
import ph.cpi.rest.api.model.utils.ACSER060;
import ph.cpi.rest.api.model.utils.CLMR010;
import ph.cpi.rest.api.model.utils.POLR044;

public class GenerateReportRequest {
	
	private String reportName;
	private String reportId;
	private Integer quoteId;
	private Integer adviceNo;
	private Integer holdCovId;
	private String userId;
	private Integer tranId;
	private Integer reqId;
	private String cedingId;
	private String policyId;
	private String pctValue;
	private String inclEndt;
	
	private POLR044 polr044Params;
	private ACITR061 acitr061Params;
	private CLMR010 clmr010Params;
	private ACITR052 acitr052Params;
	private ACSER060 acser060Params;
	
	
	private String printerName;
	private String pageOrientation;
	private String paperSize;
	private String instNo;
	private String distId;
	private String histNo;
	private String draftTag;
	
	public String getDraftTag() {
		return draftTag;
	}
	public void setDraftTag(String draftTag) {
		this.draftTag = draftTag;
	}
	public String getDistId() {
		return distId;
	}
	public void setDistId(String distId) {
		this.distId = distId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getPctValue() {
		return pctValue;
	}
	public void setPctValue(String pctValue) {
		this.pctValue = pctValue;
	}
	public String getInclEndt() {
		return inclEndt;
	}
	public void setInclEndt(String inclEndt) {
		this.inclEndt = inclEndt;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public Integer getAdviceNo() {
		return adviceNo;
	}
	public void setAdviceNo(Integer adviceNo) {
		this.adviceNo = adviceNo;
	}
	public Integer getHoldCovId() {
		return holdCovId;
	}
	public void setHoldCovId(Integer holdCovId) {
		this.holdCovId = holdCovId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public POLR044 getPolr044Params() {
		return polr044Params;
	}
	public void setPolr044Params(POLR044 polr044Params) {
		this.polr044Params = polr044Params;
	}
	public String getPrinterName() {
		return printerName;
	}
	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}
	public String getPageOrientation() {
		return pageOrientation;
	}
	public void setPageOrientation(String pageOrientation) {
		this.pageOrientation = pageOrientation;
	}
	public String getPaperSize() {
		return paperSize;
	}
	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
	}
	public ACITR061 getAcitr061Params() {
		return acitr061Params;
	}
	public void setAcitr061Params(ACITR061 acitr061Params) {
		this.acitr061Params = acitr061Params;
	}
	public CLMR010 getClmr010Params() {
		return clmr010Params;
	}
	public void setClmr010Params(CLMR010 clmr010Params) {
		this.clmr010Params = clmr010Params;
	}
	public ACITR052 getAcitr052Params() {
		return acitr052Params;
	}
	public void setAcitr052Params(ACITR052 acitr052Params) {
		this.acitr052Params = acitr052Params;
	}
	public ACSER060 getAcser060Params() {
		return acser060Params;
	}
	public void setAcser060Params(ACSER060 acser060Params) {
		this.acser060Params = acser060Params;
	}
	@Override
	public String toString() {
		return "GenerateReportRequest [reportName=" + reportName + ", reportId=" + reportId + ", quoteId=" + quoteId
				+ ", adviceNo=" + adviceNo + ", holdCovId=" + holdCovId + ", userId=" + userId + ", tranId=" + tranId
				+ ", reqId=" + reqId + ", cedingId=" + cedingId + ", policyId=" + policyId + ", pctValue=" + pctValue
				+ ", inclEndt=" + inclEndt + ", polr044Params=" + polr044Params + ", acitr061Params=" + acitr061Params
				+ ", printerName=" + printerName + ", pageOrientation=" + pageOrientation + ", paperSize=" + paperSize
				+ ", instNo=" + instNo + ", distId=" + distId + ", histNo=" + histNo + ", draftTag=" + draftTag + "]";
	}
	
}
