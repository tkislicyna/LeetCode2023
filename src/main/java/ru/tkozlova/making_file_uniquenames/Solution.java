package ru.tkozlova.making_file_uniquenames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public String[] getFolderNames(String[] names) {
        Map<String, List<List<Integer>>> folderNames = new HashMap<>();

        List<String> result = new ArrayList<>();

        for (var name : names) {

            var base = name;
            List<Integer> version = List.of();

            if (name.contains("(")) {
                base = name.substring(0, name.indexOf("("));
                version = Arrays.stream(
                                name.substring(name.indexOf("("))
                                        .replace("(", "")
                                        .split("\\)"))
                        .map(Integer::valueOf).collect(Collectors.toList());
            }

            if (folderNames.containsKey(base)) {
                List<List<Integer>> existedVersions = folderNames.get(base);
                if (existedVersions.contains(version)) {
                    var nextVersion = getNextVersion(existedVersions, version);
                    insertByInc(existedVersions, nextVersion);

                    result.add(concatFolderName(base, nextVersion));
                } else {
                    insertByInc(existedVersions, version);
                    result.add(name);
                }
            } else {
                List<List<Integer>> firstVersion = new LinkedList<>();
                firstVersion.add(version);
                folderNames.put(base, firstVersion);

                result.add(name);
            }


        }

        return result.toArray(new String[result.size()]);
    }

    private String concatFolderName(String base, List<Integer> version) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(base);
        version.forEach(v -> {
            stringBuilder.append("(");
            stringBuilder.append(v);
            stringBuilder.append(")");
        });
        return stringBuilder.toString();
    }

    private void insertByInc(List<List<Integer>> existedVersions, List<Integer> version) {
        for (var sortedVersion : existedVersions) {
            if (moreVersion(sortedVersion, version)) {
                existedVersions.add(existedVersions.indexOf(sortedVersion), version);
                return;
            }
        }

        existedVersions.add(version);
    }

    private boolean moreVersion(List<Integer> version, List<Integer> newVersion) {

        for (var i = 0; i < newVersion.size(); i++) {
            if (i >= version.size()) {
                return false;
            }

            if (version.get(i) < newVersion.get(i)) {
                return false;
            } else if (version.get(i) > newVersion.get(i) && version.size() == i + 1) {
                return true;
            }

        }

        return false;
    }

    private List<Integer> getNextVersion(List<List<Integer>> existedVersion, List<Integer> version) {

        int tailVersion = 1;
        var newVersion = new ArrayList<>(version);
        newVersion.add(tailVersion);
        while (existedVersion.contains(newVersion)) {
            tailVersion++;
            newVersion.set(version.size(), tailVersion);
        }

        return newVersion;
    }
}
