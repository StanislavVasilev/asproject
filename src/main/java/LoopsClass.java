/**
 * Задание 8 блока 5 Управляющие операторы условия и цикла
 * 
 * Необходимо с помощью цикла вывести на экран числа от 1 до 50
 */
public class LoopsClass {
  public static void main(String[] args) {
//    Первый вариант
    for (int i = 1; i <51; i++){
      System.out.println(i);
    }

//Второй вариант
    int i = 0;
    while (++i<51){
      System.out.println(i);
    }

  }


}
