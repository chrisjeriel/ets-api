package ph.cpi.rest.api.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import org.hibernate.HibernateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import ph.cpi.rest.api.dao.UserDao;
import ph.cpi.rest.api.model.request.RetrieveMtnUserAccessRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnUserAmountLimitRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnUserGroupAccessRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnUserGroupRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnUsersRequest;
import ph.cpi.rest.api.model.request.SaveApprovalRequest;
import ph.cpi.rest.api.model.request.SaveMtnUserGrpRequest;
import ph.cpi.rest.api.model.request.SaveMtnUserRequest;
import ph.cpi.rest.api.model.request.SaveMtnUserResponse;
import ph.cpi.rest.api.model.request.UserLoginRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnUserAccessResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnUserAmountLimitResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnUserGroupAccessResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnUserGroupResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnUsersResponse;
import ph.cpi.rest.api.model.response.SaveApprovalResponse;
import ph.cpi.rest.api.model.response.SaveMtnUserGrpResponse;
import ph.cpi.rest.api.model.response.UserAuthenticateResponse;
import ph.cpi.rest.api.model.response.UserLoginResponse;
import ph.cpi.rest.api.service.UserService;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public UserLoginResponse userLogin(UserLoginRequest ulr) throws SQLException {
		UserLoginResponse ulResponse = new UserLoginResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("userId", ulr.getUserId());
		params.put("password", ulr.getPassword());
		
		ulResponse.setModulesList(userDao.userLogin(params));
		
		return ulResponse;
	}
	
	@Override
	public RetrieveMtnUsersResponse retMtnUsers(RetrieveMtnUsersRequest rmur) throws SQLException{
		RetrieveMtnUsersResponse uResponse = new RetrieveMtnUsersResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
	
		params.put("userId", rmur.getUserId());
		params.put("userGrp", rmur.getUserGrp());
		params.put("activeTag", rmur.getActiveTag());
		params.put("position", rmur.getPaginationRequest().getPosition());
		params.put("count", rmur.getPaginationRequest().getCount());
		params.put("sortKey", rmur.getSortRequest().getSortKey());
		params.put("order", rmur.getSortRequest().getOrder());
		
		uResponse.setUsersList(userDao.retMtnUsers(params));
		
		uResponse.getPaginationResponse().setPosition(rmur.getPaginationRequest().getPosition());
		uResponse.getPaginationResponse().setCount(rmur.getPaginationRequest().getCount());
		uResponse.getSortResponse().setSortKey(rmur.getSortRequest().getSortKey());
		uResponse.getSortResponse().setOrder(rmur.getSortRequest().getOrder());
		return uResponse;
	}

	@Override
	public RetrieveMtnUserAccessResponse retrieveMtnUserAccess(RetrieveMtnUserAccessRequest rmuar) throws SQLException {
		RetrieveMtnUserAccessResponse uaResponse = new RetrieveMtnUserAccessResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("userId", rmuar.getUserId());
		
		uaResponse.setUserAccessList(userDao.retrieveMtnUserAccess(params));
		return uaResponse;
	}

	@Override
	public RetrieveMtnUserGroupResponse retrieveMtnUserGroup(RetrieveMtnUserGroupRequest rmugr) throws SQLException {
		RetrieveMtnUserGroupResponse ugResponse = new RetrieveMtnUserGroupResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("userGrp", rmugr.getUserGrp());
	
		ugResponse.setUserGroups(userDao.retrieveMtnUserGroup(params));
		return ugResponse;
	}

	@Override
	public RetrieveMtnUserGroupAccessResponse retrieveMtnUserGroupAccess(RetrieveMtnUserGroupAccessRequest rmugar)
			throws SQLException {
		RetrieveMtnUserGroupAccessResponse ugaResponse = new RetrieveMtnUserGroupAccessResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("userGrp", rmugar.getUserGrp());
		
		ugaResponse.setUserGroups(userDao.retrieveMtnUserGroupAccess(params));
		
		return ugaResponse;
	}

	@Override
	public SaveApprovalResponse saveApproval(SaveApprovalRequest sar) throws SQLException {
		SaveApprovalResponse saResponse = new SaveApprovalResponse();
		HashMap<String, Object> saveApprovalParams = new HashMap<String, Object>();
		saveApprovalParams.put("approvalId",sar.getApprovalId());
		saveApprovalParams.put("referenceId",sar.getReferenceId());
		saveApprovalParams.put("module",sar.getModule());
		saveApprovalParams.put("moduleId",sar.getModuleId());
		saveApprovalParams.put("details",sar.getDetails());
		saveApprovalParams.put("assignedDate",sar.getAssignedDate());
		saveApprovalParams.put("assignedTo",sar.getAssignedTo());
		saveApprovalParams.put("assignedBy",sar.getAssignedBy());
		saveApprovalParams.put("approvalTag",sar.getApprovalTag());
		saveApprovalParams.put("createUser",sar.getCreateUser());
		saveApprovalParams.put("createDate",sar.getCreateDate());
		saveApprovalParams.put("updateUser",sar.getUpdateUser());
		saveApprovalParams.put("updateDate",sar.getUpdateDate());
		
		saResponse.setReturnCode(userDao.saveApproval(saveApprovalParams));
		return saResponse;
	}

	@Override
	public UserAuthenticateResponse userAuthenticate(UserLoginRequest ulr) throws SQLException {
		UserAuthenticateResponse uaResponse = new UserAuthenticateResponse();
		HashMap<String, Object> params = new HashMap<String, Object>();
		
		params.put("userId", ulr.getUserId());
		params.put("password", ulr.getPassword());
		
		uaResponse.setUser(userDao.userAuthenticate(params));
		
		return uaResponse;
	}

	@Override
	public RetrieveMtnUserAmountLimitResponse retrieveMtnUserAmountLimit(RetrieveMtnUserAmountLimitRequest rmualr)
			throws SQLException {
		RetrieveMtnUserAmountLimitResponse rmualResponse = new RetrieveMtnUserAmountLimitResponse();
		HashMap<String, Object> userAmtLmtParams = new HashMap<String, Object>();
		userAmtLmtParams.put("userGrp", rmualr.getUserGrp());
		userAmtLmtParams.put("lineCd", rmualr.getLineCd());
		rmualResponse.setUserAmtLmtList(userDao.retrieveMtnUserAmountLimit(userAmtLmtParams));
		return rmualResponse;
	}

	@Override
	@ExceptionHandler(Exception.class)
	public SaveMtnUserResponse saveMtnUser(SaveMtnUserRequest smur) throws SQLException, org.springframework.dao.DataIntegrityViolationException {
		SaveMtnUserResponse smuResponse = new SaveMtnUserResponse();
		HashMap<String, Object> saveMtnUserParams = new HashMap<String, Object>();
		saveMtnUserParams.put("usersList", smur.getUsersList());
		String errorMsg = "Please check field values.";
		
		try {
			smuResponse.setReturnCode(userDao.saveMtnUser(saveMtnUserParams));
			if(smur.getUsersList().size() == 1 && smuResponse.getReturnCode() == -1){
				smuResponse.setPassword(smur.getUsersList().get(0).getPassword());
			}
		} catch (HibernateException e) {
			smuResponse.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUHE", "HibernateException Exception : " + errorMsg));
		} catch (org.springframework.dao.DataIntegrityViolationException e) {
			e.printStackTrace();
			smuResponse.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUDIV", "DataIntegrityViolation Exception : " + errorMsg));
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			smuResponse.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUSQL", "SQL Exception : " + errorMsg));
		} catch (Exception e) {
			e.printStackTrace();
			smuResponse.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGEN", "General Exception"));
		}
		
		return smuResponse;
	}

	@Override
	public SaveMtnUserGrpResponse saveMtnUserGrp(SaveMtnUserGrpRequest smur) throws SQLException {
		SaveMtnUserGrpResponse smugResponse = new SaveMtnUserGrpResponse();
		HashMap<String, Object> saveMtnUserGrpParams = new HashMap<String, Object>();
		saveMtnUserGrpParams.put("userGrpList", smur.getUserGrpList());
		saveMtnUserGrpParams.put("delUserGrpList", smur.getDelUserGrpList());
		String errorMsg = "Please check field values.";
		
		try {
			smugResponse.setReturnCode(userDao.saveMtnUserGrp(saveMtnUserGrpParams));
		} catch (HibernateException e) {
			smugResponse.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGHE", "HibernateException Exception : " + errorMsg));
		} catch (org.springframework.dao.DataIntegrityViolationException e) {
			smugResponse.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGDIV", "DataIntegrityViolation Exception : " + errorMsg));
		} catch (SQLException sqle) {
			smugResponse.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGSQL", "SQL Exception : " + errorMsg));
		} catch (Exception e) {
			smugResponse.getErrorList().add(new ph.cpi.rest.api.model.Error("SMUGGEN", "General Exception"));
		}
		
		
		return smugResponse;
	}

}
