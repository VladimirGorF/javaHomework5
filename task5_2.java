import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;


// Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе) 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
public class task5_2 {

    public static void program(List<String> arg) {
        HashMap<String, Integer> linkMap = new LinkedHashMap<>();

        List<String> list = new ArrayList<>();
        List<Integer> listValues = new ArrayList<>();

        for (String string : arg) {
            String[] s = string.split(" "); // разбиваем имя и фамилию на массив из 2 элементов
            list.add(s[1]); // добавляем имена в list
        }

        for (String string : list) {
            linkMap.put(string, Collections.frequency(list, string)); // добавляем имена и встречаемость в map
        }

        for (var item : linkMap.entrySet()) {
            listValues.add(item.getValue()); // заполняем лист значениями встречаемости Имен

        }

        listValues.sort(null); // сортируем values по порядку
        Collections.reverse(listValues); // разворачиваем по порядку убывания
        HashSet<Integer> set = new HashSet<>();
        set.addAll(listValues);  // передаем наши встречаемости в уникальную коллекцию сет

        Stack st = new Stack<>(); //  затем передаем все в Stack  
        st.addAll(set);
        Collections.reverse(st); //  и переворачиваем  -> 4,2,1
        


        for (var i : st) {
            for (var a : linkMap.entrySet()) {
                if (a.getValue().equals(i)) { // выводим на экран совпадающие Values вместе с Именами
                    System.out.println(a);
                    
                }
            }
        }
    }

    public static void main(String[] args) {

        List<String> listEployee = Arrays.asList("Смирнова Мария", "Иванова Виктория", "Gerasimova Елизавета",
                "Hohlova Lena", "Popova Frosya", "Gorbunova Мария", "Epifanceva Frosya",
                "Solovianova Мария", "Siniukova Елизавета", "Voroncova Мария");

        program(listEployee);
    }
}