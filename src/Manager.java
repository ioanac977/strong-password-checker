public class Manager {
    private static final String UPPERCASE_INTERVAL =".*[A-Z].*";
    private static final String LOWERCASE_INTERVAL =".*[a-z].*";
    private static final String DIGIT_INTERVAL =".*[0-9].*";
    private static final int MIN_LENGTH = 6;
    private static final int MAX_LENGTH = 20;
    private static String changes="";

    protected String changesOnPassword(String password){
        Security security= new Security();

        security.checkMinimumLength(password,MIN_LENGTH);
        security.checkMaximumLength(password,MAX_LENGTH);
        security.checkLetters(password,UPPERCASE_INTERVAL);
        security.checkLetters(password,LOWERCASE_INTERVAL);
        security.checkLetters(password,DIGIT_INTERVAL);
        security.checkRepetitions(password);

        if(!security.minLength )
           changes +=" INSERT ";

        if(!security.maxLength)
           changes += " DELETE ";

        if(!security.noRepetition)
            changes += " REPLACE ";

        if(!security.letterMatch)
            changes += " INSERT/REPLACE ";

        if(changes=="")
        return "0";
        else
            return changes;
    }


}
