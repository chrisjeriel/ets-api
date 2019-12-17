package ph.cpi.rest.api.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import ph.cpi.rest.api.model.request.GenerateReportRequest;
import ph.cpi.rest.api.model.utils.ACITR061;
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
		reportParams.put("P_PRINTED_BY", grr.getUserId());
		reportParams.put("p_printed_by", grr.getUserId());
		
		reportParams.put("P_TRAN_ID", grr.getTranId());
		reportParams.put("pTranId", grr.getTranId());
		
		reportParams.put("P_REQ_ID", grr.getReqId());
		reportParams.put("pReqId", grr.getReqId());
		
		
		reportParams.put("P_REPORT_ID", grr.getReportId());
		reportParams.put("p_report_id", grr.getReportId());
		reportParams.put("pReportId", grr.getReportId());
		
		reportParams.put("reportId", grr.getReportName());
		
		reportParams.put("P_CEDING_ID", grr.getCedingId());
		reportParams.put("p_ceding_id", grr.getCedingId());
		reportParams.put("pCedingId", grr.getCedingId());
		
		reportParams.put("P_POLICY_ID", grr.getPolicyId());
		reportParams.put("p_policy_id", grr.getPolicyId());
		
		reportParams.put("P_PCT_VALUE", grr.getPctValue());
		reportParams.put("p_pct_value", grr.getPctValue());
		
		reportParams.put("P_INCL_ENDT", grr.getInclEndt());
		reportParams.put("p_incl_endt", grr.getInclEndt());
		return reportParams;
	}
	
	public static HashMap<String, Object> mapPOLR044AParams(POLR044 param) {
		HashMap<String, Object> POLR044AParams = new HashMap<String, Object>();
		
		POLR044AParams.put("P_REPORT_ID", param.getReportId());
		POLR044AParams.put("p_report_id", param.getReportId());
		POLR044AParams.put("pReportId", param.getReportId());
		POLR044AParams.put("reportId", param.getReportId());
		
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
	
	public static HashMap<String, Object> mapACITR061Params(ACITR061 param) throws ParseException {
		HashMap<String, Object> ACITR061Params = new HashMap<String, Object>();
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d;
		*/
		
		ACITR061Params.put("P_REPORT_ID", param.getReportId());
		ACITR061Params.put("p_report_id", param.getReportId());
		ACITR061Params.put("pReportId", param.getReportId());
		ACITR061Params.put("reportId", param.getReportId());
		
		ACITR061Params.put("P_PAYMENT_MODE", param.getPaytMode());
		ACITR061Params.put("P_PAYMENT_TYPE", param.getPaytType());
		ACITR061Params.put("P_CHK_DATE", param.getChkDate());
		
		ACITR061Params.put("P_FROM_DATE", param.getFromDate());
		ACITR061Params.put("P_TO_DATE", param.getToDate());
		
		/*d = sdf.parse(param.getFromDate());
		Timestamp fromDate = new Timestamp(d.getTime());
		ACITR061Params.put("P_FROM_DATE", fromDate);
		d = sdf.parse(param.getToDate());
		Timestamp toDate = new Timestamp(d.getTime());
		ACITR061Params.put("P_TO_DATE", toDate);*/
		
		
		ACITR061Params.put("P_INC_CLOSED_TRAN", param.getIncClosedTran());
		ACITR061Params.put("P_CLOSED_TRANS", param.getIncClosedTran());
		ACITR061Params.put("P_INC_CANCEL_TRAN", param.getIncCancelTran());
		ACITR061Params.put("P_CANCELLED_TRANS", param.getIncCancelTran());
		ACITR061Params.put("P_TRANPOST_DATE", param.getTranPostDate());
		ACITR061Params.put("P_PRINTED_BY", param.getPrintedBy());
		
		return ACITR061Params;
	}
	
}
