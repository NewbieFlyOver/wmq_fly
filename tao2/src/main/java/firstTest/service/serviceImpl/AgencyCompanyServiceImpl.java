package firstTest.service.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import firstTest.dto.AgencyCompany;
import firstTest.mapper.AgencyCompanyMapper;
import firstTest.service.AgencyCompanyService;

@Service
public class AgencyCompanyServiceImpl implements AgencyCompanyService{
	
	@Autowired
	private AgencyCompanyMapper agencyCompanyMapper;
	
	
	
	 public AgencyCompany selectByPrimaryKey(int agencyid) {
		 
		 return agencyCompanyMapper.selectByPrimaryKey(agencyid);
	 }

}
