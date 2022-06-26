package jtc.core;



public class Cml {
    String form = "%s%s%s";

    public String getColour(Colour colour, String str){
        return String.format(form, colour.getColour(), str,  Colour.reset.getColour());
    }

    public String getBackground(Colour colour, String str){
        return String.format(form, colour.getBackground(), str, Colour.reset.getBackground());
    }

    public String getBackground(int code, String str) {
        if(code > 255 || code < 0) throw new IllegalArgumentException("code must be between 0 and 255");

        return String.format(form, "\u001b[48;5;" + code + "m", str, Colour.reset.getBackground());
    }

    public String black(String str){
        return getColour(Colour.black, str);
    }

    public String red(String str){
        return getColour(Colour.red, str);
    }

    public String green(String str){
        return getColour(Colour.green, str);
    }

    public String yellow(String str) {
        return getColour(Colour.yellow, str);
    }

    public String magenta(String str){
        return getColour(Colour.magenta, str);
    }

    public String cyan(String str){
        return getColour(Colour.cyan, str);
    }

    public String white(String str) {
        return getColour(Colour.white, str);
    }
    public  String blue(String str) {return getColour(Colour.blue, str);}
    public String black_bgr(String str){
        return getBackground(Colour.black, str);
    }

    public String red_bgr(String str){
        return getBackground(Colour.red, str);
    }

    public String green_bgr(String str){
        return getBackground(Colour.green, str);
    }

    public String yellow_bgr(String str) {
        return getBackground(Colour.yellow, str);
    }

    public String magenta_bgr(String str){
        return getBackground(Colour.magenta, str);
    }

    public String cyan_bgr(String str){
        return getBackground(Colour.cyan, str);
    }

    public String white_bgr(String str) {
        return getBackground(Colour.white, str);
    }
    public String blue_bgr(String str) {return getBackground(Colour.blue, str);}
    public static void main(String[] args) {

        Cml cml = new Cml();
        System.out.println(cml.red("red text"));


        System.out.println(cml.blue_bgr(cml.black("Advance example ")) + cml.yellow_bgr(cml.black(" too :)")));
        System.out.println();

        System.out.print("                   ");
        for (int i = 0; i< 10; i++){
            for (int j = 0; j < 10; j++){
                if(j%2 == i%2){
                    System.out.print(cml.black_bgr("   "));
                }else {
                    System.out.print(cml.red_bgr("   "));
                }
            }
            System.out.println();
            System.out.print("                   ");
        }


        System.out.println();
        System.out.print(Colour.reset.getColour());
        int code = 0;
        for(int i = 0; i<16; i++){
            for (int j = 1; j<16; j++){
                code = i*16 + j;
                System.out.print("\u001b[48;5;" + code + "m");
                System.out.format("%2s%3d%s", "  ", code, "  ");
                System.out.print(Colour.reset.getColour());
            }
            }

    }


}
