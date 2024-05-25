package web.service;

/**
 * Service class for handling math questions.
 * 
 * @author Ahsan.
 */
public class MathQuestionService {

    /**
     * Calculate the result of addition.
     * 
     * @param number1 The first number.
     * @param number2 The second number.
     * @return The result of the addition.
     */
    public static double q1Addition(String number1, String number2) {
        double result = Double.valueOf(number1) + Double.valueOf(number2);
        return result;
    }

    /**
     * Calculate the result of subtraction.
     * 
     * @param number1 The first number.
     * @param number2 The second number.
     * @return The result of the subtraction.
     */
    public static double q2Subtraction(String number1, String number2) {
        double result = Double.valueOf(number1) - Double.valueOf(number2);
        return result;
    }

    /**
     * Calculate the result of multiplication.
     * 
     * @param number1 The first number.
     * @param number2 The second number.
     * @return The result of the multiplication.
     */
    public static double q3Multiplication(String number1, String number2) {
        double result = Double.valueOf(number1) * Double.valueOf(number2);
        return result;
    }

	public static Object q4Division(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
