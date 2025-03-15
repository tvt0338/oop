import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class String_Code {
    String blowup(String str) {
        int l = str.length();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < l; i++) {
            if (Character.isDigit(str.charAt(i)) && i + 1 < l) {
                int a = str.charAt(i) - '0';
                s.append((str.charAt(i + 1) + "").repeat(a));
            } else if (!Character.isDigit(str.charAt(i))) {
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }

    public int maxRun(String str) {
        int l = str.length();
        ArrayList<Integer> size = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            int j = i;
            int dem = 0;
            while (str.charAt(i) == str.charAt(j) && (j < l)) {
                j++;
                dem++;
            }
            size.add(dem);
            i = j;
        }
        return Collections.max(size);
    }

    boolean stringIntersect(String a, String b, int len) {
        HashSet<String> o = new HashSet<>();
        for (int i = 0; i <= a.length() - len; i++) {
            o.add(a.substring(i, i + len));
        }
        for (int i = 0; i <= b.length() - len; i++) {
            if (o.contains(b.substring(i, i + len))){
                return true;
            }
        } return false;

    }

    public static void main(String[] args) {
        String s = "4d1c3n9";
        String_Code oj = new String_Code();
        System.out.println(oj.blowup(s));
    }
}
