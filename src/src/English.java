package src;
//Wip
public class English extends Subject{

	public String translate(String animal){
        if (animal != null){
            animal = animal.toLowerCase();
        }else {
            animal = "";
        }

        switch (animal){
            case "pes":
                animal = "dog";
                break;
            case "potkan":
                animal = "rat";
                break;
            case "diviak":
                animal = "boar";
                break;
            case "medved":
                animal = "bear";
                break;
            case "krt":
                animal = "mole";
                break;
            case "vlk":
                animal = "wolf";
                break;
            case "duch":
                animal = "poltergeist";
                break;
            case "prizrak":
                animal = "chimera";
                break;
             default:
                 animal = "invalid";
                 break;
        }

        return animal;
    }

}
