import java.util.function.DoubleUnaryOperator;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        String[] negative = {"хуй","пизда"};
        TextAnalyzer[] analyzers = {
                new TooLongTextAnalyzer(1000)
                , new NegativeTextAnalyzer()
                , new SpamAnalyzer(negative)};

        String text = String.valueOf(new Scanner(System.in));

        switch (checkLabels(analyzers, text)){
            case NEGATIVE_TEXT:
                System.out.println("NEGATIVE");
                break;
            case TOO_LONG:
                System.out.println("TOO LONG");
                break;
            case SPAM:
                System.out.println("SPAM");
                break;
            case OK:
                System.out.println("OK");
                break;
        }
    }
    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label label = Label.OK;
        for(TextAnalyzer analyzer: analyzers)
        {   label = analyzer.processText(text);
            if(label != Label.OK)
            {
                return label;
            }
        }
        return Label.OK;
    }
}

