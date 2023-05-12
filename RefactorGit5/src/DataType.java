import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DataType {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }
    public static String gd(int code){
        Set<Integer> fechas = new HashSet<>(Arrays.asList(702, 1082, 1083, 1114, 1184, 1266, 12403));
        ArrayList<Integer> numerico = new ArrayList<>(Arrays.asList(20,21,23,24,26,700,701,790,1700,2202,2203,2204,2205,2206,3734,3769,12396));

        if (fechas.contains(code)){
            return "Date";
        }else if (numerico.contains(code)){
            return "Numeric";
        } else{
            return "String";
        }

    }
}
