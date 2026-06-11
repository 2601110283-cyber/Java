package ai0611.abstracttest;

public class RunPersion {
    static void main(String[] args) {
        //추상(abstract)클래스는
        // Person person = new Person(;
        Men men = new Men();
        men.name = "김폴리";
        men.weight = 70;
        men.height = 180;


        Women  women = new Women();
        women.name = "박인순";
        women.weight = 40;
        women.height = 170;

        men.eat("김치찌개");
        men.study();
        men.sleep(8);

        women.eat("파스타");
        women.study();
        women.sleep(18);



    }
}
