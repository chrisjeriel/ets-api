package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.CopyRetAmtSetupRequest;
import ph.cpi.rest.api.model.request.CopyTreatyShareSetupRequest;
import ph.cpi.rest.api.model.request.RetMtnInsuredLovRequest;
import ph.cpi.rest.api.model.request.RetMtnPolWordingsRequest;
import ph.cpi.rest.api.model.request.RetMtnQuoteReasonRequest;
import ph.cpi.rest.api.model.request.RetMtnUserAmtLimitRequest;
import ph.cpi.rest.api.model.request.RetrieveEndtCodeRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnAdviceWordingsRequest;
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
import ph.cpi.rest.api.model.request.RetrieveMtnProvinceRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnQuoteWordingsRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnReasonRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRegionRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnReportsParamRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnReportsRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRetAmtRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRiskListingRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRiskRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnSectionCoversLovRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnSectionCoversRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnSpoilageReasonRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTreatyCommissionRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTreatyRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTreatyShareRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTypeOfCessionRequest;
import ph.cpi.rest.api.model.request.RetrieveRefCodeRequest;
import ph.cpi.rest.api.model.request.SaveMtnAdviceWordingsRequest;
import ph.cpi.rest.api.model.request.SaveMtnBlockRequest;
import ph.cpi.rest.api.model.request.SaveMtnCatPerilRequest;
import ph.cpi.rest.api.model.request.SaveMtnCedingCompanyRequest;
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
import ph.cpi.rest.api.model.request.SaveMtnPolicyWordingsRequest;
import ph.cpi.rest.api.model.request.SaveMtnProvinceRequest;
import ph.cpi.rest.api.model.request.SaveMtnQuoteReasonRequest;
import ph.cpi.rest.api.model.request.SaveMtnQuoteWordingsRequest;
import ph.cpi.rest.api.model.request.SaveMtnRegionRequest;
import ph.cpi.rest.api.model.request.SaveMtnRetAmtRequest;
import ph.cpi.rest.api.model.request.SaveMtnRiskRequest;
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
import ph.cpi.rest.api.model.response.RetrieveMtnAdviceWordingsResponse;
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
import ph.cpi.rest.api.model.response.RetrieveMtnProvinceResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnQuoteWordingsResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnReasonResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRegionResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnReportsParamResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnReportsResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRetAmtResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRiskListingResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRiskResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnSectionCoversLovResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnSectionCoversResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnSpoilageReasonResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTreatyCommissionResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTreatyResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTreatyShareResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTypeOfCessionResponse;
import ph.cpi.rest.api.model.response.RetrieveRefCodeResponse;
import ph.cpi.rest.api.model.response.SaveMtnAdviceWordingsResponse;
import ph.cpi.rest.api.model.response.SaveMtnBlockResponse;
import ph.cpi.rest.api.model.response.SaveMtnCatPerilResponse;
import ph.cpi.rest.api.model.response.SaveMtnCedingCompanyResponse;
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
import ph.cpi.rest.api.model.response.SaveMtnPolicyWordingsResponse;
import ph.cpi.rest.api.model.response.SaveMtnProvinceResponse;
import ph.cpi.rest.api.model.response.SaveMtnQuoteReasonResponse;
import ph.cpi.rest.api.model.response.SaveMtnQuoteWordingsResponse;
import ph.cpi.rest.api.model.response.SaveMtnRegionResponse;
import ph.cpi.rest.api.model.response.SaveMtnRetAmtResponse;
import ph.cpi.rest.api.model.response.SaveMtnRiskResponse;
import ph.cpi.rest.api.model.response.SaveMtnSectionCoverResponse;
import ph.cpi.rest.api.model.response.SaveMtnSpoilageReasonResponse;
import ph.cpi.rest.api.model.response.SaveMtnTreatyResponse;
import ph.cpi.rest.api.model.response.SaveMtnTreatyShareResponse;
import ph.cpi.rest.api.model.response.SaveMtnTypeOfCessionResponse;
import ph.cpi.rest.api.model.response.SaveMtnUserAmtLimitRequest;
import ph.cpi.rest.api.model.response.SaveMtnUserAmtLimitResponse;
import ph.cpi.rest.api.service.MaintenanceService;


@Component
public class MaintenanceServiceImpl implements MaintenanceService{

	@Autowired
	MaintenanceDao maintenanceDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);
	
	/*
	 * @Override public RetrieveQuoteAlopResponse
	 * retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException {
	 * RetrieveQuoteAlopResponse rqaResponse = new RetrieveQuoteAlopResponse();
	 * 
	 * HashMap<String, Object> retrieveQuoteAlopParams = new HashMap<String,
	 * Object>(); retrieveQuoteAlopParams.put("quoteId", rqap.getQuoteId());
	 * retrieveQuoteAlopParams.put("quotationNo", rqap.getQuotationNo());
	 * 
	 * rqaResponse.getQuotation().setAlop(maintenanceDao.retrieveQuoteAlop(
	 * retrieveQuoteAlopParams));
	 * 
	 * logger.info("retrieveQuoteAlopResponse : " + rqaResponse.toString());
	 * 
	 * return rqaResponse; }
	 */

	@Override
	public RetrieveMtnRiskResponse retrieveMtnRisk(RetrieveMtnRiskRequest rmrp) throws SQLException {
		RetrieveMtnRiskResponse rmrResponse = new RetrieveMtnRiskResponse();
		HashMap<String, Object> retrieveMtnRiskParams = new HashMap<String, Object>();
		retrieveMtnRiskParams.put("riskId", rmrp.getRiskId());
		/*retrieveMtnRiskParams.put("position", rmrp.getPaginationRequest().getPosition());
		retrieveMtnRiskParams.put("count", rmrp.getPaginationRequest().getCount());
		retrieveMtnRiskParams.put("sortKey", rmrp.getSortRequest().getSortKey());
		retrieveMtnRiskParams.put("order", rmrp.getSortRequest().getOrder());*/
		retrieveMtnRiskParams.put("listing", false);
		
		rmrResponse.setRisk(maintenanceDao.retrieveMtnRisk(retrieveMtnRiskParams));
		logger.info("retrieveMtnRiskResponse : " + rmrResponse.toString());
		return rmrResponse;
	}
	
	@Override
	public RetrieveMtnRiskListingResponse retrieveMtnRiskListing(RetrieveMtnRiskListingRequest rmrlp)
			throws SQLException {
		RetrieveMtnRiskListingResponse rmrlResponse = new RetrieveMtnRiskListingResponse();
		
		HashMap<String, Object> retrieveMtnRiskListingParams = new HashMap<String, Object>();
		retrieveMtnRiskListingParams.put("riskId", rmrlp.getRiskId());
		retrieveMtnRiskListingParams.put("riskAbbr", rmrlp.getRiskAbbr());
		retrieveMtnRiskListingParams.put("riskName", rmrlp.getRiskName());
		retrieveMtnRiskListingParams.put("regionDesc", rmrlp.getRegionDesc());
		retrieveMtnRiskListingParams.put("provinceDesc", rmrlp.getProvinceDesc());
		retrieveMtnRiskListingParams.put("cityDesc", rmrlp.getCityDesc());
		retrieveMtnRiskListingParams.put("districtDesc", rmrlp.getDistrictDesc());
		retrieveMtnRiskListingParams.put("blockDesc", rmrlp.getBlockDesc());
		retrieveMtnRiskListingParams.put("latitude", rmrlp.getLatitude());
		retrieveMtnRiskListingParams.put("longitude", rmrlp.getLongitude());
		retrieveMtnRiskListingParams.put("activeTag", rmrlp.getActiveTag());
		retrieveMtnRiskListingParams.put("listing", true);
		
		rmrlResponse.setRisk(maintenanceDao.retrieveMtnRiskListing(retrieveMtnRiskListingParams));
		
		logger.info("retrieveMtnRiskListingResponse : " + rmrlResponse.toString());
		
		return rmrlResponse;
	}

	@Override
	public RetrieveMtnSectionCoversResponse retrieveMtnSectionCovers(RetrieveMtnSectionCoversRequest rmscp)
			throws SQLException {
		RetrieveMtnSectionCoversResponse rmscResponse = new RetrieveMtnSectionCoversResponse();
		
		HashMap<String, Object> retrieveMtnSectionCoversParams = new HashMap<String, Object>();
		retrieveMtnSectionCoversParams.put("lineCd", rmscp.getLineCd());
		retrieveMtnSectionCoversParams.put("coverCd", rmscp.getCoverCd());
		
		rmscResponse.setSectionCovers(maintenanceDao.retrieveSectionCovers(retrieveMtnSectionCoversParams));
		
		logger.info("retrieveMtnSectionCoversResponse : " + rmscResponse.toString());

		return rmscResponse;
	}

	@Override
	public RetrieveMtnTypeOfCessionResponse retrieveMtnTypeOfCession(RetrieveMtnTypeOfCessionRequest rmtcp)
			throws SQLException {
		RetrieveMtnTypeOfCessionResponse rmtcResponse = new RetrieveMtnTypeOfCessionResponse();
		
		HashMap<String, Object> retrieveMtnTypeOfCessionParams = new HashMap<String, Object>();
		retrieveMtnTypeOfCessionParams.put("cessionId", rmtcp.getCessionId());
		
		rmtcResponse.setCession(maintenanceDao.retrieveTypeOfCession(retrieveMtnTypeOfCessionParams));
		
		logger.info("retrieveMtnTypeOfCessionResponse : " + rmtcResponse.toString());
		
		return rmtcResponse;
	}
	
	public RetrieveMtnInsuredResponse retrieveMtnInsured(RetrieveMtnInsuredRequest rmir) throws SQLException {
		RetrieveMtnInsuredResponse rmirResponse = new RetrieveMtnInsuredResponse();
		
		HashMap<String, Object> retrieveMtnInsuredParams = new HashMap<String, Object>();
		retrieveMtnInsuredParams.put("insuredId", rmir.getInsuredId());
		retrieveMtnInsuredParams.put("insuredName",rmir.getInsuredName());
		retrieveMtnInsuredParams.put("insuredAbbr",rmir.getInsuredAbbr());
		retrieveMtnInsuredParams.put("activeTag",rmir.getActiveTag());
		retrieveMtnInsuredParams.put("insuredType",rmir.getInsuredType());
		retrieveMtnInsuredParams.put("corpTag",rmir.getCorpTag());
		retrieveMtnInsuredParams.put("vatTag",rmir.getVatTag());
		retrieveMtnInsuredParams.put("address",rmir.getAddress());
		rmirResponse.setInsured(maintenanceDao.retrieveMtnInsured(retrieveMtnInsuredParams));
		logger.info("retrieveMtnInsuredResponse : " + rmirResponse.toString());
		
		return rmirResponse;
	}

	@Override
	public RetrieveEndtCodeResponse retrieveEndtCode(RetrieveEndtCodeRequest recr) throws SQLException {
		RetrieveEndtCodeResponse recrResponse = new RetrieveEndtCodeResponse();
		
		HashMap<String, Object> retrieveEndtCodeParams = new HashMap<String, Object>();
		retrieveEndtCodeParams.put("endtCd", recr.getEndtCd());
		retrieveEndtCodeParams.put("lineCd", recr.getLineCd());
		
		recrResponse.setEndtCode(maintenanceDao.retrieveEndtCode(retrieveEndtCodeParams));
		logger.info("recrResponse : " + recrResponse.toString());
		
		return recrResponse;
	}

	@Override
	public RetrieveMtnDistrictResponse retrieveMtnDistrict(RetrieveMtnDistrictRequest rmdr) throws SQLException {
		RetrieveMtnDistrictResponse rmdrResponse = new RetrieveMtnDistrictResponse();
		HashMap<String, Object> retrieveMtnDistrictParams = new HashMap<String, Object>();
		retrieveMtnDistrictParams.put("regionCd", rmdr.getRegionCd());
		retrieveMtnDistrictParams.put("provinceCd", rmdr.getProvinceCd());
		retrieveMtnDistrictParams.put("cityCd", rmdr.getCityCd());
		retrieveMtnDistrictParams.put("districtCd", rmdr.getDistrictCd());
		rmdrResponse.setRegion(maintenanceDao.retrieveMtnDistrict(retrieveMtnDistrictParams));
		
		logger.info("retrieveMtnDistrict : " + rmdrResponse.toString());
		
		return rmdrResponse;
	}

	@Override
	public RetrieveMtnDeductiblesResponse retrieveMtnDeductibles(RetrieveMtnDeductiblesRequest rmdr)
			throws SQLException {
		RetrieveMtnDeductiblesResponse rmdrResponse = new RetrieveMtnDeductiblesResponse();
		HashMap<String, Object> retrieveMtnDeductiblesParams = new HashMap<String, Object>();
		retrieveMtnDeductiblesParams.put("lineCd", rmdr.getLineCd());
		retrieveMtnDeductiblesParams.put("deductibleCd", rmdr.getDeductibleCd());
		retrieveMtnDeductiblesParams.put("coverCd", rmdr.getCoverCd());
		retrieveMtnDeductiblesParams.put("endtCd", rmdr.getEndtCd());
		retrieveMtnDeductiblesParams.put("activeTag", rmdr.getActiveTag());
		retrieveMtnDeductiblesParams.put("defaultTag", rmdr.getDefaultTag());
		rmdrResponse.setDeductibles(maintenanceDao.retrieveMtnDeductibles(retrieveMtnDeductiblesParams));
		
		return rmdrResponse;
	}

	@Override
	public RetrieveMtnRegionResponse retrieveMtnRegion(RetrieveMtnRegionRequest rmrp) throws SQLException {
		RetrieveMtnRegionResponse rmrResponse = new RetrieveMtnRegionResponse();
		
		HashMap<String, Object> retrieveMtnRegionParams = new HashMap<String, Object>();
		retrieveMtnRegionParams.put("regionCd", rmrp.getRegionCd());
		retrieveMtnRegionParams.put("from", "retrieveMtnRegion");
		rmrResponse.setRegion(maintenanceDao.retrieveMtnRegion(retrieveMtnRegionParams));
		logger.info("retrieveMtnRegionResponse :" + rmrResponse.toString());
		
		return rmrResponse;
	}

	@Override
	public RetrieveMtnProvinceResponse retrieveMtnProvince(RetrieveMtnProvinceRequest rmpp) throws SQLException {
		RetrieveMtnProvinceResponse rmpResponse = new RetrieveMtnProvinceResponse();
		
		HashMap<String, Object> retrieveMtnProvinceParams = new HashMap<String, Object>();
		retrieveMtnProvinceParams.put("regionCd", rmpp.getRegionCd());
		retrieveMtnProvinceParams.put("provinceCd", rmpp.getProvinceCd());
		retrieveMtnProvinceParams.put("from", "retrieveMtnProvince");
		rmpResponse.setRegion(maintenanceDao.retrieveMtnProvince(retrieveMtnProvinceParams));
		//rmpResponse.getRegion().setProvinceList(maintenanceDao.retrieveMtnProvince(retrieveMtnProvinceParams));
		logger.info("retrieveMtnProvinceResponse :" + rmpResponse.toString());
		
		return rmpResponse;
	}

	@Override
	public RetrieveMtnObjectResponse retrieveMtnObject(RetrieveMtnObjectRequest rmop) throws SQLException {
		RetrieveMtnObjectResponse rmoResponse = new RetrieveMtnObjectResponse();
		
		HashMap<String, Object> retrieveMtnObjectParams = new HashMap<String, Object>();
		retrieveMtnObjectParams.put("objectId", rmop.getObjectId());
		retrieveMtnObjectParams.put("lineCd", rmop.getLineCd());
		rmoResponse.setObject(maintenanceDao.retrieveMtnObject(retrieveMtnObjectParams));
		logger.info("retrieveMtnObjectResponse :" + rmoResponse.toString());
		
		return rmoResponse;
	}

	@Override
	public RetrieveMtnQuoteWordingsResponse retrieveMtnQuoteWordings(RetrieveMtnQuoteWordingsRequest rmqwp)
			throws SQLException {
		RetrieveMtnQuoteWordingsResponse rmqwResponse = new RetrieveMtnQuoteWordingsResponse();
		HashMap<String, Object> retrieveMtnQuoteWordingsParams = new HashMap<String, Object>();
		retrieveMtnQuoteWordingsParams.put("lineCd", rmqwp.getLineCd());
		retrieveMtnQuoteWordingsParams.put("wordType", rmqwp.getWordType());
		rmqwResponse.setQuoteWordings(maintenanceDao.retrieveMtnQuoteWordings(retrieveMtnQuoteWordingsParams));
		logger.info("retrieveMtnQuoteWordingsResponse :" + rmqwResponse.toString());

		return rmqwResponse;
	}
	
	@Override
	public RetrieveMtnCityResponse retrieveMtnCity(RetrieveMtnCityRequest rmcr) throws SQLException {
		RetrieveMtnCityResponse rmcrResponse = new RetrieveMtnCityResponse();
		
		HashMap<String, Object> retrieveMtnCityParams = new HashMap<String, Object>();
		retrieveMtnCityParams.put("regionCd", rmcr.getRegionCd());
		retrieveMtnCityParams.put("provinceCd", rmcr.getProvinceCd());
		retrieveMtnCityParams.put("cityCd", rmcr.getCityCd());
		retrieveMtnCityParams.put("position", rmcr.getPaginationRequest().getPosition());
		retrieveMtnCityParams.put("count", rmcr.getPaginationRequest().getCount());
		retrieveMtnCityParams.put("sortKey", rmcr.getSortRequest().getSortKey());
		retrieveMtnCityParams.put("order", rmcr.getSortRequest().getOrder());
		
		rmcrResponse.setRegion(maintenanceDao.retrieveMtnCityList(retrieveMtnCityParams));
		rmcrResponse.getPaginationResponse().setPosition(rmcr.getPaginationRequest().getPosition());
		rmcrResponse.getPaginationResponse().setCount(rmcr.getPaginationRequest().getCount());
		rmcrResponse.getSortResponse().setSortKey(rmcr.getSortRequest().getSortKey());
		rmcrResponse.getSortResponse().setOrder(rmcr.getSortRequest().getOrder());
		logger.info("retrieveMtnCityResponse : " + rmcrResponse.toString());
		
		return rmcrResponse;
	}
	
	@Override
	public RetrieveMtnCrestaZoneResponse retrieveMtnCrestaZone(RetrieveMtnCrestaZoneRequest rmczr) throws SQLException {
		RetrieveMtnCrestaZoneResponse rmczrResponse = new RetrieveMtnCrestaZoneResponse();
		
		HashMap<String, Object> retrieveMtnCrestaZoneParams = new HashMap<String, Object>();
		retrieveMtnCrestaZoneParams.put("zoneCd", rmczr.getZoneCd());
		retrieveMtnCrestaZoneParams.put("position", rmczr.getPaginationRequest().getPosition());
		retrieveMtnCrestaZoneParams.put("count", rmczr.getPaginationRequest().getCount());
		retrieveMtnCrestaZoneParams.put("sortKey", rmczr.getSortRequest().getSortKey());
		retrieveMtnCrestaZoneParams.put("order", rmczr.getSortRequest().getOrder());
		
		rmczrResponse.setCrestaZone(maintenanceDao.retrieveMtnCrestaZoneList(retrieveMtnCrestaZoneParams));
		rmczrResponse.getPaginationResponse().setPosition(rmczr.getPaginationRequest().getPosition());
		rmczrResponse.getPaginationResponse().setCount(rmczr.getPaginationRequest().getCount());
		rmczrResponse.getSortResponse().setSortKey(rmczr.getSortRequest().getSortKey());
		rmczrResponse.getSortResponse().setOrder(rmczr.getSortRequest().getOrder());
		
		logger.info("retrieveMtnCrestaZoneResponse : " + rmczrResponse.toString());
		
		return rmczrResponse;
	}
	
	@Override
	public RetrieveMtnCurrencyResponse retrieveMtnCurrency(RetrieveMtnCurrencyRequest rmcr) throws SQLException {
		RetrieveMtnCurrencyResponse rmcrResponse = new RetrieveMtnCurrencyResponse();
		
		HashMap<String, Object> retrieveMtnCurrencyParams = new HashMap<String, Object>();
		retrieveMtnCurrencyParams.put("currencyCd", rmcr.getCurrencyCd());
		retrieveMtnCurrencyParams.put("activeTag", rmcr.getActiveTag());
		retrieveMtnCurrencyParams.put("position", rmcr.getPaginationRequest().getPosition());
		retrieveMtnCurrencyParams.put("count", rmcr.getPaginationRequest().getCount());
		retrieveMtnCurrencyParams.put("sortKey", rmcr.getSortRequest().getSortKey());
		retrieveMtnCurrencyParams.put("order", rmcr.getSortRequest().getOrder());
		
		rmcrResponse.setCurrency(maintenanceDao.retrieveMtnCurrencyList(retrieveMtnCurrencyParams));
		rmcrResponse.getPaginationResponse().setPosition(rmcr.getPaginationRequest().getPosition());
		rmcrResponse.getPaginationResponse().setCount(rmcr.getPaginationRequest().getCount());
		rmcrResponse.getSortResponse().setSortKey(rmcr.getSortRequest().getSortKey());
		rmcrResponse.getSortResponse().setOrder(rmcr.getSortRequest().getOrder());
		
		logger.info("retrieveMtnCurrencyResponse : " + rmcrResponse.toString());
		
		return rmcrResponse;
	}


	@Override
	public RetrieveMtnAdviceWordingsResponse retrieveMaintenanceAdviceWordings(
			RetrieveMtnAdviceWordingsRequest retMtnAdviceWordings)
					throws SQLException {
		
		RetrieveMtnAdviceWordingsResponse rmawResponse = new RetrieveMtnAdviceWordingsResponse();
        
        HashMap<String, Object> retrieveMtnAdviceWordingsParams = new HashMap<String, Object>();
        retrieveMtnAdviceWordingsParams.put("adviceWordId", retMtnAdviceWordings.getAdviceWordId());
        
        rmawResponse.setAdviceWordings(maintenanceDao.retrieveMaintenanceAdviceWordings(retrieveMtnAdviceWordingsParams));
        
        logger.info("retrieveMaintenanceAdviceWordingsResponse : " + rmawResponse.toString());
        
        
        return rmawResponse;

	}

	@Override
	public RetrieveMtnBlockResponse retrieveMaintenanceBlock(RetrieveMtnBlockRequest retMtnBlock)
			throws SQLException {
		
		RetrieveMtnBlockResponse rmbResponse = new RetrieveMtnBlockResponse();
        
        HashMap<String, Object> retrieveMtnBlockParams = new HashMap<String, Object>();
        retrieveMtnBlockParams.put("regionCd", retMtnBlock.getRegionCd());
        retrieveMtnBlockParams.put("provinceCd", retMtnBlock.getProvinceCd());
        retrieveMtnBlockParams.put("cityCd", retMtnBlock.getCityCd());
        retrieveMtnBlockParams.put("districtCd", retMtnBlock.getDistrictCd());
        retrieveMtnBlockParams.put("blockCd", retMtnBlock.getBlockCd());
        
        rmbResponse.setRegion(maintenanceDao.retrieveMaintenanceBlockList(retrieveMtnBlockParams));
        
        logger.info("retrieveMaintenanceBlockResponse : " + rmbResponse.toString());
        
		return rmbResponse;
	}

	@Override
	public RetrieveMtnCedingCompanyListingResponse retrieveMaintenanceCedingCompanyListing(
			RetrieveMtnCedingCompanyListingRequest retMtnCedingCompanyListing) throws SQLException {
		
		RetrieveMtnCedingCompanyListingResponse rmcclResponse = new RetrieveMtnCedingCompanyListingResponse();
		
		HashMap<String, Object> retrieveMtnCedingCompanyParams = new HashMap<String, Object>();
		retrieveMtnCedingCompanyParams.put("cedingId",retMtnCedingCompanyListing.getCedingId()); 
		retrieveMtnCedingCompanyParams.put("cedingName",retMtnCedingCompanyListing.getCedingName());
		retrieveMtnCedingCompanyParams.put("cedingAbbr",retMtnCedingCompanyListing.getCedingAbbr());
		retrieveMtnCedingCompanyParams.put("address",retMtnCedingCompanyListing.getAddress());
		retrieveMtnCedingCompanyParams.put("membershipDate",retMtnCedingCompanyListing.getMembershipDate());
		retrieveMtnCedingCompanyParams.put("terminationDate",retMtnCedingCompanyListing.getTerminationDate());
		retrieveMtnCedingCompanyParams.put("inactiveDate",retMtnCedingCompanyListing.getInactiveDate());
		retrieveMtnCedingCompanyParams.put("activeTag",retMtnCedingCompanyListing.getActiveTag());
		retrieveMtnCedingCompanyParams.put("govtTag",retMtnCedingCompanyListing.getGovtTag());
		retrieveMtnCedingCompanyParams.put("membershipTag",retMtnCedingCompanyListing.getMembershipTag());
		
		rmcclResponse.setCedingcompany(maintenanceDao.retrieveMaintenanceCedingCompanyList(retrieveMtnCedingCompanyParams));
        
		return rmcclResponse;
	}

	@Override
	public RetrieveMtnCedingCompanyResponse retrieveMaintenanceCedingCompany(
			RetrieveMtnCedingCompanyRequest retMtnCedingCompany) throws SQLException {
		RetrieveMtnCedingCompanyResponse rmccResponse = new RetrieveMtnCedingCompanyResponse();
		
		HashMap<String, Object> retrieveMtnCedingCompanyParams = new HashMap<String, Object>();
		retrieveMtnCedingCompanyParams.put("cedingId",retMtnCedingCompany.getCedingId()); 
		
		rmccResponse.setCedingCompany(maintenanceDao.retrieveMaintenanceCedingCompany(retrieveMtnCedingCompanyParams));
        
		return rmccResponse;
	}

	/*@Override
	public RetrieveMtnCedingCompanyResponse retrieveMaintenanceCedingCompany(
			RetrieveMtnCedingCompanyRequest retMtnCedingCompany) throws SQLException {
		RetrieveMtnCedingCompanyResponse rmccResponse = new RetrieveMtnCedingCompanyResponse();
        
        HashMap<String, Object> retrieveMtnCedingCompanyParams = new HashMap<String, Object>();
        retrieveMtnCedingCompanyParams.put("cedingId", retMtnCedingCompany.getCedingId());
        
        rmccResponse.setCedingCompany(maintenanceDao.retrieveMaintenanceCedingCompany(retrieveMtnCedingCompanyParams));
      
        logger.info("retrieveMaintenanceCedingCompanyResponse : " + rmccResponse.toString());
        
		return rmccResponse;
	}

	@Override
	public RetrieveMtnCedingCompanyListingResponse retrieveMaintenanceCedingCompanyListing(
			RetrieveMtnCedingCompanyListingRequest retMtnCedingCompanyListing) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}*/

	/*@Override
	public RetrieveMtnCedingCompanyListingResponse retrieveMaintenanceCedingCompanyListing(
			RetrieveMtnCedingCompanyListingRequest retMtnCedingCompanyListing) throws SQLException {
		
		RetrieveMtnCedingCompanyListingResponse rmcclResponse = new RetrieveMtnCedingCompanyListingResponse();
        
        HashMap<String, Object> retrieveMtnCedingCompanyListingResponseParams = new HashMap<String, Object>();
        retrieveMtnCedingCompanyListingResponseParams.put("cedingId", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("cedingName", retMtnCedingCompanyListing.getCedingName());
        retrieveMtnCedingCompanyListingResponseParams.put("cedingAbbr", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("cedingAddress", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("membershipDate", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("terminationDate", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("inactiveDate", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("membershipDate", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("inactiveTag", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("activeTag", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("governmentTag", retMtnCedingCompanyListing.getCedingId());
        retrieveMtnCedingCompanyListingResponseParams.put("membershipTag", retMtnCedingCompanyListing.getCedingId());
        
        rmcclResponse.setCedingcompany(maintenanceDao.retrieveMaintenanceCedingCompanyList(retrieveMtnCedingCompanyListingResponseParams));
      
        logger.info("retrieveMaintenanceCedingCompanyResponse : " + rmcclResponse.toString());
        
		return rmcclResponse;
	}*/

	@Override
	public RetrieveMtnIntermediaryResponse retrieveMtnIntermediary(RetrieveMtnIntermediaryRequest rmip)
			throws SQLException {
		// TODO Auto-generated method stub
		RetrieveMtnIntermediaryResponse rmiResponse = new RetrieveMtnIntermediaryResponse();
		
		HashMap<String, Object> retrieveMtnIntermediaryParams = new HashMap<String, Object>();
		retrieveMtnIntermediaryParams.put("intmId", rmip.getIntmId());
		retrieveMtnIntermediaryParams.put("intmName",rmip.getIntmName());
		retrieveMtnIntermediaryParams.put("address",rmip.getAddress());
		retrieveMtnIntermediaryParams.put("contactNo",rmip.getContactNo());
		retrieveMtnIntermediaryParams.put("activeTag",rmip.getActiveTag());
		retrieveMtnIntermediaryParams.put("corpTag",rmip.getCorpTag());
		retrieveMtnIntermediaryParams.put("vatTag",rmip.getVatTag());
		retrieveMtnIntermediaryParams.put("oldIntmId",rmip.getOldIntmId());

		rmiResponse.setIntermediary(maintenanceDao.retrieveMntIntermediary(retrieveMtnIntermediaryParams));
			
		logger.info("retrieveMtnIntermediaryResponse : " + rmiResponse.toString());
		
		return rmiResponse;
	}

	@Override
	public RetrieveMtnLineResponse retrieveMtnLine(RetrieveMtnLineRequest rmlp) throws SQLException {
		// TODO Auto-generated method stub
		RetrieveMtnLineResponse rmlResponse = new RetrieveMtnLineResponse();
		HashMap<String, Object> retrieveMtnLineParams = new HashMap<String, Object>();
		retrieveMtnLineParams.put("lineCd", rmlp.getLineCd());
		
		rmlResponse.setLine(maintenanceDao.retrieveMntLine(retrieveMtnLineParams));
		logger.info("retrieveMtnLineResponse : " + rmlResponse.toString());
		return rmlResponse;
	}

	public RetrieveMtnLineClassResponse retrieveMtnLineClass(RetrieveMtnLineClassRequest rmlcp) throws SQLException {
		// TODO Auto-generated method stub
		RetrieveMtnLineClassResponse rmlcResponse = new RetrieveMtnLineClassResponse();
		HashMap<String, Object> retrieveMtnLineClassParams = new HashMap<String, Object>();
		
		retrieveMtnLineClassParams.put("lineCd", rmlcp.getLineCd());
		retrieveMtnLineClassParams.put("lineClassCd", rmlcp.getLineClassCd());
		
		rmlcResponse.setLineClass(maintenanceDao.retrieveMntLineClass(retrieveMtnLineClassParams));
		logger.info("retrieveMtnLineClassResponse : " + rmlcResponse.toString());
		return rmlcResponse;
	}
	
	@Override
	public SaveMtnLineClassResponse saveMtnLineClass(SaveMtnLineClassRequest smlcr) throws SQLException {
		SaveMtnLineClassResponse smlcrResponse = new SaveMtnLineClassResponse();
		HashMap<String, Object> saveMtnLineClassParams = new HashMap<String, Object>();
		saveMtnLineClassParams.put("saveLineClass", smlcr.getSaveLineClass());
		saveMtnLineClassParams.put("deleteLineClass", smlcr.getDeleteLineClass());
		smlcrResponse.setReturnCode(maintenanceDao.saveMtnLineClass(saveMtnLineClassParams));
		logger.info("SaveMtnLineClassResponse : " + smlcrResponse.toString());
		return smlcrResponse;
	}

	@Override
	public SaveMtnRiskResponse saveMtnRisk(SaveMtnRiskRequest smrr) throws SQLException {
		SaveMtnRiskResponse smrrResponse = new SaveMtnRiskResponse();
		HashMap<String, Object> saveMtnRiskParams = new HashMap<String, Object>();
		
		saveMtnRiskParams.put("riskId", smrr.getRiskId());
		saveMtnRiskParams.put("riskAbbr", smrr.getRiskAbbr());
		saveMtnRiskParams.put("riskName", smrr.getRiskName());
		saveMtnRiskParams.put("regionCd", smrr.getRegionCd());
		saveMtnRiskParams.put("provinceCd", smrr.getProvinceCd());
		saveMtnRiskParams.put("cityCd", smrr.getCityCd());
		saveMtnRiskParams.put("districtCd", smrr.getDistrictCd());
		saveMtnRiskParams.put("latitude", smrr.getLatitude());
		saveMtnRiskParams.put("longitude", smrr.getLongitude());
		saveMtnRiskParams.put("zoneCd", smrr.getZoneCd());
		saveMtnRiskParams.put("activeTag", smrr.getActiveTag());
		saveMtnRiskParams.put("remarks", smrr.getRemarks());
		saveMtnRiskParams.put("createUser", smrr.getCreateUser());
		saveMtnRiskParams.put("createDate", smrr.getCreateDate());
		saveMtnRiskParams.put("updateUser", smrr.getUpdateUser());
		saveMtnRiskParams.put("updateDate", smrr.getUpdateDate());
		saveMtnRiskParams.put("blockCd", smrr.getBlockCd());
		try{
			HashMap<String, Object> res = maintenanceDao.saveMtnRisk(saveMtnRiskParams);
			smrrResponse.setReturnCode((Integer) res.get("errorCode"));
			smrrResponse.setRiskId((String) res.get("riskId")); 
		}catch (SQLException ex) {
			smrrResponse.setReturnCode(0);
			smrrResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}catch (Exception ex) {
			smrrResponse.setReturnCode(0);
			smrrResponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		
		System.out.println("smrrResponse: " + smrrResponse);
		return smrrResponse;
	}

	@Override
	public RetrieveMtnTreatyResponse retrieveMtnTreaty(RetrieveMtnTreatyRequest rmtr) throws SQLException {
		RetrieveMtnTreatyResponse retrieveMtnTreatyResponse = new RetrieveMtnTreatyResponse();
		
		HashMap<String, Object> retrieveMtnTreatyParams =  new HashMap<String, Object>();
		retrieveMtnTreatyParams.put("treatyId", rmtr.getTreatyId());
		
		retrieveMtnTreatyResponse.setTreatyList(maintenanceDao.retrieveMtnTreaty(retrieveMtnTreatyParams));
		return retrieveMtnTreatyResponse;
	}
	
	@Override
	public RetrieveMtnReasonResponse retrieveMtnReason(RetrieveMtnReasonRequest rmrr) throws SQLException {
		RetrieveMtnReasonResponse rmrResponse = new RetrieveMtnReasonResponse();
		
		HashMap<String, Object> retrieveMtnReasonParams =  new HashMap<String, Object>();
		retrieveMtnReasonParams.put("reasonCd", rmrr.getReasonCd());
		
		rmrResponse.setReason(maintenanceDao.retrieveMtnReason(retrieveMtnReasonParams));
		
		return rmrResponse;
	}

	@Override
	public RetrieveMtnReportsResponse retrieveMtnReports(RetrieveMtnReportsRequest rmreport) throws SQLException {
		RetrieveMtnReportsResponse rmreResponse = new RetrieveMtnReportsResponse();
		
		HashMap<String, Object> retrieveMtnReportsParams = new HashMap<String, Object>();
		retrieveMtnReportsParams.put("reportId", rmreport.getReportId());
		
		rmreResponse.setReports(maintenanceDao.retrieveMtnReports(retrieveMtnReportsParams));
		return rmreResponse;
	}

	@Override
	public RetrieveMtnSectionCoversLovResponse retrieveMtnSectionCoversLov(RetrieveMtnSectionCoversLovRequest rmsclp)
			throws SQLException {
		RetrieveMtnSectionCoversLovResponse rmsclResponse = new RetrieveMtnSectionCoversLovResponse();
		
		HashMap<String, Object> retrieveMtnSectionCoversLovParams = new HashMap<String, Object>();
		retrieveMtnSectionCoversLovParams.put("lineCd", rmsclp.getLineCd());
		retrieveMtnSectionCoversLovParams.put("cover", rmsclp.getCover());
		
		rmsclResponse.setSectionCovers(maintenanceDao.retrieveSectionCoversLov(retrieveMtnSectionCoversLovParams));
		
		logger.info("retrieveMtnSectionCoversLovResponse : " + rmsclResponse.toString());

		return rmsclResponse;
	}
	
	@Override
	public RetrieveRefCodeResponse retrieveRefCode(RetrieveRefCodeRequest rrcr) throws SQLException{
		RetrieveRefCodeResponse rrcResponse = new RetrieveRefCodeResponse();
		HashMap <String, Object> retrieveRefCodeParams = new HashMap<String, Object>();
		retrieveRefCodeParams.put("identifier", rrcr.getIdentifier());
		
		rrcResponse.setRefCodeList(maintenanceDao.retrieveRefCode(retrieveRefCodeParams));
		return rrcResponse;
	}

	@Override
	public RetrieveMtnReportsParamResponse retrieveMtnReportsParam(RetrieveMtnReportsParamRequest rmrp)
			throws SQLException {
		// TODO Auto-generated method stub
		RetrieveMtnReportsParamResponse rmrpResponse = new RetrieveMtnReportsParamResponse();
		HashMap<String, Object> retrieveMtnReportsParamParams = new HashMap<String, Object>();
		retrieveMtnReportsParamParams.put("reportId", rmrp.getReportId());
		rmrpResponse.setReportsParam(maintenanceDao.retrieveMtnReportsParam(retrieveMtnReportsParamParams));
		return rmrpResponse;
	}

	@Override
	public SaveMtnLineResponse saveMtnLine(SaveMtnLineRequest smlr) throws SQLException {
		SaveMtnLineResponse smlResponse = new SaveMtnLineResponse();
		HashMap<String, Object> saveMtnLineParams = new HashMap<String, Object>();
		saveMtnLineParams.put("saveLine", smlr.getSaveLine());
		saveMtnLineParams.put("deleteLine",smlr.getDeleteLine());
        smlResponse.setReturnCode(maintenanceDao.saveMtnLine(saveMtnLineParams));
		logger.info("SaveMtnLineResponse : " + smlResponse.toString());

		return smlResponse;
	}
	
	@Override
	public RetrieveMtnCATPerilResponse retrieveMtnCATPeril(RetrieveMtnCATPerilRequest rmcatpr) throws SQLException {
		RetrieveMtnCATPerilResponse rmcatpResponse = new RetrieveMtnCATPerilResponse();
		
		HashMap<String, Object> retrieveMtnCATPerilParams = new HashMap<String, Object>();
		retrieveMtnCATPerilParams.put("lineCd", rmcatpr.getLineCd());
		retrieveMtnCATPerilParams.put("objectId", rmcatpr.getObjectId());
		retrieveMtnCATPerilParams.put("catPerilId", rmcatpr.getCatPerilId());
		
		rmcatpResponse.setCatPerilList(maintenanceDao.retrieveMtnCATPeril(retrieveMtnCATPerilParams));
		
		return rmcatpResponse;
	}

	@Override
	public RetrieveMtnChargesResponse retrieveMtnCharges(RetrieveMtnChargesRequest rmcr) throws SQLException {
		RetrieveMtnChargesResponse rmcResponse = new RetrieveMtnChargesResponse();
		
		HashMap<String, Object> retrieveMtnChargesParams = new HashMap<String, Object>();
		retrieveMtnChargesParams.put("chargeCd", rmcr.getChargeCd());
		
		rmcResponse.setMtnChargesList(maintenanceDao.retrieveMtnCharges(retrieveMtnChargesParams));
		
		return rmcResponse;
	}

	@Override
	public SaveMtnDeductiblesResponse saveMtnDeductibles(SaveMtnDeductiblesRequest smdr) throws SQLException {
		SaveMtnDeductiblesResponse smdResponse = new SaveMtnDeductiblesResponse();
		HashMap<String, Object> saveMtnDeductiblesParams = new HashMap<String, Object>();
		saveMtnDeductiblesParams.put("saveDeductibles", smdr.getSaveDeductibles());
		saveMtnDeductiblesParams.put("deleteDeductibles", smdr.getDeleteDeductibles());
		smdResponse.setReturnCode(maintenanceDao.saveMtnDeductibles(saveMtnDeductiblesParams));
		logger.info("SaveMtnDeductiblesResponse : " + smdResponse.toString());
		return smdResponse;
	}

	@Override
	public RetrieveMtnSpoilageReasonResponse retrieveMtnSpoilageReason(RetrieveMtnSpoilageReasonRequest rmsrr)
			throws SQLException {
		RetrieveMtnSpoilageReasonResponse rsrResponse = new RetrieveMtnSpoilageReasonResponse();
		HashMap<String, Object> retrieveMtnSpoilageReasonParams = new HashMap<String, Object>();
		retrieveMtnSpoilageReasonParams.put("spoilCd", rmsrr.getSpoilCd());
		retrieveMtnSpoilageReasonParams.put("activeTag", rmsrr.getActiveTag());
		rsrResponse.setSpoilageReason(maintenanceDao.retrieveMtnSpoilageReason(retrieveMtnSpoilageReasonParams));
		logger.info("RetrieveMtnSpoilageReasonResponse : " + rsrResponse.toString());
		return rsrResponse;
	}

	@Override
	public RetMtnPolWordingsResponse retMtnPolWordings(RetMtnPolWordingsRequest rmpwr) throws SQLException {
		RetMtnPolWordingsResponse rmpwrResponse = new RetMtnPolWordingsResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("lineCd" , rmpwr.getLineCd());
		params.put("wordingCd" , rmpwr.getWordingCd());
		params.put("wordType", rmpwr.getWordType());
		params.put("activeTag" , rmpwr.getActiveTag());
		params.put("defaultTag" , rmpwr.getDefaultTag());
		params.put("ocTag" , rmpwr.getOcTag());
		rmpwrResponse.setMtnPolWordings(maintenanceDao.retMtnPolWordings(params));
		logger.info("RetMtnPolWordingsResponse : " + rmpwrResponse.toString());
		return rmpwrResponse;
	}
	
	@Override
	public SaveMtnInsuredResponse saveMtnInsured(SaveMtnInsuredRequest smir) throws SQLException {
		SaveMtnInsuredResponse smiResponse = new SaveMtnInsuredResponse();
		HashMap<String, Object> saveMtnInsuredParams = new HashMap<String, Object>();
		saveMtnInsuredParams.put("insuredIdOut", "");
		saveMtnInsuredParams.put("insuredId",smir.getInsuredId());
		saveMtnInsuredParams.put("insuredName",smir.getInsuredName());
		saveMtnInsuredParams.put("insuredAbbr",smir.getInsuredAbbr());
		saveMtnInsuredParams.put("insuredType",smir.getInsuredType());
		saveMtnInsuredParams.put("firstName",smir.getFirstName());
		saveMtnInsuredParams.put("middleInitial",smir.getMiddleInitial());
		saveMtnInsuredParams.put("lastName",smir.getLastName());
		saveMtnInsuredParams.put("addrLine1",smir.getAddrLine1());
		saveMtnInsuredParams.put("addrLine2",smir.getAddrLine2());
		saveMtnInsuredParams.put("addrLine3",smir.getAddrLine3());
		saveMtnInsuredParams.put("zipCd",smir.getZipCd());
		saveMtnInsuredParams.put("contactNo",smir.getContactNo());
		saveMtnInsuredParams.put("emailAdd",smir.getEmailAdd());
		saveMtnInsuredParams.put("activeTag",smir.getActiveTag());
		saveMtnInsuredParams.put("corpTag",smir.getCorpTag());
		saveMtnInsuredParams.put("vatTag",smir.getVatTag());
		saveMtnInsuredParams.put("oldInsId",smir.getOldInsId());
		saveMtnInsuredParams.put("remarks",smir.getRemarks());
		saveMtnInsuredParams.put("createUser",smir.getCreateUser());
		saveMtnInsuredParams.put("createDate",smir.getCreateDate());
		saveMtnInsuredParams.put("updateUser",smir.getUpdateUser());
		saveMtnInsuredParams.put("updateDate",smir.getUpdateDate());
		
		HashMap<String, Object> result = maintenanceDao.saveMtnInsured(saveMtnInsuredParams);
		
		smiResponse.setReturnCode((Integer) result.get("errorCode"));
		smiResponse.setInsuredIdOut((Integer) result.get("insuredIdOut"));
		
		logger.info("SaveMtnInsuredResponse : " + smiResponse.toString());
		System.out.println(saveMtnInsuredParams);

		return smiResponse;
	}

	@Override
	public SaveMtnTypeOfCessionResponse saveMtnTypeOfCession(SaveMtnTypeOfCessionRequest smtocr) throws SQLException {
		SaveMtnTypeOfCessionResponse smtocResponse =  new SaveMtnTypeOfCessionResponse();
		HashMap<String, Object> saveMtnTypeOfCessionParams = new HashMap<String, Object>();
		saveMtnTypeOfCessionParams.put("saveTypeOfCession", smtocr.getSaveTypeOfCession());
		saveMtnTypeOfCessionParams.put("deleteTypeOfCession", smtocr.getDeleteTypeOfCession());
		smtocResponse.setReturnCode(maintenanceDao.saveMtnTypeOfCession(saveMtnTypeOfCessionParams));
		logger.info("SaveMtnTypeOfCessionResponse : " + smtocResponse.toString());
		return smtocResponse;
	}
	
	@Override
	public RetMtnInsuredLovResponse retMtnInsuredLov(RetMtnInsuredLovRequest rmil) throws SQLException {
		RetMtnInsuredLovResponse rmilResponse = new RetMtnInsuredLovResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("lovParam", rmil.getLovParam());
		params.put("page", rmil.getPaginationRequest());
		params.put("sort", rmil.getSortRequest());
		rmilResponse.setList(maintenanceDao.retMtnInsuredLov(params));
		rmilResponse.setCount(maintenanceDao.retMtnInsuredLovCount(params));
		
		return rmilResponse;
	}

	@Override
	public SaveMtnIntermediaryResponse saveMtnIntermediary(SaveMtnIntermediaryRequest smir) throws SQLException {
		SaveMtnIntermediaryResponse smiResponse = new SaveMtnIntermediaryResponse();
		HashMap<String, Object> saveMtnIntmParams = new HashMap<String, Object>();
		saveMtnIntmParams.put("intmIdOut", "");
		saveMtnIntmParams.put("intmId", smir.getIntmId());
		saveMtnIntmParams.put("intmName", smir.getIntmName());
		saveMtnIntmParams.put("firstName", smir.getFirstName());
		saveMtnIntmParams.put("middleInitial", smir.getMiddleInitial());
		saveMtnIntmParams.put("lastName", smir.getLastName());
		saveMtnIntmParams.put("addrLine1", smir.getAddrLine1());
		saveMtnIntmParams.put("addrLine2", smir.getAddrLine2());
		saveMtnIntmParams.put("addrLine3", smir.getAddrLine3());
		saveMtnIntmParams.put("zipCd", smir.getZipCd());
		saveMtnIntmParams.put("contactNo", smir.getContactNo());
		saveMtnIntmParams.put("emailAdd", smir.getEmailAdd());
		saveMtnIntmParams.put("activeTag", smir.getActiveTag());
		saveMtnIntmParams.put("corpTag", smir.getCorpTag());
		saveMtnIntmParams.put("vatTag", smir.getVatTag());
		saveMtnIntmParams.put("oldIntmId", smir.getOldIntmId());
		saveMtnIntmParams.put("remarks", smir.getRemarks());          
		saveMtnIntmParams.put("createUser", smir.getCreateUser());
		saveMtnIntmParams.put("createDate", smir.getCreateDate());
		saveMtnIntmParams.put("updateUser", smir.getUpdateUser());
		saveMtnIntmParams.put("updateDate", smir.getUpdateDate());
		
		HashMap<String, Object> result = maintenanceDao.saveMtnIntermediary(saveMtnIntmParams);
		
		smiResponse.setReturnCode((Integer) result.get("errorCode"));
		smiResponse.setIntmIdOut((Integer) result.get("intmIdOut"));
		
		logger.info("SaveMtnIntermediaryResponse : " + smiResponse.toString());
		
		return smiResponse;
	}
	
	@Override
	public SaveMtnAdviceWordingsResponse saveMtnAdviceWordings(SaveMtnAdviceWordingsRequest smawr) throws SQLException {
		SaveMtnAdviceWordingsResponse response = new SaveMtnAdviceWordingsResponse();
		try{
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("saveAdvWordList", smawr.getSaveAdvWordList());
			params.put("deleteAdvWordList", smawr.getDeleteAdvWordList());
			Integer res = maintenanceDao.saveMtnAdviceWordings(params);
			response.setReturnCode(res);
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}
	
	@Override
	public RetrieveMtnCurrencyListResponse retMtnCurrencyList(RetrieveMtnCurrencyListRequest rmcl) throws SQLException {
		RetrieveMtnCurrencyListResponse rmclist = new RetrieveMtnCurrencyListResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("currencyCd", rmcl.getCurrencyCd());
		params.put("paginationRequest", rmcl.getPaginationRequest());
		params.put("sortRequest", rmcl.getSortRequest());
		
		rmclist.setCurrency(maintenanceDao.retrieveMtnCurrencyListing(params));
		return rmclist;
	}

	@Override
	public SaveMtnCurrencyResponse saveMtnCurrency(SaveMtnCurrencyRequest smcr) throws SQLException {
		SaveMtnCurrencyResponse smcResponse = new SaveMtnCurrencyResponse();
		try{
			HashMap<String, Object> saveMtnCurrParams = new HashMap<String, Object>();
			saveMtnCurrParams.put("saveCurrency",smcr.getSaveCurrency());
			saveMtnCurrParams.put("delCurrency",smcr.getDelCurrency());
			
			HashMap<String, Object> res = maintenanceDao.saveMtnCurrency(saveMtnCurrParams);
			smcResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			smcResponse.setReturnCode(0);
			smcResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return smcResponse;
	}

	@Override
	public RetrieveMtnCurrencyRtResponse retrieveMtnCurrencyRate(RetrieveMtnCurrencyRtRequest rmcrr)
			throws SQLException {
		RetrieveMtnCurrencyRtResponse rmcrResponse = new RetrieveMtnCurrencyRtResponse();
		
		HashMap<String, Object> retrieveMtnCurrRtParams = new HashMap<String, Object>();
		retrieveMtnCurrRtParams.put("currencyCd", rmcrr.getCurrencyCd());
		
		rmcrResponse.setCurrencyCd((maintenanceDao.retrieveMtnCurrencyRt(retrieveMtnCurrRtParams)));
		
		logger.info("retrieveMtnCurrRtResponse : " + rmcrResponse.toString());
		
		return rmcrResponse;
	}

	@Override
	public SaveMtnCurrencyRtResponse saveMtnCurrencyRt(SaveMtnCurrencyRtRequest smcrr) throws SQLException {
		SaveMtnCurrencyRtResponse smcrResponse = new SaveMtnCurrencyRtResponse();
		try{
			HashMap<String, Object> saveMtnCurrRtParams = new HashMap<String, Object>();
			saveMtnCurrRtParams.put("delCurrencyRt",smcrr.getDelCurrencyRt());
			saveMtnCurrRtParams.put("saveCurrencyRt",smcrr.getSaveCurrencyRt());
			
			HashMap<String, Object> res = maintenanceDao.saveMtnCurrencyRt(saveMtnCurrRtParams);
			smcrResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			smcrResponse.setReturnCode(0);
			smcrResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return smcrResponse;
	}

	@Override
	public SaveMtnQuoteWordingsResponse saveMtnQuoteWordings(SaveMtnQuoteWordingsRequest smqwr) throws SQLException {
		SaveMtnQuoteWordingsResponse smqwResponse = new SaveMtnQuoteWordingsResponse();
		HashMap<String, Object> saveMtnQuoteWordingsParams = new HashMap<String, Object>();
		saveMtnQuoteWordingsParams.put("saveQW", smqwr.getSaveQW());
		saveMtnQuoteWordingsParams.put("deleteQW",smqwr.getDeleteQW());
		smqwResponse.setReturnCode(maintenanceDao.saveMtnQuoteWordings(saveMtnQuoteWordingsParams));
		
		return smqwResponse;
	}

	@Override
	public SaveMtnEndorsementResponse saveMtnEndorsement(SaveMtnEndorsementRequest smer) throws SQLException {
		SaveMtnEndorsementResponse smerResponse = new SaveMtnEndorsementResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveEndt", smer.getSaveEndorsement());
		params.put("delEndt", smer.getDelEndorsement());
		params.put("saveDeductibles", smer.getSaveDeductibles());
		params.put("deleteDeductibles", smer.getDeleteDeductibles());
		try{
			smerResponse.setReturnCode(maintenanceDao.saveMtnEndorsement(params));
		}catch (Exception ex) {
			smerResponse.setReturnCode(0);
			smerResponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return smerResponse;
	}

	@Override
	public SaveMtnPolicyWordingsResponse saveMtnPolicyWordings(SaveMtnPolicyWordingsRequest smpwr) throws SQLException {
		SaveMtnPolicyWordingsResponse smpwResponse = new SaveMtnPolicyWordingsResponse();
		HashMap<String, Object> saveMtnPolicyWordingsParams = new HashMap<String, Object>();
		saveMtnPolicyWordingsParams.put("savePW", smpwr.getSavePW());
		saveMtnPolicyWordingsParams.put("deletePW", smpwr.getDeletePW());
		smpwResponse.setReturnCode(maintenanceDao.saveMtnPolicyWordings(saveMtnPolicyWordingsParams));
		
		return smpwResponse;
	}

	@Override
	public SaveMtnCatPerilResponse saveMtnCatPeril(SaveMtnCatPerilRequest smcpr) throws SQLException {
		SaveMtnCatPerilResponse smcpResponse = new SaveMtnCatPerilResponse();
		try{
			HashMap<String, Object> saveMtnCatParams = new HashMap<String, Object>();
			saveMtnCatParams.put("delCatPeril",smcpr.getDelCatPeril());
			saveMtnCatParams.put("saveCatPeril",smcpr.getSaveCatPeril());
			
			HashMap<String, Object> res = maintenanceDao.saveMtnCatPeril(saveMtnCatParams);
			smcpResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			smcpResponse.setReturnCode(0);
			smcpResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return smcpResponse;
	}
	
	@Override
	public SaveMtnObjectResponse saveMtnObject(SaveMtnObjectRequest smor) throws SQLException {
		SaveMtnObjectResponse smoResponse = new SaveMtnObjectResponse();
		try {
			HashMap<String, Object> saveMtnObjectParams = new HashMap<String, Object>();
			saveMtnObjectParams.put("deleteObject", smor.getDeleteObject());
			saveMtnObjectParams.put("saveObject", smor.getSaveObject());
			smoResponse.setReturnCode(maintenanceDao.saveMtnObject(saveMtnObjectParams));
			logger.info("SaveMtnLineObjectResponse : " + smoResponse.toString());
		} catch (Exception ex) {
			ex.printStackTrace();
			smoResponse.setReturnCode(0);
			smoResponse.getErrorList().add(new Error("SQLException", "Please check the field values."));
		}
		return smoResponse;
	}

	@Override
	public SaveMtnCrestaZoneResponse saveMtnCrestaZone(SaveMtnCrestaZoneRequest smczr) throws SQLException {
		SaveMtnCrestaZoneResponse smczResponse = new SaveMtnCrestaZoneResponse();
		try{
			HashMap<String, Object> saveMtnCrestaParams = new HashMap<String, Object>();
			saveMtnCrestaParams.put("delCrestaZone",smczr.getDelCrestaZone());
			saveMtnCrestaParams.put("saveCrestaZone",smczr.getSaveCrestaZone());
			
			HashMap<String, Object> res = maintenanceDao.saveMtnCrestaZone(saveMtnCrestaParams);
			smczResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			smczResponse.setReturnCode(0);
			smczResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return smczResponse;
	}
	
	@Override
	public SaveMtnCedingCompanyResponse saveMtnCedingCompany(SaveMtnCedingCompanyRequest smccr) throws SQLException {
		SaveMtnCedingCompanyResponse response = new SaveMtnCedingCompanyResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("cedingId", smccr.getCedingId());
			params.put("cedingName", smccr.getCedingName());
			params.put("cedingAbbr", smccr.getCedingAbbr());
			params.put("addrLine1", smccr.getAddrLine1());
			params.put("addrLine2", smccr.getAddrLine2());
			params.put("addrLine3", smccr.getAddrLine3());
			params.put("zipCd", smccr.getZipCd());
			params.put("contactNo", smccr.getContactNo());
			params.put("emailAdd", smccr.getEmailAdd());
			params.put("bussTypeId", smccr.getBussTypeId());
			params.put("tinNo", smccr.getTinNo());
			params.put("activeTag", smccr.getActiveTag());
			params.put("govtTag", smccr.getGovtTag());
			params.put("oldCedingId", smccr.getOldCedingId());
			params.put("membershipTag", smccr.getMembershipTag());
			params.put("membershipDate", smccr.getMembershipDate());
			params.put("terminationDate", smccr.getTerminationDate());
			params.put("inactiveDate", smccr.getInactiveDate());
			params.put("treatyTag", smccr.getTreatyTag());
			params.put("remarks", smccr.getRemarks());
			params.put("createUser", smccr.getCreateUser());
			params.put("createDate", smccr.getCreateDate());
			params.put("updateUser", smccr.getUpdateUser());
			params.put("updateDate", smccr.getUpdateDate());
			params.put("saveCedingRepList", smccr.getSaveCedingRepList());
			params.put("delCedingRepList", smccr.getDelCedingRepList());
			HashMap<String, Object> res = maintenanceDao.saveMtnCedingCompany(params);
			response.setReturnCode((Integer) res.get("errorCode"));
			response.setOutCedingId((String) res.get("outCedingId"));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}
	
	@Override
	public SaveMtnSectionCoverResponse saveMtnSectionCover(SaveMtnSectionCoverRequest smscr) throws SQLException {
		SaveMtnSectionCoverResponse smscrResponse = new SaveMtnSectionCoverResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveSec", smscr.getSaveSectionCover());
		params.put("delSec", smscr.getDelSectionCover());
		params.put("addSec", smscr.getAddSectionCover());
		params.put("saveDeductibles", smscr.getSaveDeductibles());
		params.put("deleteDeductibles", smscr.getDeleteDeductibles());
		try{
			smscrResponse.setReturnCode(maintenanceDao.saveMtnSectionCover(params));
		}catch (Exception ex) {
			smscrResponse.setReturnCode(0);
			smscrResponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return smscrResponse;
	}

	@Override
	public RetMtnQuoteReasonResponse retMtnQuoteReason(RetMtnQuoteReasonRequest rmqrr) throws SQLException {
		RetMtnQuoteReasonResponse rmqrrResponse = new RetMtnQuoteReasonResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("reasonCd", rmqrr.getReasonCd());
		params.put("activeTag", rmqrr.getActiveTag());
		rmqrrResponse.setReasonList(maintenanceDao.retMtnQuoteReason(params));
		return rmqrrResponse;
	}

	@Override
	public SaveMtnQuoteReasonResponse saveMtnQuoteReason(SaveMtnQuoteReasonRequest smqrr) throws SQLException {
		SaveMtnQuoteReasonResponse smqrrResponse = new SaveMtnQuoteReasonResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveQuReason", smqrr.getSaveQuReason());
		params.put("delQuReason", smqrr.getDelQuReason());
		try{
			smqrrResponse.setReturnCode(maintenanceDao.saveMtnQuoteReason(params));
		}catch (Exception ex) {
			smqrrResponse.setReturnCode(0);
			smqrrResponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return smqrrResponse;
	}

	@Override
	public SaveMtnSpoilageReasonResponse saveMtnSpoilageReason(SaveMtnSpoilageReasonRequest smqrr) throws SQLException {
		SaveMtnSpoilageReasonResponse smqrrResponse = new SaveMtnSpoilageReasonResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveSpoilReason", smqrr.getSaveSpoilReason());
		params.put("delSpoilReason", smqrr.getDelSpoilReason());
		try{
			smqrrResponse.setReturnCode(maintenanceDao.saveMtnSpoilageReason(params));
		}catch (Exception ex) {
			smqrrResponse.setReturnCode(0);
			smqrrResponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return smqrrResponse;
	}

	@Override
	public SaveMtnDistrictResponse saveMtnDistrict(SaveMtnDistrictRequest smqrr) throws SQLException {
		SaveMtnDistrictResponse smqrrResponse = new SaveMtnDistrictResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("regionCd", smqrr.getRegionCd());
		params.put("provinceCd", smqrr.getProvinceCd());
		params.put("cityCd", smqrr.getCityCd());
		params.put("saveDistrict", smqrr.getSaveDistrict());
		params.put("delDistrict", smqrr.getDelDistrict());
		try{
			smqrrResponse.setReturnCode(maintenanceDao.saveMtnDistrict(params));
		}catch (Exception ex) {
			smqrrResponse.setReturnCode(0);
			smqrrResponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return smqrrResponse;
	}

	@Override
	public SaveMtnBlockResponse saveMtnBlock(SaveMtnBlockRequest smqrr) throws SQLException {
		SaveMtnBlockResponse smqrrResponse = new SaveMtnBlockResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("districtCd", smqrr.getDistrictCd());
		params.put("regionCd", smqrr.getRegionCd());
		params.put("provinceCd", smqrr.getProvinceCd());
		params.put("cityCd", smqrr.getCityCd());
		params.put("saveBlock", smqrr.getSaveBlock());
		params.put("delBlock", smqrr.getDelBlock());
		try{
			smqrrResponse.setReturnCode(maintenanceDao.saveMtnBlock(params));
		}catch (Exception ex) {
			smqrrResponse.setReturnCode(0);
			smqrrResponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return smqrrResponse;
	}

	@Override
	public RetMtnUserAmtLimitResponse retMtnUserAmtLimit(RetMtnUserAmtLimitRequest rmil) throws SQLException {
		RetMtnUserAmtLimitResponse rmqrrResponse = new RetMtnUserAmtLimitResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userGrp", rmil.getUserGrp());
		params.put("lineCd", rmil.getLineCd());
		rmqrrResponse.setUserAmtLimit(maintenanceDao.retMtnUserAmtLimit(params));
		return rmqrrResponse;
	}

	@Override
	public SaveMtnUserAmtLimitResponse saveMtnUserAmtLimit(SaveMtnUserAmtLimitRequest smualr) throws SQLException {
		SaveMtnUserAmtLimitResponse smualrResponse = new SaveMtnUserAmtLimitResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveUserAmtLmt", smualr.getSaveUserAmtLmt());
		params.put("delUserAmtLmt", smualr.getDelUserAmtLmt());
		try{
			smualrResponse.setReturnCode(maintenanceDao.saveMtnUserAmtLimit(params));
		}catch (Exception ex) {
			smualrResponse.setReturnCode(0);
			smualrResponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return smualrResponse;
	}
	
	@Override
	public SaveMtnOtherChargeResponse saveMtnOtherCharge(SaveMtnOtherChargeRequest smocr) throws SQLException {		
		SaveMtnOtherChargeResponse smocResponse = new SaveMtnOtherChargeResponse();
		HashMap<String, Object> saveMtnOtherChargeParams = new HashMap<String, Object>();
		saveMtnOtherChargeParams.put("saveOChrg", smocr.getSaveOChrg());
		saveMtnOtherChargeParams.put("deleteOChrg", smocr.getDeleteOChrg());
		smocResponse.setReturnCode(maintenanceDao.saveMtnOtherCharge(saveMtnOtherChargeParams));
		
		return smocResponse;
	}
	
	@Override
	public RetrieveMtnNonRenewalReasonResponse retriveMtnNonRenewalReason(RetrieveMtnNonRenewalReasonRequest rmnrrr)
			throws SQLException {
		RetrieveMtnNonRenewalReasonResponse response = new RetrieveMtnNonRenewalReasonResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("reasonCd", rmnrrr.getReasonCd());
		params.put("activeTag", rmnrrr.getActiveTag());
		params.put("position", rmnrrr.getPaginationRequest().getPosition());
		params.put("count", rmnrrr.getPaginationRequest().getCount());
		params.put("sortKey", rmnrrr.getSortRequest().getSortKey());
		params.put("order", rmnrrr.getSortRequest().getOrder());
		
		response.setNonRenewalReason(maintenanceDao.retriveMtnNonRenewalReason(params));
		response.getPaginationResponse().setPosition(rmnrrr.getPaginationRequest().getPosition());
		response.getPaginationResponse().setCount(rmnrrr.getPaginationRequest().getCount());
		response.getSortResponse().setSortKey(rmnrrr.getSortRequest().getSortKey());
		response.getSortResponse().setOrder(rmnrrr.getSortRequest().getOrder());
		
		return response;
	}

	@Override
	public SaveMtnNonRenewalReasonResponse saveMtnNonRenewalReason(SaveMtnNonRenewalReasonRequest smnrrr)
			throws SQLException {
		SaveMtnNonRenewalReasonResponse response = new SaveMtnNonRenewalReasonResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveNonRenewalReasonList", smnrrr.getSaveNonRenewalReasonList());
		params.put("delNonRenewalReasonList", smnrrr.getDelNonRenewalReasonList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnNonRenewalReason(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}
	
	@Override
	public SaveMtnRegionResponse saveMtnRegion(SaveMtnRegionRequest smrr) throws SQLException {
		// TODO Auto-generated method stub
		SaveMtnRegionResponse smrResponse = new SaveMtnRegionResponse();
		HashMap<String, Object> saveMtnRegionParams = new HashMap<String, Object>();
		saveMtnRegionParams.put("saveRegion", smrr.getSaveRegion());
		saveMtnRegionParams.put("deleteRegion", smrr.getDeleteRegion());
		smrResponse.setReturnCode(maintenanceDao.saveMtnRegion(saveMtnRegionParams));
		logger.info("SaveMtnRegionResponse : " + smrResponse.toString());
		return smrResponse;
	}

	@Override
	public SaveMtnProvinceResponse saveMtnProvince(SaveMtnProvinceRequest smpr) throws SQLException {
		// TODO Auto-generated method stub
		SaveMtnProvinceResponse smpResponse = new SaveMtnProvinceResponse();
		HashMap<String, Object> saveMtnProvinceParams = new HashMap<String, Object>();
		saveMtnProvinceParams.put("saveProvince", smpr.getSaveProvince());
		saveMtnProvinceParams.put("deleteProvince", smpr.getDeleteProvince());
		smpResponse.setReturnCode(maintenanceDao.saveMtnProvince(saveMtnProvinceParams));
		logger.info("SaveMtnProvinceResponse : " + smpResponse.toString());
		return smpResponse;
	}

	@Override
	public RetrieveMtnTreatyCommissionResponse retrieveMtnTreatyCommission(RetrieveMtnTreatyCommissionRequest rmtcr)
			throws SQLException {
		RetrieveMtnTreatyCommissionResponse response = new RetrieveMtnTreatyCommissionResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("quoteYear", rmtcr.getQuoteYear());
		params.put("position", rmtcr.getPaginationRequest().getPosition());
		params.put("count", rmtcr.getPaginationRequest().getCount());
		params.put("sortKey", rmtcr.getSortRequest().getSortKey());
		params.put("order", rmtcr.getSortRequest().getOrder());
		
		response.setTreatyList(maintenanceDao.retrieveMtnTreatyCommission(params));
		response.getPaginationResponse().setPosition(rmtcr.getPaginationRequest().getPosition());
		response.getPaginationResponse().setCount(rmtcr.getPaginationRequest().getCount());
		response.getSortResponse().setSortKey(rmtcr.getSortRequest().getSortKey());
		response.getSortResponse().setOrder(rmtcr.getSortRequest().getOrder());
		
		logger.info("RetrieveMtnTreatyCommissionResponse : " + response.toString());
		
		return response;
	}
	
	@Override
	public SaveMtnTreatyResponse saveMtnTreaty(SaveMtnTreatyRequest smtr) throws SQLException {
		SaveMtnTreatyResponse smtResponse = new SaveMtnTreatyResponse();
		HashMap<String, Object> saveMtnTreatyParams = new HashMap<String, Object>();
		saveMtnTreatyParams.put("saveTreaty", smtr.getSaveTreaty());
		saveMtnTreatyParams.put("deleteTreaty", smtr.getDeleteTreaty());
		smtResponse.setReturnCode(maintenanceDao.saveMtnTreaty(saveMtnTreatyParams));
		
		return smtResponse;
	}

	@Override
	public RetrieveMtnRetAmtResponse retrieveMtnRetAmt(RetrieveMtnRetAmtRequest rmrar) throws SQLException {
		RetrieveMtnRetAmtResponse rmraResponse = new RetrieveMtnRetAmtResponse();
		
		HashMap<String, Object> retrieveMtnRetAmtParams = new HashMap<String, Object>();
		retrieveMtnRetAmtParams.put("lineCd", rmrar.getLineCd());
		retrieveMtnRetAmtParams.put("lineClassCd", rmrar.getLineClassCd());
		
		rmraResponse.setRetAmtList(maintenanceDao.retrieveMtnRetAmt(retrieveMtnRetAmtParams));
		
		return rmraResponse;
	}

	@Override
	public RetrieveMtnTreatyShareResponse retrieveMtnTreatyShare(RetrieveMtnTreatyShareRequest rmtsr)
			throws SQLException {
		RetrieveMtnTreatyShareResponse rmtsResponse = new RetrieveMtnTreatyShareResponse();
		
		HashMap<String, Object> retrieveMtnTreatyShareParams = new HashMap<String, Object>();
		retrieveMtnTreatyShareParams.put("treatyYear", rmtsr.getTreatyYear());
		retrieveMtnTreatyShareParams.put("treatyId", rmtsr.getTreatyId());
		
		rmtsResponse.setTreatyShareList(maintenanceDao.retrieveMtnTreatyShare(retrieveMtnTreatyShareParams));
		
		return rmtsResponse;
	}

	@Override
	public RetrieveMtnCedingRetentionResponse retrieveMtnCedingRetention(RetrieveMtnCedingRetentionRequest rmcrr)
			throws SQLException {
		RetrieveMtnCedingRetentionResponse rmcrResponse = new RetrieveMtnCedingRetentionResponse();
		
		HashMap<String, Object> retrieveMtnCedRetParams = new HashMap<String, Object>();
		retrieveMtnCedRetParams.put("treatyYear", rmcrr.getTreatyYear());
		retrieveMtnCedRetParams.put("treatyId", rmcrr.getTreatyId());
		retrieveMtnCedRetParams.put("trtyCedId", rmcrr.getTrtyCedId());
		
		rmcrResponse.setCedingRetentionList(maintenanceDao.retrieveMtnCedingRetention(retrieveMtnCedRetParams));
		
		return rmcrResponse;
	}

	@Override
	public SaveMtnTreatyShareResponse saveMtnTreatyShare(SaveMtnTreatyShareRequest smtsr) throws SQLException {
		SaveMtnTreatyShareResponse smtsResponse = new SaveMtnTreatyShareResponse();
		HashMap<String, Object> saveMtnTreatyShareParams = new HashMap<String, Object>();
		saveMtnTreatyShareParams.put("saveTreatyComm", smtsr.getSaveTreatyComm());
		saveMtnTreatyShareParams.put("deleteTreatyComm", smtsr.getDeleteTreatyComm());
		saveMtnTreatyShareParams.put("saveTreatyShare", smtsr.getSaveTreatyShare());
		saveMtnTreatyShareParams.put("deleteTreatyShare", smtsr.getDeleteTreatyShare());
		saveMtnTreatyShareParams.put("saveCedRetention", smtsr.getSaveCedRetention());
		saveMtnTreatyShareParams.put("deleteCedRetention", smtsr.getDeleteCedRetention());
		smtsResponse.setReturnCode(maintenanceDao.saveMtnTreatyShare(saveMtnTreatyShareParams));
		
		return smtsResponse;
	}

	@Override
	public CopyTreatyShareSetupResponse copyTreatyShareSetup(CopyTreatyShareSetupRequest ctssr) throws SQLException {
		CopyTreatyShareSetupResponse ctssResponse = new CopyTreatyShareSetupResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("checker", ctssr.getChecker());
		params.put("copyFromYear", ctssr.getCopyFromYear());
		params.put("copyToYear", ctssr.getCopyToYear());
		params.put("createUser", ctssr.getCreateUser());
		params.put("createDate", ctssr.getCreateDate());
		params.put("updateUser", ctssr.getUpdateUser());
		params.put("updateDate", ctssr.getUpdateDate());
		
		Integer res = 0;
		Integer chkr = (Integer) params.get("checker");
		
		if(chkr == 0) {
			res = maintenanceDao.checkTreatyYear(params);
		}
		
		if(res == 1 || chkr == 1) {
			ctssResponse.setReturnCode(maintenanceDao.copyTreatyShareSetup(params));
		} else if(res == 2) {
			ctssResponse.setReturnCode(2);
		} else if(res == 3) {
			ctssResponse.setReturnCode(3);
		}
		
		return ctssResponse;
	}

	@Override
	public SaveMtnRetAmtResponse saveMtnRetAmt(SaveMtnRetAmtRequest smrar) throws SQLException {
		SaveMtnRetAmtResponse smraResponse = new SaveMtnRetAmtResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveRetAmt", smrar.getSaveRetAmt());
		params.put("deleteRetAmt", smrar.getDeleteRetAmt());
		
		smraResponse.setReturnCode(maintenanceDao.saveMtnRetAmt(params));
		
		return smraResponse;
	}

	@Override
	public CopyRetAmtSetupResponse copyRetAmtSetup(CopyRetAmtSetupRequest crasr) throws SQLException {
		CopyRetAmtSetupResponse crasResponse = new CopyRetAmtSetupResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("copyFromRetentionId", crasr.getCopyFromRetentionId());
		params.put("copyToLineCd", crasr.getCopyToLineCd());
		params.put("copyToLineClassCd", crasr.getCopyToLineClassCd());
		params.put("createUser", crasr.getCreateUser());
		params.put("createDate", crasr.getCreateDate());
		params.put("updateUser", crasr.getUpdateUser());
		params.put("updateDate", crasr.getUpdateDate());
		
		Integer res = maintenanceDao.checkRetAmt(params);
		
		if(res == 1) {
			crasResponse.setReturnCode(2);
		} else if(res == 0) {
			crasResponse.setReturnCode(maintenanceDao.copyRetAmtSetup(params));
		}
		
		return crasResponse;
	}
}
