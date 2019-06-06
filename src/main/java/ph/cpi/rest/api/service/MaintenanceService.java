package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.CopyRetAmtSetupRequest;
import ph.cpi.rest.api.model.request.CopyTreatyShareSetupRequest;
import ph.cpi.rest.api.model.request.RetMtnInsuredLovRequest;
import ph.cpi.rest.api.model.request.RetMtnPolWordingsRequest;
import ph.cpi.rest.api.model.request.RetMtnQuoteReasonRequest;
import ph.cpi.rest.api.model.request.RetMtnUserAmtLimitRequest;
import ph.cpi.rest.api.model.request.RetrieveEndtCodeRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnAdjRepresentativeRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnAdjusterListRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnAdviceWordingsRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnApprovalFunctionRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnApprovalRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnApproverFnRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnApproverRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnBlockRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCATPerilRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCedingCompanyListingRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCedingCompanyRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCedingRetentionRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnChargesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCityRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCrestaZoneRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCurrencyListRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCurrencyRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCurrencyRtRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnDeductiblesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnDistrictRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnInsuredRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnIntermediaryRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnLineClassRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnLineRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnNonRenewalReasonRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnObjectRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnParametersRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnProvinceRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnQuoteWordingsRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnReasonRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRegionRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnReportsParamRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnReportsRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRetAmtRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRiskListingRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRiskRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRoundingErrorRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnSectionCoversLovRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnSectionCoversRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnSpoilageReasonRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTreatyCommissionRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTreatyRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTreatyShareRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTypeOfCessionRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnUsersLovRequest;
import ph.cpi.rest.api.model.request.RetrieveRefCodeRequest;
import ph.cpi.rest.api.model.request.SaveMtnAdjusterRequest;
import ph.cpi.rest.api.model.request.SaveMtnAdviceWordingsRequest;
import ph.cpi.rest.api.model.request.SaveMtnApprovalFunctionRequest;
import ph.cpi.rest.api.model.request.SaveMtnApprovalRequest;
import ph.cpi.rest.api.model.request.SaveMtnApproverFnRequest;
import ph.cpi.rest.api.model.request.SaveMtnApproverRequest;
import ph.cpi.rest.api.model.request.SaveMtnBlockRequest;
import ph.cpi.rest.api.model.request.SaveMtnCatPerilRequest;
import ph.cpi.rest.api.model.request.SaveMtnCedingCompanyRequest;
import ph.cpi.rest.api.model.request.SaveMtnCityRequest;
import ph.cpi.rest.api.model.request.SaveMtnCrestaZoneRequest;
import ph.cpi.rest.api.model.request.SaveMtnCurrencyRequest;
import ph.cpi.rest.api.model.request.SaveMtnCurrencyRtRequest;
import ph.cpi.rest.api.model.request.SaveMtnDeductiblesRequest;
import ph.cpi.rest.api.model.request.SaveMtnDistrictRequest;
import ph.cpi.rest.api.model.request.SaveMtnEndorsementRequest;
import ph.cpi.rest.api.model.request.SaveMtnInsuredRequest;
import ph.cpi.rest.api.model.request.SaveMtnIntermediaryRequest;
import ph.cpi.rest.api.model.request.SaveMtnLineClassRequest;
import ph.cpi.rest.api.model.request.SaveMtnLineRequest;
import ph.cpi.rest.api.model.request.SaveMtnNonRenewalReasonRequest;
import ph.cpi.rest.api.model.request.SaveMtnObjectRequest;
import ph.cpi.rest.api.model.request.SaveMtnOtherChargeRequest;
import ph.cpi.rest.api.model.request.SaveMtnParametersRequest;
import ph.cpi.rest.api.model.request.SaveMtnPolicyWordingsRequest;
import ph.cpi.rest.api.model.request.SaveMtnProvinceRequest;
import ph.cpi.rest.api.model.request.SaveMtnQuoteReasonRequest;
import ph.cpi.rest.api.model.request.SaveMtnQuoteWordingsRequest;
import ph.cpi.rest.api.model.request.SaveMtnRegionRequest;
import ph.cpi.rest.api.model.request.SaveMtnReportParamRequest;
import ph.cpi.rest.api.model.request.SaveMtnReportsRequest;
import ph.cpi.rest.api.model.request.SaveMtnRetAmtRequest;
import ph.cpi.rest.api.model.request.SaveMtnRiskRequest;
import ph.cpi.rest.api.model.request.SaveMtnRoundingErrorRequest;
import ph.cpi.rest.api.model.request.SaveMtnSectionCoverRequest;
import ph.cpi.rest.api.model.request.SaveMtnSpoilageReasonRequest;
import ph.cpi.rest.api.model.request.SaveMtnTreatyRequest;
import ph.cpi.rest.api.model.request.SaveMtnTreatyShareRequest;
import ph.cpi.rest.api.model.request.SaveMtnTypeOfCessionRequest;
import ph.cpi.rest.api.model.response.CopyRetAmtSetupResponse;
import ph.cpi.rest.api.model.response.CopyTreatyShareSetupResponse;
import ph.cpi.rest.api.model.response.RetMtnInsuredLovResponse;
import ph.cpi.rest.api.model.response.RetMtnPolWordingsResponse;
import ph.cpi.rest.api.model.response.RetMtnQuoteReasonResponse;
import ph.cpi.rest.api.model.response.RetMtnUserAmtLimitResponse;
import ph.cpi.rest.api.model.response.RetrieveEndtCodeResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnAdjRepresentativeResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnAdjusterListResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnAdviceWordingsResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnApprovalFunctionResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnApprovalResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnApproverFnResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnApproverResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnBlockResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCATPerilResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCedingCompanyListingResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCedingCompanyResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCedingRetentionResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnChargesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCityResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCrestaZoneResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCurrencyListResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCurrencyResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCurrencyRtResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnDeductiblesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnDistrictResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnInsuredResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnIntermediaryResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnLineClassResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnLineResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnNonRenewalReasonResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnObjectResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnParametersResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnProvinceResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnQuoteWordingsResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnReasonResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRegionResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnReportsParamResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnReportsResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRetAmtResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRiskListingResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRiskResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRoundingErrorResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnSectionCoversLovResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnSectionCoversResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnSpoilageReasonResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTreatyCommissionResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTreatyResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTreatyShareResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTypeOfCessionResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnUsersLovResponse;
import ph.cpi.rest.api.model.response.RetrieveRefCodeResponse;
import ph.cpi.rest.api.model.response.SaveMtnAdjusterResponse;
import ph.cpi.rest.api.model.response.SaveMtnAdviceWordingsResponse;
import ph.cpi.rest.api.model.response.SaveMtnApprovalFunctionResponse;
import ph.cpi.rest.api.model.response.SaveMtnApprovalResponse;
import ph.cpi.rest.api.model.response.SaveMtnApproverFnResponse;
import ph.cpi.rest.api.model.response.SaveMtnApproverResponse;
import ph.cpi.rest.api.model.response.SaveMtnBlockResponse;
import ph.cpi.rest.api.model.response.SaveMtnCatPerilResponse;
import ph.cpi.rest.api.model.response.SaveMtnCedingCompanyResponse;
import ph.cpi.rest.api.model.response.SaveMtnCityResponse;
import ph.cpi.rest.api.model.response.SaveMtnCrestaZoneResponse;
import ph.cpi.rest.api.model.response.SaveMtnCurrencyResponse;
import ph.cpi.rest.api.model.response.SaveMtnCurrencyRtResponse;
import ph.cpi.rest.api.model.response.SaveMtnDeductiblesResponse;
import ph.cpi.rest.api.model.response.SaveMtnDistrictResponse;
import ph.cpi.rest.api.model.response.SaveMtnEndorsementResponse;
import ph.cpi.rest.api.model.response.SaveMtnInsuredResponse;
import ph.cpi.rest.api.model.response.SaveMtnIntermediaryResponse;
import ph.cpi.rest.api.model.response.SaveMtnLineClassResponse;
import ph.cpi.rest.api.model.response.SaveMtnLineResponse;
import ph.cpi.rest.api.model.response.SaveMtnNonRenewalReasonResponse;
import ph.cpi.rest.api.model.response.SaveMtnObjectResponse;
import ph.cpi.rest.api.model.response.SaveMtnOtherChargeResponse;
import ph.cpi.rest.api.model.response.SaveMtnParametersResponse;
import ph.cpi.rest.api.model.response.SaveMtnPolicyWordingsResponse;
import ph.cpi.rest.api.model.response.SaveMtnProvinceResponse;
import ph.cpi.rest.api.model.response.SaveMtnQuoteReasonResponse;
import ph.cpi.rest.api.model.response.SaveMtnQuoteWordingsResponse;
import ph.cpi.rest.api.model.response.SaveMtnRegionResponse;
import ph.cpi.rest.api.model.response.SaveMtnReportParamResponse;
import ph.cpi.rest.api.model.response.SaveMtnReportsResponse;
import ph.cpi.rest.api.model.response.SaveMtnRetAmtResponse;
import ph.cpi.rest.api.model.response.SaveMtnRiskResponse;
import ph.cpi.rest.api.model.response.SaveMtnRoundingErrorResponse;
import ph.cpi.rest.api.model.response.SaveMtnSectionCoverResponse;
import ph.cpi.rest.api.model.response.SaveMtnSpoilageReasonResponse;
import ph.cpi.rest.api.model.response.SaveMtnTreatyResponse;
import ph.cpi.rest.api.model.response.SaveMtnTreatyShareResponse;
import ph.cpi.rest.api.model.response.SaveMtnTypeOfCessionResponse;
import ph.cpi.rest.api.model.response.SaveMtnUserAmtLimitRequest;
import ph.cpi.rest.api.model.response.SaveMtnUserAmtLimitResponse;

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
	public RetrieveMtnAdjusterListResponse retrieveMtnAdjusterList(RetrieveMtnAdjusterListRequest rmalr) throws SQLException;
	public RetrieveMtnAdjRepresentativeResponse retrieveMtnAdjRepresentative(RetrieveMtnAdjRepresentativeRequest rmarr) throws SQLException;
	public SaveMtnAdjusterResponse saveMtnAdjuster(SaveMtnAdjusterRequest smar) throws SQLException;
}
