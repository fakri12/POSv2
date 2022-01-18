package metier.entities;

public class Client {
	private Long id;
	private String f_name;
	private String l_name;
	private String mail;
	private String city;
	private String adress;
	private String passowrd;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", f_name=" + f_name + ", l_name=" + l_name + ", mail=" + mail + ", city=" + city
				+ ", adress=" + adress + ", passowrd=" + passowrd + "]";
	}
	
	
	
}

