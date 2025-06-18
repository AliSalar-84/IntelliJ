public class Color {
    private int r;
    private int g;
    private int b;
    private static boolean isSupplement(Color c1, Color c2) { return  c1.r + c2.r == 255 && c1.g + c2.g == 255 && c1.b + c2.b == 255;}
    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public static void result(String name_1,String name_2,Color c1, Color c2) {
        if(isSupplement(c1,c2)){
            System.out.println(name_1 + "is a Supplement to" + name_2 + ".");
        }
        else {
            System.out.println(name_1 + "just ruined" + name_2 + "!");
        }
    }
}
