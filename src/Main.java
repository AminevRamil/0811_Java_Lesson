import java.io.*;

public class Main {

    public static void main(String[] args) {
            try {
                File folder = new File("./TestFiles");
                File[] files = folder.listFiles();
                FileWriter fw = new FileWriter("./TestFiles/OutputFile.txt");

                for (File elem : files) {
                    if (elem.isFile()) {
                        System.out.println(elem);
                        BufferedReader f = new BufferedReader(new FileReader(elem.getAbsoluteFile()));
                        while (f.ready()) System.out.println("\t" + f.readLine());

                        fw.write(elem.getName() + "\n");
                    }
                    fw.flush();
                }
            } catch (FileNotFoundException e){
                System.out.println("File Not Found");
            } catch (IOException e){
                System.out.println("IOException");
            }


    }
}
