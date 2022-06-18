abstract class KeywordAnalyzer implements TextAnalyzer{
    abstract protected String[] getKeywords();
    abstract protected Label getLabel();

    public Label processText(String text) {
        //String[] keywords = getKeywords();
        for (String keyword : this.getKeywords()) {
            if (text.indexOf(keyword) > -1) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}