import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomParser {

    public int parseWithBR(String inputWord) throws IOException {
        File f1 = new File("WarAndPeace.txt"); //Creation of File Descriptor for input file
        String[] words = null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String s;
        int count = 0;   //Intialize the word to zero
        Pattern pattern = Pattern.compile(".*" + inputWord +".*", Pattern.CASE_INSENSITIVE);

        while ((s = br.readLine()) != null)   //Reading Content from the file
        {
            words = s.split(" ");  //Split the word using space
            for (String word : words) {
                Matcher matcher = pattern.matcher(word);
                if (matcher.matches())
                {
                    count++;    //If Present increase the count by one
                }
            }
        }

        fr.close();
        return count;
    }

    public int parseWithScanner (String inputWord) throws FileNotFoundException {
        int count = 0;
        String[] words = null;
        File f1 = new File("WarAndPeace.txt"); //Creation of File Descriptor for input file
        Scanner scan = new Scanner(f1);
        Pattern pattern = Pattern.compile(".*" + inputWord +".*", Pattern.CASE_INSENSITIVE);
        while (scan.hasNext()) {
            words = scan.next().split(" ");  //Split the word using space
            for (String word : words) {
                Matcher matcher = pattern.matcher(word);
                if (matcher.matches())
                {
                    count++;    //If Present increase the count by one
                }
            }
        }
        return count;
    }


}

