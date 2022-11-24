package lesson_05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hw_05_FindDuplicateFileinSystem {
    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        String[] paths1 = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)"};
        System.out.println(findDuplicate(paths));
        System.out.println(findDuplicate(paths1));
    }

    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] arrayStr = path.split(" ");
            String dir = arrayStr[0];
            for (int i = 1; i < arrayStr.length; i++) {
                int index = arrayStr[i].indexOf("(");
                String content = arrayStr[i].substring(index);
                String dirWithFile = dir + "/" + arrayStr[i].substring(0, index);
                List<String> arrPaths = map.getOrDefault(content, new ArrayList<>());
                arrPaths.add(dirWithFile);
                map.put(content, arrPaths);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                result.add(map.get(key));
            }
        }
        return result;
    }
}
