package firstTest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import firstTest.dto.AgencyCompany;
import firstTest.service.AgencyCompanyService;

@Controller
public class AgencyCompanyController {
	
	@Autowired
	private AgencyCompanyService agencyCompanyService;

	@RequestMapping(value="/getAgencyCompany")
	@ResponseBody
	public AgencyCompany getAgencyCompany(@RequestBody AgencyCompany agCompany) {
		
		int i = 1;
		System.out.println(agCompany);
		AgencyCompany agencyCompany= agencyCompanyService.selectByPrimaryKey(agCompany.getAgencyid());
		
		return agencyCompany;
		
	}
	
	
}
