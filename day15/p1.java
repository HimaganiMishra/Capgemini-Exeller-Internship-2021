package day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

class ReadToHashmap {
   
	final static String filePath = "C:\\Users\\Anshuman Biswal\\Documents\\EmployeeRecord.txt";
	
	        
    public static void main(String[] args)
   
    {
  
        Map<String, String> mapFromFile = HashMapFromTextFile();
            
 
        for (Map.Entry<String, String> entry :
             mapFromFile.entrySet()) {
            System.out.println(entry.getKey() + " : "
                               + entry.getValue());
        }
    }
  
    public static Map<String, String> HashMapFromTextFile()
    {
  
        Map<String, String> map
            = new HashMap<String, String>();
        BufferedReader br = null;
  
        try {
  
            File file = new File(filePath);
  
            br = new BufferedReader(new FileReader(file));
  
            String line = null;
  
            while ((line = br.readLine()) != null) {
  
                String[] parts = line.split(",");
  
               
                String name = parts[0].trim();
                String number = parts[1].trim();
  
      
                if (!name.equals("") && !number.equals(""))
                    map.put(name, number);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
      
        return map;
    }
}