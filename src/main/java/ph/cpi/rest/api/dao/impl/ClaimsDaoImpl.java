package ph.cpi.rest.api.dao.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ph.cpi.rest.api.dao.ClaimsDao;
import ph.cpi.rest.api.model.claims.Attachment;
import ph.cpi.rest.api.model.claims.CheckHist;
import ph.cpi.rest.api.model.claims.ClaimApprovedAmt;
import ph.cpi.rest.api.model.claims.ClaimDist;
import ph.cpi.rest.api.model.claims.ClaimDistCeding;
import ph.cpi.rest.api.model.claims.ClaimPaytRequest;
import ph.cpi.rest.api.model.claims.ClaimReserve;
import ph.cpi.rest.api.model.claims.ClaimReserveDist;
import ph.cpi.rest.api.model.claims.ClaimReserveDistPool;
import ph.cpi.rest.api.model.claims.Claims;

@Component
public class ClaimsDaoImpl implements ClaimsDao {
	
	@Autowired
	private SqlSession sqlSession;

	private static final Logger logger = LoggerFactory.getLogger(ClaimsDaoImpl.class);

//	@Override
//	public List<ClaimHistory> retrieveClaimHistory(HashMap<String, Object> params) throws SQLException {
//		List<ClaimHistory> clmHistory = sqlSession.selectList("retrieveClaimHistory", params);
//		return clmHistory;
//	}
	
	@Override
	public List<ClaimReserve> retrieveClaimHistory(HashMap<String, Object> params) throws SQLException {
		List<ClaimReserve> clmHistoryList = sqlSession.selectList("retrieveClaimHistory", params);
		return clmHistoryList;
	}

	@Override
	public Integer saveClaimHistory(HashMap<String, Object> params) throws SQLException {
		Integer saveClaimHistory = sqlSession.update("saveClaimHistory",params);
		return saveClaimHistory;
	}

	public List<Claims> retrieveClaimListing(HashMap<String, Object> params) throws SQLException {
		List<Claims> res = sqlSession.selectList("retrieveClaimListing", params);
		return res;
	}

	@Override
	public Claims retrieveClmGenInfo(HashMap<String, Object> params) throws SQLException {
		Claims claim = sqlSession.selectOne("retrieveClmGenInfo", params);
		return claim;
	}
	
	@Override
	public Claims retrieveClaimSecCover(HashMap<String, Object> params) throws SQLException {
		Claims claims = sqlSession.selectOne("retrieveClaimSecCover",params);
		return claims;
	}

	@Override
	public HashMap<String, Object> saveClaimSecCover(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveClaimSecCover",params);
		params.put("errorCode", errorCode);
		return params;
	}


	@Override
	public HashMap<String, Object> saveClaimsAttachment(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		Integer errorCode = sqlSession.update("saveClaimsAttachment",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public List<Attachment> retrieveClaimsAttachmentList(HashMap<String, Object> params) throws SQLException {
		// TODO Auto-generated method stub
		List<Attachment> claimsAttachmentList = sqlSession.selectList("retrieveClaimsAttachment", params);
		return claimsAttachmentList;
	}

	@Override
	public List<ClaimApprovedAmt> retrieveClaimApprovedAmt(HashMap<String, Object> params) throws SQLException {
		List<ClaimApprovedAmt> clmApprovedAmt = sqlSession.selectList("retrieveClaimApprovedAmt", params);
		return clmApprovedAmt;
	}

	@Override
	public Integer saveClaimApprovedAmt(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveClaimApprovedAmt",params);
		return errorCode;
	}

	@Override
	public List<Claims> retrieveChangeClmStatus(HashMap<String, Object> params) throws SQLException {
		List<Claims> res = sqlSession.selectList("retrieveChangeClmStatus", params);
		return res;
	}

	@Override
	public List<Claims> retrieveClaimReserve(HashMap<String, Object> params) throws SQLException {
		List<Claims> clmReserve = sqlSession.selectList("retrieveClaimReserve", params);
		return clmReserve;
	}

	@Override
	public Integer updateClaimStatus(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("updateClaimStatus",params);
		return res;
	}

	@Override
	public Integer saveClmAdjuster(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("saveClmAdjuster",params);
		return res;
	}

	@Override
	public HashMap<String, Object> saveClmGenInfo(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveClmGenInfo", params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveClaimResStat(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveClaimResStat",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer updateClmDetails(HashMap<String, Object> params) throws SQLException {
		Integer res = sqlSession.update("updateClmDetails",params);
		return res;
	}

	@Override
	public List<ClaimPaytRequest> retrieveClmPaytReq(HashMap<String, Object> params) throws SQLException {
		List<ClaimPaytRequest> list = sqlSession.selectList("retrieveClmPaytReq", params);
		return list;
	}
	

	@Transactional(rollbackFor=Exception.class)
	@Override
	public HashMap<String, Object> saveClaimReserve(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveClaimReserve",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public HashMap<String, Object> saveClaimPaytReq(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("saveClaimPaytReq",params);
		params.put("errorCode", errorCode);
		return params;
	}

	@Override
	public Integer checkReserve(HashMap<String, Object> params) throws SQLException {
		params.put("checkResult", "");
		sqlSession.selectOne("checkReserve", params);
		Integer res = (Integer) params.get("checkResult");
		return res;
	}

	@Override
	public List<ClaimDist> retrieveClmDist(HashMap<String, Object> params) throws SQLException {
		List<ClaimDist> list = sqlSession.selectList("retrieveClmDist", params);
		return list;
	}

	@Override
	public List<ClaimDistCeding> retrieveClmDistPool(HashMap<String, Object> params) throws SQLException {
		List<ClaimDistCeding> list = sqlSession.selectList("retrieveClmDistPool", params);
		return list;
	}

	@Override
	public Integer redistributeClaimDist(HashMap<String, Object> params) throws SQLException {
		Integer errorCode = sqlSession.update("redistributeClaimDist",params);
		return errorCode;
	}

	@Override
	public List<CheckHist> checkHist(Integer param) throws SQLException {
//		HashMap<String, Object> par = new HashMap<String, Object>();
//		par.put("claimId", param);
//		sqlSession.selectOne("chkPoldistStat", par);
//		return (Integer) par.get("checkRes");
		List<CheckHist> listCheckHist = sqlSession.selectList("checkHist", param);
		return listCheckHist;
	}

	@Override
	public Float chkAdjRate(float param) throws SQLException {
		HashMap<String, Object> par = new HashMap<String, Object>();
		par.put("claimId", param);
		par.put("chkAdjRate", "");
		sqlSession.selectOne("chkAdjRate", par);
		return (Float) par.get("chkAdjRate");
	}

	@Override
	public List<ClaimReserveDist> retrieveClmReserveDist(HashMap<String, Object> params) throws SQLException {
		List<ClaimReserveDist> list = sqlSession.selectList("retrieveClmReserveDist", params);
		return list;
	}

	@Override
	public List<ClaimReserveDistPool> retrieveClmReserveDistPool(HashMap<String, Object> params) throws SQLException {
		List<ClaimReserveDistPool> list = sqlSession.selectList("retrieveClmReserveDistPool", params);
		return list;
	}

	@Override
	public Integer redistributeClaimReserveDist(HashMap<String, Object> params) throws SQLException {
		Integer code = sqlSession.update("redistributeClaimReserveDist",params);
		return code;
	}
}
