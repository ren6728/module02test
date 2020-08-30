package problems;

public class InvertString {

    /**
     * Invert a String without using String default reverse() method
     *
     * */

    public String invertWithStringBuffer(String str) {

        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        return buffer.toString();
    }

    public String invertWithoutStringBuffer(String str) {

        int length = str.length();
        String original = str;
        String invert = "";
        for (int i = length - 1; i >= 0; i--) {
            invert = invert + original.charAt(i);
        }
        return invert;
    }

    public static void main(String[] args) {

        InvertString invertStr = new InvertString();

        System.out.println("Inverted String with StringBuffer class: "
                + invertStr.invertWithStringBuffer("987654321"));

        System.out.println("");

        System.out.println("Inverted String without StringBuffer class: "
                + invertStr.invertWithoutStringBuffer("kjihgfedcba"));
    }

}

