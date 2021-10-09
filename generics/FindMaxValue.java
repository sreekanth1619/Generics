package generics;
/**
 * Purpose - To find maximum string value using generics
 * @author - sreekanth
 * 
 */
public class FindMaxValue<T extends Comparable<T>> {
	T a1,a2,a3;
	public FindMaxValue(T a1,T a2,T a3) {
		this.a1=a1;
		this.a2=a2;
		this.a3=a3;
	}
	
	/**
     * Generic method to compare any type of data and find maximum
     * @param a1 : First value to compare
     * @param a2 : Second value to compare
     * @param a3 : Third value to compare
     * @return max : Maximum of three values
     */

	public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3) {
        T max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }
		 public static void main(String[] args) {
		System.out.println("welcome to the maximum of three integer");
		System.out.println("the maximum value of three integer is:"+maxOfValues(4,5,9));
		System.out.println("the maximum of three float values is:"+maxOfValues(5.2f,8.2f,6.3f));
		System.out.println("the maxium of the three string is:"+maxOfValues("apple","peach","bannana"));
	}
}
