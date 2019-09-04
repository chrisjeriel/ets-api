package ph.cpi.rest.api.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.RetrieveMtnUserAccessRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnUserAmountLimitRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnUserGroupAccessRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnUserGroupRequest;
import ph.cpi.rest.api.model.request.RetrieveMtnUsersRequest;
import ph.cpi.rest.api.model.request.SaveApprovalRequest;
import ph.cpi.rest.api.model.request.SaveMtnUserRequest;
import ph.cpi.rest.api.model.request.SaveMtnUserResponse;
import ph.cpi.rest.api.model.request.UserLoginRequest;
import ph.cpi.rest.api.model.response.RetrieveMtnUserAccessResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnUserAmountLimitResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnUserGroupAccessResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnUserGroupResponse;
import ph.cpi.rest.api.model.response.RetrieveMtnUsersResponse;
import ph.cpi.rest.api.model.response.SaveApprovalResponse;
import ph.cpi.rest.api.model.response.UserAuthenticateResponse;
import ph.cpi.rest.api.model.response.UserLoginResponse;
import ph.cpi.rest.api.service.UserService;

@Controller
@CrossOrigin(origins = {"http://192.10.10.210:4200", "http://127.0.0.1:4200", "http://localhost:4200", "http://192.168.99.202:4200", "http://192.168.99.163:4200", 
						"http://192.168.99.202:8888", "http://192.168.99.202:8080", "http://192.10.10.230:4200", "http://192.10.10.230:8888", "http://192.10.10.149:4200", 
						"http://192.10.10.149:8888", "http://192.168.99.200:4200", "http://192.168.99.200:8888",
						"http://192.168.99.201:8888", "http://192.168.99.201:4200", "http://192.168.99.202:8888", "http://192.168.99.202:4200"})
@RequestMapping(path="/user-service")
public class UserController {
	
	
	@Autowired 
	private UserService userService;
	 
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	
	@GetMapping(path="userLogin")
	public @ResponseBody UserLoginResponse userLogin(UserLoginRequest ulr) throws SQLException {
		logger.info("GET: /api/user-service/userLogin");
		logger.info("UserLoginRequest : " + ulr.toString());
		
		UserLoginResponse ulResponse = userService.userLogin(ulr);
		ulResponse.setUserId(ulr.getUserId());	
		
		return ulResponse;
	}
	
	@GetMapping(path="userAuthenticate")
	public @ResponseBody UserAuthenticateResponse userAuthenticate(UserLoginRequest ulr) throws SQLException {
		logger.info("GET: /api/user-service/userAuthenticate");
		logger.info("UserLoginRequest : " + ulr.toString());
		
		UserAuthenticateResponse uaResponse = userService.userAuthenticate(ulr);
		if (uaResponse.getUser() == null) {
			uaResponse.setReturnCode(400);
		}

		return uaResponse;
	}
	
	@GetMapping(path="retMtnUsers")
	public @ResponseBody RetrieveMtnUsersResponse retMtnUsers(RetrieveMtnUsersRequest rmur) throws SQLException {
		logger.info("GET: /api/user-service/retMtnUsers");
		logger.info("RetrieveMtnUsersRequest : " + rmur.toString());
		
		return userService.retMtnUsers(rmur);
	}
	
	@GetMapping(path="retrieveMtnUserAccess")
	public @ResponseBody RetrieveMtnUserAccessResponse retrieveMtnUserAccess(RetrieveMtnUserAccessRequest rmuar) throws SQLException {
		logger.info("GET: /api/user-service/retrieveMtnUserAccess");
		logger.info("RetrieveMtnUserAccessRequest : " + rmuar.toString());
		
		return userService.retrieveMtnUserAccess(rmuar);
	}
	
	@GetMapping(path="retrieveMtnUserGroup")
	public @ResponseBody RetrieveMtnUserGroupResponse retrieveMtnUserGroup(RetrieveMtnUserGroupRequest rmugr) throws SQLException {
		logger.info("GET: /api/user-service/retrieveMtnUserGroup");
		logger.info("RetrieveMtnUserGroupRequest : " + rmugr.toString());
		
		return userService.retrieveMtnUserGroup(rmugr);
	}
	
	@GetMapping(path="retrieveMtnUserAmountLimit")
	public @ResponseBody RetrieveMtnUserAmountLimitResponse retrieveMtnUserAmountLimit(RetrieveMtnUserAmountLimitRequest rmualr) throws SQLException {
		logger.info("GET: /api/user-service/retrieveMtnUserAmountLimit");
		logger.info("RetrieveMtnUserAmountLimitRequest : " + rmualr.toString());
		
		return userService.retrieveMtnUserAmountLimit(rmualr);
	}
	
	@GetMapping(path="retrieveMtnUserGroupAccess")
	public @ResponseBody RetrieveMtnUserGroupAccessResponse retrieveMtnUserGroupAccess(RetrieveMtnUserGroupAccessRequest rmugar) throws SQLException {
		logger.info("GET: /api/user-service/retrieveMtnUserGroupAccess");
		logger.info("RetrieveMtnUserGroupAccessRequest : " + rmugar.toString());
		
		return userService.retrieveMtnUserGroupAccess(rmugar);
	}
	
	@PostMapping(path="saveMtnUser")
	public @ResponseBody SaveMtnUserResponse saveMtnUser(@RequestBody SaveMtnUserRequest smur) throws SQLException {
		logger.info("POST: /api/user-service/saveMtnUser");
		logger.info("SaveMtnUserRequest : " + smur.toString());
		return userService.saveMtnUser(smur);
	}
	
	@PostMapping(path="saveApproval")
	public @ResponseBody SaveApprovalResponse saveApproval(@RequestBody SaveApprovalRequest sar) throws SQLException {
		logger.info("POST: /api/user-service/saveApproval");
		logger.info("SaveApprovalRequest : " + sar.toString());
		return userService.saveApproval(sar);
	}
}