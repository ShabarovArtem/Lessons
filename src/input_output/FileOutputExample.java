package input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputExample {
    public static void main(String[] args) throws IOException {
        String menu1 = "Хлеб - 40 рублей\n";
        String fileName = "G:\\Projects\\Lessons\\menu.txt";
//        FileOutputStream outputStream = new FileOutputStream(fileName);
//        outputStream.write(menu1.getBytes());
//        outputStream.close();
        String menu2 = "banans - 60 рублей\n";
        try(FileWriter fileWriter = new FileWriter(fileName,true)){
            fileWriter.write(menu2);
        }

    }
}
