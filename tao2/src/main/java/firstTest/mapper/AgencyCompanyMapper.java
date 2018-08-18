package firstTest.mapper;


import java.util.List;
//import org.apache.ibatis.annotations.Param;

import firstTest.dto.AgencyCompany;

public interface AgencyCompanyMapper {
    

    int deleteByPrimaryKey(Integer agencyid);

    int insert(AgencyCompany record);

    int insertSelective(AgencyCompany record);

    AgencyCompany selectByPrimaryKey(int agencyid);

    int updateByPrimaryKeySelective(AgencyCompany record);

    int updateByPrimaryKey(AgencyCompany record);
}