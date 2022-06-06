public class NegativeTextAnalyzer extends  KeywordAnalyzer {
    private String[] keywords = new String[]{":(","=(",":|"};
    protected Label label;

    @Override
    public Label processText(String text) {
        if (super.processText(text) != Label.OK)
        {
            this.label = Label.NEGATIVE_TEXT;
            return this.getLabel();
        }
        else {
            this.label = Label.OK;
            return this.getLabel();
        }
    }

    @Override
    protected String[] getKeywords() {
        return new String[0];
    }

    @Override
    protected Label getLabel() {
        return null;
    }
}
