import java.util.*;

public class lesson5dz2 {
    public static void main(String[] args) {
        String humans = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, " +
                "Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, " +
                "Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, " +
                "Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] human = humans.split(", ");
        Map<String, Integer> map = new TreeMap<>();
        for (String item:human) {
            String[] str = item.split(" ");
            int count = 1;
            if(map.containsKey(str[0])){
                count +=1;
                map.put(str[0],count);
            }else{
                map.put(str[0],count);
            }
        }
        System.out.println(map);
        Map<Integer, List> map2 = new TreeMap<>(Comparator.naturalOrder());
        for (Map.Entry<String,Integer> item: map.entrySet()) {
            if (map2.containsKey(item.getValue())){
                List<String> str = map2.get(item.getValue());
                str.add(item.getKey());
                map2.put(item.getValue(), str);
            }else {
                List<String> str = new ArrayList<>();
                str.add(item.getKey());
                map2.put(item.getValue(), str);
            }
        }
        System.out.println(map2);

    }
}
