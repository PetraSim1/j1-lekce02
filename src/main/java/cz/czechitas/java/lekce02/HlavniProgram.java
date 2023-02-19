package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();
/*
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(500);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliPrasatkoSOcaskem();

        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(420);
        zofka.penDown();

        nakresliOsmiuhelnik();

        zofka.penUp();
        zofka.move(300);
        zofka.penDown();

        nakresliKruh();

        zofka.penUp();
        zofka.move(300);
        zofka.penDown();

        nakresliSlunce();

 */

        zofka.setLocation(700,500);

        nakresliPrasatkoSOcaskem();

        zofka.setLocation(350,650);
        zofka.turnRight(45);

        nakresliDOmecek();

        zofka.setLocation(350,350);
        zofka.turnLeft(135);

        for (int i = 0; i <5; i++) {
               nakresliDOmecek();
               zofka.penUp();
               zofka.turnRight(45);
               zofka.move(150);
               zofka.turnLeft(90);
               zofka.move(50);
               zofka.turnLeft(90);
               zofka.penDown();
        }

        zofka.setLocation(1150,650);

        nakresliDOmecek();

        zofka.setLocation(570,30);

        nakresliSlunce();

        zofka.turnLeft(135);
        zofka.setLocation(400,950);

        napisJmenoPetra();
    }

    private void napisJmenoPetra() {

        napisPismenoP();

        napisPismenoE();

        napisPismenoT();

        napisPismenoR();

        napisPismenoA();
    }

    private void napisPismenoA() {
        zofka.turnRight(10);
        zofka.move(210);
        zofka.turnRight(160);
        zofka.move(210);
        zofka.turnLeft(180);
        zofka.move(105);
        zofka.turnLeft(80);
        zofka.move(35);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(105);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private void napisPismenoR() {
        napisSvislouCaru200();

        napisMalyPulkruhKPismenu();

        zofka.turnLeft(125);
        zofka.move(105);
        zofka.penUp();
        zofka.turnLeft(55);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private void napisPismenoT() {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penDown();

        napisSvislouCaru200();

        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(100);

        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(180);
        zofka.penDown();
    }

    private void napisPismenoE() {
        napisSvislouCaru200();

        napisVodorovnouCaru50();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        napisVodorovnouCaru50();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        napisVodorovnouCaru50();

        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private void napisVodorovnouCaru50() {
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
    }

    private void napisPismenoP() {
        napisSvislouCaru200();

        napisMalyPulkruhKPismenu();

        presunNaDalsiPismeno();
    }

    private void napisMalyPulkruhKPismenu() {
        for (int i = 0; i < 180; i++) {
            zofka.move(1);
            zofka.turnRight(1);
        }
    }

    private void presunNaDalsiPismeno() {
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(85);
        zofka.penDown();
        zofka.turnRight(180);
    }

    private void napisSvislouCaru200() {
        zofka.move(200);
        zofka.turnRight(90);
    }


    private void nakresliSlunce() {
        for (int i = 0; i < 12; i++) {

            for (int j = 0; j <30; j++) {
                zofka.move(1);
                zofka.turnRight(1);
            }
            zofka.turnLeft(90);
            zofka.move(25);
            zofka.turnRight(180);
            zofka.move(25);
            zofka.turnLeft(90);
        }
    }

    private void nakresliKruh() {
        for (int i = 0; i < 360; i++) {
            zofka.move(1);
            zofka.turnRight(1);
        }
    }

    private void nakresliOsmiuhelnik() {
        for (int i = 0; i <8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
    }

    private void nakresliPrasatkoSOcaskem() {
        zofka.turnRight(90);
        nakresliDOmecek();
        zofka.turnRight(45);
        nakresliNohu();
        zofka.turnLeft(45);
        zofka.penUp();
        zofka.move(150);
        zofka.penDown();
        nakresliNohu();
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(150);
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
        zofka.move(150);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(106);
        zofka.turnRight(90);
        zofka.move(106);
    }

    private void nakresliCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move (150);
            zofka.turnRight(90);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
