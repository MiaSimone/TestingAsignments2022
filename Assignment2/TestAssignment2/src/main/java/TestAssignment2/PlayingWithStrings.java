package TestAssignment2;

public class PlayingWithStrings {
    public String ReturnAString(String string) {
        return string;
    }

    public String ReverseAString(String source) {

        StringBuilder str = new StringBuilder();
        if(source == null || source.isEmpty()) {
            return source;
        }
//        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            str.append(source.charAt(i));
//            reverse = reverse + source.charAt(i);
        }
        return str.toString();
    }

    public String CapitalizeAString(String source) {
        if(source == null || source.isEmpty()) {
            return source;
        }
        String capitalize = "";

        char strArr[] = source.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                capitalize = capitalize + (char) ((int) strArr[i] - 32);
            } else {
                capitalize = capitalize + (char) ((int) strArr[i]);
            }
        }
        return capitalize;
    }

    public String LowercaseAString(String source) {
        if(source == null || source.isEmpty()) {
            return source;
        }
        String lowercased = "";

        char strArr[] = source.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'A' && strArr[i] <= 'Z') {
                lowercased = lowercased + (char) ((int) strArr[i] + 32);
            } else {
                lowercased = lowercased + (char) ((int) strArr[i]);
            }
        }
        return lowercased;
    }
}
