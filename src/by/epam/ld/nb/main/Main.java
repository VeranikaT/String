package by.epam.ld.nb.main;

public class Main {
    public static void main(String[] args) {

        /**
         * Удаление лишних пробелов
         * */
        String str = " Go    back    to    the    drawing         board ";
        System.out.println("|" + str + "|");
        String str2 = str.replaceAll("\s{2,10}", "\s").replaceAll("\s$", "").replaceAll("^\s", "");
        System.out.println("|" + str2 + "|");
    }
}
