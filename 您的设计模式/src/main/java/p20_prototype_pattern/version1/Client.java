package p20_prototype_pattern.version1;

import java.util.Random;

/**
 * @author YangYunhe
 * @date 2021-01-05 15:59
 * @description
 */
public class Client {

    /**
     * 发送邮件的数量
     */
    private static int maxCount = 6;

    public static void main(String[] args) {

        // 模拟发送邮件
        int i = 0;
        // 定义模板
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版本所有");
        while (i < maxCount) {
            mail.setAppellation(getRandString(5) + " 先生/女士");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(mail);
            i++;
        }
    }

    /**
     * 发送邮件
     */
    public static void sendMail(Mail mail) {
        System.out.println(String.format("标题: %s, 收件人: %s ... 发送成功！", mail.getSubject(), mail.getReceiver()));
    }

    /**
     * 生成随机字符串
     * @param maxLength 字符串的最大长度
     * @return 生成的字符串
     */
    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }

}
