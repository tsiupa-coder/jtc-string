package jtc.core;

public enum Colour {

    black(30, 40),
    red(31, 41),
    green(32, 42),
    yellow(33, 43),
    blue(34, 44),
    magenta(35, 45),
    cyan(36, 46),
    white(37, 47),
    reset(0, 0);

    Colour(int code, int bgr_code) {
        this.code = code;
        this.bgr_code = bgr_code;
    }

    private final int code;
    private final int bgr_code;

    private static final String decorate = "\u001b[%sm";

    public String getColour() {
        return String.format(decorate, code);
    }

    public String getBold() {
        return String.format(decorate, code + ";1");
    }

    public String getBackground() {
        return String.format(decorate, bgr_code);
    }
}
