package ph.cpi.rest.api.utils;

import java.text.ParseException;
import java.util.HashMap;

import ph.cpi.rest.api.model.request.GenerateReportRequest;
import ph.cpi.rest.api.model.utils.ACITR052;
import ph.cpi.rest.api.model.utils.ACITR061;
import ph.cpi.rest.api.model.utils.ACSER060;
import ph.cpi.rest.api.model.utils.CLMR010;
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
		reportParams.put("P_INST_NO", grr.getInstNo());
		
		reportParams.put("P_DIST_ID", grr.getDistId());
		reportParams.put("P_HIST_NO", grr.getHistNo());
		reportParams.put("P_DRAFT_TAG", grr.getDraftTag());
		reportParams.put("P_HUNDRED_PCT",grr.getHundredPct());
		
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
		POLR044AParams.put("P_PRINTED_BY", param.getExtractUser());
		
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
		ACITR061Params.put("P_JV_TYPE", param.getJvType());
		ACITR061Params.put("P_BANK", param.getBank());
		ACITR061Params.put("P_BANK_ACCT", param.getBankAcct());
		ACITR061Params.put("P_SORT_BY", param.getSortBy());
		
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
	
	public static HashMap<String, Object> mapCLMR010Params(CLMR010 param) throws ParseException {
		HashMap<String, Object> CLMR010Params = new HashMap<String, Object>();
		
		//Report Purposes
		CLMR010Params.put("P_REPORT_ID", param.getReportId());
		CLMR010Params.put("P_EXTRACT_USER", param.getExtractUser());
		CLMR010Params.put("P_LINE_CD_PARAM", param.getLineCdParam());
		CLMR010Params.put("P_CEDING_ID_PARAM", param.getCedingIdParam());
		CLMR010Params.put("P_DATE_PARAM", param.getDateParam());
		CLMR010Params.put("P_DATE_RANGE", param.getDateRange());
		CLMR010Params.put("P_FROM_DATE", param.getFromDate());
		CLMR010Params.put("P_TO_DATE", param.getToDate());
		CLMR010Params.put("P_FORCE_EXTRACT", param.getForceExtract());
		CLMR010Params.put("P_PRINTED_BY", param.getExtractUser());
		
		
		CLMR010Params.put("p_extract_user", param.getExtractUser());
		CLMR010Params.put("p_date_param", param.getDateParam());
		CLMR010Params.put("p_date_range", param.getDateRange());
		CLMR010Params.put("p_printed_by", param.getExtractUser());
		
		//Extract MyBatis Purposes
		CLMR010Params.put("reportId", param.getReportId());
		CLMR010Params.put("extractUser", param.getExtractUser());
		CLMR010Params.put("lineCdParam", param.getLineCdParam());
		CLMR010Params.put("cedingIdParam", param.getCedingIdParam());
		CLMR010Params.put("dateParam", param.getDateParam());
		CLMR010Params.put("dateRange", param.getDateRange());
		CLMR010Params.put("fromDate", param.getFromDate());
		CLMR010Params.put("toDate", param.getToDate());
		CLMR010Params.put("forceExtract", param.getForceExtract());
		CLMR010Params.put("printedBy", param.getExtractUser());
		
		return CLMR010Params;
	}
	
	public static HashMap<String, Object> mapACITR052Params(ACITR052 param) throws ParseException {
		HashMap<String, Object> ACITR052Params = new HashMap<String, Object>();
		
		//Report Purposes
		ACITR052Params.put("P_EXTRACT_USER", param.getExtractUser());
		ACITR052Params.put("P_OS_PAID_TAG", param.getOsPaidTag());
		ACITR052Params.put("P_EXT_TYPE_TAG", param.getExtTypeTag());
		ACITR052Params.put("P_DATE_PARAM", param.getDateParam());
		ACITR052Params.put("P_DATE_RANGE", param.getDateRange());
		ACITR052Params.put("P_DATE_FROM", param.getDateFrom());
		ACITR052Params.put("P_DATE_TO", param.getDateTo());
		ACITR052Params.put("P_LINE_CD", param.getLineCd());
		ACITR052Params.put("P_CESSION_ID", param.getCessionId());
		ACITR052Params.put("P_FORCE_EXTRACT", param.getForceExtract());
		ACITR052Params.put("P_PRINTED_BY", param.getExtractUser());
		ACITR052Params.put("P_REPORT_ID", param.getReportId());
		
		//Extract MyBatis Purposes
		ACITR052Params.put("extractUser", param.getExtractUser());
		ACITR052Params.put("osPaidTag", param.getOsPaidTag());
		ACITR052Params.put("extTypeTag", param.getExtTypeTag());
		ACITR052Params.put("dateParam", param.getDateParam());
		ACITR052Params.put("dateRange", param.getDateRange());
		ACITR052Params.put("dateFrom", param.getDateFrom());
		ACITR052Params.put("dateTo", param.getDateTo());
		ACITR052Params.put("lineCd", param.getLineCd());
		ACITR052Params.put("cessionId", param.getCessionId());
		ACITR052Params.put("forceExtract", param.getForceExtract());
		ACITR052Params.put("reportId", param.getReportId());
		
		return ACITR052Params;
	}
	
	public static HashMap<String, Object> mapACSER060Params(ACSER060 param) throws ParseException {
		HashMap<String, Object> ACSER060Params = new HashMap<String, Object>();
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d;
		*/
		
		ACSER060Params.put("P_REPORT_ID", param.getReportId());
		ACSER060Params.put("p_report_id", param.getReportId());
		ACSER060Params.put("pReportId", param.getReportId());
		ACSER060Params.put("reportId", param.getReportId());
		
		ACSER060Params.put("P_PAYMENT_MODE", param.getPaytMode());
		ACSER060Params.put("P_PAYMENT_TYPE", param.getPaytType());
		ACSER060Params.put("P_CHK_DATE", param.getChkDate());
		ACSER060Params.put("P_JV_TYPE", param.getJvType());
		ACSER060Params.put("P_BANK", param.getBank());
		ACSER060Params.put("P_BANK_ACCT", param.getBankAcct());
		ACSER060Params.put("P_SORT_BY", param.getSortBy());
		
		ACSER060Params.put("P_FROM_DATE", param.getFromDate());
		ACSER060Params.put("P_TO_DATE", param.getToDate());
		
		/*d = sdf.parse(param.getFromDate());
		Timestamp fromDate = new Timestamp(d.getTime());
		ACSER060Params.put("P_FROM_DATE", fromDate);
		d = sdf.parse(param.getToDate());
		Timestamp toDate = new Timestamp(d.getTime());
		ACSER060Params.put("P_TO_DATE", toDate);*/
		
		
		ACSER060Params.put("P_INC_CLOSED_TRAN", param.getIncClosedTran());
		ACSER060Params.put("P_CLOSED_TRANS", param.getIncClosedTran());
		ACSER060Params.put("P_INC_CANCEL_TRAN", param.getIncCancelTran());
		ACSER060Params.put("P_CANCELLED_TRANS", param.getIncCancelTran());
		ACSER060Params.put("P_TRANPOST_DATE", param.getTranPostDate());
		ACSER060Params.put("P_PRINTED_BY", param.getPrintedBy());
		
		return ACSER060Params;
	}
}
