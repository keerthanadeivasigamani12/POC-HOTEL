import java.sql.Date;

public class Memberbooking {
    private String uname,Roomnumber,Noofmemberstostay, Stayfrom,Stayto;
    

    
	public Memberbooking() {
		super();
	}

	public Memberbooking(String uname, String roomnumber, String noofmemberstostay,  String stayfrom, String stayto) {
		super();
		this.uname = uname;
		Roomnumber = roomnumber;
		Noofmemberstostay = noofmemberstostay;
		Stayfrom = stayfrom;
		Stayto = stayto;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getRoomnumber() {
		return Roomnumber;
	}

	public void setRoomnumber(String roomnumber) {
		Roomnumber = roomnumber;
	}

	public String getNoofmemberstostay() {
		return Noofmemberstostay;
	}

	public void setNoofmemberstostay(String noofmemberstostay) {
		Noofmemberstostay = noofmemberstostay;
	}

	public String getStayfrom() {
		return Stayfrom;
	}

	public void setStayfrom(String stayfrom) {
		Stayfrom = stayfrom;
	}

	public String getStayto() {
		return Stayto;
	}

	public void setStayto(String stayto) {
		Stayto = stayto;
	}
}
