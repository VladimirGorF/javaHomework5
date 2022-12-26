import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class  task5_1 {
    public static void main(String[] args) {
        HashMap<String, List> telefons = new HashMap<>();

        List<Integer> tel = Arrays.asList(432143, 354325, 543342);  // создаем Values как список номеров.
        telefons.put("Ivanov", tel);

        tel = Arrays.asList(732143, 754325, 743342, 543252, 5432553);
        telefons.put("Petrova", tel);

        tel = Arrays.asList(732143);
        telefons.put("Gorbunov", tel);


        System.out.println(telefons.entrySet());
        System.out.println(telefons.get("Petrova"));
 



}
}
