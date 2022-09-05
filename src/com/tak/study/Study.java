package com.tak.study;

public class Study {

    public static void main(String[] args) {

        System.out.println("" +
                "//String[]을 for문을 돌려 vo등에 담아 service에 전달해주면 service가 여러번 호출된다." +
                "//해결 방법은 한번에 service로 전달하는 것." +

                "//JSP 등 view에서 받아온 공통된 이름의 여러 값들을 getParameterValues(\"~\");를 사용하여 받아온다." +
                "String[] checkbox = request.getParameterValues(\"check\");\n" +
                "혹은" +
                "String[] checkbox = {\"One\", \"Two\", \"Three\", \"Four\"};" +
                "이 같은 형식의 String[]이 있을 것이다.\n" +

                "//\" \"안에 공백을 넣었는데 되지 않는다면 \",\" 이런식으로 comma를 추가 해준다. " +
                "String checkboxList = String.join(\" \", checkbox);" +

                "//확인" +
                "System.out.println(checkboxList);");


    }


}
