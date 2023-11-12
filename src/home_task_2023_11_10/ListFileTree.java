package home_task_2023_11_10;

import java.io.File;
import java.util.Scanner;
/*
*  1. Написать программу, которая находила бы все текстовые файлы расширения .txt
*  в заданной папке и ее подпапках и выводила бы их содержимое в консоль.
* За основу решения можно взять класс ListFileTree.java (см. репозиторий)*/
public class ListFileTree {
    public static void main(String args[]) {
        String s;
        while (true) {
            System.out.println("Enter full path ('quit' to exit): ");
            Scanner scanner = new Scanner(System.in);
            s = scanner.nextLine();

            if (s.equals("quit")) break;
            File f = new File(s);
            if (!f.exists()) {
                System.out.println("\nNot found: " + s);
                continue;
            }

            if (!f.isDirectory()) {
                System.out.println("\nNot directory: " + s);
                continue;
            }

            list(s);
        }
    }

    public static void list(String szDir) {
        File f = new File(szDir);
        String[] sDirList = f.list();

        int i;
        for (i = 0; i < sDirList.length; i++) {
            File f1 = new File(szDir + File.separator + sDirList[i]);

            if (f1.isFile() && f1.getName().endsWith(".txt")) {
                System.out.println("File: " + f1.getAbsolutePath());
                try (Scanner fileScanner = new Scanner(f1)) {
                    while (fileScanner.hasNextLine()) {
                        System.out.println(fileScanner.nextLine());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Moving to dir: " + f1.getAbsolutePath());
                list(f1.getAbsolutePath());
            }
        }
    }

}
