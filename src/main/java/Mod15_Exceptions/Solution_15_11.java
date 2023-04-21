package Mod15_Exceptions;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/*
Распаковка исключений
*/

public class Solution_15_11 {

    public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
    public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        fileManager.copyFile("book.txt", "book_final_copy.txt");
        fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
        //напишите тут ваш код
    }
}

