package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.Error;
import ph.cpi.rest.api.model.request.*;
import ph.cpi.rest.api.model.response.*;
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
		
		
		rmrResponse.setRisk(maintenanceDao.retrieveMtnRisk(retrieveMtnRiskParams));
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
		retrieveMtnRiskListingParams.put("pagination", rmrlp.getPaginationRequest());
		retrieveMtnRiskListingParams.put("sort", rmrlp.getSortRequest());
		retrieveMtnRiskListingParams.put("search", rmrlp.getSearch());
		
		rmrlResponse.setRisk(maintenanceDao.retrieveMtnRiskListing(retrieveMtnRiskListingParams));
		rmrlResponse.setCount(maintenanceDao.retrieveMtnRiskListingCount(retrieveMtnRiskListingParams));
		
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

		return rmscResponse;
	}

	@Override
	public RetrieveMtnTypeOfCessionResponse retrieveMtnTypeOfCession(RetrieveMtnTypeOfCessionRequest rmtcp)
			throws SQLException {
		RetrieveMtnTypeOfCessionResponse rmtcResponse = new RetrieveMtnTypeOfCessionResponse();
		
		HashMap<String, Object> retrieveMtnTypeOfCessionParams = new HashMap<String, Object>();
		retrieveMtnTypeOfCessionParams.put("cessionId", rmtcp.getCessionId());
		
		rmtcResponse.setCession(maintenanceDao.retrieveTypeOfCession(retrieveMtnTypeOfCessionParams));
		
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
		retrieveMtnInsuredParams.put("pagination",rmir.getPaginationRequest());
		retrieveMtnInsuredParams.put("sort",rmir.getSortRequest());
		retrieveMtnInsuredParams.put("search",rmir.getSearch());
		rmirResponse.setInsured(maintenanceDao.retrieveMtnInsured(retrieveMtnInsuredParams));
		rmirResponse.setLength(maintenanceDao.retrieveMtnInsuredLength(retrieveMtnInsuredParams));
		
		return rmirResponse;
	}

	@Override
	public RetrieveEndtCodeResponse retrieveEndtCode(RetrieveEndtCodeRequest recr) throws SQLException {
		RetrieveEndtCodeResponse recrResponse = new RetrieveEndtCodeResponse();
		
		HashMap<String, Object> retrieveEndtCodeParams = new HashMap<String, Object>();
		retrieveEndtCodeParams.put("endtCd", recr.getEndtCd());
		retrieveEndtCodeParams.put("lineCd", recr.getLineCd());
		retrieveEndtCodeParams.put("endtTitle", recr.getEndtTitle());
		retrieveEndtCodeParams.put("endtDesc", recr.getEndtDesc());
		retrieveEndtCodeParams.put("remarks", recr.getRemarks());
		retrieveEndtCodeParams.put("mtnMode", recr.getMtnMode());
		
		recrResponse.setEndtCode(maintenanceDao.retrieveEndtCode(retrieveEndtCodeParams));
		
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
		retrieveMtnDistrictParams.put("activeTag", rmdr.getActiveTag());
		rmdrResponse.setRegion(maintenanceDao.retrieveMtnDistrict(retrieveMtnDistrictParams));
		
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
		
		retrieveMtnDeductiblesParams.put("deductibleTitle",rmdr.getDeductibleTitle());
		retrieveMtnDeductiblesParams.put("deductibleType",rmdr.getDeductibleType());
		retrieveMtnDeductiblesParams.put("rateFrom",rmdr.getRateFrom());
		retrieveMtnDeductiblesParams.put("rateTo",rmdr.getRateTo());
		retrieveMtnDeductiblesParams.put("amtFrom",rmdr.getAmtFrom());
		retrieveMtnDeductiblesParams.put("amtTo",rmdr.getAmtTo());
		retrieveMtnDeductiblesParams.put("deductibleText",rmdr.getDeductibleText());
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
		//rmpResponse.getRegion().setProvinceList(maintenanceDao.retrieveMtnProvince(retrieveMtnProvinceParams));\
		
		return rmpResponse;
	}

	@Override
	public RetrieveMtnObjectResponse retrieveMtnObject(RetrieveMtnObjectRequest rmop) throws SQLException {
		RetrieveMtnObjectResponse rmoResponse = new RetrieveMtnObjectResponse();
		
		HashMap<String, Object> retrieveMtnObjectParams = new HashMap<String, Object>();
		retrieveMtnObjectParams.put("objectId", rmop.getObjectId());
		retrieveMtnObjectParams.put("lineCd", rmop.getLineCd());
		rmoResponse.setObject(maintenanceDao.retrieveMtnObject(retrieveMtnObjectParams));
		
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
//		logger.info("retrieveMtnQuoteWordingsResponse :" + rmqwResponse.toString());

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
		
		return rmczrResponse;
	}
	
	@Override
	public RetrieveMtnCurrencyResponse retrieveMtnCurrency(RetrieveMtnCurrencyRequest rmcr) throws SQLException {
		RetrieveMtnCurrencyResponse rmcrResponse = new RetrieveMtnCurrencyResponse();
		
		HashMap<String, Object> retrieveMtnCurrencyParams = new HashMap<String, Object>();
		retrieveMtnCurrencyParams.put("currencyCd", rmcr.getCurrencyCd());
		retrieveMtnCurrencyParams.put("activeTag", rmcr.getActiveTag());
		retrieveMtnCurrencyParams.put("effDateFrom", rmcr.getEffDateFrom());
		retrieveMtnCurrencyParams.put("position", rmcr.getPaginationRequest().getPosition());
		retrieveMtnCurrencyParams.put("count", rmcr.getPaginationRequest().getCount());
		retrieveMtnCurrencyParams.put("sortKey", rmcr.getSortRequest().getSortKey());
		retrieveMtnCurrencyParams.put("order", rmcr.getSortRequest().getOrder());
		
		rmcrResponse.setCurrency(maintenanceDao.retrieveMtnCurrencyList(retrieveMtnCurrencyParams));
		rmcrResponse.getPaginationResponse().setPosition(rmcr.getPaginationRequest().getPosition());
		rmcrResponse.getPaginationResponse().setCount(rmcr.getPaginationRequest().getCount());
		rmcrResponse.getSortResponse().setSortKey(rmcr.getSortRequest().getSortKey());
		rmcrResponse.getSortResponse().setOrder(rmcr.getSortRequest().getOrder());
		
		
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
        retrieveMtnBlockParams.put("activeTag", retMtnBlock.getActiveTag());
        rmbResponse.setRegion(maintenanceDao.retrieveMaintenanceBlockList(retrieveMtnBlockParams));
        
        
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
			
		
		return rmiResponse;
	}

	@Override
	public RetrieveMtnLineResponse retrieveMtnLine(RetrieveMtnLineRequest rmlp) throws SQLException {
		// TODO Auto-generated method stub
		RetrieveMtnLineResponse rmlResponse = new RetrieveMtnLineResponse();
		HashMap<String, Object> retrieveMtnLineParams = new HashMap<String, Object>();
		retrieveMtnLineParams.put("lineCd", rmlp.getLineCd());
		
		rmlResponse.setLine(maintenanceDao.retrieveMntLine(retrieveMtnLineParams));
		return rmlResponse;
	}

	public RetrieveMtnLineClassResponse retrieveMtnLineClass(RetrieveMtnLineClassRequest rmlcp) throws SQLException {
		// TODO Auto-generated method stub
		RetrieveMtnLineClassResponse rmlcResponse = new RetrieveMtnLineClassResponse();
		HashMap<String, Object> retrieveMtnLineClassParams = new HashMap<String, Object>();
		
		retrieveMtnLineClassParams.put("lineCd", rmlcp.getLineCd());
		retrieveMtnLineClassParams.put("lineClassCd", rmlcp.getLineClassCd());
		
		rmlcResponse.setLineClass(maintenanceDao.retrieveMntLineClass(retrieveMtnLineClassParams));
		return rmlcResponse;
	}
	
	@Override
	public SaveMtnLineClassResponse saveMtnLineClass(SaveMtnLineClassRequest smlcr) throws SQLException {
		SaveMtnLineClassResponse smlcrResponse = new SaveMtnLineClassResponse();
		HashMap<String, Object> saveMtnLineClassParams = new HashMap<String, Object>();
		saveMtnLineClassParams.put("saveLineClass", smlcr.getSaveLineClass());
		saveMtnLineClassParams.put("deleteLineClass", smlcr.getDeleteLineClass());
		smlcrResponse.setReturnCode(maintenanceDao.saveMtnLineClass(saveMtnLineClassParams));
		return smlcrResponse;
	}

	@Override
	public SaveMtnRiskResponse saveMtnRisk(SaveMtnRiskRequest smrr) throws SQLException {
		SaveMtnRiskResponse smrrResponse = new SaveMtnRiskResponse();
		HashMap<String, Object> saveMtnRiskParams = new HashMap<String, Object>();
		
		saveMtnRiskParams.put("riskId", smrr.getRiskId());
		saveMtnRiskParams.put("oldRiskId", smrr.getOldRiskId());
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
		retrieveMtnReportsParams.put("position", rmreport.getPaginationRequest().getPosition());
		retrieveMtnReportsParams.put("count", rmreport.getPaginationRequest().getCount());
		retrieveMtnReportsParams.put("sortKey", rmreport.getSortRequest().getSortKey());
		retrieveMtnReportsParams.put("order", rmreport.getSortRequest().getOrder());
		
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

		return smiResponse;
	}

	@Override
	public SaveMtnTypeOfCessionResponse saveMtnTypeOfCession(SaveMtnTypeOfCessionRequest smtocr) throws SQLException {
		SaveMtnTypeOfCessionResponse smtocResponse =  new SaveMtnTypeOfCessionResponse();
		HashMap<String, Object> saveMtnTypeOfCessionParams = new HashMap<String, Object>();
		saveMtnTypeOfCessionParams.put("saveTypeOfCession", smtocr.getSaveTypeOfCession());
		saveMtnTypeOfCessionParams.put("deleteTypeOfCession", smtocr.getDeleteTypeOfCession());
		smtocResponse.setReturnCode(maintenanceDao.saveMtnTypeOfCession(saveMtnTypeOfCessionParams));
		return smtocResponse;
	}
	
	@Override
	public RetMtnInsuredLovResponse retMtnInsuredLov(RetMtnInsuredLovRequest rmil) throws SQLException {
		RetMtnInsuredLovResponse rmilResponse = new RetMtnInsuredLovResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("lovParam", rmil.getLovParam());
		params.put("page", rmil.getPaginationRequest());
		params.put("sort", rmil.getSortRequest());
		params.put("insuredName", rmil.getInsuredName());
		params.put("address", rmil.getAddress());
		params.put("insuredAbbr", rmil.getInsuredAbbr());
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
			params.put("vatTag", smccr.getVatTag());
			params.put("oldCedingId", smccr.getOldCedingId());
			params.put("membershipTag", smccr.getMembershipTag());
			params.put("membershipDate", smccr.getMembershipDate());
			params.put("withdrawDate", smccr.getWithdrawDate());
			params.put("inactiveDate", smccr.getInactiveDate());
			params.put("treatyTag", smccr.getTreatyTag());
			params.put("withdrawTag", smccr.getWithdrawTag());
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
			response.setUploadDate((String) res.get("uploadDate"));
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
		return smpResponse;
	}

	@Override
	public RetrieveMtnApprovalResponse retrieveMtnApproval(RetrieveMtnApprovalRequest rmafr)
			throws SQLException {
		RetrieveMtnApprovalResponse response = new RetrieveMtnApprovalResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("approvalCd", rmafr.getApprovalCd());
		response.setApprovalFunction(maintenanceDao.retrieveMtnApproval(params));
		return response;
	}

	@Override
	public RetrieveMtnTreatyCommissionResponse retrieveMtnTreatyCommission(RetrieveMtnTreatyCommissionRequest rmtcr)
			throws SQLException {
		RetrieveMtnTreatyCommissionResponse response = new RetrieveMtnTreatyCommissionResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("quoteYear", rmtcr.getQuoteYear());
		params.put("currencyCd",rmtcr.getCurrencyCd());
		params.put("position", rmtcr.getPaginationRequest().getPosition());
		params.put("count", rmtcr.getPaginationRequest().getCount());
		params.put("sortKey", rmtcr.getSortRequest().getSortKey());
		params.put("order", rmtcr.getSortRequest().getOrder());
		
		response.setTreatyList(maintenanceDao.retrieveMtnTreatyCommission(params));
		response.getPaginationResponse().setPosition(rmtcr.getPaginationRequest().getPosition());
		response.getPaginationResponse().setCount(rmtcr.getPaginationRequest().getCount());
		response.getSortResponse().setSortKey(rmtcr.getSortRequest().getSortKey());
		response.getSortResponse().setOrder(rmtcr.getSortRequest().getOrder());
		
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
		retrieveMtnRetAmtParams.put("currencyCd", rmrar.getCurrencyCd());
		retrieveMtnRetAmtParams.put("retentionId", rmrar.getRetentionId());
		
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
		saveMtnTreatyShareParams.put("currencyCd", smtsr.getCurrencyCd());
		saveMtnTreatyShareParams.put("saveTreatyComm", smtsr.getSaveTreatyComm());
		saveMtnTreatyShareParams.put("deleteTreatyComm", smtsr.getDeleteTreatyComm());
		saveMtnTreatyShareParams.put("deleteTreatyShare", smtsr.getDeleteTreatyShare());
		saveMtnTreatyShareParams.put("deleteCedRetention", smtsr.getDeleteCedRetention());
		smtsResponse.setReturnCode(maintenanceDao.saveMtnTreatyShare(saveMtnTreatyShareParams));
		
		return smtsResponse;
	}

	@Override
	public CopyTreatyShareSetupResponse copyTreatyShareSetup(CopyTreatyShareSetupRequest ctssr) throws SQLException {
		CopyTreatyShareSetupResponse ctssResponse = new CopyTreatyShareSetupResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("checker", ctssr.getChecker());
		params.put("currencyCd", ctssr.getCurrencyCd());
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
		params.put("copyFromLineCd", crasr.getCopyFromLineCd());
		params.put("copyFromLineClassCd", crasr.getCopyFromLineClassCd());
		params.put("copyFromCurrencyCd", crasr.getCopyFromCurrencyCd());
		params.put("copyToLineCd", crasr.getCopyToLineCd());
		params.put("copyToLineClassCd", crasr.getCopyToLineClassCd());
		params.put("copyToCurrencyCd", crasr.getCopyToCurrencyCd());
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

	@Override
	public RetrieveMtnTreatyLimitResponse retrieveMtnTreatyLimit(RetrieveMtnTreatyLimitRequest rmtlr)
			throws SQLException {
		RetrieveMtnTreatyLimitResponse rmtlResponse = new RetrieveMtnTreatyLimitResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("lineCd", rmtlr.getLineCd());
		params.put("lineClassCd", rmtlr.getLineClassCd());
		params.put("currencyCd", rmtlr.getCurrencyCd());
		params.put("treatyLimitId", rmtlr.getTreatyLimitId());
		
		rmtlResponse.setTreatyLimitList(maintenanceDao.retrieveMtnTreatyLimit(params));
		
		return rmtlResponse;
	}
	
	@Override
	public RetrieveMtnApprovalFunctionResponse retrieveMtnApprovalFunction(RetrieveMtnApprovalFunctionRequest rmar)
			throws SQLException {
		RetrieveMtnApprovalFunctionResponse response = new RetrieveMtnApprovalFunctionResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("approvalCd", rmar.getApprovalCd());
		response.setApproverFn(maintenanceDao.retrieveMtnApprovalFunction(params));
		return response;
	}

	@Override
	public SaveMtnApprovalResponse saveMtnApproval(SaveMtnApprovalRequest smrr) throws SQLException {
		SaveMtnApprovalResponse smpResponse = new SaveMtnApprovalResponse();
		try{
			HashMap<String, Object> saveMtnApprovalParams = new HashMap<String, Object>();
			saveMtnApprovalParams.put("saveMtnApproval", smrr.getSaveMtnApproval());
			saveMtnApprovalParams.put("deleteMtnApproval", smrr.getDeleteMtnApproval());
			
			HashMap<String, Object> res = maintenanceDao.saveMtnApproval(saveMtnApprovalParams);
			smpResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			smpResponse.setReturnCode(0);
			smpResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return smpResponse;
	}

	@Override
	public SaveMtnApprovalFunctionResponse saveMtnApprovalFunction(SaveMtnApprovalFunctionRequest smrr)
			throws SQLException {
		SaveMtnApprovalFunctionResponse smpResponse = new SaveMtnApprovalFunctionResponse();
		try{
			HashMap<String, Object> saveMtnApprovalFnParams = new HashMap<String, Object>();
			saveMtnApprovalFnParams.put("saveMtnApprovalFn", smrr.getSaveMtnApprovalFn());
			saveMtnApprovalFnParams.put("deleteMtnApprovalFn", smrr.getDeleteMtnApprovalFn());
			
			HashMap<String, Object> res = maintenanceDao.saveMtnApprovalFunction(saveMtnApprovalFnParams);
			smpResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			smpResponse.setReturnCode(0);
			smpResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return smpResponse;
	}

	@Override
	public RetrieveMtnUsersLovResponse retrieveMtnUsersLov(RetrieveMtnUsersLovRequest rmar) throws SQLException {
		RetrieveMtnUsersLovResponse response = new RetrieveMtnUsersLovResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userId", rmar.getUserId());
		response.setUsers(maintenanceDao.retrieveMtnUsersLov(params));
		return response;
	}

	@Override
	public RetrieveMtnApproverResponse retrieveApprover(RetrieveMtnApproverRequest rar) throws SQLException {
		RetrieveMtnApproverResponse rarResponse = new RetrieveMtnApproverResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userId", rar.getUserId());
		rarResponse.setApproverList(maintenanceDao.retrieveApprover(params));
		return rarResponse;
	}

	@Override
	public RetrieveMtnApproverFnResponse retrieveApproverFn(RetrieveMtnApproverFnRequest rafr) throws SQLException {
		RetrieveMtnApproverFnResponse rafrResponse = new RetrieveMtnApproverFnResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userId", rafr.getUserId());
		rafrResponse.setApproverFnList(maintenanceDao.retrieveApproverFn(params));
		return rafrResponse;
	}

	@Override
	public SaveMtnApproverResponse saveMtnApprover(SaveMtnApproverRequest smar) throws SQLException {
		SaveMtnApproverResponse smarResponse = new SaveMtnApproverResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveList", smar.getSaveList());
		params.put("delList", smar.getDelList());
		try{
			smarResponse.setReturnCode(maintenanceDao.saveMtnApprover(params));
		}catch (Exception ex) {
			smarResponse.setReturnCode(0);
			smarResponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return smarResponse;
	}

	@Override
	public SaveMtnApproverFnResponse saveMtnApproverFn(SaveMtnApproverFnRequest smar) throws SQLException {
		SaveMtnApproverFnResponse smarResponse = new SaveMtnApproverFnResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userId", smar.getUserId());
		params.put("saveList", smar.getSaveList());
		params.put("delList", smar.getDelList());
		try{
			smarResponse.setReturnCode(maintenanceDao.saveMtnApproverFn(params));
		}catch (Exception ex) {
			smarResponse.setReturnCode(0);
			smarResponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return smarResponse;
	}

	@Override
	public RetrieveMtnParametersResponse retrieveMtnParameters(RetrieveMtnParametersRequest rafr) throws SQLException {
		RetrieveMtnParametersResponse response = new RetrieveMtnParametersResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("paramType", rafr.getParamType());
		params.put("paramName", rafr.getParamName());
		response.setParameters(maintenanceDao.retrieveParameters(params));
		return response;
	}

	@Override
	public SaveMtnParametersResponse saveMtnParameters(SaveMtnParametersRequest smrr) throws SQLException {
		SaveMtnParametersResponse smpResponse = new SaveMtnParametersResponse();
		try{
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("saveParameters", smrr.getSaveParameters());
			params.put("delParameters", smrr.getDelParameters());
			
			HashMap<String, Object> res = maintenanceDao.saveMtnParameters(params);
			smpResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			smpResponse.setReturnCode(0);
			smpResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return smpResponse;
	}

	@Override
	public RetrieveMtnRoundingErrorResponse retrieveMtnRoundingError(RetrieveMtnRoundingErrorRequest rafr)
			throws SQLException {
		RetrieveMtnRoundingErrorResponse response = new RetrieveMtnRoundingErrorResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("companyId", rafr.getCompanyId());
		response.setRoundingError(maintenanceDao.retrieveMtnRoundingError(params));
		return response;
	}

	@Override
	public SaveMtnRoundingErrorResponse saveMtnRoundingError(SaveMtnRoundingErrorRequest smrr) throws SQLException {
		SaveMtnRoundingErrorResponse smpResponse = new SaveMtnRoundingErrorResponse();
		try{
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("saveRoundingError", smrr.getSaveRoundingError());
			params.put("delRoundingError", smrr.getDelRoundingError());
			
			HashMap<String, Object> res = maintenanceDao.saveMtnRoundingError(params);
			smpResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			smpResponse.setReturnCode(0);
			smpResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return smpResponse;
	}

	@Override
	public SaveMtnReportsResponse saveMtnReports(SaveMtnReportsRequest smrr) throws SQLException {
		SaveMtnReportsResponse response = new SaveMtnReportsResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("delReports", smrr.getDelReports());
		params.put("saveReports", smrr.getSaveReports());
		try{
			response.setReturnCode(maintenanceDao.saveMtnReports(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnReportParamResponse saveMtnReportParam(SaveMtnReportParamRequest smrpr) throws SQLException {
		SaveMtnReportParamResponse response = new SaveMtnReportParamResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("delReportParam", smrpr.getDelReportParam());
		params.put("saveReportParam", smrpr.getSaveReportParam());
		try{
			response.setReturnCode(maintenanceDao.saveMtnReportParam(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnCityResponse saveMtnCity(SaveMtnCityRequest smcr) throws SQLException {
		// TODO Auto-generated method stub
		SaveMtnCityResponse smcResponse = new SaveMtnCityResponse();
		HashMap<String, Object> saveMtnCityParams = new HashMap<String, Object>();
		saveMtnCityParams.put("saveCity", smcr.getSaveCity());
		saveMtnCityParams.put("deleteCity", smcr.getDeleteCity());
		smcResponse.setReturnCode(maintenanceDao.saveMtnCity(saveMtnCityParams));
		return smcResponse;
	}

	@Override
	public RetrieveMtnClmStatusResponse retrieveMtnClaimStatus(RetrieveMtnClmStatusRequest rafr) throws SQLException {
		RetrieveMtnClmStatusResponse response = new RetrieveMtnClmStatusResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("statusCode", rafr.getStatusCode());
		response.setClaimStatus(maintenanceDao.retrieveMtnClaimStatus(params));
		return response;
	}

	@Override
	public SaveMtnTreatyLimitResponse saveMtnTreatyLimit(SaveMtnTreatyLimitRequest smtlr) throws SQLException {
		SaveMtnTreatyLimitResponse smtlResponse = new SaveMtnTreatyLimitResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveTreatyLimit", smtlr.getSaveTreatyLimit());
		params.put("deleteTreatyLimit", smtlr.getDeleteTreatyLimit());
		
		smtlResponse.setReturnCode(maintenanceDao.saveMtnTreatyLimit(params));
		
		return smtlResponse;
	}

	@Override
	public CopyTreatyLimitResponse copyTreatyLimit(CopyTreatyLimitRequest ctlr) throws SQLException {
		CopyTreatyLimitResponse ctlResponse = new CopyTreatyLimitResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("copyFromTreatyLimitId", ctlr.getCopyFromTreatyLimitId());
		params.put("copyFromLineCd", ctlr.getCopyFromLineCd());
		params.put("copyFromLineClassCd", ctlr.getCopyFromLineClassCd());
		params.put("copyFromCurrencyCd", ctlr.getCopyFromCurrencyCd());
		params.put("copyToLineCd", ctlr.getCopyToLineCd());
		params.put("copyToLineClassCd", ctlr.getCopyToLineClassCd());
		params.put("copyToCurrencyCd", ctlr.getCopyToCurrencyCd());
		params.put("createUser", ctlr.getCreateUser());
		params.put("createDate", ctlr.getCreateDate());
		params.put("updateUser", ctlr.getUpdateUser());
		params.put("updateDate", ctlr.getUpdateDate());
		
		Integer res = maintenanceDao.checkTreatyLimit(params);
		
		if(res == 1) {
			ctlResponse.setReturnCode(2);
		} else if(res == 0) {
			ctlResponse.setReturnCode(maintenanceDao.copyTreatyLimit(params));
		}
		
		return ctlResponse;
	}

	@Override
	public RetrieveMtnAdjusterListResponse retrieveMtnAdjusterList(RetrieveMtnAdjusterListRequest rmalr)
			throws SQLException {
		RetrieveMtnAdjusterListResponse response = new RetrieveMtnAdjusterListResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("adjName", rmalr.getAdjName());
		params.put("adjRefNo", rmalr.getAdjRefNo());
		params.put("fullAddress", rmalr.getFullAddress());
		params.put("zipCd", rmalr.getZipCd());
		params.put("contactNo", rmalr.getContactNo());
		params.put("emailAdd", rmalr.getEmailAdd());
		params.put("createUser", rmalr.getCreateUser());
		params.put("createDateFrom", rmalr.getCreateDateFrom());
		params.put("createDateTo", rmalr.getCreateDateTo());
		params.put("updateUser", rmalr.getUpdateUser());
		params.put("updateDateFrom", rmalr.getUpdateDateFrom());
		params.put("updateDateTo", rmalr.getUpdateDateTo());
		params.put("position", rmalr.getPaginationRequest().getPosition());
		params.put("count", rmalr.getPaginationRequest().getCount());
		params.put("sortKey", rmalr.getSortRequest().getSortKey());
		params.put("order", rmalr.getSortRequest().getOrder());
		response.setAdjusterList(maintenanceDao.retrieveMtnAdjusterList(params));
		response.getPaginationResponse().setPosition(rmalr.getPaginationRequest().getPosition());
		response.getPaginationResponse().setCount(rmalr.getPaginationRequest().getCount());
		response.getSortResponse().setSortKey(rmalr.getSortRequest().getSortKey());
		response.getSortResponse().setOrder(rmalr.getSortRequest().getOrder());
		return response;
	}

	@Override
	public RetrieveMtnAdjRepresentativeResponse retrieveMtnAdjRepresentative(RetrieveMtnAdjRepresentativeRequest rmarr)
			throws SQLException {
		RetrieveMtnAdjRepresentativeResponse response = new RetrieveMtnAdjRepresentativeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("adjId", rmarr.getAdjId());
		params.put("position", rmarr.getPaginationRequest().getPosition());
		params.put("count", rmarr.getPaginationRequest().getCount());
		params.put("sortKey", rmarr.getSortRequest().getSortKey());
		params.put("order", rmarr.getSortRequest().getOrder());
		response.setAdjuster(maintenanceDao.retrieveMtnAdjRepresentative(params));
		response.getPaginationResponse().setPosition(rmarr.getPaginationRequest().getPosition());
		response.getPaginationResponse().setCount(rmarr.getPaginationRequest().getCount());
		response.getSortResponse().setSortKey(rmarr.getSortRequest().getSortKey());
		response.getSortResponse().setOrder(rmarr.getSortRequest().getOrder());
		return response;
	}

	@Override
	public SaveMtnAdjusterResponse saveMtnAdjuster(SaveMtnAdjusterRequest smar) throws SQLException {
		SaveMtnAdjusterResponse response = new SaveMtnAdjusterResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		try{
			params.put("adjId", smar.getAdjId());
			params.put("adjName", smar.getAdjName());
			params.put("addrLine1", smar.getAddrLine1());
			params.put("addrLine2", smar.getAddrLine2());
			params.put("addrLine3", smar.getAddrLine3());
			params.put("zipCd", smar.getZipCd());
			params.put("contactNo", smar.getContactNo());
			params.put("emailAdd", smar.getEmailAdd());
			params.put("activeTag", smar.getActiveTag());
			params.put("remarks", smar.getRemarks());
			params.put("createUser", smar.getCreateUser());
			params.put("createDate", smar.getCreateDate());
			params.put("updateUser", smar.getUpdateUser());
			params.put("updateDate", smar.getUpdateDate());
			params.put("saveAdjRepList", smar.getSaveAdjRepList());
			params.put("delAdjRepList", smar.getDelAdjRepList());
			params.put("accreditedTag", smar.getAccreditedTag());
			HashMap<String, Object> res = maintenanceDao.saveMtnAdjuster(params);
			response.setReturnCode((Integer) res.get("errorCode"));
			response.setOutAdjId((String) res.get("outAdjId"));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQLException","Please check the field values."));
			e.printStackTrace();
		}
		
		return response;
	}
	
	@Override
	public RetrieveMtnLossCdResponse retrieveMtnLossCd(RetrieveMtnLossCdRequest rmlcr) throws SQLException {
		// TODO Auto-generated method stub
		
		RetrieveMtnLossCdResponse response = new RetrieveMtnLossCdResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();		
		params.put("lossCd",rmlcr.getLossCd());
		response.setLossCd(maintenanceDao.retrieveMtnLossCd(params));
		return response;

	}

	@Override
	public SaveMtnLossCdResponse saveMtnLossCd(SaveMtnLossCdRequest smcr) throws SQLException {
		// TODO Auto-generated method stub
		SaveMtnLossCdResponse response = new SaveMtnLossCdResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("deleteLossCd", smcr.getDeleteLossCd());
		params.put("saveLossCd", smcr.getSaveLossCd());
		try{
			response.setReturnCode(maintenanceDao.saveMtnLossCd(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}
	
	@Override
	public RetrieveMtnClmEventTypeResponse retrieveMtnClmEventType(RetrieveMtnClmEventTypeRequest rmcetr)
			throws SQLException {
		RetrieveMtnClmEventTypeResponse rmcetResponse = new RetrieveMtnClmEventTypeResponse();
		HashMap<String, Object> retMtnClmEventTypeParams = new HashMap<String, Object>();
		retMtnClmEventTypeParams.put("eventTypeCd", rmcetr.getEventTypeCd());
		rmcetResponse.setEventTypeList(maintenanceDao.retrieveMtnEventType(retMtnClmEventTypeParams));
		return rmcetResponse;
	}

	@Override
	public SaveMtnClmEventTypeResponse saveMtnClmEventType(SaveMtnClmEventTypeRequest smcetr) throws SQLException {
		SaveMtnClmEventTypeResponse smcetResponse = new SaveMtnClmEventTypeResponse();
		HashMap<String, Object> smcetParams = new HashMap<String, Object>();
		smcetParams.put("saveEventType", smcetr.getSaveEventType());
		smcetParams.put("deleteEventType",smcetr.getDeleteEventType());
		smcetResponse.setReturnCode(maintenanceDao.saveMtnClmEventType(smcetParams));
		return smcetResponse;
	}
	
	@Override
	public RetrieveMtnClmEventResponse retrieveMtnClmEvent(RetrieveMtnClmEventRequest rmcer)
			throws SQLException {
		RetrieveMtnClmEventResponse rmceResponse = new RetrieveMtnClmEventResponse();
		HashMap<String, Object> retMtnClmEventParams = new HashMap<String, Object>();
		retMtnClmEventParams.put("eventCd", rmcer.getEventCd());
		rmceResponse.setEventList(maintenanceDao.retrieveMtnEvent(retMtnClmEventParams));
		return rmceResponse;
	}

	@Override
	public SaveMtnClmEventResponse saveMtnClmEvent(SaveMtnClmEventRequest smcer) throws SQLException {
		SaveMtnClmEventResponse smceResponse = new SaveMtnClmEventResponse();
		HashMap<String, Object> smceParams = new HashMap<String, Object>();
		smceParams.put("saveEvent", smcer.getSaveEvent());
		smceParams.put("deleteEvent",smcer.getDeleteEvent());
		smceResponse.setReturnCode(maintenanceDao.saveMtnClmEvent(smceParams));
		return smceResponse;
	}
	
	@Override
	public SaveMtnClaimStatusResponse saveMtnClaimStatus(SaveMtnClaimStatusRequest smcsr) throws SQLException {
		SaveMtnClaimStatusResponse smpResponse = new SaveMtnClaimStatusResponse();
		try{
			HashMap<String, Object> params = new HashMap<String, Object>();
			params.put("saveClaimStatus", smcsr.getSaveClaimStatus());
			params.put("delClaimStatus", smcsr.getDelClaimStatus());
			
			HashMap<String, Object> res = maintenanceDao.saveMtnClaimStatus(params);
			smpResponse.setReturnCode((Integer) res.get("errorCode"));
		} catch (Exception ex) {
			smpResponse.setReturnCode(0);
			smpResponse.getErrorList().add(new Error("SQLException","Please check the field values."));
			ex.printStackTrace();
		}
		return smpResponse;
	}

	@Override
	public RetrieveMtnSecIITrtyLimitResponse retrieveMtnSecIITrtyLimit(RetrieveMtnSecIITrtyLimitRequest rmstr)
			throws SQLException {
		RetrieveMtnSecIITrtyLimitResponse rmstResponse = new RetrieveMtnSecIITrtyLimitResponse();
		
		HashMap<String, Object> retrieveMtnSecIITrtyLimitParams = new HashMap<String, Object>();
		retrieveMtnSecIITrtyLimitParams.put("lineCd", rmstr.getLineCd());
		retrieveMtnSecIITrtyLimitParams.put("lineClassCd", rmstr.getLineClassCd());
		retrieveMtnSecIITrtyLimitParams.put("currencyCd", rmstr.getCurrencyCd());
		retrieveMtnSecIITrtyLimitParams.put("seciiTrtyLimId", rmstr.getSeciiTrtyLimId());
		
		rmstResponse.setSecIITreatyLimList(maintenanceDao.retrieveMtnSecIITrtyLimit(retrieveMtnSecIITrtyLimitParams));
		
		return rmstResponse;
	}

	@Override
	public SaveMtnSecIITrtyLimitResponse saveMtnSecIITrtyLimit(SaveMtnSecIITrtyLimitRequest smstr) throws SQLException {
		SaveMtnSecIITrtyLimitResponse smstResponse = new SaveMtnSecIITrtyLimitResponse();
		
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveSecIITrtyLimit", smstr.getSaveSecIITrtyLimit());
		params.put("deleteSecIITrtyLimit", smstr.getDeleteSecIITrtyLimit());
		
		smstResponse.setReturnCode(maintenanceDao.saveMtnSecIITrtyLimit(params));
		
		return smstResponse;
	}

	@Override
	public CopySecIITrtyLimitResponse copySecIITrtyLimit(CopySecIITrtyLimitRequest cstr) throws SQLException {
		CopySecIITrtyLimitResponse cstResponse = new CopySecIITrtyLimitResponse();
		
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("copyFromSeciiTrtyLimId", cstr.getCopyFromSeciiTrtyLimId());
		params.put("copyFromLineCd", cstr.getCopyFromLineCd());
		params.put("copyFromLineClassCd", cstr.getCopyFromLineClassCd());
		params.put("copyFromCurrencyCd", cstr.getCopyFromCurrencyCd());
		params.put("copyToLineCd", cstr.getCopyToLineCd());
		params.put("copyToLineClassCd", cstr.getCopyToLineClassCd());
		params.put("copyToCurrencyCd", cstr.getCopyToCurrencyCd());
		params.put("createUser", cstr.getCreateUser());
		params.put("createDate", cstr.getCreateDate());
		params.put("updateUser", cstr.getUpdateUser());
		params.put("updateDate", cstr.getUpdateDate());
		
		Integer res = maintenanceDao.checkSecIITrtyLimit(params);
		
		if(res == 1) {
			cstResponse.setReturnCode(2);
		} else if(res == 0) {
			cstResponse.setReturnCode(maintenanceDao.copySecIITrtyLimit(params));
		}
		
		return cstResponse;
	}

	@Override
	public RetrieveMtnPoolRetHistResponse retrieveMtnPoolRetHist(RetrieveMtnPoolRetHistRequest rmprhr)
			throws SQLException {
		RetrieveMtnPoolRetHistResponse rmprhResponse = new RetrieveMtnPoolRetHistResponse();
		
		HashMap<String, Object> retrieveMtnPoolRetHistParams = new HashMap<String, Object>();
		retrieveMtnPoolRetHistParams.put("retHistId", rmprhr.getRetHistId());
		retrieveMtnPoolRetHistParams.put("currencyCd", rmprhr.getCurrencyCd());
		
		rmprhResponse.setPoolRetHistList(maintenanceDao.retrieveMtnPoolRetHist(retrieveMtnPoolRetHistParams));
		
		return rmprhResponse;
	}

	@Override
	public RetrieveMtnClaimReasonResponse retrieveMtnClaimReason(RetrieveMtnClaimReasonRequest rmcrr)
			throws SQLException {
		RetrieveMtnClaimReasonResponse response = new RetrieveMtnClaimReasonResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("reasonCd", rmcrr.getReasonCd());
		params.put("clmStatCd", rmcrr.getClmStatCd());
		params.put("activeTag", rmcrr.getActiveTag());
		response.setClmReasonList(maintenanceDao.retrieveMtnClaimReason(params));
		return response;
	}

	@Override
	public SaveMtnClaimReasonResponse saveMtnClaimReason(SaveMtnClaimReasonRequest smcrr) throws SQLException {
		SaveMtnClaimReasonResponse response = new SaveMtnClaimReasonResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveClmReason", smcrr.getSaveClmReason());
		params.put("delClmReason", smcrr.getDelClmReason());
		try{
			response.setReturnCode(maintenanceDao.saveMtnClaimReason(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}
	
	@Override
	public SaveMtnPoolRetHistResponse saveMtnPoolRetHist(SaveMtnPoolRetHistRequest smprhr) throws SQLException {
		SaveMtnPoolRetHistResponse smprhResponse = new SaveMtnPoolRetHistResponse();
		HashMap<String, Object> saveMtnTreatyShareParams = new HashMap<String, Object>();
		saveMtnTreatyShareParams.put("currencyCd", smprhr.getCurrencyCd());
		saveMtnTreatyShareParams.put("savePoolRetHist", smprhr.getSavePoolRetHist());
		saveMtnTreatyShareParams.put("deletePoolRetHist", smprhr.getDeletePoolRetHist());
		saveMtnTreatyShareParams.put("deletePoolMember", smprhr.getDeletePoolMember());
		
		try{
			smprhResponse.setReturnCode(maintenanceDao.saveMtnPoolRetHist(saveMtnTreatyShareParams));
		}catch(Exception e){
			smprhResponse.setReturnCode(0);
		}
		
		return smprhResponse;
	}

	@Override
	public CopyPoolRetHistResponse copyPoolRetHist(CopyPoolRetHistRequest cprhr) throws SQLException {
		CopyPoolRetHistResponse cprhResponse = new CopyPoolRetHistResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("copyFromRetHistId", cprhr.getCopyFromRetHistId());
		params.put("copyToEffDateFrom", cprhr.getCopyToEffDateFrom());
		params.put("currencyCd", cprhr.getCurrencyCd());
		params.put("createUser", cprhr.getCreateUser());
		params.put("createDate", cprhr.getCreateDate());
		params.put("updateUser", cprhr.getUpdateUser());
		params.put("updateDate", cprhr.getUpdateDate());
		
		Integer res = maintenanceDao.checkPoolRetHist(params);
		
		if(res == 1) {
			cprhResponse.setReturnCode(2);
		} else if(res == 0) {
			cprhResponse.setReturnCode(maintenanceDao.copyPoolRetHist(params));
		}
		
		return cprhResponse;
	}

	@Override
	public RetrieveMtnLossCdLovResponse retrieveMtnLossCdLov(RetrieveMtnLossCdLovRequest rmlcl) throws SQLException {
		RetrieveMtnLossCdLovResponse rmlclResponse = new RetrieveMtnLossCdLovResponse();
		HashMap<String, Object> searchParams = new HashMap<String, Object>();
		
		searchParams.put("lossCdType", rmlcl.getLossCdType());
		searchParams.put("searchStr", rmlcl.getSearchStr());
		
		rmlclResponse.setLossCdList(maintenanceDao.retrieveMtnLossCdLov(searchParams));
		
		return rmlclResponse;
	}
	
	@Override
	public RetrieveMtnClmCashCallResponse retrieveMtnClmCashCall(RetrieveMtnClmCashCallRequest rccp)
			throws SQLException {
		// TODO Auto-generated method stub
		RetrieveMtnClmCashCallResponse rccResponse = new RetrieveMtnClmCashCallResponse();
		HashMap<String, Object> retrieveClmCashCallParams = new HashMap<String, Object>();
		retrieveClmCashCallParams.put("treatyId", rccp.getTreatyId());
		retrieveClmCashCallParams.put("treatyCedId", rccp.getTreatyCedId());
		retrieveClmCashCallParams.put("currCd", rccp.getCurrCd());
		rccResponse.setCashCallList(maintenanceDao.retrieveMtnCashCall(retrieveClmCashCallParams));
		return rccResponse;
	}

	@Override
	public SaveMtnClmCashCallResponse saveMtnClmCashCall(SaveMtnClmCashCallRequest smcccr) throws SQLException {
		// TODO Auto-generated method stub
		SaveMtnClmCashCallResponse smcccrResponse = new SaveMtnClmCashCallResponse();
		HashMap<String, Object> saveMtnClmCashCallParams = new HashMap<String, Object>();
		saveMtnClmCashCallParams.put("saveCashCall", smcccr.getSaveCashCall());
		saveMtnClmCashCallParams.put("delCashCall", smcccr.getDelCashCall());
		smcccrResponse.setReturnCode(maintenanceDao.saveMtnClmCashCall(saveMtnClmCashCallParams));
		return smcccrResponse;
	}
		
	@Override
	public RetrieveMtnClmEventTypeLovResponse retrieveMtnClmEventTypeLov(RetrieveMtnClmEventTypeLovRequest rmcel)
			throws SQLException {
		RetrieveMtnClmEventTypeLovResponse rmcelResponse = new RetrieveMtnClmEventTypeLovResponse();
		HashMap<String, Object> rmcelParams = new HashMap<String, Object>();
		rmcelParams.put("searchStr", rmcel.getSearchStr());
		
		rmcelResponse.setClmEventTypeList(maintenanceDao.retrieveMtnClmEventTypeLov(rmcelParams));
		
		return rmcelResponse;
	}

	@Override
	public RetrieveMtnClmEventLovResponse retrieveMtnClmEventLov(RetrieveMtnClmEventLovRequest rmcel)
			throws SQLException {
		RetrieveMtnClmEventLovResponse rmcelResponse = new RetrieveMtnClmEventLovResponse();
		HashMap<String, Object> rmcelParams = new HashMap<String, Object>();
		rmcelParams.put("eventTypeCd", rmcel.getEventTypeCd());
		rmcelParams.put("searchStr", rmcel.getSearchStr());
		
		rmcelResponse.setClmEventList(maintenanceDao.retrieveMtnClmEventLov(rmcelParams));
		
		return rmcelResponse;
	}

	@Override
	public CopyMtnClmCashCallResponse copyMtnClmCashCall(CopyMtnClmCashCallRequest cpmccr) throws SQLException {
		// TODO Auto-generated method stub
		CopyMtnClmCashCallResponse cpmccResponse = new CopyMtnClmCashCallResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("copyFromTreatyId", cpmccr.getCopyFromTreatyId());
		params.put("copyToTreatyId", cpmccr.getCopyToTreatyId());
		params.put("copyFromTreatyCedId", cpmccr.getCopyFromTreatyCedId());
		params.put("copyToTreatyCedId", cpmccr.getCopyToTreatyCedId());
		params.put("copyFromCurrCd", cpmccr.getCopyFromCurrCd());
		params.put("copyToCurrCd", cpmccr.getCopyToCurrCd());
		params.put("copyFromHistNo", cpmccr.getCopyFromHistNo());
		params.put("createUser", cpmccr.getCreateUser());
		params.put("createDate", cpmccr.getCreateDate());
		params.put("updateUser", cpmccr.getUpdateUser());
		params.put("updateDate", cpmccr.getUpdateDate());
		
		Integer res = maintenanceDao.checkMtnClmCashCall(params);
		
		if(res == 1) {
			cpmccResponse.setReturnCode(2);
		} else if(res == 0) {
			cpmccResponse.setReturnCode(maintenanceDao.copyMtnClmCashCall(params));
		}
		
		return cpmccResponse;
	}

	@Override
	public RetrieveMtnAcitTranTypeResponse retrieveMtnAcitTranType(RetrieveMtnAcitTranTypeRequest rmattr)
			throws SQLException {
		RetrieveMtnAcitTranTypeResponse rmattResponse =  new RetrieveMtnAcitTranTypeResponse();
		HashMap<String, Object> rmattParams = new HashMap<String, Object>();
		rmattParams.put("tranClass", rmattr.getTranClass());
		rmattParams.put("tranTypeCd", rmattr.getTranTypeCd());
		rmattParams.put("typePrefix", rmattr.getTypePrefix());
		rmattParams.put("autoTag", rmattr.getAutoTag());
		rmattParams.put("baeTag", rmattr.getBaeTag());
		rmattParams.put("activeTag", rmattr.getActiveTag());
		rmattResponse.setTranTypeList(maintenanceDao.retrieveMtnAcitTranType(rmattParams));
		return rmattResponse;
	}

	@Override
	public RetrieveMtnBankResponse retrieveMtnBank(RetrieveMtnBankRequest rmbr) throws SQLException {
		RetrieveMtnBankResponse res = new RetrieveMtnBankResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("bankCd", rmbr.getBankCd());
		params.put("officialName", rmbr.getOfficialName());
		params.put("activeTag", rmbr.getActiveTag());
		params.put("dcbTag", rmbr.getDcbTag());
		res.setBankList(maintenanceDao.retrieveMtnBank(params));
		return res;
	}
	
	@Override
	public RetrieveBankLovResponse retrieveBankLov(RetrieveBankLovRequest rblr) throws SQLException {
		RetrieveBankLovResponse res = new RetrieveBankLovResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("bankCd", rblr.getBankCd());
		params.put("officialName", rblr.getOfficialName());
		params.put("activeTag", rblr.getActiveTag());
		params.put("dcbTag", rblr.getDcbTag());
		params.put("glDepFor", rblr.getGlDepFor());
		res.setBankLovList(maintenanceDao.retrieveBankLov(params));
		return res;
	}

	@Override
	public RetrieveMtnBankAcctResponse retrieveMtnBankAcct(RetrieveMtnBankAcctRequest rmbar) throws SQLException {
		RetrieveMtnBankAcctResponse res = new RetrieveMtnBankAcctResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("bankCd", rmbar.getBankCd());
		params.put("bankAcctCd", rmbar.getBankAcctCd());
		params.put("accountNo", rmbar.getAccountNo());
		params.put("dcbTag", rmbar.getDcbTag());
		res.setBankAcctList(maintenanceDao.retrieveMtnBankAcct(params));
		return res;
	}

	@Override
	public RetrieveMtnAcitDCBNoResponse retrieveMtnAcitDCBNo(RetrieveMtnAcitDCBNoRequest rmaidcbr) throws SQLException {
		RetrieveMtnAcitDCBNoResponse response = new RetrieveMtnAcitDCBNoResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("dcbYear", rmaidcbr.getDcbYear());
		params.put("dcbNo", rmaidcbr.getDcbNo());
		params.put("dcbDate", rmaidcbr.getDcbDate());
		params.put("dcbStatus", rmaidcbr.getDcbStatus());
		response.setDcbNoList(maintenanceDao.retrieveMtnAcitDCBNo(params));
		return response;
	}

	@Override
	public SaveMtnAcitDCBNoResponse saveMtnAcitDCBNo(SaveMtnAcitDCBNoRequest smaidcbr) throws SQLException {
		SaveMtnAcitDCBNoResponse response = new SaveMtnAcitDCBNoResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveDCBNo", smaidcbr.getSaveDCBNo());
		params.put("delDCBNo", smaidcbr.getDelDCBNo());
		try{
			response.setReturnCode(maintenanceDao.saveMtnAcitDCBNo(params));
		}catch(SQLException sqlex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQL Exception","Please check the field values."));
			sqlex.printStackTrace();
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnDCBUserResponse retrieveMtnDCBUser(RetrieveMtnDCBUserRequest rmdur) throws SQLException {
		RetrieveMtnDCBUserResponse response = new RetrieveMtnDCBUserResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userId", rmdur.getUserid());
		response.setDcbUserList(maintenanceDao.retrieveMtnDCBUser(params));
		return response;
	}

	@Override
	public RetrieveMtnPayeeResponse retrieveMtnPayee(RetrieveMtnPayeeRequest rmbar) throws SQLException {
		RetrieveMtnPayeeResponse reponse = new RetrieveMtnPayeeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("payeeNo", rmbar.getPayeeNo());
		params.put("payeeClassCd", rmbar.getPayeeClassCd());
		reponse.setPayeeList(maintenanceDao.retrieveMtnPayee(params));
		return reponse;
	}
	
	@Override
	public RetrieveMtnBookingMonthResponse retrieveMtnBookingMonth(RetrieveMtnBookingMonthRequest rbmr)
			throws SQLException {
		RetrieveMtnBookingMonthResponse rmbmResponse = new RetrieveMtnBookingMonthResponse();
		HashMap<String, Object> rmbmParams = new HashMap<String, Object>();
		rmbmParams.put("bookingMm", rbmr.getBookingMm());
		rmbmParams.put("bookingYear", rbmr.getBookingYear());
		rmbmResponse.setBookingMonthList(maintenanceDao.retrieveMtnBookingMonth(rmbmParams));
		return rmbmResponse;
	}

	@Override
	public RetrieveMtnInvtSecurityTypeResponse retrieveMtnInvtSecurityType(RetrieveMtnInvtSecurityTypeRequest rist)
			throws SQLException {
		// TODO Auto-generated method stub
		RetrieveMtnInvtSecurityTypeResponse rmistResponse = new RetrieveMtnInvtSecurityTypeResponse();
		HashMap<String, Object> rmistParams = new HashMap<String, Object>();
		rmistParams.put("invtSecCd", rist.getInvtSecCd());
		rmistParams.put("activeTag", rist.getActiveTag());
		rmistResponse.setInvSecTypeList(maintenanceDao.retrieveMtnInvtSecurityType(rmistParams));
		return rmistResponse;
	}
	
	@Override
	public RetrieveMtnAcitChartAcctResponse retrieveMtnAcitChartAcct(RetrieveMtnAcitChartAcctRequest rbmr)
			throws SQLException {
		RetrieveMtnAcitChartAcctResponse response = new RetrieveMtnAcitChartAcctResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("glAcctId", rbmr.getGlAcctId());
		params.put("glAcctCategory", rbmr.getGlAcctCategory());
		params.put("glAcctControl", rbmr.getGlAcctControl());
		params.put("glAcctSub1", rbmr.getGlAcctSub1());
		params.put("glAcctSub2", rbmr.getGlAcctSub2());
		params.put("glAcctSub3", rbmr.getGlAcctSub3());
		params.put("slTypeCd", rbmr.getSlTypeCd());
		params.put("drCrTag", rbmr.getDrCrTag());
		params.put("postTag", rbmr.getPostTag());
		params.put("activeTag", rbmr.getActiveTag());
		params.put("lov", rbmr.getLov());
		response.setList(maintenanceDao.retrieveMtnAcitChartAcct(params));
		return response;
	}

	@Override
	public RetrieveMtnSLTypeResponse retrieveMtnSLType(RetrieveMtnSLTypeRequest rbmr) throws SQLException {
		RetrieveMtnSLTypeResponse response = new RetrieveMtnSLTypeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("slTypeCd", rbmr.getSlTypeCd());
		params.put("autoTag", rbmr.getAutoTag());
		params.put("activeTag", rbmr.getActiveTag());
		response.setList(maintenanceDao.retrieveMtnSLType(params));
		return response;
	}

	@Override
	public RetrieveMtnSLResponse retrieveMtnSL(RetrieveMtnSLRequest rbmr) throws SQLException {
		RetrieveMtnSLResponse response = new RetrieveMtnSLResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("slTypeCd", rbmr.getSlTypeCd());
		params.put("slCd", rbmr.getSlCd());
		params.put("payeeNo", rbmr.getPayeeNo());
		params.put("autoTag", rbmr.getAutoTag());
		params.put("activeTag", rbmr.getActiveTag());
		params.put("slTypeCdArr", rbmr.getSlTypeCdArr());
		response.setList(maintenanceDao.retrieveMtnSL(params));
		return response;
	}

	@Override
	public RetrieveMtnPrintableNamesResponse retrieveMtnPrintableNames(RetrieveMtnPrintableNamesRequest request)
			throws SQLException {
		RetrieveMtnPrintableNamesResponse response = new RetrieveMtnPrintableNamesResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("employeeId", request.getEmployeeId());
		response.setPrintableNames(maintenanceDao.retrieveMtnPrintableNames(params));
		return response;
	}
	
	@Override
	public SaveMtnBankResponse saveMtnBank(SaveMtnBankRequest smaidcbr) throws SQLException {
		SaveMtnBankResponse response = new SaveMtnBankResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveList", smaidcbr.getSaveList());
		params.put("delList", smaidcbr.getDelList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnBank(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnCedingTreatyResponse retrieveMtnCedingTreaty(RetrieveMtnCedingTreatyRequest request)
			throws SQLException {
		RetrieveMtnCedingTreatyResponse response = new RetrieveMtnCedingTreatyResponse();
		
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("treatyTag",request.getTreatyTag()); 
		params.put("cedingName",request.getCedingName()); 
		response.setCedingcompany(maintenanceDao.retrieveMtnCedingTreaty(params));
        return response;
	}

	@Override
	public SaveMtnBankAcctResponse saveMtnBankAcct(SaveMtnBankAcctRequest smaidcbr) throws SQLException {
		SaveMtnBankAcctResponse response = new SaveMtnBankAcctResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveList", smaidcbr.getSaveList());
		params.put("delList", smaidcbr.getDelList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnBankAcct(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnCompanyResponse retrieveMtnCompany(RetrieveMtnCompanyRequest rmcr) throws SQLException {
		RetrieveMtnCompanyResponse response = new RetrieveMtnCompanyResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("companyId", rmcr.getCompanyId());
		response.setCompanyListing(maintenanceDao.retrieveMtnCompany(params));
		return response;
	}

	@Override
	public RetrieveMtnBussTypeResponse retrieveMtnBussType(RetrieveMtnBussTypeRequest rmbtr) throws SQLException {
		RetrieveMtnBussTypeResponse response = new RetrieveMtnBussTypeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("bussTypeCd", rmbtr.getBussTypeCd());
		params.put("bussTypeName", rmbtr.getBussTypeName());
		params.put("activeTag", rmbtr.getActiveTag());
		response.setBussTypeList(maintenanceDao.retrieveMtnBussType(params));
		return response;
	}

	@Override
	public RetrieveMtnPayeeCedingResponse retrieveMtnPayeeCeding(RetrieveMtnPayeeCedingRequest request)
			throws SQLException {
		RetrieveMtnPayeeCedingResponse response = new RetrieveMtnPayeeCedingResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("payeeClassCd", request.getPayeeClassCd());
		params.put("treatyTag", request.getTreatyTag());
		response.setPayeeCeding(maintenanceDao.retrieveMtnPayeeCeding(params));
		return response;
	}

	@Override
	public RetrieveMtnAcitCheckSeriesResponse retrieveMtnAcitCheckSeries(RetrieveMtnAcitCheckSeriesRequest rmacs)
			throws SQLException {
		RetrieveMtnAcitCheckSeriesResponse rmacsResponse = new RetrieveMtnAcitCheckSeriesResponse();
		HashMap<String, Object> rmacsParams = new HashMap<String, Object>();
		rmacsParams.put("bank",rmacs.getBank());
		rmacsParams.put("bankAcct", rmacs.getBankAcct());
		rmacsParams.put("checkNo",rmacs.getCheckNo());
		rmacsParams.put("srchFrom",rmacs.getSrchFrom());
		rmacsParams.put("srchTo",rmacs.getSrchTo());
		rmacsParams.put("from",rmacs.getFrom());
		rmacsResponse.setCheckSeriesList(maintenanceDao.retrieveMtnAcitCheckSeries(rmacsParams));
		return rmacsResponse;
	}
	
	@Override
	public RetrieveMtnAcseTranTypeResponse retrieveMtnAcseTranType(RetrieveMtnAcseTranTypeRequest rmattr)
			throws SQLException {
		RetrieveMtnAcseTranTypeResponse response = new RetrieveMtnAcseTranTypeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("tranClass", rmattr.getTranClass());
		params.put("tranTypeCd", rmattr.getTranTypeCd());
		params.put("typePrefix", rmattr.getTypePrefix());
		params.put("autoTag", rmattr.getAutoTag());
		params.put("baeTag", rmattr.getBaeTag());
		params.put("activeTag", rmattr.getActiveTag());
		response.setTranTypeList(maintenanceDao.retrieveMtnAcseTranType(params));
		return response;
	}

	@Override
	public RetrieveMtnAcseDCBNoResponse retrieveMtnAcseDCBNo(RetrieveMtnAcseDCBNoRequest rmadnr) throws SQLException {
		RetrieveMtnAcseDCBNoResponse response = new RetrieveMtnAcseDCBNoResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("dcbYear", rmadnr.getDcbYear());
		params.put("dcbNo", rmadnr.getDcbNo());
		params.put("dcbDate", rmadnr.getDcbDate());
		params.put("dcbStatus", rmadnr.getDcbStatus());
		response.setDcbNoList(maintenanceDao.retrieveMtnAcseDCBNo(params));
		return response;
	}
	
	@Override
	public SaveMtnAcseDCBNoResponse saveMtnAcseDCBNo(SaveMtnAcseDCBNoRequest smaidcbr) throws SQLException {
		SaveMtnAcseDCBNoResponse response = new SaveMtnAcseDCBNoResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveDCBNo", smaidcbr.getSaveDCBNo());
		params.put("delDCBNo", smaidcbr.getDelDCBNo());
		try{
			response.setReturnCode(maintenanceDao.saveMtnAcseDCBNo(params));
		}catch(SQLException sqlex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("SQL Exception","Please check the field values."));
			sqlex.printStackTrace();
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnAcitArSeriesResponse retrieveMtnAcitArSeries(RetrieveMtnAcitArSeriesRequest rmaasr)
			throws SQLException {
		RetrieveMtnAcitArSeriesResponse response = new RetrieveMtnAcitArSeriesResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("usedTag", rmaasr.getUsedTag());
		params.put("rowNum", rmaasr.getRowNum());
		response.setArSeriesList(maintenanceDao.retrieveMtnAcitArSeries(params));
		return response;
	}

	@Override
	public RetrieveMtnGenTaxResponse retrieveMtnGenTax(RetrieveMtnGenTaxRequest rmgtr) throws SQLException {
		RetrieveMtnGenTaxResponse response = new RetrieveMtnGenTaxResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("taxCd", rmgtr.getTaxCd());
		params.put("taxName", rmgtr.getTaxName());
		params.put("chargeType", rmgtr.getChargeType());
		params.put("fixedTag", rmgtr.getFixedTag());
		params.put("activeTag", rmgtr.getActiveTag());
		response.setGenTaxList(maintenanceDao.retrieveMtnGenTax(params));
		return response;
	}

	@Override
	public RetrieveMtnWhTaxResponse retrieveMtnWhTax(RetrieveMtnWhTaxRequest rmwt) throws SQLException {
		RetrieveMtnWhTaxResponse response = new RetrieveMtnWhTaxResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("taxCd", rmwt.getTaxCd());
		params.put("taxName", rmwt.getTaxName());
		params.put("taxType", rmwt.getTaxType());
		params.put("creditableTag", rmwt.getCreditableTag());
		params.put("fixedTag", rmwt.getFixedTag());
		params.put("activeTag", rmwt.getActiveTag());
		response.setWhTaxList(maintenanceDao.retrieveMtnWhTax(params));
		return response;
	}
	
	@Override
	public SaveMtnBussTypeResponse saveMtnBussType(SaveMtnBussTypeRequest smbtr)
			throws SQLException {
		SaveMtnBussTypeResponse response = new SaveMtnBussTypeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("saveList", smbtr.getSaveList());
		params.put("delList", smbtr.getDelList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnBussType(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnDcbUserResponse saveMtnDcbUser(SaveMtnDcbUserRequest smdur)
			throws SQLException {
		SaveMtnDcbUserResponse response = new SaveMtnDcbUserResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("saveList", smdur.getSaveList());
		params.put("delList", smdur.getDelList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnDcbUser(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnEmployeeResponse retrieveMtnEmployee(
			RetrieveMtnEmployeeRequest rmer) throws SQLException {
		RetrieveMtnEmployeeResponse response = new RetrieveMtnEmployeeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("companyId", rmer.getCompanyId());
		params.put("employeeId", rmer.getEmployeeId());
		response.setEmployeeList(maintenanceDao.retrieveMtnEmployee(params));
		return response;
		
	}
	
	@Override
    public RetrieveMtnAcseCheckSeriesResponse retrieveMtnAcseCheckSeries(RetrieveMtnAcseCheckSeriesRequest rmacs)
            throws SQLException {
        RetrieveMtnAcseCheckSeriesResponse rmacsResponse = new RetrieveMtnAcseCheckSeriesResponse();
        HashMap<String, Object> rmacsParams = new HashMap<String, Object>();
        rmacsParams.put("bank",rmacs.getBank());
        rmacsParams.put("bankAcct", rmacs.getBankAcct());
        rmacsParams.put("checkNo",rmacs.getCheckNo());
        rmacsParams.put("srchFrom",rmacs.getSrchFrom());
        rmacsParams.put("srchTo",rmacs.getSrchTo());
        rmacsParams.put("from",rmacs.getFrom());
        rmacsResponse.setCheckSeriesList(maintenanceDao.retrieveMtnAcseCheckSeries(rmacsParams));
        return rmacsResponse;
    }

	@Override
	public RetrieveMtnAcseChartAcctResponse retrieveMtnAcseChartAcct(RetrieveMtnAcseChartAcctRequest rmacar)
			throws SQLException {
		RetrieveMtnAcseChartAcctResponse response = new RetrieveMtnAcseChartAcctResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("glAcctId", rmacar.getGlAcctId());
		params.put("glAcctCategory", rmacar.getGlAcctCategory());
		params.put("glAcctControl", rmacar.getGlAcctControl());
		params.put("glAcctSub1", rmacar.getGlAcctSub1());
		params.put("glAcctSub2", rmacar.getGlAcctSub2());
		params.put("glAcctSub3", rmacar.getGlAcctSub3());
		params.put("slTypeCd", rmacar.getSlTypeCd());
		params.put("drCrTag", rmacar.getDrCrTag());
		params.put("postTag", rmacar.getPostTag());
		params.put("activeTag", rmacar.getActiveTag());
		params.put("lov", rmacar.getLov());
		response.setList(maintenanceDao.retrieveMtnAcseChartAcct(params));
		return response;
	}

	@Override
	public GenerateAcitARSeriesResponse generateARSeries(GenerateAcitARSeriesRequest request) throws SQLException {
		GenerateAcitARSeriesResponse response = new GenerateAcitARSeriesResponse();
		try{
			HashMap<String,Object> params = new HashMap<String, Object>();
			params.put("arFrom", request.getArFrom());
			params.put("arTo", request.getArTo());
			params.put("createUser", request.getCreateUser());
			params.put("createDate", request.getCreateDate());
			params.put("updateUser", request.getUpdateUser());
			params.put("updateDate", request.getUpdateDate());
			HashMap<String,Object> res = maintenanceDao.generateARSeries(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public GenerateAcitCVSeriesResponse generateCVSeries(GenerateAcitCVSeriesRequest request) throws SQLException {
		GenerateAcitCVSeriesResponse response = new GenerateAcitCVSeriesResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("cvYear", request.getCvYear());
			params.put("cvFrom", request.getCvFrom());
			params.put("cvTo", request.getCvTo());
			params.put("createUser", request.getCreateUser());
			params.put("createDate", request.getCreateDate());
			params.put("updateUser", request.getUpdateUser());
			params.put("updateDate", request.getUpdateDate());
			HashMap<String, Object> res = maintenanceDao.generateCVSeries(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public GenerateAcitJVSeriesResponse generateJVSeries(GenerateAcitJVSeriesRequest request) throws SQLException {
		GenerateAcitJVSeriesResponse response  = new GenerateAcitJVSeriesResponse();
		try{
			HashMap<String,Object> params = new HashMap<String, Object>();
			params.put("jvYear",request.getJvYear());
			params.put("jvFrom", request.getJvFrom());
			params.put("jvTo", request.getJvTo());
			params.put("createUser", request.getCreateUser());
			params.put("createDate", request.getCreateDate());
			params.put("updateUser", request.getUpdateUser());
			params.put("updateDate", request.getUpdateDate());
			HashMap<String,Object> res = maintenanceDao.generateJVSeries(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnGenARSeriesResponse retrieveArSeries(RetrieveMtnGenARSeriesRequest request) throws SQLException {
		RetrieveMtnGenARSeriesResponse response = new RetrieveMtnGenARSeriesResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("arFrom", request.getArFrom());
		params.put("arTo", request.getArTo());
		params.put("usedTag", request.getUsedTag());
		response.setArSeries(maintenanceDao.retrieveArSeries(params));
		return response;
	}

	@Override
	public RetrieveMtnGenCVSeriesResponse retrieveCvSeries(RetrieveMtnGenCVSeriesRequest request) throws SQLException {
		RetrieveMtnGenCVSeriesResponse response = new RetrieveMtnGenCVSeriesResponse();
		HashMap<String,Object> params  =  new HashMap<String,Object>();
		params.put("cvYear",request.getCvYear());
		params.put("cvFrom", request.getCvFrom());
		params.put("cvTo", request.getCvTo());
		params.put("usedTag", request.getUsedTag());
		response.setCvSeries(maintenanceDao.retrieveCvSeries(params));
		return response;
	}

	@Override
	public RetrieveMtnGenJVSeriesResponse retrieveJvSeries(RetrieveMtnGenJVSeriesRequest request) throws SQLException {
		RetrieveMtnGenJVSeriesResponse response = new RetrieveMtnGenJVSeriesResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("jvYear",request.getJvYear());
		params.put("jvFrom", request.getJvFrom());
		params.put("jvTo", request.getJvTo());
		params.put("usedTag", request.getUsedTag());
		response.setJvSeries(maintenanceDao.retrieveJvSeries(params));
		return response;
	}

	@Override
	public RetrieveMtnAcitSeriesResponse retrieveAcitAllowGenerate(RetrieveMtnAcitSeriesRequest request) throws SQLException {
		RetrieveMtnAcitSeriesResponse response = new RetrieveMtnAcitSeriesResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("tranClass", request.getTranClass());
		params.put("tranFrom", request.getTranFrom());
		params.put("tranTo", request.getTranTo());
		params.put("year", request.getYear());
		response.setAllowGenerate(maintenanceDao.retrieveAcitAllowGenerate(params));
		return response;
	}

	@Override
	public GenerateAcseCVSeriesResponse generateAcseCVSeries(GenerateAcseCVSeriesRequest request) throws SQLException {
		GenerateAcseCVSeriesResponse response = new GenerateAcseCVSeriesResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("cvFrom", request.getCvFrom());
			params.put("cvTo",request.getCvTo());
			params.put("cvYear", request.getCvYear());
			params.put("createUser", request.getCreateUser());
			params.put("createDate", request.getCreateDate());
			params.put("updateUser", request.getUpdateUser());
			params.put("updateDate", request.getUpdateDate());
			HashMap<String,Object> res = maintenanceDao.generateAcseCVSeries(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public GenerateAcseJVSeriesResponse generateAcseJVSeries(GenerateAcseJVSeriesRequest request) throws SQLException {
		GenerateAcseJVSeriesResponse response = new GenerateAcseJVSeriesResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("jvFrom",request.getJvFrom());
			params.put("jvTo", request.getJvTo());
			params.put("jvYear", request.getJvYear());
			params.put("createUser", request.getCreateUser());
			params.put("createDate", request.getCreateDate());
			params.put("updateUser", request.getUpdateUser());
			params.put("updateDate", request.getUpdateDate());
			HashMap<String,Object> res = maintenanceDao.generateAcseJVSeries(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public GenerateAcseORSeriesResponse generateAcseORSeries(GenerateAcseORSeriesRequest request) throws SQLException {
		GenerateAcseORSeriesResponse response = new GenerateAcseORSeriesResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("orType", request.getOrType());
			params.put("orFrom", request.getOrFrom());
			params.put("orTo", request.getOrTo());
			params.put("createUser", request.getCreateUser());
			params.put("createDate", request.getCreateDate());
			params.put("updateUser", request.getUpdateUser());
			params.put("updateDate", request.getUpdateDate());
			HashMap<String ,Object> res = maintenanceDao.generateAcseORSeries(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnAcseGenORSeriesResponse retrieveAcseOrSeries(RetrieveMtnAcseGenORSeriesRequest request)
			throws SQLException {
		RetrieveMtnAcseGenORSeriesResponse response = new RetrieveMtnAcseGenORSeriesResponse(); 
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("orType", request.getOrType());
		params.put("orTo", request.getOrTo());
		params.put("orFrom", request.getOrFrom());
		params.put("usedTag", request.getUsedTag());
		params.put("rowNum", request.getRowNum());
		response.setOrSeries(maintenanceDao.retrieveAcseOrSeries(params));
		return response;
	}

	@Override
	public RetrieveMtnAcseGenCVSeriesResponse retrieveAcseCVSeries(RetrieveMtnAcseGenCVSeriesRequest request)
			throws SQLException {
		RetrieveMtnAcseGenCVSeriesResponse response = new RetrieveMtnAcseGenCVSeriesResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("cvYear", request.getCvYear());
		params.put("cvFrom", request.getCvFrom());
		params.put("cvTo", request.getCvTo());
		params.put("usedTag", request.getUsedTag());
		response.setCvSeries(maintenanceDao.retrieveAcseCVSeries(params));
		return response;
	}

	@Override
	public RetrieveMtnAcseGenJVSeriesResponse retrieveAcseJVSeries(RetrieveMtnAcseGenJVSeriesRequest request)
			throws SQLException {
		RetrieveMtnAcseGenJVSeriesResponse response = new RetrieveMtnAcseGenJVSeriesResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("jvYear", request.getJvYear());
		params.put("jvFrom", request.getJvFrom());
		params.put("jvTo", request.getJvTo());
		params.put("usedTag", request.getUsedTag());
		response.setJvSeries(maintenanceDao.retrieveAcseJVSeries(params));
		return response;
	}

	@Override
	public RetrieveMtnAcseSeriesResponse retrieveAcseAllowGenerate(RetrieveMtnAcseSeriesRequest request) throws SQLException {
		RetrieveMtnAcseSeriesResponse response =  new RetrieveMtnAcseSeriesResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("tranClass", request.getTranClass());
		params.put("tranFrom", request.getTranFrom());
		params.put("tranTo", request.getTranTo());
		params.put("tranYear", request.getTranYear());
		params.put("orType", request.getOrType());
		response.setAllowGenerate(maintenanceDao.retrieveAcseAllowGenerate(params));
		return response;
	}

	@Override
	public RetrieveMtnAcseWhtaxResponse retrieveAcseWHTax(RetrieveMtnAcseWhtaxRequest request) throws SQLException {
		RetrieveMtnAcseWhtaxResponse response =  new RetrieveMtnAcseWhtaxResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("whtaxId",request.getWhtaxId());
		params.put("taxCd",request.getTaxCd());
		params.put("taxType",request.getTaxType());
		params.put("creditableTag",request.getCreditableTag());
		params.put("fixedTag",request.getFixedTag());
		params.put("activeTag",request.getActiveTag());
		response.setWhtax(maintenanceDao.retrieveAcseWHTax(params));
		return response;
	}

	@Override
	public SaveMtnAcseWhTaxResponse saveMtnWhTax(SaveMtnAcseWhTaxRequest request) throws SQLException {
		SaveMtnAcseWhTaxResponse response = new SaveMtnAcseWhTaxResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveWhTax", request.getSaveWhTax());
			params.put("delWhTax", request.getDelWhTax());
			HashMap<String,Object> res = maintenanceDao.saveMtnWhTax(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnAcitTranTypeResponse saveMtnTranType(SaveMtnAcitTranTypeRequest request) throws SQLException {
		SaveMtnAcitTranTypeResponse response = new SaveMtnAcitTranTypeResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveTranType", request.getSaveTranType());
			params.put("delTranType", request.getDelTranType());
			HashMap<String,Object> res = maintenanceDao.saveMtnTranType(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnAcitDefAmtDtlResponse retrieveAcitDefAmt(RetrieveMtnAcitDefAmtDtlRequest request)
			throws SQLException {
		RetrieveMtnAcitDefAmtDtlResponse response = new RetrieveMtnAcitDefAmtDtlResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("tranClass", request.getTranClass());
		params.put("tranTypeCd", request.getTranTypeCd());
		params.put("itemNo",request.getItemNo());
		response.setDefAmtDtl(maintenanceDao.retrieveAcitDefAmt(params));
		return response;	
	}
	
	@Override
	public SaveMtnEmployeeResponse saveMtnEmployee(SaveMtnEmployeeRequest smer)
			throws SQLException {
		SaveMtnEmployeeResponse response = new SaveMtnEmployeeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("saveList", smer.getSaveList());
		params.put("delList", smer.getDelList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnEmployee(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnAcitDefAmtDtlResponse saveMtnAcitDefAmt(SaveMtnAcitDefAmtDtlRequest request) throws SQLException {
		SaveMtnAcitDefAmtDtlResponse response = new SaveMtnAcitDefAmtDtlResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveDefAmt", request.getSaveDefAmt());
			params.put("delDefAmt", request.getDelDefAmt());
			HashMap<String,Object> res = maintenanceDao.saveMtnAcitDefAmt(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnAcitDefAcctEntResponse retrieveAcitDefAcctEnt(RetrieveMtnAcitDefAcctEntRequest request)
			throws SQLException {
		RetrieveMtnAcitDefAcctEntResponse response = new RetrieveMtnAcitDefAcctEntResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("tranClass", request.getTranClass());
		params.put("tranTypeCd", request.getTranTypeCd());
		params.put("entryNo", request.getEntryNo());
		response.setDefAccEnt(maintenanceDao.retrieveAcitDefAcctEnt(params));
		return response;
	}

	@Override
	public SaveMtnAcitDefAcctEntriesResponse saveAcitDefAcctEnt(SaveMtnAcitDefAcctEntriesRequest request)
			throws SQLException {
		SaveMtnAcitDefAcctEntriesResponse response = new SaveMtnAcitDefAcctEntriesResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveAcctEnt", request.getSaveAcctEnt());
			params.put("delAcctEnt", request.getDelAcctEnt());
			HashMap<String,Object> res = maintenanceDao.saveAcitDefAcctEnt(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnAcseTranTypeResponse saveAcseTranType(SaveMtnAcseTranTypeRequest request) throws SQLException {
		SaveMtnAcseTranTypeResponse response = new SaveMtnAcseTranTypeResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveTranType",request.getSaveTranType());
			params.put("delTranType" , request.getDelTranType());
			HashMap<String,Object> res = maintenanceDao.saveAcseTranType(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnAcseDefAcctEntResponse retrieveAcseDefAcctEnt(RetrieveMtnAcseDefAcctEntRequest request)
			throws SQLException {
		RetrieveMtnAcseDefAcctEntResponse response = new RetrieveMtnAcseDefAcctEntResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("tranClass", request.getTranClass());
		params.put("tranTypeCd", request.getTranTypeCd());
		params.put("entryNo", request.getEntryNo());
		response.setDefAccEnt(maintenanceDao.retrieveAcseDefAcctEnt(params));
		return response;
	}

	@Override
	public SaveMtnAcseDefAcctEntResponse saveAcseDefAcctEnt(SaveMtnAcseDefAcctEntRequest request) throws SQLException {
		SaveMtnAcseDefAcctEntResponse response = new SaveMtnAcseDefAcctEntResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveAcctEnt", request.getSaveAcctEnt());
			params.put("delAcctEnt", request.getDelAcctEnt());
			HashMap<String,Object> res = maintenanceDao.saveAcseDefAcctEnt(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnGenTaxResponse saveMtnGenTax(SaveMtnGenTaxRequest smgt)
			throws SQLException {
		SaveMtnGenTaxResponse response = new SaveMtnGenTaxResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("saveList", smgt.getSaveList());
		params.put("delList", smgt.getDelList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnGenTax(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnGenTaxHistResponse retrieveMtnGenTaxHist(
			RetrieveMtnGenTaxHistRequest rmgthr) throws SQLException {
		RetrieveMtnGenTaxHistResponse response = new RetrieveMtnGenTaxHistResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("taxId", rmgthr.getTaxId());
	    response.setGenTaxList(maintenanceDao.retrieveMtnGenTaxHist(params));
		return response;
	}

	@Override
	public SaveMtnGenTaxHistResponse saveMtnGenTaxHist(
			SaveMtnGenTaxHistRequest smgth) throws SQLException {
		SaveMtnGenTaxHistResponse response = new SaveMtnGenTaxHistResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("saveList", smgth.getSaveList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnGenTaxHist(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnGenTaxRangeResponse saveMtnGenTaxRange(
			SaveMtnGenTaxRangeRequest smgtr) throws SQLException {
		SaveMtnGenTaxRangeResponse response = new SaveMtnGenTaxRangeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("saveList", smgtr.getSaveList());
		params.put("delList", smgtr.getDelList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnGenTaxRange(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnGenTaxRangeResponse retrieveMtnGenTaxRange(
			RetrieveMtnGenTaxRangeRequest rmgtrr) throws SQLException {
		RetrieveMtnGenTaxRangeResponse response = new RetrieveMtnGenTaxRangeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("taxId", rmgtrr.getTaxId());
	    response.setGenTaxListRange(maintenanceDao.retrieveMtnGenTaxRange(params));
		return response;
	}

	@Override
	public SaveMtnInvSecTypeResponse saveMtnInvSecType(
			SaveMtnInvSecTypeRequest smist) throws SQLException {
		SaveMtnInvSecTypeResponse response = new SaveMtnInvSecTypeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("saveList", smist.getSaveList());
		params.put("delList", smist.getDelList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnInvSecType(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnPayeeClassResponse retrieveMtnPayeeClass(
			RetrieveMtnPayeeClassRequest rmpcr) throws SQLException {
		RetrieveMtnPayeeClassResponse response = new RetrieveMtnPayeeClassResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("payeeClassCd", rmpcr.getPayeeClassCd());
		params.put("activeTag", rmpcr.getActiveTag());
	    response.setPayeeClassList(maintenanceDao.retrieveMtnPayeeClass(params));
		return response;
	}

	@Override
	public SaveMtnPayeeClassResponse saveMtnPayeeClass(
			SaveMtnPayeeClassRequest smpc) throws SQLException {
		SaveMtnPayeeClassResponse response = new SaveMtnPayeeClassResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("saveList", smpc.getSaveList());
		params.put("delList", smpc.getDelList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnPayeeClass(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnSLTypeResponse saveMtnSLType(SaveMtnSLTypeRequest smst)
			throws SQLException {
		SaveMtnSLTypeResponse response = new SaveMtnSLTypeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("saveList", smst.getSaveList());
		params.put("delList", smst.getDelList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnSLType(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnSLResponse saveMtnSL(SaveMtnSLRequest sms)
			throws SQLException {
		SaveMtnSLResponse response = new SaveMtnSLResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("saveList", sms.getSaveList());
		params.put("delList", sms.getDelList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnSL(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnPayeeResponse saveMtnPayee(SaveMtnPayeeRequest smp)
			throws SQLException {
		// TODO Auto-generated method stub
		SaveMtnPayeeResponse response = new SaveMtnPayeeResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("saveList", smp.getSaveList());
		params.put("delList", smp.getDelList());
		try{
			response.setReturnCode(maintenanceDao.saveMtnPayee(params));
		}catch(Exception e){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			e.printStackTrace();
		}
		return response;
   }
		
	public RetrieveMtnAcseDefAmtResponse retrieveAcseAmtDtl(RetrieveMtnAcseDefAmtRequest request) throws SQLException {
		RetrieveMtnAcseDefAmtResponse response = new RetrieveMtnAcseDefAmtResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("tranClass", request.getTranClass());
		params.put("tranTypeCd", request.getTranTypeCd());
		params.put("itemNo", request.getItemNo());
		response.setDefAmtDtl(maintenanceDao.retrieveAcseAmtDtl(params));
		return response;
	}

	@Override
	public SaveMtnAcseDefAmtDtlResponse saveAcseAmtDtl(SaveMtnAcseDefAmtDtlRequest request) throws SQLException {
		SaveMtnAcseDefAmtDtlResponse response = new SaveMtnAcseDefAmtDtlResponse();
		try {
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveDefAmt", request.getSaveDefAmt());
			params.put("delDefAmt", request.getDelDefAmt());
			HashMap<String,Object> res = maintenanceDao.saveAcseAmtDtl(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnAcseWhTaxHistResponse retrieveAcseWhTaxHist(RetrieveMtnAcseWhTaxHistRequest request)
			throws SQLException {
		RetrieveMtnAcseWhTaxHistResponse response = new RetrieveMtnAcseWhTaxHistResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("whTaxId", request.getWhTaxId());
		params.put("histNo", request.getHistNo());
		params.put("taxCd", request.getTaxCd());
		response.setWhTaxHist(maintenanceDao.retrieveAcseWhTaxHist(params));
		return response;
	}

	@Override
	public SaveMtnAcseWhTaxHistResponse saveAcseWhTaxHist(SaveMtnAcseWhTaxHistRequest request) throws SQLException {
		SaveMtnAcseWhTaxHistResponse response = new SaveMtnAcseWhTaxHistResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveWhTaxHist", request.getSaveWhTaxHist());
			HashMap<String,Object> res = maintenanceDao.saveAcseWhTaxHist(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnAcitChartAcctResponse saveAcitChartAcct(SaveMtnAcitChartAcctRequest request) throws SQLException {
		SaveMtnAcitChartAcctResponse response =  new SaveMtnAcitChartAcctResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveAcitChartAcct",request.getSaveAcitChartAcct());
			params.put("deleteAcitChartAcct", request.getDeleteAcitChartAcct());
			HashMap<String,Object> res = maintenanceDao.saveAcitChartAcc(params);
		    response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public SaveMtnAcseChartAcctResponse saveAcseChartAcct(SaveMtnAcseChartAcctRequest request) throws SQLException {
		SaveMtnAcseChartAcctResponse response = new SaveMtnAcseChartAcctResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveAcseChartAcct", request.getSaveAcseChartAcct());
			params.put("deleteAcseChartAcct", request.getDeleteAcseChartAcct());
			HashMap<String,Object> res = maintenanceDao.saveAcseChartAcc(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public RetrieveMtnAcseDefTaxResponse retrieveAcseDefTax(RetrieveMtnAcseDefTaxRequest request) throws SQLException {
		RetrieveMtnAcseDefTaxResponse response = new RetrieveMtnAcseDefTaxResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("tranClass", request.getTranClass());
		params.put("tranTypeCd", request.getTranTypeCd());
		params.put("taxId", request.getTaxId());
		response.setDefTax(maintenanceDao.retrieveAcseDefTax(params));
		return response;
	}

	@Override
	public RetrieveMtnAcseDefWhTaxResponse retrieveAcseDefWhTax(RetrieveMtnAcseDefWhTaxRequest request)
			throws SQLException {
		RetrieveMtnAcseDefWhTaxResponse response = new RetrieveMtnAcseDefWhTaxResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("tranClass", request.getTranClass());
		params.put("tranTypeCd", request.getTranTypeCd());
		params.put("whTaxId", request.getWhTaxId());
		response.setDefWhTax(maintenanceDao.retrieveAcseDefWhTax(params));
		return response;
	}

	@Override
	public SaveMtnAcseDefTaxResponse saveAcseDefTax(SaveMtnAcseDefTaxRequest request) throws SQLException {
		SaveMtnAcseDefTaxResponse response = new SaveMtnAcseDefTaxResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveDefTax", request.getSaveDefTax());
			params.put("delDefTax", request.getDelDefTax());
			params.put("saveDefWhTax", request.getSaveDefWhTax());
			params.put("delDefWhTax", request.getDelDefWhTax());
			HashMap<String,Object> res = maintenanceDao.saveAcseDefTax(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}
	
	@Override
	public RetrieveMtnUserLovResponse retrieveMtnUserLov(RetrieveMtnUserLovRequest rmulr) throws SQLException {
		RetrieveMtnUserLovResponse response = new RetrieveMtnUserLovResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("searchStr", rmulr.getSearchStr());
		
		response.setUserList(maintenanceDao.retrieveMtnUserLov(params));
		
		return response;
	}

	@Override
	public RetrieveMtnAcitTranTypeLovResponse retrieveMtnAcitTranTypeLov(RetrieveMtnAcitTranTypeLovRequest rmtlr)
			throws SQLException {
		RetrieveMtnAcitTranTypeLovResponse response =  new RetrieveMtnAcitTranTypeLovResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("searchStr", rmtlr.getSearchStr());
		params.put("tranClass", rmtlr.getTranClass());
		params.put("tranTypeCd", rmtlr.getTranTypeCd());
		params.put("typePrefix", rmtlr.getTypePrefix());
		params.put("autoTag", rmtlr.getAutoTag());
		params.put("baeTag", rmtlr.getBaeTag());
		params.put("activeTag", rmtlr.getActiveTag());
		
		response.setTranTypeList(maintenanceDao.retrieveMtnAcitTranTypeLov(params));
		
		return response;
	}

	@Override
	public RetrieveMtnAcseGenInvSeriesResponse retrieveMtnAcseInvSeries(
			RetrieveMtnAcseGenInvSeriesRequest request) throws SQLException {
		// TODO Auto-generated method stub
		RetrieveMtnAcseGenInvSeriesResponse rmagisResponse = new RetrieveMtnAcseGenInvSeriesResponse();
		HashMap<String, Object> rmagisParams = new HashMap<String, Object>();
		rmagisParams.put("invFrom",request.getInvFrom());
		rmagisParams.put("invTo", request.getInvTo());
		rmagisParams.put("usedTag", request.getUsedTag());
		rmagisParams.put("rowNum", request.getRowNum());
		rmagisResponse.setInvSeries(maintenanceDao.retrieveAcseInvSeries(rmagisParams));
		return rmagisResponse;
	
	}

	@Override
	public RetrieveMtnGlSubDepNoResponse retrieveMtnGlSubDepNo(RetrieveMtnGlSubDepNoRequest rmgsdnr)
			throws SQLException {
		RetrieveMtnGlSubDepNoResponse rmgsdnResponse = new RetrieveMtnGlSubDepNoResponse();
		HashMap<String, Object> rmgsdnParams = new HashMap<String, Object>();
		rmgsdnParams.put("depCd",rmgsdnr.getDepCd());
		rmgsdnParams.put("depNo",rmgsdnr.getDepNo());
		rmgsdnResponse.setGlSubDepNoList(maintenanceDao.retrieveMtnGlSubDepNo(rmgsdnParams));
		return rmgsdnResponse;
	}

	@Override
	public GenerateMtnAcitCheckSeriesResponse generateMtnAcitCheckSeries(GenerateMtnAcitCheckSeriesRequest gmacs)
			throws SQLException {
		GenerateMtnAcitCheckSeriesResponse gmacsResponse = new GenerateMtnAcitCheckSeriesResponse();
		HashMap<String, Object> gmacsParams = new HashMap<String, Object>();
		try {
			gmacsParams.put("bank",gmacs.getBank());
			gmacsParams.put("bankAcct",gmacs.getBankAcct());
			gmacsParams.put("checkNoFrom",gmacs.getCheckNoFrom());
			gmacsParams.put("checkNoTo",gmacs.getCheckNoTo());
			gmacsParams.put("user",gmacs.getUser());
			HashMap<String, Object> response = maintenanceDao.generateMtnAcitCheckSeries(gmacsParams);
			gmacsResponse.setReturnCode((Integer) response.get("errorCode"));
			gmacsResponse.setReturnCode(-1);
		} catch (SQLException sqlex) {
			gmacsResponse.setReturnCode(0);
			gmacsResponse.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
			sqlex.printStackTrace();
		} catch (Exception ex) {
			gmacsResponse.setReturnCode(0);
			gmacsResponse.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
			ex.printStackTrace();
		}
		
		return gmacsResponse;
	}

	@Override
	public GenerateAcseInvoiceSeriesResponse generateAcseInvoiceSeries(
			GenerateAcseInvoiceSeriesRequest request) throws SQLException {
		// TODO Auto-generated method stub
		GenerateAcseInvoiceSeriesResponse response = new GenerateAcseInvoiceSeriesResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("invoiceFrom", request.getInvoiceFrom());
			params.put("invoiceTo",request.getInvoiceTo());
			params.put("createUser", request.getCreateUser());
			params.put("createDate", request.getCreateDate());
			params.put("updateUser", request.getUpdateUser());
			params.put("updateDate", request.getUpdateDate());
			HashMap<String,Object> res = maintenanceDao.generateAcseInvoiceSeries(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
    public GenerateMtnAcseCheckSeriesResponse generateMtnAcseCheckSeries(GenerateMtnAcseCheckSeriesRequest gmacs)
            throws SQLException {
        GenerateMtnAcseCheckSeriesResponse gmacsResponse = new GenerateMtnAcseCheckSeriesResponse();
        HashMap<String, Object> gmacsParams = new HashMap<String, Object>();
        try {
            gmacsParams.put("bank",gmacs.getBank());
            gmacsParams.put("bankAcct",gmacs.getBankAcct());
            gmacsParams.put("checkNoFrom",gmacs.getCheckNoFrom());
            gmacsParams.put("checkNoTo",gmacs.getCheckNoTo());
            gmacsParams.put("user",gmacs.getUser());
            HashMap<String, Object> response = maintenanceDao.generateMtnAcseCheckSeries(gmacsParams);
            gmacsResponse.setReturnCode((Integer) response.get("errorCode"));
            gmacsResponse.setReturnCode(-1);
        } catch (SQLException sqlex) {
            gmacsResponse.setReturnCode(0);
            gmacsResponse.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
            sqlex.printStackTrace();
        } catch (Exception ex) {
            gmacsResponse.setReturnCode(0);
            gmacsResponse.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
            ex.printStackTrace();
        }
        
        return gmacsResponse;
    }

	@Override
	public RetrieveMtnReportsRangeResponse retrieveMtnReportsRange(RetrieveMtnReportsRangeRequest rmrrr)
			throws SQLException {
		RetrieveMtnReportsRangeResponse response  =  new RetrieveMtnReportsRangeResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("userId", rmrrr.getUserId());
		response.setReportsRange(maintenanceDao.retrieveMtnReportRange(params));
		return response;
	}

	@Override
	public SaveMtnReportsRangeResponse saveMtnReportsRange(SaveMtnReportsRangeRequest request) throws SQLException {
		SaveMtnReportsRangeResponse response = new SaveMtnReportsRangeResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveReportsRange", request.getSaveReportsRange());
			params.put("delReportsRange", request.getDelReportsRange());
			HashMap<String,Object> res = maintenanceDao.saveMtnReportsRange(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public GenerateMtnBookingMthResponse generateMtnBookingMth(
			GenerateMtnBookingMthRequest gmbmr) throws SQLException {
		// TODO Auto-generated method stub
		
		GenerateMtnBookingMthResponse gmacsResponse = new GenerateMtnBookingMthResponse();
	        HashMap<String, Object> params = new HashMap<String, Object>();
	        try {
	        	params.put("year",gmbmr.getYear());
	        	params.put("createUser",gmbmr.getCreateUser());
	        	params.put("createDate",gmbmr.getCreateDate());
	        	params.put("updateUser",gmbmr.getUpdateUser());
	        	params.put("updateDate",gmbmr.getUpdateDate());
	        	
	            HashMap<String, Object> response = maintenanceDao.generateMtnBookingMth(params);
	            gmacsResponse.setReturnCode((Integer) response.get("errorCode"));
	            gmacsResponse.setReturnCode(-1);
	        } catch (SQLException sqlex) {
	        	gmacsResponse.setReturnCode(0);
	        	gmacsResponse.getErrorList().add(new Error("SQLException","Unable to proceed to saving. Check fields."));
	            sqlex.printStackTrace();
	        } catch (Exception ex) {
	        	gmacsResponse.setReturnCode(0);
	        	gmacsResponse.getErrorList().add(new Error("General Exception","Unable to proceed to saving. Check fields."));
	            ex.printStackTrace();
	        }
	        
	        return gmacsResponse;
	}

	@Override
	public SaveMtnBookingMthResponse saveMtnBookingMth(
			SaveMtnBookingMthRequest smbmr) throws SQLException {
		// TODO Auto-generated method stub
		SaveMtnBookingMthResponse response = new SaveMtnBookingMthResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveBookingMth", smbmr.getSaveBookingMth());
			HashMap<String,Object> res = maintenanceDao.saveMtnBookingMth(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}
	
	@Override
	public RetMtnUserAmtLimitResponse retMtnPostingAmtLimit(RetMtnUserAmtLimitRequest rmil) throws SQLException {
		RetMtnUserAmtLimitResponse rmqrrResponse = new RetMtnUserAmtLimitResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("userGrp", rmil.getUserGrp());
		params.put("lineCd", rmil.getLineCd());
		rmqrrResponse.setUserAmtLimit(maintenanceDao.retMtnPostingAmtLimit(params));
		return rmqrrResponse;
	}
	
	@Override
	public SaveMtnUserAmtLimitResponse saveMtnPostingAmtLimit(SaveMtnUserAmtLimitRequest smualr) throws SQLException {
		SaveMtnUserAmtLimitResponse smualrResponse = new SaveMtnUserAmtLimitResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("saveUserAmtLmt", smualr.getSaveUserAmtLmt());
		params.put("delUserAmtLmt", smualr.getDelUserAmtLmt());
		try{
			smualrResponse.setReturnCode(maintenanceDao.saveMtnPostingAmtLimit(params));
		}catch (Exception ex) {
			smualrResponse.setReturnCode(0);
			smualrResponse.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return smualrResponse;
	}
	
	@Override
	public RetrieveMtnClmReportsRangeResponse retrieveMtnClmReportsRange(RetrieveMtnClmReportsRangeRequest request)throws SQLException{
		RetrieveMtnClmReportsRangeResponse response  =  new RetrieveMtnClmReportsRangeResponse();
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("userId", request.getUserId());
		response.setReportsRange(maintenanceDao.retrieveMtnClmReportsRange(params));
		return response;
	}

	@Override
	public SaveMtnClmReportsRangeResponse saveMtnClmReportsRange(SaveMtnClmReportsRangeRequest request)throws SQLException{
		SaveMtnClmReportsRangeResponse response = new SaveMtnClmReportsRangeResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveReportsRange", request.getSaveReportsRange());
			params.put("delReportsRange", request.getDelReportsRange());
			HashMap<String,Object> res = maintenanceDao.saveMtnClmReportsRange(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public String checkOkDeleteRetPerCede(CheckOkDeleteRetPerCedeRequest request) throws SQLException {
		HashMap<String,Object> params = new HashMap<String,Object>();
		params.put("currencyCd", request.getCurrencyCd());
		params.put("retHistId", request.getRetHistId());
		return maintenanceDao.checkOkDeleteRetPerCede(params);
	}

	@Override
	public RetrieveMtnPremPlanResponse retrieveMtnPremPlan(RetrieveMtnPremPlanRequest request) throws SQLException {
		RetrieveMtnPremPlanResponse response = new RetrieveMtnPremPlanResponse();
		response.setList(maintenanceDao.retrieveMtnPremPlan(request));
		return response;
	}

	@Override
	public SaveMtnPremPlanResponse saveMtnPremPlan(SaveMtnPremPlanRequest request) throws SQLException {
		SaveMtnPremPlanResponse response = new SaveMtnPremPlanResponse();
		try{
			HashMap<String,Object> params = new HashMap<String,Object>();
			params.put("saveList", request.getSaveList());
			HashMap<String,Object> res = maintenanceDao.saveMtnPremPlan(params);
			response.setReturnCode((Integer) res.get("errorCode"));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}

	@Override
	public CopyMtnPremPlanResponse copyMtnPremPlan(CopyMtnPremPlanRequest request) throws SQLException {
		CopyMtnPremPlanResponse response = new CopyMtnPremPlanResponse();
		try{
			response.setReturnCode(maintenanceDao.copyMtnPremPlan(request));
		}catch(Exception ex){
			response.setReturnCode(0);
			response.getErrorList().add(new Error("General Exception","Please check the field values."));
			ex.printStackTrace();
		}
		return response;
	}
}
