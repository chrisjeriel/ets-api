package ph.cpi.rest.api.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import ph.cpi.rest.api.model.request.RetrieveMtnObjectRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnProvinceRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnQuoteWordingsRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnRegionRequest;
import ph.cpi.rest.api.model.request.RetrieveQuoteAlopRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnObjectResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnProvinceResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnQuoteWordingsResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnRegionResponse;
import ph.cpi.rest.api.model.response.RetrieveQuoteAlopResponse;

@Service
public interface MaintenanceService {

	public RetrieveQuoteAlopResponse retrieveQuoteAlop(RetrieveQuoteAlopRequest rqap) throws SQLException;
	public RetrieveMtnRegionResponse retrieveMtnRegion(RetrieveMtnRegionRequest rmrp) throws SQLException;
	public RetrieveMtnProvinceResponse retrieveMtnProvince(RetrieveMtnProvinceRequest rmpp) throws SQLException;
	public RetrieveMtnObjectResponse retrieveMtnObject(RetrieveMtnObjectRequest rmop) throws SQLException;
	public RetrieveMtnQuoteWordingsResponse retrieveMtnQuoteWordings(RetrieveMtnQuoteWordingsRequest rmqwp) throws SQLException;
}
