package jtc.core;


public class Cml {
    String form = "%s%s%s";

    public String getColour(Colour colour, String str) {
        return String.format(form, colour.getColour(), str, Colour.reset.getColour());
    }

    public String getBold(Colour colour, String str) {
        return String.format(form, colour.getBold(), str, Colour.reset.getCode());
    }

    public String getBackground(Colour colour, String str) {
        return String.format(form, colour.getBackground(), str, Colour.reset.getBackground());
    }

    public String getBackground(int code, String str) {
        if (code > 255 || code < 0) throw new IllegalArgumentException("code must be between 0 and 255");

        return String.format(form, getDecorator(code), str, Colour.reset.getBackground());
    }

    public String getDecorator(int code) {

        return "\u001b[48;5;" + code + "m";
    }

    public String black(String str) {
        return getColour(Colour.black, str);
    }

    public String red(String str) {
        return getColour(Colour.red, str);
    }

    public String green(String str) {
        return getColour(Colour.green, str);
    }

    public String yellow(String str) {
        return getColour(Colour.yellow, str);
    }

    public String magenta(String str) {
        return getColour(Colour.magenta, str);
    }

    public String cyan(String str) {
        return getColour(Colour.cyan, str);
    }

    public String white(String str) {
        return getColour(Colour.white, str);
    }

    public String blue(String str) {
        return getColour(Colour.blue, str);
    }

    public String black_bgr(String str) {
        return getBackground(Colour.black, str);
    }

    public String red_bgr(String str) {
        return getBackground(Colour.red, str);
    }

    public String green_bgr(String str) {
        return getBackground(Colour.green, str);
    }

    public String yellow_bgr(String str) {
        return getBackground(Colour.yellow, str);
    }

    public String magenta_bgr(String str) {
        return getBackground(Colour.magenta, str);
    }

    public String cyan_bgr(String str) {
        return getBackground(Colour.cyan, str);
    }

    public String white_bgr(String str) {
        return getBackground(Colour.white, str);
    }

    public String blue_bgr(String str) {
        return getBackground(Colour.blue, str);
    }
}