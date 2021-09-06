package p17_responsibility_chain_pattern.version1;

/**
 * @author YangYunhe
 * @date 2021-01-04 12:28
 * @description 古代悲哀女性的总称
 */
public interface IWomen {

    /**
     * 返回个人状况，已婚、未婚、是否丧偶
     * @return 个人状况
     */
    int getType();

    /** 获取个人请示：要干什么？逛街？看电影？
     * @return 个人请示
     */
    String getRequest();

}
