import Util.HammingUtils;
import Util.SimHashUtils;
import Util.TxtIOUtil;

public class Test {

    @org.junit.Test
    public void testAll(){
        String[] str = new String[6];
        str[0] = TxtIOUtil.readTxt("D:/test/orig.txt");
        str[1] = TxtIOUtil.readTxt("D:/test/orig_0.8_add.txt");
        str[2] = TxtIOUtil.readTxt("D:/test/orig_0.8_del.txt");
        str[3] = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_1.txt");
        str[4] = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_10.txt");
        str[5] = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_15.txt");
        String ansFileName = "D:/test/ansAll.txt";
        for(int i = 0; i <= 5; i++){
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str[0]), SimHashUtils.getSimHash(str[i]));
            TxtIOUtil.writeTxt(ans, ansFileName);
        }
    }

    @org.junit.Test
    public void test1(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String ansFileName = "D:/test/test1.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @org.junit.Test
    public void test2(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_add.txt");
        String ansFileName = "D:/test/test2.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @org.junit.Test
    public void test3(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_del.txt");
        String ansFileName = "D:/test/test3.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @org.junit.Test
    public void test4(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_1.txt");
        String ansFileName = "D:/test/test4.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @org.junit.Test
    public void test5(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_10.txt");
        String ansFileName = "D:/test/test5.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans, ansFileName);
    }

    @org.junit.Test
    public void test6(){
        String str0 = TxtIOUtil.readTxt("D:/test/orig.txt");
        String str1 = TxtIOUtil.readTxt("D:/test/orig_0.8_dis_15.txt");
        String ansFileName = "D:/test/test6.txt";
        double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str0), SimHashUtils.getSimHash(str1));
        TxtIOUtil.writeTxt(ans,ansFileName);
    }

}