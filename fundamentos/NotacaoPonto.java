public class NotacaoPonto {
    static void main() {
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");
        System.out.println(s);

        String y = "Bom dia X".replace("X", "Senhora").toUpperCase().concat("!!!");
        System.out.println(y);
    }
}
