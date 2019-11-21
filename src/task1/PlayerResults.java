package task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlayerResults {
    public static void main(String[] args) {
        startPlayerResults();
    }

    private static void startPlayerResults() {
        List<Player> list = getDataFromUser();
        Collections.sort(list);
        writeToFile(list);
    }

    private static void writeToFile(List<Player> list) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("stats.txt")));) {
            for (int i = 0; i < list.size() - 1; i++){
                bufferedWriter.write(String.valueOf(list.get(i)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List getDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        Player player = null;
        List<Player> list = new ArrayList<>();
        String line = "";
        String[] word = null;
        getInfo();
        line = scanner.nextLine();
        //while(line != "stop"){
            word = line.split(" ");
            player = new Player(word[0],word[1],Integer.parseInt(word[2]));
            list.add(player);
            getInfo();
        //    line = scanner.nextLine();
          //  if(line == "stop") break;
        //}
        return list;
    }

    private static void getInfo() {
        System.out.println("Podaj wynik kolejnego gracza (lub stop):");
    }
}
