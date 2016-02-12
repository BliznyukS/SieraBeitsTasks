package task3b;

public class Hobbits {
    String name;

    public static void main(String[] args) {

        Hobbits[] hobbit = new Hobbits[3];
        int z = -1;
        /*
        hobbit[0] = new Hobbits();
        hobbit[1] = new Hobbits();
        hobbit[2] = new Hobbits();*/

        while (z < 2) {
            z++;
            hobbit[z] = new Hobbits();
            hobbit[z].name = "Бильбо";
            if (z==1){
                hobbit[z].name="Фродо";
            }
            if (z==2){
                hobbit[z].name="Сэм";
            }
            System.out.println(hobbit[z].name + " - ");
            System.out.println("имя хорошего хоббита");
        }
    }
}
