import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Выполнение задания №3
 * <p>
 * Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
 * Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
 * (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */
public class MainClass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double exchangeRate = getExchangeRate(in);
    int currencySum = getCurrencySum(in);
    System.out.println(String.format("Итого: %s$", getTotal(currencySum, exchangeRate)));
  }

  public static int getCurrencySum(Scanner in) {
    System.out.println("Введите сумму в рублях: ");
    return in.nextInt();
  }

  public static double getExchangeRate(Scanner scanner) {
    System.out.println("Введите курс доллара: ");
    String exR = scanner.nextLine();
    exR = exR.replace(",", ".");
    return Double.parseDouble(exR);
  }

  public static String getTotal(double currencySum, double exchangeRate) {
    return new DecimalFormat("#0.00").format(currencySum / exchangeRate);
  }
}
