package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.*;
import ph.cpi.rest.api.model.response.*;

@Service
public interface MaintenanceService {

	public RetrieveMtnRiskResponse retrieveMtnRisk(RetrieveMtnRiskRequest rmrp) throws SQLException;
	public RetrieveMtnSectionCoversResponse retrieveMtnSectionCovers(RetrieveMtnSectionCoversRequest rmscp) throws SQLException;
	public RetrieveMtnTypeOfCessionResponse retrieveMtnTypeOfCession(RetrieveMtnTypeOfCessionRequest rmtcp) throws SQLException;
	public RetrieveMtnRiskListingResponse retrieveMtnRiskListing(RetrieveMtnRiskListingRequest rmrlp) throws SQLException;
	public RetrieveMtnInsuredResponse retrieveMtnInsured(RetrieveMtnInsuredRequest rmir) throws SQLException;
	public RetrieveEndtCodeResponse retrieveEndtCode(RetrieveEndtCodeRequest recr) throws SQLException;
	public RetrieveMtnDistrictResponse retrieveMtnDistrict(RetrieveMtnDistrictRequest rmdr) throws SQLException;
	public RetrieveMtnDeductiblesResponse retrieveMtnDeductibles(RetrieveMtnDeductiblesRequest rmdr) throws SQLException;
	public RetrieveMtnRegionResponse retrieveMtnRegion(RetrieveMtnRegionRequest rmrp) throws SQLException;
	public RetrieveMtnProvinceResponse retrieveMtnProvince(RetrieveMtnProvinceRequest rmpp) throws SQLException;
	public RetrieveMtnObjectResponse retrieveMtnObject(RetrieveMtnObjectRequest rmop) throws SQLException;
	public RetrieveMtnQuoteWordingsResponse retrieveMtnQuoteWordings(RetrieveMtnQuoteWordingsRequest rmqwp) throws SQLException;
	public RetrieveMtnCityResponse retrieveMtnCity(RetrieveMtnCityRequest rmcr) throws SQLException;
	public RetrieveMtnCrestaZoneResponse retrieveMtnCrestaZone(RetrieveMtnCrestaZoneRequest rmczr) throws SQLException;
	public RetrieveMtnCurrencyResponse retrieveMtnCurrency(RetrieveMtnCurrencyRequest rmcr) throws SQLException;
	public RetrieveMtnAdviceWordingsResponse retrieveMaintenanceAdviceWordings(RetrieveMtnAdviceWordingsRequest retMtnAdviceWordings) throws SQLException;
	public RetrieveMtnBlockResponse retrieveMaintenanceBlock(RetrieveMtnBlockRequest retMtnBlock) throws SQLException;
	public RetrieveMtnCedingCompanyListingResponse retrieveMaintenanceCedingCompanyListing(RetrieveMtnCedingCompanyListingRequest retMtnCedingCompanyListing) throws SQLException;
	public RetrieveMtnCedingCompanyResponse retrieveMaintenanceCedingCompany(RetrieveMtnCedingCompanyRequest retMtnCedingCompany) throws SQLException;
	public RetrieveMtnIntermediaryResponse retrieveMtnIntermediary(RetrieveMtnIntermediaryRequest rmip) throws SQLException;
	public RetrieveMtnLineResponse retrieveMtnLine(RetrieveMtnLineRequest rmlp ) throws SQLException;
	public RetrieveMtnLineClassResponse retrieveMtnLineClass(RetrieveMtnLineClassRequest rmlcp ) throws SQLException;
	public SaveMtnLineClassResponse saveMtnLineClass(SaveMtnLineClassRequest smlcr) throws SQLException;
	public SaveMtnRiskResponse saveMtnRisk(SaveMtnRiskRequest smrr) throws SQLException;
	public RetrieveMtnReasonResponse retrieveMtnReason (RetrieveMtnReasonRequest rmrr) throws SQLException;
	public RetrieveMtnTreatyResponse retrieveMtnTreaty(RetrieveMtnTreatyRequest rmtr) throws SQLException;
	public RetrieveMtnReportsResponse retrieveMtnReports(RetrieveMtnReportsRequest rmr) throws SQLException;
	public RetrieveMtnSectionCoversLovResponse retrieveMtnSectionCoversLov(RetrieveMtnSectionCoversLovRequest rmsclp) throws SQLException;
	public RetrieveRefCodeResponse retrieveRefCode(RetrieveRefCodeRequest rrcr) throws SQLException;
	public RetrieveMtnReportsParamResponse retrieveMtnReportsParam(RetrieveMtnReportsParamRequest rmrp) throws SQLException;
	public RetrieveMtnCATPerilResponse retrieveMtnCATPeril (RetrieveMtnCATPerilRequest rmcatpr) throws SQLException;
	public RetrieveMtnChargesResponse retrieveMtnCharges (RetrieveMtnChargesRequest rmcr) throws SQLException;
	public SaveMtnLineResponse saveMtnLine(SaveMtnLineRequest smlr) throws SQLException;
	public SaveMtnDeductiblesResponse saveMtnDeductibles(SaveMtnDeductiblesRequest smdr) throws SQLException;
	public RetrieveMtnSpoilageReasonResponse retrieveMtnSpoilageReason (RetrieveMtnSpoilageReasonRequest rmcr) throws SQLException;
	public RetMtnPolWordingsResponse retMtnPolWordings(RetMtnPolWordingsRequest rmpwr) throws SQLException;
	public SaveMtnInsuredResponse saveMtnInsured(SaveMtnInsuredRequest smir) throws SQLException;
	public SaveMtnTypeOfCessionResponse saveMtnTypeOfCession(SaveMtnTypeOfCessionRequest smdr) throws SQLException;
	public RetMtnInsuredLovResponse retMtnInsuredLov(RetMtnInsuredLovRequest rmil) throws SQLException;
	public SaveMtnAdviceWordingsResponse saveMtnAdviceWordings(SaveMtnAdviceWordingsRequest smawr) throws SQLException;
	public SaveMtnQuoteWordingsResponse saveMtnQuoteWordings(SaveMtnQuoteWordingsRequest smqwr) throws SQLException;
	public SaveMtnPolicyWordingsResponse saveMtnPolicyWordings(SaveMtnPolicyWordingsRequest smpwr) throws SQLException;
	public RetrieveMtnCurrencyListResponse retMtnCurrencyList(RetrieveMtnCurrencyListRequest rmcl) throws SQLException;
	public SaveMtnCurrencyResponse saveMtnCurrency (SaveMtnCurrencyRequest smcr) throws SQLException;
	public RetrieveMtnCurrencyRtResponse retrieveMtnCurrencyRate (RetrieveMtnCurrencyRtRequest rmcrr) throws SQLException;
	public SaveMtnCurrencyRtResponse saveMtnCurrencyRt (SaveMtnCurrencyRtRequest smcrr) throws SQLException;
	public SaveMtnEndorsementResponse saveMtnEndorsement(SaveMtnEndorsementRequest smer) throws SQLException;
	public SaveMtnCatPerilResponse saveMtnCatPeril (SaveMtnCatPerilRequest smcpr) throws SQLException;
	public SaveMtnCrestaZoneResponse saveMtnCrestaZone (SaveMtnCrestaZoneRequest smczr) throws SQLException;
	public SaveMtnCedingCompanyResponse saveMtnCedingCompany(SaveMtnCedingCompanyRequest smccr) throws SQLException;
	public SaveMtnIntermediaryResponse saveMtnIntermediary(SaveMtnIntermediaryRequest smir) throws SQLException;
	public SaveMtnSectionCoverResponse saveMtnSectionCover(SaveMtnSectionCoverRequest smscr) throws SQLException;
	public  RetMtnQuoteReasonResponse retMtnQuoteReason(RetMtnQuoteReasonRequest rmqrr) throws SQLException;
	public SaveMtnQuoteReasonResponse saveMtnQuoteReason(SaveMtnQuoteReasonRequest smqrr) throws SQLException;
	public SaveMtnSpoilageReasonResponse saveMtnSpoilageReason(SaveMtnSpoilageReasonRequest smqrr) throws SQLException;
	public SaveMtnDistrictResponse saveMtnDistrict(SaveMtnDistrictRequest smqrr) throws SQLException;
	public SaveMtnBlockResponse saveMtnBlock(SaveMtnBlockRequest smqrr) throws SQLException;
	public SaveMtnObjectResponse saveMtnObject(SaveMtnObjectRequest smor) throws SQLException;
	public RetMtnUserAmtLimitResponse retMtnUserAmtLimit(RetMtnUserAmtLimitRequest rmil) throws SQLException;
	public SaveMtnUserAmtLimitResponse saveMtnUserAmtLimit(SaveMtnUserAmtLimitRequest smualr) throws SQLException;
	public SaveMtnOtherChargeResponse saveMtnOtherCharge(SaveMtnOtherChargeRequest smocr) throws SQLException;
	public RetrieveMtnNonRenewalReasonResponse retriveMtnNonRenewalReason(RetrieveMtnNonRenewalReasonRequest rmnrrr) throws SQLException;
	public SaveMtnNonRenewalReasonResponse saveMtnNonRenewalReason(SaveMtnNonRenewalReasonRequest smnrrr) throws SQLException;
	public SaveMtnRegionResponse saveMtnRegion(SaveMtnRegionRequest smrr) throws SQLException;
	public SaveMtnProvinceResponse saveMtnProvince(SaveMtnProvinceRequest smpr) throws SQLException;
	public RetrieveMtnTreatyCommissionResponse retrieveMtnTreatyCommission(RetrieveMtnTreatyCommissionRequest rmtcr) throws SQLException;
	public SaveMtnTreatyResponse saveMtnTreaty(SaveMtnTreatyRequest smtr) throws SQLException;
	public RetrieveMtnRetAmtResponse retrieveMtnRetAmt(RetrieveMtnRetAmtRequest rmrar) throws SQLException;
	public RetrieveMtnTreatyShareResponse retrieveMtnTreatyShare(RetrieveMtnTreatyShareRequest rmtsr) throws SQLException;
	public RetrieveMtnCedingRetentionResponse retrieveMtnCedingRetention(RetrieveMtnCedingRetentionRequest rmcrr) throws SQLException;
	public SaveMtnTreatyShareResponse saveMtnTreatyShare(SaveMtnTreatyShareRequest smtsr) throws SQLException;
	public CopyTreatyShareSetupResponse copyTreatyShareSetup(CopyTreatyShareSetupRequest ctssr) throws SQLException;
	public SaveMtnRetAmtResponse saveMtnRetAmt(SaveMtnRetAmtRequest smrar) throws SQLException;
	public CopyRetAmtSetupResponse copyRetAmtSetup(CopyRetAmtSetupRequest crasr) throws SQLException;
	public RetrieveMtnTreatyLimitResponse retrieveMtnTreatyLimit(RetrieveMtnTreatyLimitRequest rmtlr) throws SQLException;
	public RetrieveMtnApprovalResponse retrieveMtnApproval(RetrieveMtnApprovalRequest rmafr) throws SQLException;
	public RetrieveMtnApprovalFunctionResponse retrieveMtnApprovalFunction(RetrieveMtnApprovalFunctionRequest rmar) throws SQLException;
	public SaveMtnApprovalResponse saveMtnApproval(SaveMtnApprovalRequest smrr) throws SQLException;
	public SaveMtnApprovalFunctionResponse saveMtnApprovalFunction(SaveMtnApprovalFunctionRequest smrr) throws SQLException;
	public RetrieveMtnUsersLovResponse retrieveMtnUsersLov(RetrieveMtnUsersLovRequest rmar) throws SQLException;
	public RetrieveMtnApproverResponse retrieveApprover(RetrieveMtnApproverRequest rar) throws SQLException;
	public RetrieveMtnApproverFnResponse retrieveApproverFn(RetrieveMtnApproverFnRequest rafr) throws SQLException;
	public SaveMtnApproverResponse saveMtnApprover(SaveMtnApproverRequest smar) throws SQLException;
	public SaveMtnApproverFnResponse saveMtnApproverFn(SaveMtnApproverFnRequest smar) throws SQLException;
	public RetrieveMtnParametersResponse retrieveMtnParameters(RetrieveMtnParametersRequest rafr) throws SQLException;
	public SaveMtnParametersResponse saveMtnParameters(SaveMtnParametersRequest smrr) throws SQLException;
	public RetrieveMtnRoundingErrorResponse retrieveMtnRoundingError(RetrieveMtnRoundingErrorRequest rafr) throws SQLException;
	public SaveMtnRoundingErrorResponse saveMtnRoundingError(SaveMtnRoundingErrorRequest smrr) throws SQLException;
	public SaveMtnReportsResponse saveMtnReports(SaveMtnReportsRequest smrr) throws SQLException;
	public SaveMtnReportParamResponse saveMtnReportParam(SaveMtnReportParamRequest smrpr) throws SQLException;
	public SaveMtnCityResponse saveMtnCity(SaveMtnCityRequest smcr) throws SQLException;
	public RetrieveMtnClmStatusResponse retrieveMtnClaimStatus(RetrieveMtnClmStatusRequest rafr) throws SQLException;
	public SaveMtnTreatyLimitResponse saveMtnTreatyLimit(SaveMtnTreatyLimitRequest smtlr) throws SQLException;
	public CopyTreatyLimitResponse copyTreatyLimit(CopyTreatyLimitRequest ctlr) throws SQLException;
	public RetrieveMtnAdjusterListResponse retrieveMtnAdjusterList(RetrieveMtnAdjusterListRequest rmalr) throws SQLException;
	public RetrieveMtnAdjRepresentativeResponse retrieveMtnAdjRepresentative(RetrieveMtnAdjRepresentativeRequest rmarr) throws SQLException;
	public SaveMtnAdjusterResponse saveMtnAdjuster(SaveMtnAdjusterRequest smar) throws SQLException;
	public RetrieveMtnClmEventTypeResponse retrieveMtnClmEventType(RetrieveMtnClmEventTypeRequest rmcetr) throws SQLException;
	public SaveMtnClmEventTypeResponse saveMtnClmEventType(SaveMtnClmEventTypeRequest smcetr) throws SQLException;
	public RetrieveMtnClmEventResponse retrieveMtnClmEvent(RetrieveMtnClmEventRequest rmcer) throws SQLException;
	public SaveMtnClmEventResponse saveMtnClmEvent(SaveMtnClmEventRequest smcer) throws SQLException;
	public RetrieveMtnLossCdResponse retrieveMtnLossCd(RetrieveMtnLossCdRequest rmlcr) throws SQLException;
	public SaveMtnLossCdResponse saveMtnLossCd(SaveMtnLossCdRequest smcr) throws SQLException;
	public SaveMtnClaimStatusResponse saveMtnClaimStatus(SaveMtnClaimStatusRequest smcsr) throws SQLException;
	public RetrieveMtnSecIITrtyLimitResponse retrieveMtnSecIITrtyLimit(RetrieveMtnSecIITrtyLimitRequest rmstr) throws SQLException;
	public SaveMtnSecIITrtyLimitResponse saveMtnSecIITrtyLimit(SaveMtnSecIITrtyLimitRequest smstr) throws SQLException;
	public CopySecIITrtyLimitResponse copySecIITrtyLimit(CopySecIITrtyLimitRequest cstr) throws SQLException;
	public RetrieveMtnPoolRetHistResponse retrieveMtnPoolRetHist(RetrieveMtnPoolRetHistRequest rmprhr) throws SQLException;
	public RetrieveMtnClaimReasonResponse retrieveMtnClaimReason(RetrieveMtnClaimReasonRequest rmcrr) throws SQLException;
	public SaveMtnClaimReasonResponse saveMtnClaimReason(SaveMtnClaimReasonRequest smcrr) throws SQLException;
	public SaveMtnPoolRetHistResponse saveMtnPoolRetHist(SaveMtnPoolRetHistRequest smprhr) throws SQLException;
	public CopyPoolRetHistResponse copyPoolRetHist(CopyPoolRetHistRequest cprhr) throws SQLException;
	public RetrieveMtnClmCashCallResponse retrieveMtnClmCashCall(RetrieveMtnClmCashCallRequest rccp ) throws SQLException;
	public SaveMtnClmCashCallResponse saveMtnClmCashCall(SaveMtnClmCashCallRequest smcccr) throws SQLException;
	public RetrieveMtnLossCdLovResponse retrieveMtnLossCdLov(RetrieveMtnLossCdLovRequest rmlcl) throws SQLException;
	public CopyMtnClmCashCallResponse copyMtnClmCashCall(CopyMtnClmCashCallRequest cpmccr) throws SQLException;
	public RetrieveMtnClmEventTypeLovResponse retrieveMtnClmEventTypeLov(RetrieveMtnClmEventTypeLovRequest rmcel) throws SQLException;
	public RetrieveMtnClmEventLovResponse retrieveMtnClmEventLov(RetrieveMtnClmEventLovRequest rmcel) throws SQLException;
	public RetrieveMtnAcitTranTypeResponse retrieveMtnAcitTranType(RetrieveMtnAcitTranTypeRequest rmattr ) throws SQLException;
	public RetrieveMtnBankResponse retrieveMtnBank(RetrieveMtnBankRequest rmbr) throws SQLException; 
	public RetrieveMtnBankAcctResponse retrieveMtnBankAcct(RetrieveMtnBankAcctRequest rmbar) throws SQLException;
	public RetrieveMtnAcitDCBNoResponse retrieveMtnAcitDCBNo(RetrieveMtnAcitDCBNoRequest rmaidcbr) throws SQLException;
	public SaveMtnAcitDCBNoResponse saveMtnAcitDCBNo(SaveMtnAcitDCBNoRequest smaidcbr) throws SQLException;
	public RetrieveMtnDCBUserResponse retrieveMtnDCBUser(RetrieveMtnDCBUserRequest rmdur) throws SQLException;
	public RetrieveMtnPayeeResponse retrieveMtnPayee(RetrieveMtnPayeeRequest rmbar) throws SQLException;
	public RetrieveMtnBookingMonthResponse retrieveMtnBookingMonth(RetrieveMtnBookingMonthRequest rbmr ) throws SQLException;
	public RetrieveMtnAcitChartAcctResponse retrieveMtnAcitChartAcct(RetrieveMtnAcitChartAcctRequest rbmr) throws SQLException;
	public RetrieveMtnSLTypeResponse retrieveMtnSLType(RetrieveMtnSLTypeRequest rbmr) throws SQLException;
	public RetrieveMtnSLResponse retrieveMtnSL(RetrieveMtnSLRequest rbmr) throws SQLException;
	public RetrieveMtnPrintableNamesResponse retrieveMtnPrintableNames (RetrieveMtnPrintableNamesRequest request) throws SQLException;
	public RetrieveMtnCedingTreatyResponse retrieveMtnCedingTreaty(RetrieveMtnCedingTreatyRequest request)throws SQLException;
	public RetrieveMtnInvtSecurityTypeResponse retrieveMtnInvtSecurityType(RetrieveMtnInvtSecurityTypeRequest rist) throws SQLException;
	public SaveMtnBankResponse saveMtnBank(SaveMtnBankRequest smaidcbr) throws SQLException;
	public SaveMtnBankAcctResponse saveMtnBankAcct(SaveMtnBankAcctRequest smaidcbr) throws SQLException;
	public RetrieveMtnCompanyResponse retrieveMtnCompany(RetrieveMtnCompanyRequest rmcr) throws SQLException;
	public RetrieveMtnBussTypeResponse retrieveMtnBussType(RetrieveMtnBussTypeRequest rmbtr) throws SQLException;
	public RetrieveMtnPayeeCedingResponse retrieveMtnPayeeCeding(RetrieveMtnPayeeCedingRequest request) throws SQLException;
	public RetrieveMtnAcitCheckSeriesResponse retrieveMtnAcitCheckSeries(RetrieveMtnAcitCheckSeriesRequest request) throws SQLException;
	public RetrieveMtnAcseTranTypeResponse retrieveMtnAcseTranType(RetrieveMtnAcseTranTypeRequest rmattr) throws SQLException;
	public RetrieveMtnAcseDCBNoResponse retrieveMtnAcseDCBNo(RetrieveMtnAcseDCBNoRequest rmadnr) throws SQLException;
	public SaveMtnAcseDCBNoResponse saveMtnAcseDCBNo(SaveMtnAcseDCBNoRequest smaidcbr) throws SQLException;
	public RetrieveMtnAcitArSeriesResponse retrieveMtnAcitArSeries(RetrieveMtnAcitArSeriesRequest rmaasr) throws SQLException;
	public RetrieveMtnGenTaxResponse retrieveMtnGenTax(RetrieveMtnGenTaxRequest rmgtr) throws SQLException;
	public RetrieveMtnWhTaxResponse retrieveMtnWhTax(RetrieveMtnWhTaxRequest rmwt) throws SQLException;
	public SaveMtnBussTypeResponse saveMtnBussType (SaveMtnBussTypeRequest smbtr) throws SQLException;
	public RetrieveMtnAcseCheckSeriesResponse retrieveMtnAcseCheckSeries(RetrieveMtnAcseCheckSeriesRequest request) throws SQLException;
	public GenerateAcitARSeriesResponse generateARSeries(GenerateAcitARSeriesRequest request)throws SQLException;
	public SaveMtnDcbUserResponse saveMtnDcbUser (SaveMtnDcbUserRequest smdur) throws SQLException;
	public RetrieveMtnEmployeeResponse retrieveMtnEmployee(RetrieveMtnEmployeeRequest rmer) throws SQLException;
	public GenerateAcitCVSeriesResponse generateCVSeries(GenerateAcitCVSeriesRequest request) throws SQLException;
	public GenerateAcitJVSeriesResponse generateJVSeries(GenerateAcitJVSeriesRequest request) throws SQLException;
	public RetrieveMtnGenARSeriesResponse retrieveArSeries(RetrieveMtnGenARSeriesRequest request) throws SQLException;
	public RetrieveMtnGenCVSeriesResponse retrieveCvSeries(RetrieveMtnGenCVSeriesRequest request) throws SQLException;
	public RetrieveMtnGenJVSeriesResponse retrieveJvSeries(RetrieveMtnGenJVSeriesRequest request) throws SQLException;
	public RetrieveMtnAcitSeriesResponse maxTranNo(RetrieveMtnAcitSeriesRequest request) throws SQLException;
	public GenerateAcseCVSeriesResponse generateAcseCVSeries(GenerateAcseCVSeriesRequest request) throws SQLException;
	public GenerateAcseJVSeriesResponse generateAcseJVSeries(GenerateAcseJVSeriesRequest request) throws SQLException;
	public GenerateAcseORSeriesResponse generateAcseORSeries(GenerateAcseORSeriesRequest request) throws SQLException;
	public RetrieveMtnAcseGenORSeriesResponse retrieveAcseOrSeries(RetrieveMtnAcseGenORSeriesRequest request) throws SQLException;
}
