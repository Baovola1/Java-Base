package objet_classesEx1;

public class Horloge {
	 private int heures;
	 private int minutes;
	 private int secondes;
	 
	 
	 //Ex1.1=> Implémentations des accesseurs(get/set)
//	  public void setHeure (int heure) {
//		  this.heures = heure;
//	  }
//	  
//	  public int getHeure() {
//		  return heures;
//	  }
//	  
//	  public void setMinutes (int minute) {
//		  this.minutes = minute;
//	  }
//	  
//	  public int getMinutes() {
//		  return minutes;
//	  }
//	 
//	  public void setSecondes(int seconde) {
//		  this.secondes = seconde;
//	  }
//	  
//	  public int getSecondes() {
//		  return secondes;
//	  }
	 
	 //1-2 => Création constructor
	 
	 public Horloge(int heures, int minutes, int secondes) {
		this.setHeures(heures);
		this.setMinutes(minutes);
		this.setSecondes(secondes);
	 }
	 
	 private int valideHeures(int heures) {
		 
		 if(heures < 0 || heures > 59) {
			 return 0;
		 }
		 return heures;
	 }
	 
	 private int valideMinutes(int minutes) {
		 if (minutes < 0 || minutes > 59) {
	            return 0; 
	        }
	        return minutes;
	    }
	 
	 private int valideSecondes (int secondes) {
		 if (secondes < 0 || secondes > 59) {
	            return 0; 
	        }
	        return secondes;
	    }
		 
	 
	  
	  //1-1=> Setters avec des valeurs invalides
//	  public int getHeures() {
//		  return heures;
//	  }
//	  
//	  public void setHeure(int heure) {
//		  if(heures < 0 || heures >23) {
//			  this.heures = 0;
//		  }else {
//			  this.heures = heure;
//		  }
//	  }
//	  public int getMinutes() {
//		  return minutes;
//	  }
//	 
//	  public void setMinutes(int minute) {
//		  if(minutes < 0 || minutes > 59) {
//			  this.minutes = 0;
//		  }
//	  }
//	  
//	  public int getSecondes() {
//		  return secondes;
//	  }
//	  
//	  public void setSecondes(int seconde) {
//		  if(secondes < 0 || secondes > 59) {
//			  this.secondes = 0;
//		  }
//	  }

//Suite ex 1-2 et 1-3

	    public int getHeures() {
	        return heures;
	    }

	    public void setHeures(int heures) {
	        this.heures = valideHeures(heures);
	    }

	    public int getMinutes() {
	        return minutes;
	    }

	    public void setMinutes(int minutes) {
	        this.minutes = valideMinutes(minutes);
	    }

	    public int getSecondes() {
	        return secondes;
	    }

	    public void setSecondes(int secondes) {
	        this.secondes = valideSecondes(secondes);
	    }
	    
	    //Création de la fonction toString

	    @Override
	    public String toString() {
	        return heures + ":" + minutes + ":" + secondes;
	    }
	    
	    //Exercice 1.4=>Implémenter une fonction avanceUneSeconde() sans paramètres et qui ne renvoie rien, elle avance d’une seconde.

	    public void avanceUneSeconde() {
	    	if(secondes == 59) {
	    		secondes = 0;
	    		if(minutes == 59) {
	    			minutes = 0;
	    			if(heures == 23) {
	    				heures = 0;
	    			}else {
	    				heures++;
	    			}
	    		}else {
	    			minutes++;
	    		}
	    	}else {
	    		secondes++;
	    	}
	    }
	}


