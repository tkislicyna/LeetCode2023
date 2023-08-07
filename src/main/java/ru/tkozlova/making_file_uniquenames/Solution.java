package ru.tkozlova.making_file_uniquenames;

import java.util.HashMap;
import java.util.Map;

class Solution {
    Map<String, Integer> folderNames = new HashMap<>();

    public String[] getFolderNames(String[] names) {
        String[] result = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            String name = names[i];

            if (folderNames.containsKey(name)) {
                int lastVersion = folderNames.get(name);
                var nextName = name;

                while (folderNames.containsKey(nextName)) {
                    lastVersion++;
                    var builder = new StringBuilder();
                    builder.append(name);
                    builder.append('(');
                    builder.append(lastVersion);
                    builder.append(')');

                    nextName = builder.toString();
                }

                folderNames.put(name, lastVersion);
                folderNames.put(nextName, 0);

                result[i] = nextName;
            } else {
                folderNames.put(name, 0);

                result[i] = name;
            }
        }
        return result;
    }
}
