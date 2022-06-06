public class SpamAnalyzer extends KeywordAnalyzer{
    private String[] keywords = new String[]{"членоху","блядимудина"};
    private Label label;

    public SpamAnalyzer(String[] spamKeywords) {
        this.keywords = new String[keywords.length];
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        if (super.processText(text) != Label.OK) {
            this.label = Label.SPAM;
            return this.getLabel();
        } else {
            this.label = Label.OK;
            return this.getLabel();
        }
    }
    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
