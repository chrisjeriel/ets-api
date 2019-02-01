package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import ph.cpi.rest.api.dao.MaintenanceDao;
import ph.cpi.rest.api.model.request.RetrieveMtnCityRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCrestaZoneRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnCurrencyRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnCityResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCrestaZoneResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnCurrencyResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;
import ph.cpi.rest.api.service.MaintenanceService;


@Component
public class MaintenanceServiceImpl implements MaintenanceService{

	@Autowired
	MaintenanceDao maintenanceDao;
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);
	
	@Override
	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException {
		RetrieveQuoteAlopResponse rqaResponse = new RetrieveQuoteAlopResponse();
		
		HashMap<String, Object> retrieveQuoteAlopParams = new HashMap<String, Object>();
		retrieveQuoteAlopParams.put("quoteId", rqap.getQuoteId());
		retrieveQuoteAlopParams.put("quotationNo", rqap.getQuotationNo());
		
		rqaResponse.getQuotation().setAlop(maintenanceDao.retrieveQuoteAlop(retrieveQuoteAlopParams));
		
		logger.info("retrieveQuoteAlopResponse : " + rqaResponse.toString());
		
		return rqaResponse;
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
}
