package xyz.dean.practice.design_pattern.interperter;

public class StringUtil {
    public static boolean isNumeric(CharSequence sequence) {
        if (sequence == null || sequence.length() == 0) return false;
        int length = sequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(sequence.charAt(i))) return false;
        }
        return true;
    }

    public static boolean isValidOperator(CharSequence sequence) {
        return "+".contentEquals(sequence)
                || "-".contentEquals(sequence)
                || "*".contentEquals(sequence)
                || "\\".contentEquals(sequence);
    }
}
