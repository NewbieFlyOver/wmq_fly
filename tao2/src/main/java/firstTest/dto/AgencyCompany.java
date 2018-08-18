package firstTest.dto;

public class AgencyCompany {
    private Integer agencyid;

    private String agencyname;

    public Integer getAgencyid() {
        return agencyid;
    }

    public void setAgencyid(Integer agencyid) {
        this.agencyid = agencyid;
    }

    public String getAgencyname() {
        return agencyname;
    }

    public void setAgencyname(String agencyname) {
        this.agencyname = agencyname == null ? null : agencyname.trim();
    }

	@Override
	public String toString() {
		return "AgencyCompany [agencyid=" + agencyid + ", agencyname=" + agencyname + "]";
	}
    
    
}