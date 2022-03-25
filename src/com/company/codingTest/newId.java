package com.company.codingTest;

public class newId {
    public String solution(String input) {
        String s = input.toLowerCase();

        char[] chars = s.toCharArray();
        String userId = "";

        for (int i=0 ;i<chars.length; i++){
            if(chars[i] >= 'a' && chars[i] <='z')
                userId += String.valueOf(chars[i]);
            else if (chars[i] >= '0' && chars[i] <= '9')
                userId += String.valueOf(chars[i]);
            else if (chars[i] == '-' || chars[i] == '_' || chars[i] =='.')
                userId += String.valueOf(chars[i]);
        }

        for (int i=0; i<userId.length();i++){
            if(userId.charAt(i) == '.'){
                int j = i+1;
                String dot = ".";

                while (j != userId.length() && userId.charAt(j) == '.'){

                    dot += ".";
                    j++;
                }

                if (dot.length() > 1)
                    userId = userId.replace(dot, ".");
            }
        }

        if (userId.startsWith("."))
            userId = userId.substring(1, userId.length());
        else if (userId.endsWith("."))
            userId = userId.substring(0, userId.length() - 1);


        if (userId.length() == 0)
            userId += "a";

        if(userId.length() >= 16){
            userId = userId.substring(0,15);
        }

        if(userId.endsWith(".")){
            userId = userId.substring(0, userId.length()-1);
        }

        char endPoint = userId.charAt(userId.length() - 1);
        if (userId.length() ==2){
            userId = userId + endPoint;
        }else if (userId.length() == 1) {
            userId = userId + endPoint + endPoint;
        }

        return userId;


    }

    public static void main(String[] args) {

    }
}
