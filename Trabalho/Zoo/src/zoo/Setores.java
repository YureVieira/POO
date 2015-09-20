package zoo;
import java.util.*;
import static zoo.Background.quadroF;

public class Setores {
	//Setores
	static ArrayList<Mamifero> setorM = new ArrayList<Mamifero>();
	static ArrayList<Reptil> setorR = new ArrayList<Reptil>();
	static ArrayList<Ave> setorAv = new ArrayList<Ave>();
	static ArrayList<Anfibio> setorAn = new ArrayList<Anfibio>();
	static ArrayList<Invertebrado> setorI = new ArrayList<Invertebrado>();
        
        static ArrayList<Mamifero> duplicateM = new ArrayList<Mamifero>();
        static ArrayList<Reptil> duplicateR = new ArrayList<Reptil>();
        static ArrayList<Ave> duplicateAv = new ArrayList<Ave>();
        static ArrayList<Anfibio> duplicateAn = new ArrayList<Anfibio>();
        static ArrayList<Invertebrado> duplicateI = new ArrayList<Invertebrado>();
        
        public static void init(){
            /*==================================================================================================*/
            setorM.add(new Mamifero("Zeca","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Luna","leão",Animal.FEMEA,"carnivoro",14,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Luan","macaco",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zeca2","leão",Animal.MACHO,"carnivoro",4,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zeca3","leão",Animal.MACHO,"carnivoro",62,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zeca1","leão",Animal.MACHO,"carnivoro",16,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zeca4","leão",Animal.MACHO,"carnivoro",1,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zeca5","leão",Animal.MACHO,"carnivoro",22,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zeca6","leão",Animal.MACHO,"carnivoro",3,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zeca7","leão",Animal.MACHO,"carnivoro",5,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zeca8","leão",Animal.MACHO,"carnivoro",6,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zeca9","leão",Animal.MACHO,"carnivoro",7,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zeca0","leão",Animal.MACHO,"carnivoro",8,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecaq","leão",Animal.MACHO,"carnivoro",9,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecaw","leão",Animal.MACHO,"carnivoro",5,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecae","leão",Animal.MACHO,"carnivoro",42,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecar","leão",Animal.MACHO,"carnivoro",32,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecat","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecay","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecau","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecai","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecao","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecap","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecaa","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecas","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecad","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecaf","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecag","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecah","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorM.add(new Mamifero("Zecaj","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            /*==================================================================================================*/
            setorAv.add(new Ave("Pituco","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Luna","leão",Animal.FEMEA,"carnivoro",14,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Luan","macaco",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zeca2","leão",Animal.MACHO,"carnivoro",4,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zeca3","leão",Animal.MACHO,"carnivoro",62,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zeca1","leão",Animal.MACHO,"carnivoro",16,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zeca4","leão",Animal.MACHO,"carnivoro",1,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zeca5","leão",Animal.MACHO,"carnivoro",22,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zeca6","leão",Animal.MACHO,"carnivoro",3,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zeca7","leão",Animal.MACHO,"carnivoro",5,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zeca8","leão",Animal.MACHO,"carnivoro",6,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zeca9","leão",Animal.MACHO,"carnivoro",7,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zeca0","leão",Animal.MACHO,"carnivoro",8,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecaq","leão",Animal.MACHO,"carnivoro",9,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecaw","leão",Animal.MACHO,"carnivoro",5,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecae","leão",Animal.MACHO,"carnivoro",42,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecar","leão",Animal.MACHO,"carnivoro",32,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecat","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecay","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecau","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecai","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecao","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecap","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecaa","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecas","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecad","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecaf","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecag","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecah","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAv.add(new Ave("Zecaj","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            /*==================================================================================================*/
            setorR.add(new Reptil("Lagartão","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Luna","leão",Animal.FEMEA,"carnivoro",14,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Luan","macaco",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zeca2","leão",Animal.MACHO,"carnivoro",4,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zeca3","leão",Animal.MACHO,"carnivoro",62,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zeca1","leão",Animal.MACHO,"carnivoro",16,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zeca4","leão",Animal.MACHO,"carnivoro",1,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zeca5","leão",Animal.MACHO,"carnivoro",22,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zeca6","leão",Animal.MACHO,"carnivoro",3,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zeca7","leão",Animal.MACHO,"carnivoro",5,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zeca8","leão",Animal.MACHO,"carnivoro",6,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zeca9","leão",Animal.MACHO,"carnivoro",7,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zeca0","leão",Animal.MACHO,"carnivoro",8,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecaq","leão",Animal.MACHO,"carnivoro",9,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecaw","leão",Animal.MACHO,"carnivoro",5,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecae","leão",Animal.MACHO,"carnivoro",42,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecar","leão",Animal.MACHO,"carnivoro",32,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecat","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecay","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecau","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecai","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecao","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecap","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecaa","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecas","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecad","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecaf","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecag","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecah","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorR.add(new Reptil("Zecaj","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            /*==================================================================================================*/
            setorAn.add(new Anfibio("Pererequinha","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Luna","leão",Animal.FEMEA,"carnivoro",14,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Luan","macaco",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zeca2","leão",Animal.MACHO,"carnivoro",4,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zeca3","leão",Animal.MACHO,"carnivoro",62,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zeca1","leão",Animal.MACHO,"carnivoro",16,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zeca4","leão",Animal.MACHO,"carnivoro",1,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zeca5","leão",Animal.MACHO,"carnivoro",22,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zeca6","leão",Animal.MACHO,"carnivoro",3,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zeca7","leão",Animal.MACHO,"carnivoro",5,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zeca8","leão",Animal.MACHO,"carnivoro",6,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zeca9","leão",Animal.MACHO,"carnivoro",7,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zeca0","leão",Animal.MACHO,"carnivoro",8,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecaq","leão",Animal.MACHO,"carnivoro",9,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecaw","leão",Animal.MACHO,"carnivoro",5,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecae","leão",Animal.MACHO,"carnivoro",42,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecar","leão",Animal.MACHO,"carnivoro",32,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecat","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecay","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecau","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecai","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecao","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecap","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecaa","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecas","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecad","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecaf","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecag","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecah","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorAn.add(new Anfibio("Zecaj","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            /*==================================================================================================*/
            setorI.add(new Invertebrado("Arr","Aranha",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Luna","leão",Animal.FEMEA,"carnivoro",14,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Luan","macaco",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zeca2","leão",Animal.MACHO,"carnivoro",4,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zeca3","leão",Animal.MACHO,"carnivoro",62,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zeca1","leão",Animal.MACHO,"carnivoro",16,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zeca4","leão",Animal.MACHO,"carnivoro",1,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zeca5","leão",Animal.MACHO,"carnivoro",22,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zeca6","leão",Animal.MACHO,"carnivoro",3,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zeca7","leão",Animal.MACHO,"carnivoro",5,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zeca8","leão",Animal.MACHO,"carnivoro",6,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zeca9","leão",Animal.MACHO,"carnivoro",7,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zeca0","leão",Animal.MACHO,"carnivoro",8,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecaq","leão",Animal.MACHO,"carnivoro",9,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecaw","leão",Animal.MACHO,"carnivoro",5,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecae","leão",Animal.MACHO,"carnivoro",42,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecar","leão",Animal.MACHO,"carnivoro",32,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecat","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecay","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecau","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecai","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecao","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecap","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecaa","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecas","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecad","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecaf","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecag","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecah","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            setorI.add(new Invertebrado("Zecaj","leão",Animal.MACHO,"carnivoro",12,"Leão é um animal carnivoro"));
            /*==================================================================================================*/

        }
        public static Animal busca_Animal(String nome,String tipo) 
        throws noFoundAnimalException, moreThanOneAnimalException {/*Exceçoes que podem ser lançadas*/
            int count=0;
            if(tipo.equals("Mamifero") || tipo.equals("Mamiferos")){
            for(Mamifero s : Setores.setorM) { 
                if(s.getNome().equals(nome)){
                    count++;
                    duplicateM.add(s);
                }
                }
            if(count == 1)return duplicateM.get(0);
            }
            if(tipo.equals("Ave") || tipo.equals("Aves")){
            for(Ave s : Setores.setorAv) { 
                if(s.getNome().equals(nome)){
                    count++;
                    duplicateAv.add(s);
                }
                }
            if(count == 1)return duplicateAv.get(0);
            }
            if(tipo.equals("Reptil") || tipo.equals("Repteis")){
            for(Reptil s : Setores.setorR) { 
                if(s.getNome().equals(nome)){
                    count++;
                    duplicateR.add(s);
                }
                }
            if(count == 1)return duplicateR.get(0);
            }
            if(tipo.equals("Anfibio") || tipo.equals("Anfibios")){
            for(Anfibio s : Setores.setorAn) { 
                if(s.getNome().equals(nome)){
                    count++;
                    duplicateAn.add(s);
                }
                } 
            if(count == 1)return duplicateAn.get(0);
            }
            if(tipo.equals("Invertebrado") || tipo.equals("Invertebrados")){
            for(Invertebrado s : Setores.setorI) { 
            if(s.getNome().equals(nome)){
                count++;
                duplicateI.add(s);
            } 
            }
            if(count == 1)return duplicateI.get(0);
            }
        if(count <= 0){
            //Exceção para animal inexistente
         throw new noFoundAnimalException("Este animal não existe");  
        }
        if(count > 1){
            //Exceção para animais de mesmo Nome
            throw new moreThanOneAnimalException("Este Animal esta duplicado");
        }
        return null;
	}

    public static ArrayList<Mamifero> getSetorM() {
        return setorM;
    }

    public static ArrayList<Reptil> getSetorR() {
        return setorR;
    }

    public static ArrayList<Ave> getSetorAv() {
        return setorAv;
    }

    public static ArrayList<Anfibio> getSetorAn() {
        return setorAn;
    }

    public static ArrayList<Invertebrado> getSetorI() {
        return setorI;
    }

    public static ArrayList<Mamifero> getDuplicateM() {
        return duplicateM;
    }

    public static ArrayList<Reptil> getDuplicateR() {
        return duplicateR;
    }

    public static ArrayList<Ave> getDuplicateAv() {
        return duplicateAv;
    }

    public static ArrayList<Anfibio> getDuplicateAn() {
        return duplicateAn;
    }

    public static ArrayList<Invertebrado> getDuplicateI() {
        return duplicateI;
    }

    public static void setSetorM(ArrayList<Mamifero> setorM) {
        Setores.setorM = setorM;
    }

    public static void setSetorR(ArrayList<Reptil> setorR) {
        Setores.setorR = setorR;
    }

    public static void setSetorAv(ArrayList<Ave> setorAv) {
        Setores.setorAv = setorAv;
    }

    public static void setSetorAn(ArrayList<Anfibio> setorAn) {
        Setores.setorAn = setorAn;
    }

    public static void setSetorI(ArrayList<Invertebrado> setorI) {
        Setores.setorI = setorI;
    }

    public static void setDuplicateM(ArrayList<Mamifero> duplicateM) {
        Setores.duplicateM = duplicateM;
    }

    public static void setDuplicateR(ArrayList<Reptil> duplicateR) {
        Setores.duplicateR = duplicateR;
    }

    public static void setDuplicateAv(ArrayList<Ave> duplicateAv) {
        Setores.duplicateAv = duplicateAv;
    }

    public static void setDuplicateAn(ArrayList<Anfibio> duplicateAn) {
        Setores.duplicateAn = duplicateAn;
    }

    public static void setDuplicateI(ArrayList<Invertebrado> duplicateI) {
        Setores.duplicateI = duplicateI;
    }
    
    
}
