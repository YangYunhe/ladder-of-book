package p20_prototype_pattern.version2;

/**
 * @author YangYunhe
 * @date 2021-01-05 15:56
 * @description
 */
public class Mail implements Cloneable {

    /**
     * 收件人
     */
    private String receiver;

    /**
     * 主题
     */
    private String subject;

    /**
     * 称呼
     */
    private String appellation;

    /**
     * 邮件内容
     */
    private String context;

    /**
     * 邮件尾部信息
     */
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    protected Mail clone() throws CloneNotSupportedException {
        return (Mail)super.clone();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
