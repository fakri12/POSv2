package metier.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class ComponentChauffage extends Composant {
	private List<Chauffage> chauffages = new ArrayList<Chauffage>();
}
