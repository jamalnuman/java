//Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.
class Solution {
    public String reverseOnlyLetters(String string) {
        
        int start = 0;
        int end = string.length() - 1;
        char[] ch = string.toCharArray();
        while(start < end){
            if(!Character.isAlphabetic(ch[start])) start++;
            else if (!Character.isAlphabetic(ch[end])) end--;
            else{
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}

//Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.

class Solution {
    public String removeVowels(String S) {
       Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
           
         List<Character> al = Arrays.asList(vowels); 
           
         StringBuffer sb = new StringBuffer(S); 
           
         for (int i = 0; i < sb.length(); i++) { 
              
             if(al.contains(sb.charAt(i))){ 
                sb.replace(i, i+1, "") ; 
                i--; 
             }
         }
        return new String(sb);
    }
}

// Given a valid (IPv4) IP address, return a defanged version of that IP address.

// A defanged IP address replaces every period "." with "[.]".

// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"

  public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (char ch : address.toCharArray()) {
            if (ch == '.') {
                sb.append('[').append(ch).append(']');
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    } 