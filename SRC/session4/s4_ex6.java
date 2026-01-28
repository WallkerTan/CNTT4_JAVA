package SRC.session4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class s4_ex6 {

    static String[] blacklist = {
        "ngu", "xau", "te", "vo van"
    };

    public static String filterBadWords(String review) {
        String regex = "(?i)\\b(" + String.join("|", blacklist) + ")\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(review);

        StringBuffer sb = new StringBuffer();

        while (m.find()) {
            String stars = "*".repeat(m.group().length());
            m.appendReplacement(sb, stars);
        }
        m.appendTail(sb);

        return sb.toString();
    }

    public static String shortenReview(String review) {
        if (review.length() <= 200)
            return review;

        String temp = review.substring(0, 200);
        int lastSpace = temp.lastIndexOf(" ");

        if (lastSpace != -1)
            temp = temp.substring(0, lastSpace);

        return new StringBuilder(temp).append("...").toString();
    }

    public static String processReview(String review) {
        String filtered = filterBadWords(review);
        return shortenReview(filtered);
    }

    public static void main(String[] args) {
        String review =
            "Cuon sach nay rat ngu va vo van, noi dung xau va cach trinh bay te. " +
            "Nhung neu doc ky thi van co mot so y hay va dang suy ngam.";

        String result = processReview(review);
        System.out.println(result);
    }
}
