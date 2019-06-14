package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.claims.ClaimHistory;
import ph.cpi.rest.api.model.claims.Claims;

public interface ClaimsDao {
	public List<ClaimHistory> retrieveClaimHistory(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveClaimHistory(final HashMap<String, Object> params) throws SQLException;
	public List<Claims> retrieveClaimListing(final HashMap<String, Object> params) throws SQLException;
}
