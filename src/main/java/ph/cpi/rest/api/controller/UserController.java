package ph.cpi.rest.api.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ph.cpi.rest.api.model.request.UserLoginRequest;
import ph.cpi.rest.api.model.response.UserLoginResponse;
import ph.cpi.rest.api.service.UserService;

@Controller
@CrossOrigin(origins = {"http://127.0.0.1:4200", "http://localhost:4200"})
@RequestMapping(path="/user-service")
public class UserController {
	
	
	@Autowired 
	private UserService userService;
	 
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	
	@GetMapping(path="userLogin")
	public @ResponseBody UserLoginResponse userLogin(UserLoginRequest ulr) throws SQLException {
		logger.info("GET: /api/user-service/userLogin");
		logger.info("RetrieveQuoteListingRequest : " + ulr.toString());
		
		UserLoginResponse ulResponse = userService.userLogin(ulr);
		ulResponse.setUserId(ulr.getUserId());	
		
		return ulResponse;
	}
	
	
}