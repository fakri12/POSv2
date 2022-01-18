package metier.entities;

import java.util.ArrayList;

public interface Methods<T> {
   void ajouter(T t);
   T supprimer(int id);
   ArrayList<T> rechercher(String motcle);
   T update(int id,T t);
   ArrayList<T> getlist();
   }
