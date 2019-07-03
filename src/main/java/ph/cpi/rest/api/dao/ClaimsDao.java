package ph.cpi.rest.api.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import ph.cpi.rest.api.model.claims.Attachment;
import ph.cpi.rest.api.model.claims.ClaimApprovedAmt;
import ph.cpi.rest.api.model.claims.ClaimReserve;
import ph.cpi.rest.api.model.claims.Claims;

public interface ClaimsDao {
	
	public List<ClaimReserve> retrieveClaimHistory(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveClaimHistory(final HashMap<String, Object> params) throws SQLException;
	public List<Claims> retrieveClaimListing(final HashMap<String, Object> params) throws SQLException;
	public Claims retrieveClmGenInfo(final HashMap<String, Object> params) throws SQLException;
	public Claims retrieveClaimSecCover(final HashMap<String, Object> params)throws SQLException;
	public HashMap<String, Object> saveClaimSecCover(final HashMap<String, Object> params ) throws SQLException;
	public List<Claims> retrieveChangeClmStatus(final HashMap<String, Object> params) throws SQLException;
	public List<ClaimApprovedAmt> retrieveClaimApprovedAmt(final HashMap<String, Object> params ) throws SQLException;
	public Integer saveClaimApprovedAmt(final HashMap<String, Object> params) throws SQLException;
	public List<Claims> retrieveClaimReserve(final HashMap<String, Object> params ) throws SQLException;
	public List<Attachment> retrieveClaimsAttachmentList(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object>saveClaimsAttachment (final HashMap<String, Object> params ) throws SQLException;
	public Integer updateClaimStatus(final HashMap<String, Object> params) throws SQLException;
	public Integer saveClmAdjuster(final HashMap<String, Object> params) throws SQLException;
	public HashMap<String, Object> saveClmGenInfo (final HashMap<String, Object> params ) throws SQLException;
	public HashMap<String, Object> saveClaimResStat(final HashMap<String, Object> params) throws SQLException;
	public Integer updateClmDetails(final HashMap<String, Object> params) throws SQLException;

}
