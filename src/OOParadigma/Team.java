package OOParadigma;

public class Team {

    Member member;
    public Team(Member member){ // quien esta en este equipo?
        this.member = member; // un integrante esta en este equipo!
    }

    // agregar el metodo main
    public static void main(String[] args){
        Member myMember = new Member("Gerson", "Fast", 10,1);
        Member myMember2 = new Member("Test", "Fast", 9,2);
        Team myTeam = new Team(myMember);
        Team myTeam2 = new Team(myMember2);

        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());

        // Integrante 2
        System.out.println("Integrante 2: " + myTeam2.member.getName());
        System.out.println("Integrante 2: " + myTeam2.member.getType());
        System.out.println("Integrante 2: " + myTeam2.member.getLevel());
        System.out.println("Integrante 2: " + myTeam2.member.getRank());
    }
}
