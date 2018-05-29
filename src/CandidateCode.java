/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {

    static List<String> routes = Arrays.asList(
            "a-b",
            "a-c,c-d,d-b",
            "a-e,e-f,f-b",
            "a-g,g-h,h-b",
            "a-d,d-c,c-b",
            "a-f,f-e,e-b",
            "a-h,h-g,g-b"
    );
    static String a, b, c, d, e, f, g, h;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();
        String line3 = in.nextLine();
        String line4 = in.nextLine();
        /*line1 = "0 0 199 199";
        line2 = "1 1 158 158";  //12
        line3 = "160 160 168 168"; //24
        line4 = "170 170 198 198"; //14*/

        process(line1,line2,line3,line4);


    }
    public static void process(String line1, String line2, String line3, String line4){
        init(line1, line2, line3, line4);
        int minTime = Integer.MAX_VALUE;
        String shortestPath = "";
        for (String r : routes) {
            String[] arr = r.split(",");
            int temp = 0;
            for (String val : arr) {
                temp += getTime(val);
            }
            if (minTime > temp) {
                minTime = temp;
                shortestPath = r;
            }
        }

//        System.out.println("minTime is " + minTime + " of shortest path " + shortestPath);
        System.out.println(minTime);
//        return minTime;
    }

    public static void init(String line1, String line2, String line3, String line4) {
        a = line1.split(" ")[0] + " " + line1.split(" ")[1];
        b = line1.split(" ")[2] + " " + line1.split(" ")[3];

        c = line2.split(" ")[0] + " " + line2.split(" ")[1];
        d = line2.split(" ")[2] + " " + line2.split(" ")[3];

        e = line3.split(" ")[0] + " " + line3.split(" ")[1];
        f = line3.split(" ")[2] + " " + line3.split(" ")[3];

        g = line4.split(" ")[0] + " " + line4.split(" ")[1];
        h = line4.split(" ")[2] + " " + line4.split(" ")[3];
    }

    public static int getTime(String coordinate) {
        switch (coordinate) {
            case "a-b":
                return getTime(a, b);
            case "a-c":
                return getTime(a, c);
            case "a-d":
                return getTime(a, d);
            case "a-e":
                return getTime(a, e);
            case "a-f":
                return getTime(a, f);
            case "a-g":
                return getTime(a, g);
            case "a-h":
                return getTime(a, h);
            case "c-b":
                return getTime(c, b);
            case "c-d":
            case "d-c":
            case "e-f":
            case "f-e":
            case "g-h":
            case "h-g":
                return 10;
            case "c-e":
                return getTime(c, e);
            case "c-f":
                return getTime(c, f);
            case "c-g":
                return getTime(c, g);
            case "c-h":
                return getTime(c, h);
            case "d-b":
                return getTime(d, b);
            case "d-e":
                return getTime(d, e);
            case "d-f":
                return getTime(d, f);
            case "d-g":
                return getTime(d, g);
            case "d-h":
                return getTime(d, h);
            case "e-b":
                return getTime(e, b);
            case "e-c":
                return getTime(e, c);
            case "e-d":
                return getTime(e, d);
            case "e-g":
                return getTime(e, g);
            case "e-h":
                return getTime(e, h);
            case "f-b":
                return getTime(f, b);
            case "f-c":
                return getTime(f, c);
            case "f-d":
                return getTime(f, d);
            case "f-g":
                return getTime(f, g);
            case "f-h":
                return getTime(f, h);
            case "g-b":
                return getTime(g, b);
            case "g-c":
                return getTime(g, c);
            case "g-d":
                return getTime(g, d);
            case "g-e":
                return getTime(g, e);
            case "g-f":
                return getTime(g, f);
            case "h-b":
                return getTime(h, b);
            case "h-c":
                return getTime(h, c);
            case "h-d":
                return getTime(h, d);
            case "h-e":
                return getTime(h, e);
            case "h-f":
                return getTime(h, f);
            default:
                throw new RuntimeException("Something Wrong");
        }
    }

    public static int getTime(String val1, String val2) {
        int x1 = Integer.parseInt(val1.split(" ")[0]);
        int y1 = Integer.parseInt(val1.split(" ")[1]);

        int x2 = Integer.parseInt(val2.split(" ")[0]);
        int y2 = Integer.parseInt(val2.split(" ")[1]);
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}

