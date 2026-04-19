import java.io.*;
public class iostreams {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new FileReader("C:\\java practise\\files\\emp.txt"));
        FileWriter fw=new FileWriter("C:\\java practise\\files\\ffile.txt");
        String line;
        while((line=br.readLine())!=null)
        {
            fw.write(line);
        }
        System.out.println("file copied successfully");
br.close();
fw.close();
    }
}
