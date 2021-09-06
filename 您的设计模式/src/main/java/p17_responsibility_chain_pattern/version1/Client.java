package p17_responsibility_chain_pattern.version1;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author YangYunhe
 * @date 2021-01-04 13:28
 * @description
 */
public class Client {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(random.nextInt(3) + 1, "我要出去逛街"));
        }

        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for (IWomen iWomen : arrayList) {
            if (iWomen.getType() == 1) {
                System.out.println("----------女儿向父亲请示----------");
                father.handleMessage(iWomen);
            } else if (iWomen.getType() == 2) {
                System.out.println("----------妻子向丈夫请示----------");
                husband.handleMessage(iWomen);
            } else if (iWomen.getType() == 3) {
                System.out.println("----------母亲向儿子请示----------");
                son.handleMessage(iWomen);
            }
        }

    }

}
