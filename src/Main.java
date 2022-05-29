
public class Main {
    public static void main(String[] args) {
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines={
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        String res = Main.printTextPerRole(roles, textLines);
    }
    public static  String printTextPerRole(String[] roles, String[] textLines) {
        for (int i = 0; i < roles.length; i++) {
            System.out.println(roles[i]+":");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    System.out.println((j + 1) + ")" + textLines[j].substring(roles[i].length() + 1));
                }
            }
            System.out.print("\n");
        }
        return "";
    }
}