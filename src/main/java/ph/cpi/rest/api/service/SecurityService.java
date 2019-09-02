package ph.cpi.rest.api.service;

import java.sql.SQLException;

import ph.cpi.rest.api.model.request.RetrieveMtnModulesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTransactionsRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnModulesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTransactionsResponse;

public interface SecurityService {

	public RetrieveMtnModulesResponse retrieveMtnModules(RetrieveMtnModulesRequest rmmr) throws SQLException;
	public RetrieveMtnTransactionsResponse retrieveMtnTransactions(RetrieveMtnTransactionsRequest rmtr) throws SQLException;
	
}
