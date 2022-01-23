class ReadyCodes{
    //is even by bitwise
    int isEvenInt(int n) {
        return (n & 1);
    }
    bollean isEven() {
        return isEvenInt(5) == 0;
    }
    
    //String to int
    void stringToInt() {
        String myString = "1234";
        int foo = Integer.parseInt(myString);
    }
    
    //int to String
    void intToString() {
        int a = 1234; 
        String str1 = Integer.toString(a);
    }
    
    //char to int
    void charToInt() {
        char c='1';  
        int a = Character.getNumericValue(c);  
    }
    
    //substring example
    void substringExample() {
        String s1="javatpoint";  
        System.out.println(s1.substring(2,4));//returns va  
        System.out.println(s1.substring(2));//returns vatpoint  
    }
    
    //String indexOf where partialString = "fl"
    void getIndexOf(String partialString) {
        String mainString = "flower";
        int i = mainString.indexOf(partialString);
        //will return 0
    }
    
    //length and charAt
    void iterateString() {
        int sz = s.length();
        int fst = s.charAt(0);
    }
    
    void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
    
    //sort array
    void sortExample(int A[]) {
        Arrays.sort(A);
        //now the A array is sorted
    }
}
