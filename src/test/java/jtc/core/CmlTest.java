package jtc.core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;

class CmlTest {

    private static Cml cml;
    String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";

    @BeforeAll
    static void beforeAll() {
        cml = new Cml();
    }

    @Test
    public void printColourBackground() {

        out.println(cml.yellow_bgr(text));
        out.println(cml.black_bgr(text));
        out.println(cml.green_bgr(text));
        out.println(cml.magenta_bgr(text));
        out.println(cml.cyan_bgr(text));
        out.println(cml.white_bgr(text));
        out.println(cml.blue_bgr(text));
    }

    @Test
    public void printBackground() {
        out.println(cml.getBackground(Colour.yellow, text));
        out.println(cml.getBackground(Colour.black, text));
        out.println(cml.getBackground(Colour.green, text));
        out.println(cml.getBackground(Colour.magenta, text));
        out.println(cml.getBackground(Colour.cyan, text));
        out.println(cml.getBackground(Colour.white, text));
        out.println(cml.getBackground(Colour.blue, text));
    }

    @Test
    public void printColourText() {
        out.println(cml.black(text));
        out.println(cml.red(text));
        out.println(cml.green(text));
        out.println(cml.yellow(text));
        out.println(cml.magenta(text));
        out.println(cml.cyan(text));
        out.println(cml.white(text));
        out.println(cml.blue(text));
    }

    @Test
    public void printColour() {

        out.println(cml.getColour(Colour.black, text));
        out.println(cml.getColour(Colour.red, text));
        out.println(cml.getColour(Colour.green, text));
        out.println(cml.getColour(Colour.yellow, text));
        out.println(cml.getColour(Colour.magenta, text));
        out.println(cml.getColour(Colour.cyan, text));
        out.println(cml.getColour(Colour.white, text));
        out.println(cml.getColour(Colour.blue, text));

    }

    @Test
    public void print() {

        out.println(
                cml.getColour(
                        Colour.yellow,
                        cml.getBackground(Colour.blue, text))
        );

    }

    @Test
    public void ByCode() {
        out.println(cml.getBackground(100, text));
    }

    @Test
    public void miscellaneous() {

        System.out.println(cml.blue_bgr(cml.black("Advance example ")) + cml.yellow_bgr(cml.black(" too :)")));
        System.out.println();

        System.out.print("                   ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j % 2 == i % 2) {
                    System.out.print(cml.black_bgr("   "));
                } else {
                    System.out.print(cml.red_bgr("   "));
                }
            }
            System.out.println();
            System.out.print("                   ");
        }

        System.out.println();
        System.out.print(Colour.reset.getColour());
        int code = 0;
        for (int i = 0; i < 16; i++) {
            for (int j = 1; j < 16; j++) {
                code = i * 16 + j;
                System.out.print(cml.getDecorator(code));
                System.out.format("%2s%3d%s", "  ", code, "  ");
                System.out.print(Colour.reset.getColour());
            }
            System.out.println();
        }
    }
}