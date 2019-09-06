package ph.cpi.rest.api.service;

import java.sql.SQLException;

import ph.cpi.rest.api.model.request.RetrieveModulesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnModulesRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnTransactionsRequest;
import ph.cpi.rest.api.model.request.RetrieveTransactionsRequest;
import ph.cpi.rest.api.model.request.SaveModulesRequest;
import ph.cpi.rest.api.model.request.SaveTransactionsRequest;
import ph.cpi.rest.api.model.response.RetrieveModulesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnModulesResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnTransactionsResponse;
import ph.cpi.rest.api.model.response.RetrieveTransactionsResponse;
import ph.cpi.rest.api.model.response.SaveModulesResponse;
import ph.cpi.rest.api.model.response.SaveTransactionsResponse;

public interface SecurityService {

	public RetrieveMtnModulesResponse retrieveMtnModules(RetrieveMtnModulesRequest rmmr) throws SQLException;
	public RetrieveMtnTransactionsResponse retrieveMtnTransactions(RetrieveMtnTransactionsRequest rmtr) throws SQLException;
	public RetrieveTransactionsResponse retrieveTransactions(RetrieveTransactionsRequest rmtr) throws SQLException;
	public RetrieveModulesResponse retrieveModules(RetrieveModulesRequest rmr) throws SQLException;
	
	public SaveTransactionsResponse saveTransactions(SaveTransactionsRequest str) throws SQLException;
	public SaveModulesResponse saveModules(SaveModulesRequest str) throws SQLException;
	
}
