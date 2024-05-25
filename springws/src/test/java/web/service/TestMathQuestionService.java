package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestMathQuestionService {

    @Test
    public void testTrueAdd() {
        Assert.assertEquals(3, MathQuestionService.q1Addition("1", "2"), 0);
    }

    @Test
    public void testAddNumber1Empty() {
        Assert.assertNull(MathQuestionService.q1Addition("", "2"));
    }

    @Test
    public void testTrueSubtraction() {
        Assert.assertEquals(1, MathQuestionService.q2Subtraction("3", "2"), 0);
    }

    @Test
    public void testSubtractionInvalidInput() {
        Assert.assertNull(MathQuestionService.q2Subtraction("abc", "2"));
    }

    @Test
    public void testTrueMultiplication() {
        Assert.assertEquals(6, MathQuestionService.q3Multiplication("2", "3"), 0);
    }

    @Test
    public void testMultiplicationEmptyInput() {
        Assert.assertNull(MathQuestionService.q3Multiplication("", "3"));
    }

    @Test
    public void testTrueDivision() {
        Assert.assertEquals(2, MathQuestionService.q4Division("6", "3"));
    }

    @Test
    public void testDivisionByZero() {
        Assert.assertNull(MathQuestionService.q4Division("6", "0"));
    }
}
