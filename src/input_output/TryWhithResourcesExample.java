package input_output;

import javax.management.RuntimeErrorException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InterruptedIOException;

public class TryWhithResourcesExample {
    public static void main(String[] args) throws IOException, InterruptedIOException {
        FileReader fileReader = null;
        try{
            fileReader = new FileReader("G:\\Projects\\Lessons\\resources\\Artcl");
            throw  new RuntimeException("Ошибка");
        } catch(Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Блок finally");
            fileReader.close();
        }
//или чтобы каждый раз ене писать close
        try(FileReader fileReader2 = new FileReader("G:\\Projects\\Lessons\\resources\\Artcl")){
            throw  new RuntimeException("Ошибка");
        }catch(Exception e){
            System.out.println("Обработал ошибку");
        }

    }
}
