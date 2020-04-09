import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Security {
    boolean minLength=true;
    boolean maxLength=true;
    boolean noRepetition=true;
    boolean letterMatch=true;

    protected void checkMinimumLength(String password,int minLength){
        if(password.length() < minLength){
            this.minLength=false;
        }
    }

    protected void checkMaximumLength(String password,int maxLength){
        if(password.length() > maxLength){
            this.maxLength=false;
        }
    }

    protected void checkLetters(String password,String letterInterval){
        if(!(password.matches(letterInterval))) {
            this.letterMatch=false;
        }
    }

    protected void checkRepetitions(String password){

        Pattern p = Pattern.compile( "((\\w)\\2+\\2)+.*");
        Matcher m = p.matcher(password);
        if (m.find())
        {
            this.noRepetition=false;
        }

    }


}
