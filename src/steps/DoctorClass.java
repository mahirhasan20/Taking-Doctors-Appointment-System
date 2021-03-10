package steps;

public class DoctorClass {
	private String name,timing,specialist,mbbs_status,mbbs_from, mbbs_country, mbbs_year,fcps_status,fcps_from,
			fcps_country, fcps_year;

	public DoctorClass(String name, String timing, String specialist, String mbbs_status, String mbbs_from,
			String mbbs_country, String mbbs_year, String fcps_status, String fcps_from, String fcps_country,
			String fcps_year) {
		this.name = name;
		this.timing = timing;
		this.specialist = specialist;
		this.mbbs_status = mbbs_status;
		this.mbbs_from = mbbs_from;
		this.mbbs_country = mbbs_country;
		this.mbbs_year = mbbs_year;
		this.fcps_status = fcps_status;
		this.fcps_from = fcps_from;
		this.fcps_country = fcps_country;
		this.fcps_year = fcps_year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getMbbs_status() {
		return mbbs_status;
	}

	public void setMbbs_status(String mbbs_status) {
		this.mbbs_status = mbbs_status;
	}

	public String getMbbs_from() {
		return mbbs_from;
	}

	public void setMbbs_from(String mbbs_from) {
		this.mbbs_from = mbbs_from;
	}

	public String getMbbs_country() {
		return mbbs_country;
	}

	public void setMbbs_country(String mbbs_country) {
		this.mbbs_country = mbbs_country;
	}

	public String getMbbs_year() {
		return mbbs_year;
	}

	public void setMbbs_year(String mbbs_year) {
		this.mbbs_year = mbbs_year;
	}

	public String getFcps_status() {
		return fcps_status;
	}

	public void setFcps_status(String fcps_status) {
		this.fcps_status = fcps_status;
	}

	public String getFcps_from() {
		return fcps_from;
	}

	public void setFcps_from(String fcps_from) {
		this.fcps_from = fcps_from;
	}

	public String getFcps_country() {
		return fcps_country;
	}

	public void setFcps_country(String fcps_country) {
		this.fcps_country = fcps_country;
	}

	public String getFcps_year() {
		return fcps_year;
	}

	public void setFcps_year(String fcps_year) {
		this.fcps_year = fcps_year;
	}

	@Override
	public String toString() {
		return "DoctorClass [name=" + name + ", timing=" + timing + ", specialist=" + specialist + ", mbbs_status="
				+ mbbs_status + ", mbbs_from=" + mbbs_from + ", mbbs_country=" + mbbs_country + ", mbbs_year="
				+ mbbs_year + ", fcps_status=" + fcps_status + ", fcps_from=" + fcps_from + ", fcps_country="
				+ fcps_country + ", fcps_year=" + fcps_year + "]";
	}
	
	

	
}
