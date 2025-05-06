import java.io.*;

class FileReaderWriterDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine(); // To preserve line breaks
            }

            // Always close resources in reverse order of creation
            br.close();
            fr.close();
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
