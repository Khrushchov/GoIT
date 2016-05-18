package goit.gojavaonline2.practice.module3;

public class UnixPath {
    public String simplify(String input) {
        String result = input
                .replaceAll("\\.+$", "")
                .replaceAll("/\\.", "/")
                .replaceAll("/\\w+/+\\.", "/")
                .replaceAll("/\\.", "/")
                .replaceAll("//+", "/")
                .replaceAll("/$", "");
        if (result.equals("")) {
            result = "/";
        }
        return result;
    }
}
