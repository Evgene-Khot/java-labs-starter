package edu.course.lab01;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPrime(int number){
        if(number<2)
            return false;
        int a = 0;
        for(int i=2;i<number-1;i++){
            if(number%i==0)
                a += 1;
        }
        if(a==0)
            return true;
        else
            return false;
    }

    public static boolean isPalindrome(String text){
        if(text==null)
            throw new IllegalArgumentException();
        int a = 0;
        int le = text.length()-1;
        for(int i=0; i<(le/2)+1; i++){
            if(text.charAt(i)!=text.charAt(le-i))
                a+=1;
        }
        if(a==0)
            return true;
        else
            return false;
    }
}
