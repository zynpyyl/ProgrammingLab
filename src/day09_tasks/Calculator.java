package day09_tasks;

public class Calculator {
    public static void main(String[] args) {
/*2. Create a class called Calculator, Given two double variables named n1 & n2,
and a char variable named mathOperator, write a program that can calculate result of n1&n2
based on the given math Operator.
    	char operator -> -, +, *, /
    	when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30
 */
            double num1=40;
            double num2=8;
            double result;
            char mathOperator='+';
            if (mathOperator=='+'){
                result=num1+num2;
            }else if (mathOperator=='-'){
                result=num1-num2;
            }else if (mathOperator=='*'){
                result=num1*num2;
            }else if (mathOperator=='/'){
                result=num1/num2;
            }else{
                result=0;
            }
            System.out.println(result);





    }
}
