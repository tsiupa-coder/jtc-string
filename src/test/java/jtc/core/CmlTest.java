package jtc.core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static jtc.core.Colour.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        out.println(cml.getBackground(yellow, text));
        out.println(cml.getBackground(black, text));
        out.println(cml.getBackground(green, text));
        out.println(cml.getBackground(magenta, text));
        out.println(cml.getBackground(cyan, text));
        out.println(cml.getBackground(white, text));
        out.println(cml.getBackground(blue, text));
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

        out.println(cml.getColour(black, text));
        out.println(cml.getColour(red, text));
        out.println(cml.getColour(green, text));
        out.println(cml.getColour(yellow, text));
        out.println(cml.getColour(magenta, text));
        out.println(cml.getColour(cyan, text));
        out.println(cml.getColour(white, text));
        out.println(cml.getColour(blue, text));

    }

    @Test
    public void print() {

        out.println(
                cml.getColour(
                        Colour.yellow,
                        cml.getBackground(blue, text))
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

    @Test
    public void testEnumColour(){

        assertEquals(black.getCode(), 30);
        assertEquals(black.getBgr_code(), 40);

        assertEquals(red.getCode(), 31);
        assertEquals(red.getBgr_code(), 41);

        assertEquals(green.getCode(), 32);
        assertEquals(green.getBgr_code(), 42);

        assertEquals(yellow.getCode(), 33);
        assertEquals(yellow.getBgr_code(), 43);

        assertEquals(blue.getCode(), 34);
        assertEquals(blue.getBgr_code(), 44);

        assertEquals(magenta.getCode(), 35);
        assertEquals(magenta.getBgr_code(), 45);

        assertEquals(cyan.getCode(), 36);
        assertEquals(cyan.getBgr_code(), 46);

        assertEquals(white.getCode(), 37);
        assertEquals(white.getBgr_code(), 47);
    }
}