package ph.cpi.rest.api.utils;

import java.util.HashMap;

import ph.cpi.rest.api.model.request.GenerateReportRequest;
import ph.cpi.rest.api.model.utils.POLR044;

public class ReportParameters {

	public static HashMap<String, Object> mapReportParams(GenerateReportRequest grr) {
		HashMap<String, Object> reportParams = new HashMap<String, Object>();
		reportParams.put("P_QUOTE_ID", grr.getQuoteId());
		reportParams.put("pQuoteId", grr.getQuoteId());
		
		reportParams.put("P_ADVICE_NO", grr.getAdviceNo());
		reportParams.put("pAdviceNo", grr.getAdviceNo());
		
		reportParams.put("P_HOLD_COV_ID", grr.getHoldCovId());
		reportParams.put("pHoldCovId", grr.getHoldCovId());
		
		reportParams.put("P_USER_ID", grr.getUserId());
		reportParams.put("pUserId", grr.getUserId());
		
		reportParams.put("P_TRAN_ID", grr.getTranId());
		reportParams.put("pTranId", grr.getTranId());
		
		reportParams.put("P_REQ_ID", grr.getReqId());
		reportParams.put("pReqId", grr.getReqId());
		
		
		reportParams.put("P_REPORT_ID", grr.getReportId());
		reportParams.put("pReportId", grr.getReportId());
		
		return reportParams;
	}
	
	public static HashMap<String, Object> mapPOLR044AParams(POLR044 param) {
		HashMap<String, Object> POLR044AParams = new HashMap<String, Object>();
		POLR044AParams.put("P_EXTRACT_USER", param.getExtractUser());
		POLR044AParams.put("P_LINE_CD_PARAM", param.getLineCdParam());
		POLR044AParams.put("P_CEDING_ID_PARAM", param.getCedingIdParam());
		POLR044AParams.put("P_DATE_PARAM", param.getDateParam());
		POLR044AParams.put("P_DATE_RANGE", param.getDateRange());
		POLR044AParams.put("P_FROM_DATE", param.getFromDate());
		POLR044AParams.put("P_TO_DATE", param.getToDate());
		POLR044AParams.put("P_INC_REC_TAG", param.getIncRecTag());
		
		return POLR044AParams;
	}
	
}
