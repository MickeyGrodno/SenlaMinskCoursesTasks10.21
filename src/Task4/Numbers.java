package Task4;

import java.util.List;

public class Numbers {
    public static final String STAR = "*";

    public void number0(List<String> a, String b) {

        if (a.isEmpty()) {
            a.add(b + " " + b + " " + b);
            a.add(b + "   " + b);
            a.add(b + "   " + b);
            a.add(b + "   " + b);
            a.add(b + " " + b + " " + b);
        } else {
            addSpace(a);
            a.set(0, a.get(0) + b + " " + b + " " + b);
            a.set(1, a.get(1) + b + "   " + b);
            a.set(2, a.get(2) + b + "   " + b);
            a.set(3, a.get(3) + b + "   " + b);
            a.set(4, a.get(4) + b + " " + b + " " + b);
        }
    }

    public void number1(List<String> a, String b) {
        if (a.isEmpty()) {
            a.add(" " + b + b + "  ");
            a.add(b + " " + b + "  ");
            a.add("  " + b + "  ");
            a.add("  " + b + "  ");
            a.add(b + " " + b + " " + b);
        } else {
            addSpace(a);
            a.set(0, a.get(0) + " " + b + b + "  ");
            a.set(1, a.get(1) + b + " " + b + "  ");
            a.set(2, a.get(2) + "  " + b + "  ");
            a.set(3, a.get(3) + "  " + b + "  ");
            a.set(4, a.get(4) + b + " " + b + " " + b);
        }
    }

    public void number2(List<String> a, String b) {
        if (a.isEmpty()) {
            a.add(" " + b + " " + b + " ");
            a.add(b + "   " + b);
            a.add("    " + b);
            a.add(" " + b + "   ");
            a.add(b + " " + b + " " + b);
        } else {
            addSpace(a);
            a.set(0, a.get(0) + " " + b + " " + b + " ");
            a.set(1, a.get(1) + b + "   " + b);
            a.set(2, a.get(2) + "    " + b);
            a.set(3, a.get(3) + " " + b + "   ");
            a.set(4, a.get(4) + b + " " + b + " " + b);
        }
    }

    public void number3(List<String> a, String b) {
        if (a.isEmpty()) {
            a.add(b + " " + b + " " + b);
            a.add("    " + b);
            a.add("  " + b + "  ");
            a.add("    " + b);
            a.add(b + " " + b + " " + b);
        } else {
            addSpace(a);
            a.set(0, a.get(0) + b + " " + b + " " + b);
            a.set(1, a.get(1) + "    " + b);
            a.set(2, a.get(2) + "  " + b + "  ");
            a.set(3, a.get(3) + "    " + b);
            a.set(4, a.get(4) + b + " " + b + " " + b);
        }
    }

    public void number4(List<String> a, String b) {
        if (a.isEmpty()) {
            a.add("   " + b + b);
            a.add("  " + b + " " + b);
            a.add(" " + b + "  " + b);
            a.add(b + " " + b + " " + b);
            a.add("    " + b);
        } else {
            addSpace(a);
            a.set(0, a.get(0) + "   " + b + b);
            a.set(1, a.get(1) + "  " + b + " " + b);
            a.set(2, a.get(2) + " " + b + "  " + b);
            a.set(3, a.get(3) + b + " " + b + " " + b);
            a.set(4, a.get(4) + "    " + b);
        }
    }

    public void number5(List<String> a, String b) {
        if (a.isEmpty()) {
            a.add(b + " " + b + " " + b);
            a.add(b + "    ");
            a.add(b + " " + b + " " + b);
            a.add("    " + b);
            a.add(b + " " + b + " " + b);
        } else {
            addSpace(a);
            a.set(0, a.get(0) + b + " " + b + " " + b);
            a.set(1, a.get(1) + b + "    ");
            a.set(2, a.get(2) + b + " " + b + " " + b);
            a.set(3, a.get(3) + "    " + b);
            a.set(4, a.get(4) + b + " " + b + " " + b);
        }
    }

    public void number6(List<String> a, String b) {
        if (a.isEmpty()) {
            a.add(b + " " + b + " " + b);
            a.add(b + "    ");
            a.add(b + " " + b + " " + b);
            a.add(b + "   " + b);
            a.add(b + " " + b + " " + b);
        } else {
            addSpace(a);
            a.set(0, a.get(0) + b + " " + b + " " + b);
            a.set(1, a.get(1) + b + "    ");
            a.set(2, a.get(2) + b + " " + b + " " + b);
            a.set(3, a.get(3) + b + "   " + b);
            a.set(4, a.get(4) + b + " " + b + " " + b);
        }
    }

    public void number7(List<String> a, String b) {
        if (a.isEmpty()) {
            a.add(b + " " + b + " " + b);
            a.add("    " + b);
            a.add("  " + b + "  ");
            a.add(b + "    ");
            a.add(b + "    ");
        } else {
            addSpace(a);
            a.set(0, a.get(0) + b + " " + b + " " + b);
            a.set(1, a.get(1) + "    " + b);
            a.set(2, a.get(2) + "  " + b + "  ");
            a.set(3, a.get(3) + b + "    ");
            a.set(4, a.get(4) + b + "    ");
        }
    }

    public void number8(List<String> a, String b) {
        if (a.isEmpty()) {
            a.add(" " + b + " " + b + " ");
            a.add(b + "   " + b);
            a.add(" " + b + " " + b + " ");
            a.add(b + "   " + b);
            a.add(" " + b + " " + b + " ");
        } else {
            addSpace(a);
            a.set(0, a.get(0) + " " + b + " " + b + " ");
            a.set(1, a.get(1) + b + "   " + b);
            a.set(2, a.get(2) + " " + b + " " + b + " ");
            a.set(3, a.get(3) + b + "   " + b);
            a.set(4, a.get(4) + " " + b + " " + b + " ");
        }
    }

    public void number9(List<String> a, String b) {
        if (a.isEmpty()) {
            a.add(b + " " + b + " " + b);
            a.add(b + "   " + b);
            a.add(b + " " + b + " " + b);
            a.add("    " + b);
            a.add(b + " " + b + " " + b);
        } else {
            addSpace(a);
            a.set(0, a.get(0) + b + " " + b + " " + b);
            a.set(1, a.get(1) + b + "   " + b);
            a.set(2, a.get(2) + b + " " + b + " " + b);
            a.set(3, a.get(3) + "    " + b);
            a.set(4, a.get(4) + b + " " + b + " " + b);
        }
    }

    public void addSpace(List<String> a) {
        for (int i = 0; i < a.size(); i++) {
            String b = a.get(i) + "   ";
            a.set(i, b);
        }
    }

    public int takesLine(String a) {
        int max = 0;
        for (char b : a.toCharArray()) {
            int number = Character.getNumericValue(b);
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}





