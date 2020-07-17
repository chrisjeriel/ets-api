package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.utils.ACITR049;
import ph.cpi.rest.api.model.utils.ACITR050;
import ph.cpi.rest.api.model.utils.ACITR052;
import ph.cpi.rest.api.model.utils.ACITR058;
import ph.cpi.rest.api.model.utils.ACITR061;
import ph.cpi.rest.api.model.utils.ACITR066;
import ph.cpi.rest.api.model.utils.ACSER024;
import ph.cpi.rest.api.model.utils.ACSER060;
import ph.cpi.rest.api.model.utils.CLMR010;
import ph.cpi.rest.api.model.utils.CLMR052;
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
	private String prodDate;
	
	private POLR044 polr044Params;
	private ACITR061 acitr061Params;
	private CLMR010 clmr010Params;
	private ACITR052 acitr052Params;
	private ACSER060 acser060Params;
	private ACITR066 acitr066Params;
	private ACSER024 acser024Params;
	private ACITR049 acitr049Params;
	private ACITR050 acitr050Params;
	private CLMR052 clmr052Params;
	private ACITR058 acitr058Params;
	
	private String memoId;
	
	
	
	
	
	public ACITR058 getAcitr058Params() {
		return acitr058Params;
	}
	public void setAcitr058Params(ACITR058 acitr058Params) {
		this.acitr058Params = acitr058Params;
	}
	public String getMemoId() {
		return memoId;
	}
	public void setMemoId(String memoId) {
		this.memoId = memoId;
	}
	public String getProdDate() {
		return prodDate;
	}
	public void setProdDate(String prodDate) {
		this.prodDate = prodDate;
	}
	private String printerName;
	private String pageOrientation;
	private String paperSize;
	private String instNo;
	private String distId;
	private String histNo;
	private String draftTag;
	private String hundredPct;
	
	
	public String getHundredPct() {
		return hundredPct;
	}
	public void setHundredPct(String hundredPct) {
		this.hundredPct = hundredPct;
	}
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
	public ACITR066 getAcitr066Params() {
		return acitr066Params;
	}
	public void setAcitr066Params(ACITR066 acitr066Params) {
		this.acitr066Params = acitr066Params;
	}
	public ACSER024 getAcser024Params() {
		return acser024Params;
	}
	public void setAcser024Params(ACSER024 acser024Params) {
		this.acser024Params = acser024Params;
	}
	public ACITR049 getAcitr049Params() {
		return acitr049Params;
	}
	public void setAcitr049Params(ACITR049 acitr049Params) {
		this.acitr049Params = acitr049Params;
	}
	public ACITR050 getAcitr050Params() {
		return acitr050Params;
	}
	public void setAcitr050Params(ACITR050 acitr050Params) {
		this.acitr050Params = acitr050Params;
	}
	public CLMR052 getClmr052Params() {
		return clmr052Params;
	}
	public void setClmr052Params(CLMR052 clmr052Params) {
		this.clmr052Params = clmr052Params;
	}
	@Override
	public String toString() {
		return "GenerateReportRequest [reportName=" + reportName + ", reportId=" + reportId + ", quoteId=" + quoteId
				+ ", adviceNo=" + adviceNo + ", holdCovId=" + holdCovId + ", userId=" + userId + ", tranId=" + tranId
				+ ", reqId=" + reqId + ", cedingId=" + cedingId + ", policyId=" + policyId + ", pctValue=" + pctValue
				+ ", inclEndt=" + inclEndt + ", prodDate=" + prodDate + ", polr044Params=" + polr044Params
				+ ", acitr061Params=" + acitr061Params + ", clmr010Params=" + clmr010Params + ", acitr052Params="
				+ acitr052Params + ", acser060Params=" + acser060Params + ", acitr066Params=" + acitr066Params
				+ ", acser024Params=" + acser024Params + ", acitr049Params=" + acitr049Params + ", acitr050Params="
				+ acitr050Params + ", clmr052Params=" + clmr052Params + ", acitr058Params=" + acitr058Params
				+ ", memoId=" + memoId + ", printerName=" + printerName + ", pageOrientation=" + pageOrientation
				+ ", paperSize=" + paperSize + ", instNo=" + instNo + ", distId=" + distId + ", histNo=" + histNo
				+ ", draftTag=" + draftTag + ", hundredPct=" + hundredPct + "]";
	}
	
}
