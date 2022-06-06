class TooLongTextAnalyzer implements TextAnalyzer {
    private  int maxLength;

    public TooLongTextAnalyzer(int maxLenght){
        this.maxLength = maxLenght;
    }

    @Override
    public Label processText(String text) {
        return text.length()<=this.maxLength? Label.OK : Label.TOO_LONG;
    }
}