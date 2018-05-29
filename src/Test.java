import java.util.*;

public class Test {
    static List<String> routes = Arrays.asList(
            "a-b",
            "a-c,c-d,d-b",
            "a-c,c-d,d-e,e-f,f-b",
            "a-c,c-d,d-e,e-f,f-g,g-h,h-b",
            "a-c,c-d,d-f,f-e,e-b",
            "a-c,c-d,d-g,g-h,h-b",
            "a-c,c-d,d-h,h-g,g-b",
            "a-c,c-d,d-h,h-g,g-f,f-e,e-b",
            "a-c,c-d,d-h,h-g,g-f,f-e,e-d,d-c,c-b",
            "a-d,d-c,c-b",
            "a-d,d-c,c-e,e-f,f-b",
            "a-d,d-c,c-f,f-e,e-b",
            "a-d,d-c,c-f,f-e,e-h,h-g,g-b",
            "a-d,d-c,c-g,g-h,h-b",
            "a-d,d-c,c-h,h-g,g-b",
            "a-e,e-f,f-b",
            "a-e,e-f,f-c,c-d,d-b",
            "a-e,e-f,f-d,d-c,c-b",
            "a-e,e-f,f-g,g-h,h-b",
            "a-e,e-f,f-h,h-g,g-b",
            "a-f,f-e,e-b",
            "a-f,f-e,e-c,c-d,d-b",
            "a-f,f-e,e-d,d-c,c-b",
            "a-f,f-e,e-g,g-h,h-b",
            "a-f,f-e,e-h,h-g,g-b",
            "a-f,f-h,h-g,g-b",
            "a-g,g-h,h-b",
            "a-g,g-h,h-c,c-d,d-b",
            "a-g,g-h,h-d,d-c,c-b",
            "a-g,g-h,h-e,e-f,f-b",
            "a-g,g-h,h-e,e-f,f-c,c-d,d-b",
            "a-g,g-h,h-e,e-f,f-d,d-c,c-b",
            "a-g,g-h,h-f,f-e,e-b",
            "a-h,h-g,g-b",
            "a-h,h-g,g-c,c-d,d-b",
            "a-h,h-g,g-d,d-c,c-b",
            "a-h,h-g,g-e,e-f,f-b",
            "a-h,h-g,g-e,e-f,f-h",
            "a-h,h-g,g-f,f-e,e-b"
    );

    public static void main(String[] args) {
        Set<String> coordinate = new TreeSet<>();
        for(String r : routes){
            String[] arr = r.split(",");
            for(String val : arr){
                coordinate.add(val);
            }
        }
        System.out.println(coordinate);
    }
}
