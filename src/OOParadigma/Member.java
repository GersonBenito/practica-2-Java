package OOParadigma;

public class Member {
    private String name;
    private String type;
    private int level; // tener en cuenta el tipo de dato
    private int rank; // tener en cuenta el tipo de dato tambien

    // generando el constructor para la clase Member
    public Member(String name, String type, int level, int rank){
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }

    // vamos a definir los getters a qui en la funcion
    public String getName(){ // cual es tu nombre?
        return this.name; // mi nombre es
    }

    public String getType(){ // cual es tu tipo?
        return this.type; // el tipo es
    }

    public int getLevel(){ // cual es tu nivel?
        return this.level; // mi nivel es
    }

    public int getRank(){ // what is your rank
        return this.rank; // my rank is
    }
}
