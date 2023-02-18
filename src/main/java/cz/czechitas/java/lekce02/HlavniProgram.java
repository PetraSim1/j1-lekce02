package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

       nakresliPrasatkoSOcaskem();


    }

    private void nakresliPrasatkoSOcaskem() {
        zofka.turnRight(90);
        nakresliDOmecek();
        zofka.turnRight(45);
        nakresliNohu();
        zofka.turnLeft(45);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        nakresliNohu();
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        zofka.turnLeft(45);
        zofka.penDown();
        zofka.move(50);
    }




    private void nakresliNohu() {
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.turnRight(180);
        zofka. penUp();
        zofka.move(50);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
    }

    private void nakresliDOmecek() {
        nakresliCtverec();
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(143);
        zofka.turnRight(90);
        zofka.move(143);
    }

    private void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move (200);
            zofka.turnRight(90);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
