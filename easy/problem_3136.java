class Solution {
    public boolean isValid(String word) {
        word = word.trim().toLowerCase();
        if (word.length() < 3) return false; // min 3 characters

        String vowels = "aeiou";
        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) return false; // only letters/digits

            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) != -1) hasVowel = true;   // vowel found
                else hasConsonant = true;                       // consonant found
            }
        }

        return hasVowel && hasConsonant;
    }
}
