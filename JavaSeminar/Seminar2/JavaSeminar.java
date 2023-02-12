import java.io.*;
import java.lang.Math;
import java.util.ArrayList;

public class JavaSeminar {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String str;
        ArrayList<String> list = new ArrayList<String>();
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        String[] stringArr = list.toArray(new String[0]);
        reader.close();
        
        String a1 = stringArr[0];
        String[] subStr1;
        String delimeter = " ";
        subStr1 = a1.split(delimeter);
        for(int i = 0; i < subStr1.length; i++) { 
           System.out.println(subStr1[i]); 
        }
        double x = Double.parseDouble(subStr1[1]);

        String b1 = stringArr[1];
        String[] subStr2;
        String delimeter2 = " ";
        subStr2 = b1.split(delimeter2);
        for(int i = 0; i < subStr2.length; i++) { 
           System.out.println(subStr2[i]); 
        }
        double y = Double.parseDouble(subStr2[1]);

        System.out.println("Число а = " + x);
        System.out.println("Число b = " + y);

        double result = Math.pow(x, y);
        System.out.println("a в степени b = " + result);;

        File file = new File("output.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file);
            if (x == 0 | y == 0)
                printWriter.println("не оперделено");
            else
                printWriter.println(result);
            printWriter.close();
        } catch (FileNotFoundException ex) {
            
        }
    }
}