package Unit1.src;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: ���������� � ������� (����� � ����������) ������� ���������� ����� �
    // ����������� �������� ��� ���� ��������� ��������� ������
    public static double squareRootExtraction(double num) {
        //  0
        //  ������������� �����
        //  ������� �������� ������
        //  �����
        if (num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }

    // ����� �������� � ������������ ����� ���������� ����� ������� �� ������� � ��������� ���, ��������� AssertJ
    // ��������� ��������� � ���� ������:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - ����� �������
        // discountAmount - ������ ������
        double resultAmount = purchaseAmount - ((double) discountAmount / 100 * purchaseAmount);
        if (purchaseAmount < 1)
            throw new IllegalArgumentException("����� ������� �� ����� ���� ������ 1 usd");
        if (discountAmount < 0) throw new IllegalArgumentException("������� ������ �� ����� ���� �������������");
        return resultAmount; // ����� ������ ���������� ����� ������� �� �������
    }
}