class Solution {
    public String[] findWords(String[] words) {
        return Stream.of(words).filter(w -> w.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }
}