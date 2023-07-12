import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phone {
    Map<String, List> phoneBook = new HashMap<>();

    void addPhone(String name, String num){
        if (phoneBook.containsKey(name)) {
            List<String> str = phoneBook.get(name);
            str.add(num);
            phoneBook.put(name, str);
        }else {
            List<String> str = new ArrayList<>();
            str.add(num);
            phoneBook.put(name,str);
        }
    }
    String print(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, List> entry: phoneBook.entrySet()) {
            String name = entry.getKey();
            List num = entry.getValue();
            stringBuilder.append(name);
            stringBuilder.append(":");
            stringBuilder.append(num);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
