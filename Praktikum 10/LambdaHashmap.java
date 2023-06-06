/* File      : LambdaHashmap.java		
   Penulis   : Puti Dhiya Salsabila Rahman / 24060121140173
   Deskripsi : Ekspresi lambda pada hashmap, digunakan untuk parameter pada method.*/

import java.util.HashMap;
import java.util.Map;
 
public class LambdaHashmap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121120025", "Annisa");
        mahasiswaMap.put("24060121140099", "Satria");
        mahasiswaMap.put("24060121140143", "Saffa");
 
        mahasiswaMap.forEach((nim, nama) -> System.out.println( nim + ": " + nama));
    }
}