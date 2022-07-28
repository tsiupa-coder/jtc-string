package jtc.core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static jtc.core.Colour.black;
import static jtc.core.Colour.blue;
import static jtc.core.Colour.cyan;
import static jtc.core.Colour.green;
import static jtc.core.Colour.magenta;
import static jtc.core.Colour.red;
import static jtc.core.Colour.reset;
import static jtc.core.Colour.white;
import static jtc.core.Colour.yellow;
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
        out.println();
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
        out.println();
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
        out.println();
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
    public void testGetBold() {
        out.println();
        //reset.getColour() close black.getBold()
        out.println(black.getBold() + text + reset.getColour());
        out.println(red.getBold() + text + reset.getColour());
        out.println(green.getBold() + text + reset.getColour());
        out.println(yellow.getBold() + text + reset.getColour());
        out.println(magenta.getBold() + text + reset.getColour());
        out.println(cyan.getBold() + text + reset.getColour());
        out.println(white.getBold() + text + reset.getColour());
        out.println(blue.getBold() + text + reset.getColour());
    }

    @Test
    public void testGetBold2() {
        out.println();
        out.println(cml.getBold(black, text));
        out.println(cml.getBold(red, text));
        out.println(cml.getBold(green, text));
        out.println(cml.getBold(yellow, text));
        out.println(cml.getBold(magenta, text));
        out.println(cml.getBold(cyan, text));
        out.println(cml.getBold(white, text));
        out.println(cml.getBold(blue, text));
    }

    @Test
    public void print() {
        out.println();
        out.println(
                cml.getColour(
                        Colour.yellow,
                        cml.getBackground(blue, text))
        );

    }

    @Test
    public void ByCode() {
        out.println();
        out.println(cml.getBackground(100, text));
    }

    @Test
    public void miscellaneous() {
        out.println();
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
    public void testEnumColour() {

        assertEquals(30, black.getCode());
        assertEquals(40, black.getBgr_code());

        assertEquals(31, red.getCode());
        assertEquals(41, red.getBgr_code());

        assertEquals(32, green.getCode());
        assertEquals(42, green.getBgr_code());

        assertEquals(33, yellow.getCode());
        assertEquals(43, yellow.getBgr_code());

        assertEquals(34, blue.getCode());
        assertEquals(44, blue.getBgr_code());

        assertEquals(35, magenta.getCode());
        assertEquals(45, magenta.getBgr_code());

        assertEquals(36, cyan.getCode());
        assertEquals(46, cyan.getBgr_code());

        assertEquals(37, white.getCode());
        assertEquals(47, white.getBgr_code());
    }
}