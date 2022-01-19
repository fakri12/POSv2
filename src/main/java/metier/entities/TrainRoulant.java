package metier.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class TrainRoulant extends Composant {
	private List<ComponentTrainRoulant> trainRoulants = new ArrayList<ComponentTrainRoulant>();
}
