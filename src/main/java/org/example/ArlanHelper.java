package org.example;


public class ArlanHelper {
    /*public String drawQuad(int n){
        int i = 1;
        int j = 1;
        String draw = "";
        while(true) {
            if (i <= n) {
                draw = draw + "*";
                i++;
            } else if (j < n) {
                draw = draw + "\n\r";
                i = 1;
                j++;
            } else break;
        }

              return draw;
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(13));
    }*/

 /*  public String drawLine(int length){
//        String result = "";
//
//        boolean star = true;
//
//        while (length > 0) {
//            result += star ? '*' : '#';
//            star = !star;
//            length--;
//        }
//
//        return result;
//    }



        String reResult = "";

        boolean even;
        while(length  > 0) {
            if ((length % 2 == 0)) even = true;
            else even = false;
            if(even != true){
                reResult += "*";
            } else{
                reResult += "#";
            }
            length--;
        }
        StringBuilder StringBuilder = new StringBuilder();
        StringBuilder.append(reResult);
        StringBuilder.reverse();
        String result = StringBuilder.toString();

        return result;
    }
*/
/*


    public String drawPattern(char[] pattern, int repeatCount){
        String result = "";


        while (repeatCount > 0) {
            String preResult = new String(pattern);
            result += preResult;
            repeatCount--;
        }

        return result;
    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'h', 's', 'd', 'd', 's', 'g', 'e', 'j', 'p', 'j', 's', 'a', 's', 's'}, 5));
    }*/




}
