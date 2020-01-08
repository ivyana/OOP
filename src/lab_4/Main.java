package lab_4;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception
    {
        FileReader fRead = new FileReader("D:\\utm\\java proj\\OOP\\src\\lab_4\\expressions\\three_expressions.txt");

        String[] givenExpression = new String[3];
        for (int l = 0; l < givenExpression.length; l++)
        {
            givenExpression[l] = "";
        }

        int i, j = 0;
        while ((i=fRead.read()) != -1)
        {
            if (i == '\n')
            {
                j++;
            }
            givenExpression[j] += (char) i;
        }
        fRead.close();

        for (int k = 0; k < givenExpression.length; k++)
        {
            if (givenExpression[k] == "")
                break;
            System.out.println(givenExpression[k]);
            System.out.println(ExpressionChecker.expressionIsLegal(givenExpression[k]));
        }
    }
}
