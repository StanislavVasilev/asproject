import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Выполнение задания 17 блока "Работа с файлами языка Java"
 * Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
 * Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
 * Пользователь при тестировании программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.
 */
public class OutputTask17Class {
  public static void main(String[] args) {
    System.out.println("Для остановки программы введите слово 'stop' в любом регистре");
    String text;
    String stop = "stop";
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try (FileWriter writer = new FileWriter(".txt")) {
      do {
        System.out.println("Введите текст для записи в файл('stop' для завершения работы приложения): ");
        text = reader.readLine();
        if (text.compareToIgnoreCase(stop) == 0)
          break;
        text = "\r\n" + text;
        writer.write(text);
      }
      while (text.compareToIgnoreCase(stop) != 0);
    } catch (IOException e) {
      System.out.println("Ошибка ввода-вывода " + e);
    }
  }
}
