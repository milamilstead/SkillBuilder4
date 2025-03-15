
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    public static String findTYPattern(String s) {
       boolean foundT = false;
        int TFOUND = -1;
        int YFOUND = -1;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!foundT && (ch == 't' || ch == 'T')){
                foundT = true;
                TFOUND = i;
            } else if (foundT && (ch == 'y' || ch == 'Y')) {
                YFOUND = i;
                break;
            }
            }
        if ((TFOUND != -1 && YFOUND != -1) && (TFOUND < YFOUND)){
            result = s.substring(TFOUND,YFOUND+1);
        }

        return result;

}
 }


