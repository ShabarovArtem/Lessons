package input_output;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInputExample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = FileInputExample.class.getClassLoader().getResourceAsStream("Artcl");
//        String fileName = "G:\\Projects\\Lessons\\src\\Artcl";
//        FileReader fileReader = new FileReader("G:\\Projects\\Lessons\\src\\Artcl", StandardCharsets.UTF_8);
////        FileInputStream fileInputStream = new FileInputStream("G:\\Projects\\Lessons\\src\\Artcl");
//
//        StringBuilder stringBuilder = new StringBuilder(); // специальный клаас, добавляет строки
//
//        while (fileReader.ready()){
//            stringBuilder.append((char) fileReader.read());
//        }
//        System.out.println(stringBuilder);


//        while(fileReader.ready()){
//            char read = (char)fileReader.read();
//            System.out.print(read);
//
//        }

        Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8);

        int count = 0;
        int lineNeeded = 1;
        while (scanner.hasNext()){
            String nextLine = scanner.nextLine();
            if (count == lineNeeded){
                System.out.println(nextLine);
            }
            count++;
        }

//        scanner.nextLine();  // перейти на след строку
//        System.out.println(scanner.nextLine());

        scanner.close();
        inputStream.close();
    }
}
