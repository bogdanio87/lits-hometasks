import java.io.*;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Array {
    public static void Time(LocalDate date, int day, int month, int year) {
        LocalDate result = LocalDate.now().plusDays(day).plusMonths(month).plusYears(year);
        System.out.println("Result is: " + result);
    }


    public static ArrayList<String> generateRandomStrings(int numberOfStrings)
    {
        ArrayList<String> randomStringsList = new ArrayList<String>();
        Random random = new Random();
        for(int i = 0; i < numberOfStrings; i++)
        {
            char[] string = new char[random.nextInt(10) + 6];
            for(int j = 0; j < string.length; j++)
            {
                string[j] = (char)('a' + random.nextInt(26));
            }
            randomStringsList.add(new String(string));
        }
        return randomStringsList;
    }

    public static void Reader() {
        HashMap<Integer, String> data = new HashMap<Integer, String>();
        int lineNumber = 1;
        try {
            File file = new File("input.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                data.put(lineNumber, line);
                lineNumber++;
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            File fileTwo=new File("output.txt");
            FileOutputStream fos=new FileOutputStream(fileTwo);
            PrintWriter pw=new PrintWriter(fos);

            for(Map.Entry<Integer,String> m :data.entrySet()){
                if((m.getKey() > 0 && (m.getKey() & (m.getKey() - 1)) == 0))
                pw.println(m.getKey()+":"+m.getValue());
            }

            pw.flush();
            pw.close();
            fos.close();
        }catch(Exception e){}


    }



    public static void main(String[] args) {
        Time(LocalDate.now(), 1,1,0);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        ArrayList<String> strings = generateRandomStrings(6);
        for(int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Reader();
    }
}
