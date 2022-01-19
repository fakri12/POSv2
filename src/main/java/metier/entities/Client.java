package metier.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Client {
	private Long id;
	private String f_name;
	private String l_name;
	private String mail;
	private String city;
	private String adress;
	private String passowrd;
}

