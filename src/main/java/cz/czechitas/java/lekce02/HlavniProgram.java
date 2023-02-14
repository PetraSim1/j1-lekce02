package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        nakresliDOmecek();

        zofka.turnRight(135);
        zofka.penUp();
        zofka.move(600);
        zofka.penDown();


        zofka.turnRight(180);

        nakresliPrasatko();


    }

    private void nakresliPrasatko() {
        nakresliDOmecek();
        zofka.turnRight(45);
        zofka.move(200);
        nakresliZdaniNohu();
        zofka.turnRight(135);
        zofka.penUp();
        zofka.move(200);
        nakresliPredniNohu();
    }

    private void nakresliPredniNohu() {
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(50);
    }

    private void nakresliZdaniNohu() {
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
