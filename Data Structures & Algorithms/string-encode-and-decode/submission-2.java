class Solution {

    public String encode(List<String> strs) {

String encoded_String = "";
for (int i = 0; i <= strs.size() - 1; i++){

    String word = strs.get(i);
    int wordLength = word.length();

    encoded_String = encoded_String + wordLength + "#" + strs.get(i);
}

String encoded_string = encoded_String;
return encoded_string;
    }

    public List<String> decode(String str) {
    List<String> decoded_strs = new ArrayList<>();
    int startOfLength = 0;

    int i = 0;
while (i < str.length()){

    if (str.charAt(i) == '#'){

    String lengthOfString = str.substring(startOfLength, i);
    int wordLen = Integer.parseInt(lengthOfString); 


    String addWord = str.substring(i + 1, i + 1 + wordLen);
    i = i + 1 + wordLen;
    startOfLength = i;

decoded_strs.add(addWord);
    }else{
        i++;
    }
    }
    return decoded_strs;
    }
}
