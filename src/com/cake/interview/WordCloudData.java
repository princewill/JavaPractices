package com.cake.interview;

import java.util.HashMap;
import java.util.Map;

public class WordCloudData {

    private Map<String, Integer> wordsToCounts = new HashMap<>();

    private void populateWordsToCount(String inputString) {
        
    }

    public WordCloudData(String inputString) {
        populateWordsToCount(inputString);
    }

    public Map<String, Integer> getWordsToCounts() {
        return wordsToCounts;
    }


}
