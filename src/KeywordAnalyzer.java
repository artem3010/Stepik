abstract class KeywordAnalyzer implements TextAnalyzer {

    @Override
    public Label processText(String text) {
        boolean boolLabel = false;
        for(String keyword: this.getKeywords())
        {
            if(text.contains(keyword))
            {
                boolLabel = true;
                break;
            }
        }
        return boolLabel ? Label.SPAM : Label.OK;
    }

    abstract protected String[] getKeywords();

    abstract protected Label getLabel();
}
