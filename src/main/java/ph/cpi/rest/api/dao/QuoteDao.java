package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.Alop;
import ph.cpi.rest.api.model.quote.Endorsements;
import ph.cpi.rest.api.model.quote.EndorsementsOc;
import ph.cpi.rest.api.model.quote.Project;
import ph.cpi.rest.api.model.quote.QuotationGeneralInfo;

public interface QuoteDao {
	
	
	public Alop retrieveQuoteAlop(final HashMap<String, Object> params) throws SQLException;
	public List<Alop> retrieveQuoteAlopList(final HashMap<String, Object> params) throws SQLException;
	public QuotationGeneralInfo retrieveQuoteGeneralInfo(final HashMap<String, Object> params) throws SQLException;
	public List<Endorsements> retrieveQuoteEndorsements(final HashMap<String, Object> params) throws SQLException;
	public EndorsementsOc retrieveQuoteEndorsementsOc(final HashMap<String, Object> params) throws SQLException;
	public Project retrieveQuoteProject(final HashMap<String, Object> params) throws SQLException;
}
